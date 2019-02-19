package com.github.sonicLee.leetcode.l45;


import com.github.sonicLee.leetcode.l45.Solution;
import org.junit.Assert;
import org.junit.Test;

public class TestL45 {
    @Test
    public void test1(){
        Solution solution=new Solution();
        Assert.assertEquals(2, solution.jump(new int[]{2, 3, 1, 1, 4}));
        Assert.assertEquals(3, solution.jump(new int[]{1,1,2,1,1}));
        Assert.assertEquals(1, solution.jump(new int[]{3,2,1}));
    }
}
