
//4. Find the first non-repeating element
import java.util.*;

public class NonRepeat {
    public static int FirstNonRepeating(int[] num, int n) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(num[i])) {
                map.put(num[i],map.getOrDefault(num[i], 0)+1);
            } else {
                map.put(num[i], 1);
            }
        }
        System.out.println(map);
        for (int i = 0; i < n; i++) {
            if (map.get(num[i]) == 1) {
                return num[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 8, 2, 3, 4, 1 };
        int n = arr.length;
        int numRes = FirstNonRepeating(arr, n);
        System.out.println(numRes);
    }
}
