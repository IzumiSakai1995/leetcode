package 动态规划.完全平方数;

import org.junit.Test;

/**
 *
 * 给定正整数n，找到若干个完全平方数（1，4，9，16...）使得他们的和等于n，你需要让组成和的完全平方数的个数最少
 * 四平方定理： 任何一个正整数都可以表示成不超过四个整数的平方之和。 推论：满足四数平方和定理的数n（四个整数的情况），必定满足 n=4^a(8b+7)
 * @author IzumiSakai
 *
 */
public class Solution {
    public int numSquares(int n){
        // 根据公式缩小n
        while ( n % 4 == 0){
            n /= 4;
        }
        if (n % 8 == 7){
            return 4;
        }
        // 判断缩小后的数能否由一个数或两个数的平方的和组成
        int a = 0;
        while ((a*a) <= n){
           int b = (int) Math.sqrt(n - a*a);
           if (a * a + b * b == n){
               if (a !=0 && b != 0){
                   return 2;
               } else {
                   return 1;
               }
           }
           a++;
        }
        // 如果不行 返回3
        return 3;
    }

    @Test
    public void test(){
        System.out.println(numSquares(15));
    }
}

