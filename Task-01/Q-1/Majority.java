public class Majority{
    public static int majorityElement(int[] num){
        int can = 0;
        int count = 0;
        for(int value : num){
            if(count == 0){
                can = value;
                count = 1;
            }else if(value == can){
                count++;
            }else{
                count--;
            }
        }
        int freq = 0;
        for(int key : num){
            if(key == can){
                freq++;
            }
        }
        return freq > num.length / 2 ? can : -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,3,1,2};
        int result = majorityElement(arr);
        System.out.println(result);
    }
}