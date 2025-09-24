public class week2two {
    public static void main(String[] args) {
        int[] arr = {14,28,19,33,45,12,45};
        int firstL=arr[0];
        int secondL = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>firstL){
                secondL = firstL;
                firstL = arr[i];
            }
           else if(arr[i]>secondL && arr[i]!=firstL){
               secondL = arr[i];
           }
        }
        System.out.println("second largest element in array :"+secondL);
    }
}
