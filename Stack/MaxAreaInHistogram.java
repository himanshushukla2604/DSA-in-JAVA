import java.util.Stack;
public class MaxAreaInHistogram {
    
    public static void nextSmallerLeft(int[] height, int[] nsl){
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i< height.length; i++){
            
            while(!stack.isEmpty() && height[stack.peek()] >= height[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nsl[i] = -1;
                stack.push(i);
            }else if(height[stack.peek()] < height[i]){
                nsl[i] = stack.peek();
                stack.push(i);
            }
        }
    }

    public static void nextSmallerRight(int[] height, int[] nsr){
        Stack<Integer> stack = new Stack<>();
        for(int i = height.length-1; i >= 0; i--){
           
            while(!stack.isEmpty() && height[stack.peek()] >= height[i]){
                stack.pop();
            }
            
            
            if(stack.isEmpty()){
                nsr[i] = height.length;
                stack.push(i);
            }else if(height[stack.peek()] < height[i]){
                nsr[i] = stack.peek();
                stack.push(i);
            }
        }
    }

    public static void main(String[] args){
        int[] height = {2, 1, 5, 6, 2, 3};
        int[] nsr = new int[height.length];
        int[] nsl = new int[height.length];

        nextSmallerLeft(height, nsl);
        nextSmallerRight(height, nsr);
        int maxArea = -1;
        for(int i = 0; i < height.length; i++){
            int area = 0;
            int h = height[i];
            int w = nsr[i] - nsl[i] -  1;
            
            area = h * w;

            maxArea = Math.max(maxArea, area);
        }

        System.out.println(maxArea);
    }
}
