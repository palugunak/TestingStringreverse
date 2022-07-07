public class ReverseString {

    public static String reverse(String S){

         String str1 = "";
        for(int i = 0;i<S.length();i++){
            str1 = S.charAt(i) + str1;

        }
        System.out.println(str1);
        return str1;
    }

    public static void main(String[] args)
    {
        String S = "Techie";
      //  String Y = "for";


        reverse("techie");
    }

}
