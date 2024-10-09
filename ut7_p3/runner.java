public class runner{
    public static void main(String[] args) {
        CustomStringMethods methods = new CustomStringMethods();
        String str = methods.funnyString("computer", 3);
        System.out.println(str);
        str = methods.funnyString("computer", 0);
        System.out.println(str);
        str = methods.funnyString("computer", 7);
        System.out.println(str);
        str = methods.funnyString("apples", 1);
        System.out.println(str);        
    }
}