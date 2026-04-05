// Search in roated sorted Arrays 
// leetcode 33

// binart Search Apprach 
public class Search {

    public int SearchRo(int[] nums, int target) {

        int st = 0, end = nums.length - 1;
        // binart Search loop

        while (st <= end) {
            int mid = st = (end - st) / 2;

            // check if mid is the lenght
            if (nums[mid] == target) {
                return mid;
            }

            // Determine if the left half is stored
            if (nums[st] <= nums[mid]) {
                if (nums[st] <= target && target < nums[mid]) {
                    end = mid - 1;

                } else {
                    st = mid + 1;
                }
            }

            // right half
            else {
                // check if target is within the sorted right half
                if (nums[mid] < target && target <= end) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] nums = { 3, 4, 5, 6, 7, 0, 1, 2 };
        Search search = new Search();
        int target = 0;
        System.out.println(search.SearchRo(nums, target));

    }
}
