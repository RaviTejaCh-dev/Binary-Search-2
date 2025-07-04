// Time Complexity : O(log n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int low = 0, high = n-1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if((mid == 0 || nums[mid] > nums[mid - 1]) && ( mid == n-1 || nums[mid] > nums[mid + 1])){
                return mid;
            }
            else if(nums[mid + 1] > nums[mid]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return -1;
    }
}