//Grade calculator
import java .util.Scanner;
public class GradeClaculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Studen mark in out of 100:");
        int mark = input.nextInt();
        char Grade = (mark>=90)?'A':(mark>=75&&mark<=89)?'B':(mark>=50&&mark<=74)?'C':'F';
        if(Grade=='F'){
            System.out.println("Fail");
            return;
        }
        System.out.println("Grade:"+Grade);
    }
}
