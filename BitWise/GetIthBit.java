import java.util.Scanner;

public class GetIthBit{

    public static void getithbit(int n, int i){
        int bitMask = 1<<i;
        if((n&bitMask) == 0){
            System.out.println("ith Bit is 0");
        }else{
            System.out.println("ith bit is 1");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        getithbit(n, i);
    }
}