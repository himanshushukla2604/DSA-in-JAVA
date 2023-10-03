import java.util.Scanner;
public class TilingProblem{
    // Given a "2xn" board and tiles of size "2X1" count the number of ways to tile the given board using the 2X1 tiles.
    //(A tile cna either be placed horizontally or vertically)


    /* If we will place the tile vertically it's width is 1 so we have to cover remaining n-1 part with tiles
     *  _______________________________________________________
     * |    |                                                  |
     * |    |                                                  |
     * |    |                                                  |
     * |____|__________________________________________________|
     * ---------------------------- n --------------------------
     * --1-- ------------------------ n-1 ----------------------
     * 
     * If we put a horizontal tile we have to put on other one horizontaly to cover the width of "2" and 
     * since the length of tile is 2 so you will have to cover (n-2) part of the floor
     *  _______________________________________________________
     * |        |                                             |
     * |________|                                             |
     * |        |                                             |
     * |________|_____________________________________________|
     * ---------------------------- n ------------------------
     * ----2----- -------------------- n-2 --------------------
     * 
     * so we  have 2 choice 
     *vertical f(n-1)
     * horizontal = f(n-2)
     * Base case = if (n==1 || n==0)return 1
     * if n = 0 we return 1 because that is a way do not need to cover
     */
    public static int Tiling(int n){
        if(n == 1 || n == 0){
            return 1;
        }

        return Tiling(n-1) + Tiling(n-2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Tiling(n));
    }
}