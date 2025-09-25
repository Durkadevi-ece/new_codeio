package week_3;

public class BankAccount {
    public static void main(String[] args) {
        Account1 A1 = new Account1();
        A1.accountNumber = 123456789;
        A1.deposit(1000.00);
        A1.withdraw(250.00);
        A1.display();
        Account2 A2 = new Account2(3000);
        A2.accountNumber = 987654321;
        A2.deposit(600.00);
        A2.withdraw(400.00);
        A2.display();

    }
}
class Account1{
    int accountNumber;
    int Balance;
    int deposit(double amount){
        Balance += amount;
        return Balance;
    }
    int withdraw(double amount){
        Balance -= amount;
        return Balance;
    }
    void display(){
        System.out.println("Balance:" + Balance);
        System.out.println();
    }


}
class Account2{
    int accountNumber;
    int Balance;
    Account2(int Balance){
        this.Balance = Balance;
    }
    int deposit(double amount){
        Balance += amount;
        return Balance;
    }
    int withdraw(double amount){
        Balance -= amount;
        return Balance;
    }
    void display(){
        System.out.println("Balance:" + Balance);
        System.out.println();
    }


}