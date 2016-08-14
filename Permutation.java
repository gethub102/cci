public class Permutation {
    public static void main(String[] args) {
        String s = args[0];
        String t = args[1];
        
        boolean ret = permutation(s, t);
        if (ret == true) 
            System.out.println("They are permutation string");
        else 
            System.out.println("They are not permutation string");
        
    }
    
    public static String sort(String s) {
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }
    
    static boolean permutation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
       if (sort(s).equals(sort(t))) {
           return true;
       }
       return false;
    }
}