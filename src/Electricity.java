import java.util.Scanner;
//Electricity bill discount
 public class Electricity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Electricity bill:");
        double Bill=input.nextDouble();
        Double Discount = 0.0;
        if(Bill>1000){
            System.out.println("you get 10% Discount");
            Discount =( 10.0/100)*Bill;
        }
         else if(Bill>500){
            System.out.println("you get 5% Discount");
            Discount = (5.0/100)*Bill;
         }
         else {
            System.out.println("pay full bill");
            System.out.println(Bill);
        }
         Double payBill = Bill - Discount;
        System.out.println("final amount to be paid:"+payBill);

    }
}
