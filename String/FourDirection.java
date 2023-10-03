import java.util.Scanner;
public class FourDirection{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String direction = sc.nextLine();
        int x = 0;
        int y = 0;
        for(int i = 0; i < direction.length(); i++){
            switch(direction.charAt(i)){
                case 'N' : y++;
                break;
                case 'S' : y--;
                break;
                case 'E' : x++;
                break;
                case 'W' : x--;
                break;
            }
        }
       
        int ans = (int)Math.sqrt((x*x)+(y*y));
        System.out.println(ans);
    }
}