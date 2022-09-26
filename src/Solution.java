public class Solution {
    public int solution(int N) {
        // write your code in Java SE 8

        int maximum_gap = 0;
        int current_gap =0;
        boolean counting = false;

        // Using the "concept of bit manipulation" and "& operation"

        while( N !=0 ){

            if(!counting){    // for the first "1"
                if( (N&1) == 1){      // note: cannot use n&1 without "()"
                    counting = true;  // start to count
                }
            }
            else{                    // counting = true
                if( (N&1) ==0){      // note: cannot use n&1 without "()"
                    current_gap ++;
                }
                else{ // N & 1 == 1
                    maximum_gap = Math.max(maximum_gap, current_gap);
                    current_gap = 0; // reset
                }
            }

            N = N >> 1; // shift by one (right side)
            // note: cannot just write "N >> 1"
        }

        return maximum_gap;
    }
    public static void main(String[] args) {

        Solution a = new Solution();
        System.out.println(a.solution(15));
    }
}