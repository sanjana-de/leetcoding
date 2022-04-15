import java.util.*;
class twoSum {
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> sum_set = new HashSet<Integer>();
        int i,j;
        for(i=0;i<nums.length-1;i++){
            for(j=0;j<nums.length;j++){
                //System.out.println(sum_map.get(nums[i]));
                //System.out.println(sum_map.get(nums[j]));
                if(!(sum_set.contains(j)) && nums[i]+nums[j] == target && i!=j){
                    sum_set.add(i);
                    sum_set.add(j);
                }
            }
        }
        int k = 0;
        int[] arr_result = new int[sum_set.size()];
        for(int i_val : sum_set){
            arr_result[k] = i_val;
            ++k;
        }
        return  arr_result;
    }
}