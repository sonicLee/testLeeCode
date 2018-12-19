package com.github.sonicLee.leetcode.l87;

/**
 * # 英文原题：
 Given a string s1, we may represent it as a binary tree by partitioning it to two non-empty substrings recursively.

 Below is one possible representation of s1 = "great":

 great
 /    \
 gr    eat
 / \    /  \
 g   r  e   at
 / \
 a   t
 To scramble the string, we may choose any non-leaf node and swap its two children.

 For example, if we choose the node "gr" and swap its two children, it produces a scrambled string "rgeat".

 rgeat
 /    \
 rg    eat
 / \    /  \
 r   g  e   at
 / \
 a   t
 We say that "rgeat" is a scrambled string of "great".

 Similarly, if we continue to swap the children of nodes "eat" and "at", it produces a scrambled string "rgtae".

 rgtae
 /    \
 rg    tae
 / \    /  \
 r   g  ta  e
 / \
 t   a
 We say that "rgtae" is a scrambled string of "great".

 Given two strings s1 and s2 of the same length, determine if s2 is a scrambled string of s1.

 Example 1:

 Input: s1 = "great", s2 = "rgeat"
 Output: true
 Example 2:

 Input: s1 = "abcde", s2 = "caebd"
 Output: false

# 中文原题：

 给定一个字符串 s1，我们可以把它递归地分割成两个非空子字符串，从而将其表示为二叉树。

 下图是字符串 s1 = "great" 的一种可能的表示形式。

 great
 /    \
 gr    eat
 / \    /  \
 g   r  e   at
 / \
 a   t
 在扰乱这个字符串的过程中，我们可以挑选任何一个非叶节点，然后交换它的两个子节点。

 例如，如果我们挑选非叶节点 "gr" ，交换它的两个子节点，将会产生扰乱字符串 "rgeat" 。

 rgeat
 /    \
 rg    eat
 / \    /  \
 r   g  e   at
 / \
 a   t
 我们将 "rgeat” 称作 "great" 的一个扰乱字符串。

 同样地，如果我们继续将其节点 "eat" 和 "at" 进行交换，将会产生另一个新的扰乱字符串 "rgtae" 。

 rgtae
 /    \
 rg    tae
 / \    /  \
 r   g  ta  e
 / \
 t   a
 我们将 "rgtae” 称作 "great" 的一个扰乱字符串。

 给出两个长度相等的字符串 s1 和 s2，判断 s2 是否是 s1 的扰乱字符串。

 示例 1:

 输入: s1 = "great", s2 = "rgeat"
 输出: true
 示例 2:

 输入: s1 = "abcde", s2 = "caebd"
 输出: false
 */
public class Solution {

    public static boolean isScramble(String s1, String s2) {

        if (s2 == s1) {
            return true;
        }
        int length = s1.length();
        if (null==s1||length==0||length != s2.length()) {
            return false;
        }

        char allS1 = 0;
        char allS2 = 0;
        boolean resbool=true;
        for (int index = 0; index < length; index++) {
            allS1^=s1.charAt(index);
            allS2^=s2.charAt(index);
            if (allS1!=allS2){
                resbool=false;
            }

        }
        if (resbool){
            return true;
        }
        if(allS1!=allS2){
            return false;
        }

        char beginS1 = 0;
        char beginS2 = 0;
        char beginS2R = 0;

        for (int index = 0; index < length-1; index++) {
            beginS1^=s1.charAt(index);
            beginS2^=s2.charAt(index);
            beginS2R^=s2.charAt(length-index-1);
            if(beginS1==beginS2){
                if (isScramble(s1.substring(0,index+1),s2.substring(0,index+1))&&isScramble(s1.substring(index+1,length),s2.substring(index+1,length))){
                    return true;
                };
            }
            if (beginS1==beginS2R){
                if (isScramble(s1.substring(0,index+1),s2.substring(length-index-1,length))&&isScramble(s1.substring(index+1,length),s2.substring(0,length-index-1))){
                    return true;
                };
            }
        }

        return false;
    }

}

