    import java.util.Scanner;
    public class PasswordChecker {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            String s = "aA1_67";
            boolean isDigitFound = false;
            boolean isCapFound = false;
            if(s.length() < 4 || Character.isDigit(s.charAt(0))){
                System.out.println(0);
                return;
            }
            for(int i=0;i<s.length()-1;i++) {
                char ch = s.charAt(i);
                if(ch == ' ' || ch == '/'){
                    System.out.println(0);
                    return;
                }
                if(ch >= 'A' && ch <= 'Z' && !isCapFound){
                    isCapFound = true;
                }
                if(Character.isDigit(ch) && !isDigitFound){
                    isDigitFound = true;
                }
            }

            if(isCapFound && isDigitFound){
                System.out.println(1);
            }else{
                System.out.println(0);
            }

        }
    }


