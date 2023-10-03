import java.util.Arrays;
import java.util.Scanner;

public class RemoveDublicateFormString {

    public static void removeDublicate (String str , StringBuilder newString, int i, boolean arr[]){
        if(i == str.length()){
            System.out.println(newString);
            return;
        }
        char c = str.charAt(i);
        if(arr[ c-'a'] == false){
            newString.append(c);
            arr[c-'a'] = true;
        }
        removeDublicate(str, newString, i+1, arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean[] arr = new boolean[26];
        Arrays.fill(arr, false);
        StringBuilder newString = new StringBuilder();
        removeDublicate(str, newString,0, arr);
        
    }
}
