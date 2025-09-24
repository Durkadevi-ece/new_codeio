package week2Assignment;

public class week2One  {
    public static void main(String[] args) {
        int [] arr = {5,-3,0,2,-9,0,7,9,-6,0};
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                zero++;
            else if(arr[i]>0)
                positive++;
            else if (arr[i]<0)
                negative++;

        }
        System.out.println("No.of zeros in array:"+zero);
        System.out.println("No.of positive elements in array:"+positive);
        System.out.println("No.of negative elements in array:"+negative);
    }
}


