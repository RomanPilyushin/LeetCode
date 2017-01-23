/**
 * Created by User on 1/16/2017.
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int j=0;
        for (int i=0; i<nums.length; i++)
            if (nums[i]!=nums[j]) nums[++j]=nums[i];
        return ++j;
    }
}
