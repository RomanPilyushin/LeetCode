/**
 * Created by User on 1/16/2017.
 */

/*
Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

For example,
Given [5, 7, 7, 8, 8, 10] and target value 8,
return [3, 4].
*/

public class SearchForARange {
    public static int[] searchRange(int[] nums, int target) {
        int[] rangeArray = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target && nums[i++] == target) {
                rangeArray[0] = i;
            }
            if (nums[i] != target) {
                rangeArray[1] = i;
            }
        }
        //if () {
        //    return rangeArray;
        //} else
        return new int[]{-1, -1};
    }
}
