import java.util.*;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int st=1;
        int sp=0;


        for(int i=1;i<=n;i++){

            for(int k=0;k<sp;k++){
                System.out.print("\t");
            }
            for(int j=1;j<=st;j++){
                System.out.print("*");
            }

            sp++;
            System.out.println();

        }

    }
}
