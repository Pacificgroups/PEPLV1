import java.util.*;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();
        int st=n;
        int sp=0;

        for(int i=1;i<=n;i++){
            for(int j=0;j<sp;j++){
                System.out.print("\t");
            }
            for(int k=1;k<=st;k++){
                System.out.print("*\t");
            }
            st--;
            sp++;
            System.out.println();
        }

    }
}
