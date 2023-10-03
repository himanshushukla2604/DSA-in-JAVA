import java.util.Scanner;

public class FastExponentiation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int ans=1;
        while(n!= 0){
            if((n&1)!= 0){
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        System.out.println(ans);
    }
}