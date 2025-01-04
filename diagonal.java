package DSA;
import java.util.*;
public class diagonal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextInt();
        // int n = 7;
        for(int i=1; i<=n; i++){

            for(int j=1; j<=n; j++){
                // int p = 1;
                if(i==1 || i==n || j==1 || j==n || j == i || j==n+1-i){
                    System.out.print("  *");
                }                
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}