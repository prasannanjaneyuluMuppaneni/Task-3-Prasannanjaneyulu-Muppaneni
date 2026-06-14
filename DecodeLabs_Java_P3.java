import java.util.Scanner;
class BankAccount{
    private double balance;
    public BankAccount(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited:" + amount);
        } 
        else{
            System.out.println("Invalid amount");
        }
    }
    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount");
        } 
        else if(amount > balance){
            System.out.println("Insufficient balance");
        } 
        else{
            balance -= amount;
            System.out.println("Withdrawal successful");
        }
    }
}
public class DecodeLabs_Java_P3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(500);
        int choice;
        do{
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Balance: " + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    account.deposit(sc.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter amount: ");
                    account.withdraw(sc.nextDouble());
                    break;
                case 4:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while(choice != 4);
        sc.close();
    }
}