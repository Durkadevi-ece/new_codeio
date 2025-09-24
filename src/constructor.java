public class constructor {
    public static void main(String[] args) {
        Account s1 = new Account();
       s1.setName("Durka",22082006);
       s1.deposit(1000,22082006);
       s1.withdraw(100,22082006);

        System.out.println("Name:  "+ s1.getName() );
        System.out.println("Balance:   "+ s1.getBalance(22082006) );


    }
}
class Account {
    private int Balance;
    private String name;
    private  int password;


    Account() {
        Balance = 0;
        password = 22082006;
    }

    void setName(String name,int password) {
        if(password == this.password){
            this.name = name;
        }
        else
            System.out.println("wrong password(Don't change name)");
    }

    String getName() {
        return name;
    }

    int getBalance(int password) {
        if(password == this.password){
      return Balance;
        }
        else
            System.out.println("wrong password(can't geetBalance)");
        return -1;

    }

    int deposit(int amt,int password) {
        if(password == this.password){
            Balance += amt;
            return Balance;

        }
        else
            System.out.println("wrong password (can't deposit)");
        return -1;
    }

    int withdraw(int amt,int password) {
       if(password == this.password) {
           if (Balance > amt) {
               Balance -= amt;
               return Balance;
           } else {
               System.out.println("insuffient Balance");
               return Balance; // return current Balance
           }
       }
       else
           System.out.println("wrong password(can't withdraw)");
           return -1;
    }
}
