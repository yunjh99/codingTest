class Solution {
    public int solution(int[] num_list) {
        
        int num = 0;
        
        for(int i : num_list){
            if(i<0){
                return num;
            }
            num++;
        }
        return -1;
    }
}