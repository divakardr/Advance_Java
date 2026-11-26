import java.util.Scanner;

class BankAccount{
    private double balance;
    BankAccount(double balance){
        this.balance=balance;
    }
    void deposit(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("Invalid amount");
        }
        else {
            balance+=amount;
            System.out.println("Deposited successfully!");
        }
    }
    void withdraw(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("Invalid amount");
        }
        if(amount>balance){
            System.out.println("Insufficient balance");
        }
        else{
            balance-=amount;
            System.out.println("Withdraw successful");
        }
    }
    double getBalance(){
        return balance;
    }
}
public class BankManagement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        BankAccount b1=new BankAccount(5000);
        int choice=0;
        while (choice !=4){
            System.out.println("\n==== BANK MANAGEMENT ====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.println("Enter the choice : "+choice);
            choice =scan.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter the amount : ");
                    b1.deposit(scan.nextDouble());
                    break;

                case 2:
                    System.out.println("Enter the amount : ");
                    b1.withdraw(scan.nextDouble());
                    break;

                case 3:
                    System.out.println("Balance : "+b1.getBalance());
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
