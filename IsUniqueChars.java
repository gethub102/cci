public class IsUniqueChars {
    public static void main(String[] args) {
        String str = args[0];
        System.out.println("Test is unique chars in ASCII code: " + str);
        
        boolean ret = isUniqueChars(str);
        if (ret)
            System.out.println("It is unique");
        else 
            System.out.println("It is not unique");
    }
    static boolean isUniqueChars(String str) {
        if (str.length() > 128) 
            return false;
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val])
                return false;
            else 
                char_set[val] = true;
        }
        return true;
    }
    
}