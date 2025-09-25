package pattern;
// Number increasing Reverse pyramid
import java.util.Scanner;
    public class increaseREVpyramid{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter row value:");
            int n = input.nextInt();
            for(int i=1;i<=n;i++){
                int count = 1;
                for(int j = n;j>=i;j--){
                    System.out.print(" " + count + " ");
                    count++;

                }
                System.out.println();
            }
        }
    }

