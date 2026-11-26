import java.util.ArrayList;
import java.util.Scanner;

class Employee{
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department,double salary){
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
    void display(){
        System.out.println("Employee ID : "+id);
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Department : "+department);
        System.out.println("Employee Salary : "+salary);
    }
}
public class EmployeeManagement {
    static ArrayList<Employee> employees=new ArrayList<>();
    static Scanner scan=new Scanner(System.in);
    static int nextId=101;

    public static void main(String[] args) {
        int choice=0;
        while(choice !=5){
            System.out.println("\n==== MENU ====");
            System.out.println("1.Add Employee");
            System.out.println("2.View Employee");
            System.out.println("3.Search Employee");
            System.out.println("4.Delete Employee");
            System.out.println("5.Exit");
            System.out.print("\nEnter the choice : ");
            choice= scan.nextInt();

            switch (choice){
                case 1: {
                    addEmployee();
                    break;
                }
                case 2: {
                    viewEmployee();
                    break;
                }
                case 3:{
                    searchEmployee();
                    break;
                }
                case 4:{
                    deleteEmployee();
                    break;
                }
                case 5:{
                    System.out.println("Thank You!");
                    break;
                }
                default:
                    System.out.println("Invalid Choice");
            }
        } //while finish
    }
    static void addEmployee(){
        System.out.println("Enter Name : ");
        String name=scan.next();

        System.out.println("Enter Department : ");
        String department= scan.next();

        System.out.println("Enter Salary : ");
        double salary= scan.nextDouble();

        Employee emp=new Employee(nextId,name,department,salary);
        employees.add(emp);
        System.out.println("Added successfully!");
        System.out.println("Employee ID : "+nextId);
        nextId++;
    }
    static void viewEmployee(){
        if(employees.isEmpty()){
            System.out.println("No Employee found");
            return;
        }
        for(Employee emp:employees){
            emp.display();
        }
    }
    static void searchEmployee(){
        System.out.println("Enter Employee ID : ");
        int id= scan.nextInt();
        for(Employee emp:employees){
            if(emp.id==id){
                emp.display();
                return;
            }
        }
        System.out.println("Element not found");
    }
    static void deleteEmployee(){
        System.out.println("Enter Employee ID : ");
        int id= scan.nextInt();
        for (Employee emp:employees){
            if(emp.id==id){
                employees.remove(emp);
                System.out.println("Employee Deleted Successfully");
                return;
            }
        }
        System.out.println("Employee not found");
    }
}
