package week2;

import java.util.Scanner;
public class week2eight {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = input.nextInt();
        int copy = num;
        int rev = 0;
        while(copy>0){
            rev = rev *10;
            rev = rev+(copy%10);
            copy/=10;
        }
        if(rev==num){
            System.out.println("palindrome");
        }
        else
            System.out.println("not a palindrome");
    }
}
