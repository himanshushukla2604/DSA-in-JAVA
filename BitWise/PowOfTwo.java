import java.util.Scanner;

public class PowOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if((num&(num-1)) == 0){
            System.out.println("Number is power of 2");
        }else{
            System.out.println("Number is not power of 2");
        }
    }
}
