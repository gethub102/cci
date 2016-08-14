public class ReplaceSpace {
    public static void main(String[] args) {
        System.out.println("Test replace whiteSpace in string");
        System.out.println("argslength = " + args.length);
        String s = "";
        boolean first = true;
        for (int i = 0;  i < args.length; i++) {
            if (first == true) {
                s += args[i];
                first = false;
            } else {
                s += " ";
                s += args[i];
            }
            
        }
        
        String ret = replaceSpace(s);
        System.out.println("result is " + ret);
    }
    static String replaceSpace(String s) {
        char[] str = s.toCharArray();
        int length = s.length();
        System.out.println("in replace function: " + "length is = " + length);
        int spaceCount = 0, newLength, i;
        for (i = 0; i < length; i++) {
            if (str[i] == ' ')
                spaceCount++;
        }
        System.out.println("in replace function: " + "spaceCount is = " + spaceCount);
        newLength = length + spaceCount * 2;
        
        //str[newLength] = '\0';
        // for (i = length - 1; i >= 0; i--) {
        //     if (str[i] == ' ') {
        //         str[newLength - 1] = '0';
        //         str[newLength - 2] = '2';
        //         str[newLength - 3] = '%';
        //         newLength -= 3;
        //     } else {
        //         str[newLength - 1] = str[i];
        //         newLength--;
        //     }
        // }
        // return new String(str);
        
        char[]  newStr = new char[newLength];
        for (i = length - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                newStr[newLength - 1] = '0';
                newStr[newLength - 2] = '2';
                newStr[newLength - 3] = '%';
                newLength -= 3;
            } else {
                newStr[newLength - 1] = str[i];
                newLength--;
            }
        }
        return new String(newStr);
    }
}