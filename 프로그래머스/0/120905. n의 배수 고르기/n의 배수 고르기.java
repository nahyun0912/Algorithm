class Solution {
    public int[] solution(int n, int[] numlist) {
        int x=0;
        for(int i=0;i<numlist.length;i++){
            if(numlist[i]%n==0){
                x++;
            }
        }
        int[] answer = new int[x];
        int j=0;
        for(int i=0;i<numlist.length;i++){
            if(numlist[i]%n==0){
                answer[j]=numlist[i];
                j++;
            }
        }
        
        return answer;
    }
}