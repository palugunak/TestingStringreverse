public class StringRotation {

    static boolean areRotation(String str1,String str2){

        return (str1.length() == str2.length()) && ((str1 + str2).indexOf(str2)) != -1;
    }

    }

