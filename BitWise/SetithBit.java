import java.util.Scanner;
public class SetithBit {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = sc.nextInt();
        int bitMask = 1<<i;
        // this will handle both cases 0 to 1 and 1 to 0
        System.out.println(5^bitMask);
        // if we want to not change the but from 1 to 0 we can simply do OR "|" opration with bitMask
        System.out.println(5|bitMask);
    }
}
