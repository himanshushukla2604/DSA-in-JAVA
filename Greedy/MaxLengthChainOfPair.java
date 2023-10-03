import java.util.*;
public class MaxLengthChainOfPair {
    public static void main(String[] args){
        
        int[][] pair = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};

        Arrays.sort(pair, Comparator.comparingDouble(o->(o[1])));

        int maxLenChain = 1;
        int lastPair = 0;
        for(int i = 1; i < pair.length; i++){
            if(pair[i][0] > pair[lastPair][1]){
                maxLenChain++;
                lastPair = i;
            }
        }

        System.out.println(maxLenChain);

    }
}
