class missingNumber {
    public int missingNumber(int[] nums) {
        int sum_all = nums.length;
       int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum_all += i;
            sum += nums[i];
        }
        return sum_all-sum; 
    }
    
}