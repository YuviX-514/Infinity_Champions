package Infinity_Champions;

import java.util.*;

public class _3Sum {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        brute(nums);
        opt(nums);
    }

    static void brute(int[]nums){
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        int n = nums.length;
        for(int i = 0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }
        System.out.println(res);
    }

    static void opt(int[]nums){
        Arrays.sort(nums);
        List<List<Integer>>res = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(i > 0 && nums[i] == nums[i-1])continue;

            int l = i+1;
            int r = n-1;

            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    while(l < r && nums[l] == nums[l+1])l++;
                    while(l < r && nums[l] == nums[r-1])r--;

                    l++;
                    r--;
                }
                else if(sum > 0){
                    r--;
                }
                else l++;
            }
        }
        System.out.println(res);
    }

}
