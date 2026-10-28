class Solution {
    public int[] solution(long n) {

        String str = new StringBuilder(String.valueOf(n))
            .reverse()
            .toString();
        
        int [] arr = new int[str.length()];
        
        for (int i=0; i<arr.length; i++){
            arr[i] = str.charAt(i)-'0';
        }
        
        return arr;
        
    }
}