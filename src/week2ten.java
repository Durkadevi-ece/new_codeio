//find how many times a particular number appears in array
import java.util.Arrays;
public class week2ten {
    public static void main(String[] args) {
        int[] arr = {2,4,2,6,2,9,6};
         occurance(arr);

    }
    static void occurance(int[] arr){
        //first to sort out the array
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            int count = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
                else
                    break;
            }
            System.out.println(arr[i]+" -> " +count);
            i+=count-1;
        }
    }
}
