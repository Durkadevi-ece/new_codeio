public class number{
    public static void main(String[] args) {
        int [] arr = {3,5,7,8,1,6,8};
        for(int i=0;i<arr.length;i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum = leftSum + arr[j];
            }
            for (int k = i + 1; k < arr.length; k++) {
                rightSum = rightSum + arr[k];
            }
            if (leftSum == rightSum)
                System.out.println(i);
            return;

        }

    }
}