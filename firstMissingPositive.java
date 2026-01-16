package Infinity_Champions;

import java.util.*;

public class firstMissingPositive {
    public static void main(String[] args) {
        int nums[] = {3, 4, -1, 1};
        brute(nums);
        opt(nums);
    }

    static void brute(int []nums){
        Arrays.sort(nums);
        int n = nums.length;
        int idx = -1;
        for(int i=1;i<n;i++){
            if(nums[i] == -1)continue;
            else if(nums[i] + 1 != nums[i+1]){
                idx = i+1;
                break;
            }
        }
        System.out.println(idx);
    }

    static void opt(int[]nums){
        int n = nums.length;
        for(int i=0;i<n;i++){
            while(nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]){
                int idx = nums[i] - 1;
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;
            }
        }
        for(int i = 0;i<n;i++){
            if(nums[i] != i+1){
                System.out.println(i+1);break;
            }
        }
    }
}
