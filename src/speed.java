//The city has speed limit 60km/hr
import java.util.Scanner;
public class speed {
    public static void main(String[] args){
        int SpeedLimit = 60 ; //(km/hr)
        Scanner input = new Scanner(System.in);
        System.out.println("car's speed:");
        int a=input.nextInt();
        if(a>SpeedLimit){
            System.out.println("over speeding pay fine");
        }
        else {
            System.out.println("you are withinn the speed limit");
        }

    }
}
