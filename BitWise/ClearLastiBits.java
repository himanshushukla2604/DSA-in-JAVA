import java.util.Scanner;
public class ClearLastiBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = sc.nextInt();
        int bitMask = (-1)<<i;
        System.out.println("After clearing last"+ i +"bits the output will be "+ (num&bitMask));
    }
}

