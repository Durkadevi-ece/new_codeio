package pattern;
//Zero-one triangle
import java.util.Scanner;
    public class zero_oneTriangle {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter row value:");
            int n = input.nextInt();
            for(int i=1;i<=n;i++){
                boolean k =(i%2 !=0);
                for(int j=1;j<=i;j++){
                    System.out.print( " " + (k ?1:0) + " ");
                    k=(!k);
                }
                System.out.println();
            }
        }
    }


