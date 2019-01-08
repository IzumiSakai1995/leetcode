package 动态规划;

import org.junit.Test;

/**

    给定一个整数数组  nums，求出数组从索引 i 到 j  (i ≤ j) 范围内元素的总和，包含 i,  j 两点。
*   给定 nums = [-2, 0, 3, -5, 2, -1]，求和函数为 sumRange()
*   sumRange(0, 2) -> 1
 *  sumRange(2, 5) -> -1
 *  sumRange(0, 5) -> -3
* */
public class RangeSumQuery {

    private int[] sums;

    public RangeSumQuery(int[] nums) {
        sums = new int[nums.length];
        if (nums.length == 0) {
            return;
        }
        sums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sums[i] += sums[i - 1] + nums[i];
        }
    }
    public int sumRange(int i, int j) {
        if (i == 0) {
            return sums[j];
        } else {
            return sums[j] - sums[i - 1];
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7};
        RangeSumQuery rangeSumQuery = new RangeSumQuery(nums);
        System.out.println(rangeSumQuery.sumRange(2,5));
    }
}
