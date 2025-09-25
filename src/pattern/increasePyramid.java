package pattern;
 //Number increasing pyramid
import java.util.Scanner;
public class increasePyramid {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter row value:");
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            for(int  j=1;j<=i;j++){
                System.out.print( " " + j + " ");
            }
            System.out.println();
        }
    }
}

