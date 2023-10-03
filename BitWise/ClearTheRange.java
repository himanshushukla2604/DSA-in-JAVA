import java.util.Scanner;

public class ClearTheRange {
    public static void main(String[] args) {
        // num = 10, i = 2, j = 4 
        // 10 = 00001010 desited output = 00000010
        //         j i
        // a = 11100000
        // b = 00000011
        // bitMask = a|b = 11100011
        // output = num & bitMask = 00001010 & 11100011 = 00000010 => 2
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();

        int a = (~0)<<j+1;
        int b = (1<<i)-1;

        int bitMask = a|b;

        System.out.println(num & bitMask);
    }
}
