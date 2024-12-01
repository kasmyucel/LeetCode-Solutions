// This is one of my first year solutions in the Computer Engineering department.
class Solution {
    public int climbStairs(int n) {
        if(n == 1)
          return 1;
        else if(n==2)
          return 2;
        else
          return fibonacciSequence(n);
    }
    public int fibonacciSequence(int termNum){
        int lastTerm =1;
        int tempTerm =1;
        int firstTerm =1;
        int counter =0;
        while(counter < termNum-1){
            lastTerm = tempTerm + firstTerm;
            tempTerm=firstTerm;
            firstTerm = lastTerm;
            counter++;
        }
        return lastTerm;
    }
}

