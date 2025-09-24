import java.util.Scanner;
public class week2four {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter row value:");
        int n=input.nextInt();
        if(n<0)
            System.out.println("invalid input");
        for(int i=1;i<=n;i++){
            //spaces for allignment
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
