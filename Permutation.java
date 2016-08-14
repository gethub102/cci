public class Permutation {
    public static void main(String[] args) {
        String s = args[0];
        String t = args[1];
        
        boolean ret = permutation(s, t);
        if (ret == true) 
            System.out.println("They are permutation string");
        else 
            System.out.println("They are not permutation string");
            
        boolean ret2 = isPermutation(s, t);
        if (ret2 == true) 
            System.out.println("ret2 They are permutation string");
        else 
            System.out.println("ret2 They are not permutation string");
        
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
    
    
    /* Solution 2 for this issue */
    static boolean isPermutation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] letter = new int[128]; // ascii asumption\
        
        char[] s_array = s.toCharArray();
        for (char c : s_array) 
        {
            letter[c]++;
        }
        
        for (int i = 0; i < t.length(); i++) {
            int c = t.charAt(i);
            letter[c]--;
            if (letter[c] < 0)
                return false;
        }
        
        return true;
    }  
}