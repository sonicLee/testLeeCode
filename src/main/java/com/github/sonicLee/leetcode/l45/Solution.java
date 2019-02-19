package com.github.sonicLee.leetcode.l45;

/**
 * 给定一个非负整数数组，你最初位于数组的第一个位置。
 *
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 *
 * 你的目标是使用最少的跳跃次数到达数组的最后一个位置。
 *
 * 示例:
 *
 * 输入: [2,3,1,1,4]
 * 输出: 2
 * 解释: 跳到最后一个位置的最小跳跃数是 2。
 *      从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。
 * 说明:
 *
 * 假设你总是可以到达数组的最后一个位置。
 */
class Solution {
    public int jump(int[] nums) {
        int length=nums.length;
        int[] maxs=new int[length];
        maxs[0]=0;
        int next=0;
        while(next<length){
            int now=nums[next];
            int step=maxs[next];
            for(int i=1;i<=now;i++){
                if(i+next<length&&(maxs[i+next]==0||maxs[i+next]>step+1)){
                    maxs[i+next]=step+1;
                }
            }
            next++;
        }

        return maxs[length-1];
    }

}