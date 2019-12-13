package com.github.sonicLee.leetcode.l001;


import org.junit.Assert;
import org.junit.Test;

public class TestL001 {
    @Test
    public void test1(){
        com.github.sonicLee.leetcode.l001.Solution solution=new com.github.sonicLee.leetcode.l001.Solution();
        Assert.assertArrayEquals(new int[]{1, 2}, solution.twoSum(new int[]{3,2,4},6));
    }
}
