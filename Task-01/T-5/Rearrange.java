import java.util.*;

public class Rearrange {
    public static void RearrangeArray(int[] num) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (Integer in : num) {
            if (in >= 0) {
                pos.add(in);
            } else {
                neg.add(in);
            }
        }
        int i = 0, j = 0, k = 0;
        while (i < pos.size() && j < neg.size()) {
            num[k++] = pos.get(i++);
            num[k++] = neg.get(j++);
        }
        while (i < pos.size()) {
            num[k++] = pos.get(i++);
        }
        while (j < neg.size()) {
            num[k++] = neg.get(j++);
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,5,-1,2,-5,3,-2};
        RearrangeArray(arr);
        for (int ab : arr) {
            System.out.print(ab+" ");
        }
    }
}
