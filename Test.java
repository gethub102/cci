public class Test {
    public static void main(String[] args) {
        String str = args[0];
        System.out.println("Test String is: " + str);
        int index = Integer.parseInt(args[1]);
        int retInt = str.charAt(index);
        char retChar = str.charAt(index);
        System.out.println("retInt = " + retInt);
        System.out.println("retChar = " + retChar);
        
        int a = 65;
        char ac = (char)a;
        System.out.println("65 cast into char is " + ac);
        
        
        System.out.println("////Test immutable string////");
        String str1 = "first";
        String str2 = "second";
        str1 += str2;
        System.out.println("result is " + str1);
    }
}