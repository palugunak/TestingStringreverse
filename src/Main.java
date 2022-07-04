import java.io.IOException;

public class Main {
    public static int main(String[] args) throws IOException {


    /*   BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
       int t = Integer.parseInt(read.readLine());

       while(t -->0){
           String str = read.readLine();
           System.out.println(new Palindrome().isPalindrome(str)); */

            /* program for palindrome */

            String a = "abcde";
            String nstr ="";
            for(int i = a.length() -1;i >=0;i--){
                 nstr += a.charAt(i);

       }
        System.out.println(nstr);

            boolean palindrome = false;
            for(int i=0;i<a.length();i++){
               if(a.charAt(i) != nstr.charAt(i)){
                   return 0;
               }
            }

        return 1;
    }
}