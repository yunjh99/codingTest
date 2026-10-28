import java.util.*;

public class Solution {
    public int solution(int n) {
        
        int sum = 0;
        String str = String.valueOf(n);
        
        for(int i=0; i<str.length(); i++){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
}