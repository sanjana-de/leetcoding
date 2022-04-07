import java.io.*;
import java.util.*;
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        int i;
        for(i=0;i<temperatures.length;i++)
            answer[i] = 0;
        Stack<Integer> s = new Stack<>();
        for(i=0;i<temperatures.length;i++){
            
            //System.out.println("stack -->"+s);
            while((!s.isEmpty()) && (temperatures[i]>temperatures[s.peek()])){
                answer[s.peek()] = i-s.peek();
                s.pop();
            }
            s.push(i);
        }
        
        return answer;
    }
}