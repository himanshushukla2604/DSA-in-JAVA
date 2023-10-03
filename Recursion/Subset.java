import java.util.Scanner;
public class Subset{
    public static void subset(String str,String newStr,int i ){
        if(i == str.length()){
            if(i == str.length()-1)
                System.out.println("null");
            else
                System.out.println(newStr);
            return;
        }
        subset(str, newStr+str.charAt(i), i+1);
        subset(str, newStr, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        subset(str, "", 0);
    }
}