package week2;

public class nine {
    static void fact(int n){
        if(n==0){
            return;    //Based condition
        }
        else{
            int fact=1;
            for(int i=1;i<=n;i++){
                fact = fact*i;
            }
            System.out.println(fact);
        }
    }

    public static void main(String[] args) {
        fact(5);
    }

        }


