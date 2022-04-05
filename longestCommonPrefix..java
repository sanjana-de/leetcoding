/*
Leetcode Problem 14 - https://leetcode.com/problems/longest-common-prefix/
Problem Statement : Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*/
class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int i,index = 0;
        int j=strs[0].length()-1;
        String output = "";
        Boolean flag = true;
        if(strs.length == 0){
            return output; 
        }
        if(strs.length == 1){
            return strs[0];
        }
        while(j>=0){
            if(strs[0].isEmpty() == true){
                return output;
            }
            
            char s = strs[0].charAt(index);
            for(i=1;i<strs.length;i++){
                
                if(strs[i].isEmpty() == true){
                    return output; 
                }
                if((index>=strs[i].length()) || (strs[i].charAt(index) != s)){
                    flag = false;                    
                    break;
                }
            }
            if(!flag)
                break; 
            ++index;
            --j;
        }
        output = strs[0].substring(0,index);
        return output;
    }
}
