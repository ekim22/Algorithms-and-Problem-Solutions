import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return the indices of the
 * two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 *
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 */
public class TwoSum {
    /**
     * My solution.
     * @param arr
     * @param target
     * @return
     */
    public static int[] find_target_indices(int[] arr, int target) {
        if (arr.length >= 2) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return null;
    }

    /**
     * Given solution. Uses a hashmap to save time
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{ map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
//        int target = 17;
//        System.out.println(Arrays.toString(find_target_indices(nums, target)));
        System.out.println(Arrays.toString(twoSum(nums, 77)));

    }
}



