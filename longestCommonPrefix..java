/*
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
