import java.util.Scanner;

public class ZeroOneTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(p);
                if(p == 1){
                    p = 0;
                }else{
                    p = 1;
                }
            }
            System.out.println();
        }
    }
}
