import java.util.HashMap;
import java.util.Scanner;

public class AttendanceManager {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        HashMap <Integer,String> attendance=new HashMap<>();
        int choice=0;

        while(choice!=4){
            System.out.println("\n===== ATTENDANCE SYSTEM =====");
            System.out.println("1. Mark Present");
            System.out.println("2. Mark Absent");
            System.out.println("3. View Attendance");
            System.out.println("4. Exit");

            System.out.print("Enter the choice : ");
            choice= scan.nextInt();

            switch (choice){
                case 1:
                {
                    System.out.print("Enter the Student ID : ");
                    int presentID= scan.nextInt();
                    attendance.put(presentID,"Present");
                    System.out.println("Attendance Marked!");
                    break;
                }
                case 2:
                {
                    System.out.print("Enter the Student ID : ");
                    int absentID= scan.nextInt();
                    attendance.put(absentID,"Absent");
                    System.out.println("Attendance Marked");
                    break;
                }
                case 3:
                {
                    System.out.println("\n==== Attendance Records ====KK ");
                    if(attendance.isEmpty()){
                        System.out.println("No records found");
                    }
                    else{
                        for (Integer id: attendance.keySet()){
                            System.out.println("Student ID : "+ id + " Status : "+attendance.get(id));
                        }
                    }
                    break;
                }
                case 4:
                {
                    System.out.println("Exiting....");
                    break;
                }
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
