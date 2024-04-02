import java.util.ArrayList;
import java.util.Collections;

public class KthFactor {
    /**
     * You are given two positive integers n and k. A factor of an integer n is defined as an integer i where n % i == 0.
     *
     * Consider a list of all factors of n sorted in ascending order, return the kth factor in this list or return -1 if n has less than k factors.
     *
     *
     *
     * Example 1:
     *
     * Input: n = 12, k = 3
     * Output: 3
     * Explanation: Factors list is [1, 2, 3, 4, 6, 12], the 3rd factor is 3.
     * @param 
     */
    public static int kthFactory(int n, int k){

        ArrayList<Integer> list =new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n%i==0){
                list.add(i);
            }
        }

        if(list.size()<k){
            return -1;
        }
        // 对 list 进行升序排序
        Collections.sort(list);
        // 先对 list 进行升序排序
//        Collections.sort(list);
//        // 然后反转 list
//        Collections.reverse(list);
        int result =list.get(k-1);
        return result;
    }
    public static void main(String[] args) {

        int i = kthFactory(12, 2);
        System.out.println(i);

    }
}
