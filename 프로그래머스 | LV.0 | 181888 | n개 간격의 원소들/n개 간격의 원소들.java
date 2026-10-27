class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int result[] = new int[num_list.length % n == 0 ? num_list.length / n : (num_list.length / n)+1];
        
        int num = 0; 

        for(int i=0; i<result.length; i++){
            result[i] = num_list[num*n];
            num++;
        }
        return result;
    }
}