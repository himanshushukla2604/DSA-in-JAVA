import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n;i++){
            for(int j = 0; j < n; j++){
                if(j <= i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int k = n-1; k >= 0; k--){
                if(k <= i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i = 0; i < n;i++){
            for(int j = 0; j < n; j++){
                if(j <= (n-1)-i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int k = n-1; k >= 0; k--){
                if(k <= (n-1)-i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
