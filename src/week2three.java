import java.util.Scanner;
public class week2three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter row value:");
        int n=input.nextInt();
        if(n<0)
            System.out.println("invalid input");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
