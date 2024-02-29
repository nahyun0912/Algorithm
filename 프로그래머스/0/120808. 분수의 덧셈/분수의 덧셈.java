class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int nu = numer1 * denom2 + numer2*denom1;
        int de = denom1 * denom2;
        
        int max = 1;
        for(int i=1; i<=nu && i<=de;i++){
            if(nu%i==0 && de%i==0){
                max = i;
            }
        }
        nu /= max;
        de /= max;
        int[] answer = {nu, de};
        return answer;
    }
}