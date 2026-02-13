public class Merage {
    public static void merageTwoArray(int[] num1,int m, int[] num2, int n){
        int i = m-1;
        int j = n-1;
        int k = m + n -1;
        while (i >= 0 && j >= 0) {
            if(num1[i] >= num2[j]){
                num1[k] = num1[i];
                i--;
            }else{
                num1[k] = num2[j];
                j--;
            }
            k--;
        }
        while (j>=0) {
            num1[k] = num2[j];
            j--;
            k--;
        }
    }
    public static void main(String[] args) {
        int[] ar1 = {1,4,7,0,0,0};
        int[] ar2 = {2,5,6};
        int a = 3;
        int b = 3;
        merageTwoArray(ar1, a, ar2, b);
        for (int i : ar1) {
            System.out.print(i + " ");
        }
    }
}
