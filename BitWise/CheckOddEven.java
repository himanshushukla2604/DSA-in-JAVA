import java.util.Scanner;
public class CheckOddEven {
    public static void OddOrEven(int num){
        int bitMask = 1;
        if((num & bitMask) == 1){
            System.out.println("Odd");
        }else{
            System.out.println("even");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        OddOrEven(num);
    }
}
