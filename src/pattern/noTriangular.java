package pattern;

import java.util.Scanner;
//number triangular pattern printing
import java.util.Scanner;
    public class noTriangular {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter row number:");
            int n = input.nextInt();
            for(int i=1;i<=n;i++){
                for(int s=1;s<=n-i;s++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print( " " + i + " ");
                }
                System.out.println();

            }
        }
    }


