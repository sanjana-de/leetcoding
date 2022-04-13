import java.util.*;
class intersectionOf2Arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set_result = new HashSet<Integer>();
        int k=0;
        for(int nums1_element : nums1){
            if(searchArray(nums2,nums1_element) == true){
                set_result.add(nums1_element);
            }
        }
        int[] arr_result = new int[set_result.size()];
        for(int key : set_result){
            arr_result[k++] = key;
        }
        return arr_result; 
    }
    boolean searchArray(int[] array, int key){
        if(array.length==0) return false;
        for(int element : array){
            if(element == key){
                return true;
            }
        }
        return false;
    }
}