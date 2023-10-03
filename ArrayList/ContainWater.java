import java.util.*;
public class ContainWater {

    public static int BroutForce(ArrayList<Integer> list){
        int maxWater = Integer.MIN_VALUE;

        // time complexcity - O(n^2)
        for(int i =0; i < list.size();i++){
            for(int j = i+1; j < list.size(); j++){
                int len = Math.min(list.get(i), list.get(j));
                int width = j-i;
                int area = len * width;
                // System.out.println(area);
                if(area > maxWater){
                    maxWater = area;
                }
            }
        }
        return maxWater;
    }

    public static int towPointer(ArrayList<Integer> list){
        int maxWater = Integer.MIN_VALUE;

        int l = 0;
        int r = list.size()-1;
        while(l < r){
            int len = Math.min(list.get(l), list.get(r));
            int width = r-l;
            int area = len * width;
            // System.out.println(area);
            if(area > maxWater){
                maxWater = area;
            }

            if(list.get(l) < list.get(r)){
                l++;
            }else{
                r--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n;i++){
            list.add(sc.nextInt());
        }
        // System.out.println(BroutForce(list));
        System.out.println(towPointer(list));

    }
}
