class Recstrstrfun
{
    // Recursive function to implement `strstr()` function
    public static String strstr(String X, String Y)
    {
        if (Y == null || Y.length() == 0) {
            return X;
        }

        for (int i = 0; i < X.length(); i++)
        {
            if (X.charAt(i) == Y.charAt(0))
            {
                String s = strstr(X.substring(i + 1), Y.substring(1));
                return (s != null) ? X.charAt(i) + s : null;
            }
        }

        return null;
    }

    public static void main(String[] args)
    {
        String X = "Techie Delight - Ace the Technical Interviews";
        String Y = "Ace";

        System.out.println(strstr(X, Y));
    }
}
