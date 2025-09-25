package pattern;
//palindrome Triangular
import java.util.Scanner;
    public class palindromeTriangular {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter row value:");
            int n = input.nextInt();
            for(int i =1;i<=n;i++){
                //spaces
                for(int s=1;s<=n-i;s++){
                    System.out.print(" ");
                }
                for(int j=i;j>=1;j--){
                    System.out.print( j + " ");
                }
                for(int j=2;j<=i;j++){
                    System.out.print( j + " ");
                }
                System.out.println();
            }
        }
    }


