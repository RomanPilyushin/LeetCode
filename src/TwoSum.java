import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(TwoSum.twoSum(new int[]{3, 2, 4}, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int tmpRes = 0;
        int[] resIndexArray = new int[2];

        for(int i= 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(i == j) continue;

                tmpRes = nums[i] + nums[j];
                if(tmpRes == target) {
                    resIndexArray[0] = i;
                    resIndexArray[1] = j;
                    return resIndexArray;
                }
            }
        }
        return resIndexArray;
    }
}