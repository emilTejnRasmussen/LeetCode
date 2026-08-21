class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;

        double guess=6;
        double prevGuess=0;
        double result=0;

        while(Math.abs(guess-prevGuess)!=0){
            result=(guess+(x/guess))/2;
            prevGuess = guess;
            guess=result;
        }
        return (int) Math.floor(result);
    }
}