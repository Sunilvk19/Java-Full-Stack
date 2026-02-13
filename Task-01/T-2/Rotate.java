public class Rotate {
    public static int[] rotateArray(int[] num,int step){
        int n = num.length;
        if(n == 0){
            return num;
        }
        int k = step % n;
        if(k == 0) {
            return num;
        }
        reverseArray(num,0,n-1);
        reverseArray(num, 0, k-1);
        reverseArray(num, k, n-1);
        return num;
    }
    public static void reverseArray(int[] arr, int start, int end){
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] result = rotateArray(arr, 3);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+", ");
        }
    }
}
