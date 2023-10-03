import java.util.*;
public class ActivitySelection {
    public static void main(String[] args){
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        // if the activities are not sorted according of end time we will have to sort them
        // for that we can make a 2d array int which row will contaion [curr_index, start, end]
        // and we will sort that 2d array on the basis of third column (end time)
        
        // we need to store orignal index because after sorting we will not able to tell the orignal order and we have to answer according to that

        int[][] activity = new int[start.length][3];

        for(int i = 0; i< start.length; i++){
            activity[i][0] = i;
            activity[i][1] = start[i];
            activity[i][2] = end[i];
        }

        Arrays.sort(activity, Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> ans = new ArrayList<>();
        int maxAct = 1;
        ans.add(activity[0][0]);
        int lastEnd= activity[0][2];

        for(int i = 1; i < end.length; i++){
            if(activity[i][1] >= lastEnd){
                maxAct++;

                ans.add(activity[i][0]);
                lastEnd = activity[i][2];
            }
        }

        System.out.println("Max Activity = "+ maxAct);
        for(int i = 0; i < ans.size(); i++){
            System.out.print("A" + ans.get(i)+ " ");
        }
    }
}
