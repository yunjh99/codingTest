class Solution {
    public int solution(String s) {
        
        int num = 0;
        
        if(s.charAt(0) == '-'){
            num = Integer.parseInt(s.substring(1));
            num *= -1;
        } else if(s.charAt(0) == '+'){
            num = Integer.parseInt(s.substring(1));
        } else {
            num = Integer.parseInt(s);
        }
        return num;
    }
}