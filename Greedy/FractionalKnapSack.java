import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapSack {
    public static void main(String[] args){
        int[] value = {60, 100, 120};
        int[] weight = {10, 20, 30};

        int Capacity = 50;

        double [][] ratio = new double[value.length][2];
        for(int i = 0; i < value.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));
        int ans = 0;
        for(int i = value.length -1 ; i >= 0 ; i--){
            int idx = (int)ratio[i][0];
            if(Capacity == 0){
                break;
            }
            if(weight[idx] <= Capacity){
               
                Capacity = Capacity - weight[idx];
                ans += value[idx];
            }else{
                ans += (ratio[i][1] * Capacity);
                Capacity = 0;
            }
        }

        System.out.println("Final Value = "+ ans);
    }
}
