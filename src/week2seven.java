import java.util.Scanner;
public class week2seven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = input.nextInt();
        int copy = num;
        int rev = 0;
        System.out.print("reversed number :");
        while(copy>0){
            rev = rev*10;
            rev = rev+(copy%10);
            copy/=10;
        }
        System.out.print(rev);

    }
}
