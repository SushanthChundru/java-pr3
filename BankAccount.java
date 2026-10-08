import java.util.Scanner;

public class BankAccount {

    int accountNumber;
    String accountHolderName;
    double balance;

   
    BankAccount(int number, String name, double bal) {
        accountNumber = number;
        accountHolderName = name;
        balance = bal;
    }

    
    void deposit(double amount) {
        balance = balance + amount;
    }

  
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

  
    double checkBalance() {
        return balance;
    }

   
    void displayAccount() {
        System.out.println("\nAccount Details");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + checkBalance());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter Account Number: ");
        int number = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

    
        BankAccount b = new BankAccount(number, name, balance);

      
        System.out.print("Enter Deposit Amount: ");
        double depositAmount = sc.nextDouble();
        b.deposit(depositAmount);

       
        System.out.print("Enter Withdrawal Amount: ");
        double withdrawAmount = sc.nextDouble();
        b.withdraw(withdrawAmount);

        
        b.displayAccount();

        sc.close();
    }
}