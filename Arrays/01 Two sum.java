/***********************************************************************************
URL: https://leetcode.com/problems/two-sum/description/?envType=featured-list&envId=top-100-liked-questions?envType=featured-list&envId=top-100-liked-questions

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?

************************************************************************************/
// O(n^2)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return new int[2];
    }
}

// O(n) using hashmap
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }
        int ans[] = new int[2];
        for(int i=0;i<n;i++){
            if(map.containsKey(target-nums[i]) && i!=map.get(target-nums[i])){
                ans[0] = i;
                ans[1] = map.get(target-nums[i]);
                break;
            }
        }
        return ans;
    }
}
