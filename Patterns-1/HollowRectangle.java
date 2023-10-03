import java.util.*;
public class HollowRectangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length : ");
        int length = sc.nextInt();
        System.out.print("Enter width : ");
        int width = sc.nextInt();

        for(int i = 0; i < width; i++){
            for(int j=0; j< length;j++){
                if(i == 0 || j == 0 || i == width-1 || j== length-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}