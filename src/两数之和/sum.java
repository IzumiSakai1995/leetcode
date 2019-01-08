package 两数之和;

import org.junit.Test;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
        你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 给定 nums = [2, 7, 11, 15], target = 9

 因为 nums[0] + nums[1] = 2 + 7 = 9
 所以返回 [0, 1]
 */
public class sum {
    int [] nums = {15,11,7,2};
    int target = 9;
    @Test
    public void method1(){
        /*
        * 遍历：时间复杂度O(N2);空间复杂度O(N);
        *
        * */
        for (int i = 0;i < nums.length;i++){
            for (int j = 0; j < nums.length;j++){
                if (target - nums[i]==nums[j]){
                    System.out.println("i:"+i+" j:"+j);
                }
            }
        }
    }

    public void method2(){

    }
}
