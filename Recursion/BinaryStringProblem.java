import java.util.Scanner;
public class BinaryStringProblem {

    public static void binaryString(int n, String str, int lp){
        if(n == 0){
            System.out.println(str);
            return;
        }
        if(lp == 0){
            
            binaryString(n-1, str + "1", 1);
            binaryString(n-1, str + "0", 0);

        }else{
           
            binaryString(n-1, str+"0", 0);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        binaryString(n, "", 0);
    }
}
