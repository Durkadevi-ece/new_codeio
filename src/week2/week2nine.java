package week2;
//find the given number is armstrong or not

import java.util.Scanner;
public class week2nine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = input.nextInt();
        System.out.println("is Armstrong number:"+isArmstrong(n));

    }
    static boolean isArmstrong(int n){
        int sum = 0,digit=0;
        int temp = n;
        while(temp>0){
            temp /= (10);
            digit++;
        }
        System.out.println("Digit of the number is:"+digit);
        temp = n;
        while(temp>0){
            int lastDigit =temp%10;
            sum = (int)(sum + Math.pow(lastDigit,digit));
            temp /= 10;
        }
        System.out.println("sum:"+sum);
        if(sum==n)
            return true;
        else
            return false;
    }
}
