import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        for (int i = 1 ; i <= m ; i++){
            for (int j = 1 ; j <= n ; j++){
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
    }
}
