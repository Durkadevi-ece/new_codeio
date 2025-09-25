package pattern;
//Number changing pyramid

import java.util.Scanner;

public class Nochangingpyramid {
    public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter row value:");
            int n = input.nextInt();
            int count=1;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(" " + count + " ");
                    count++;
                }
                System.out.println();
            }


        }
    }


