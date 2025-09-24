//pass or fail in exam
import java.util.Scanner;
public class passFail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your exam mark out of 100:");
        int a = input.nextInt();
        String result =(a>=50)?"Pass":"fail";
        System.out.println(result);

    }
}
