// leetcode 217  ->    Contain Duplicate 

import java.util.HashSet;

public class ContnDupl {

    public static boolean contaiDuplicate(int[] nums) {
        /* Brute Force */
        // Complexity time o(n^2) and Space n(1) no extra memory

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    return true;
                }

            }
        }
        return false;

    }

    public static boolean contDupl(int[] nums) {
          //Complexity
// Time: O(n)
// Space: O(n)
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(nums)){
                return true ;

            }
            set.add(num);;
        }
        return false;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
       // System.out.println(contaiDuplicate(arr));
       System.out.println(contDupl(arr));

    }
}
