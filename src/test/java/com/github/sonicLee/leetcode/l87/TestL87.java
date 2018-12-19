package com.github.sonicLee.leetcode.l87;


import org.junit.Assert;
import org.junit.Test;

public class TestL87 {
    @Test
    public void test1(){
        Solution solution=new Solution();
        Assert.assertEquals(true, Solution.isScramble(null,null));
        Assert.assertEquals(true, Solution.isScramble("s","s"));
        Assert.assertEquals(false, Solution.isScramble("s","d"));
        Assert.assertEquals(true, Solution.isScramble("as","as"));
        Assert.assertEquals(true, Solution.isScramble("as","sa"));
        Assert.assertEquals(true, Solution.isScramble("ase","sea"));
        Assert.assertEquals(true, Solution.isScramble("great","rgeat"));
        Assert.assertEquals(false, Solution.isScramble("abcde","caebd"));
        Assert.assertEquals(false, Solution.isScramble("aa","ab"));
        Assert.assertEquals(true, Solution.isScramble("abab","bbaa"));
        Assert.assertEquals(true, Solution.isScramble("abcd","bdca"));
        Assert.assertEquals(true, Solution.isScramble("great","ategr"));
    }
}
