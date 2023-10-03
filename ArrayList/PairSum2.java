import java.util.*;
public class PairSum2 {
    public static boolean bruteForce(ArrayList<Integer> list, int target){
        
        for(int i = 0; i< list.size(); i++){
            for(int j = i+1; j < list.size(); j++){
                if(list.get(i)+list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean twoPointer(ArrayList<Integer> list, int target){
        int bp = -1;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i)> list.get(i+1)){
                bp = i;
                break;
            }
        }
        int lp = 0;
            int rp = list.size()-1;
        if(bp != -1){
        
            lp = bp+1;
            rp = bp;
        }
      
        while(lp != rp){
            if(list.get(lp)+list.get(rp) == target){
                return true;
            }

            if(list.get(lp)+list.get(rp) < target){
                lp = (lp+1)%list.size();
            }else{
                rp = (list.size()+rp-1)%list.size();
            }
        }
       
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
       
        System.out.print("Enter the Arraylist : ");
        int i = 0;
        while(i < n){

            list.add(sc.nextInt());
            i++;
        }
        System.out.print("Enter the target : ");
        int target = sc.nextInt();
        System.out.println(bruteForce(list, target));
        System.out.println(twoPointer(list, target));
    }
}