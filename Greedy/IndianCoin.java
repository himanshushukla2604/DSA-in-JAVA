import java.util.*;
public class IndianCoin {
    public static void main(String[] args){
        Integer []coin = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

        Arrays.sort(coin, Comparator.reverseOrder());
        int countOfCoin = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        int amount = 590;
        for(int i = 0; i < coin.length; i++){
             
            while(coin[i] <= amount){
                amount -= coin[i];
                ans.add(coin[i]);
                countOfCoin++;
            }
        }

        System.out.println("total (min) coins used : "+ countOfCoin);

        for(int i = 0; i< ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
    }
}
