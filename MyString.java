public class MyString {
    public static void main(String[] args) {
        /**System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));
        */

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
        

         //System.out.println(fromThisChar(2 , "unhappy", "happy"));
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        if (str == null) {
            return null;
        }
        for (int i=0; i<str.length(); i++)
        {
            char c = str.charAt(i);
            if ((c>='A') && (c<='Z')) {
                char newC = (char) (c+32);
                str = str.replace(c, newC);
            }
        }
        return str;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if ((str1 == null) || (str2 == null)) {
            return false;
        }
        if ((str1.length() < str2.length())) {
            return false;
        }
        for (int i=0; i<=str1.length() - str2.length(); i++){
            if (fromThisChar(i, str1, str2) == true) {
                return true;
            }
        }
        return false;
    }

    // return true if  index i on str1, str2 start
    public static boolean fromThisChar (int i, String str1, String str2) {
        int i2 = 0;
        while (i < str1.length()) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i2);
            if (c1 != c2) {
                return false;
            }
            else {
                i2 ++;
                i++;
            }
            if (i2 == str2.length()) {
                return true;
            }
        }
        return false;
        
    }
}
