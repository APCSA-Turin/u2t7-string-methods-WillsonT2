import java.util.Scanner;

public class main{
    public static void main(String[] args) {    
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = scan.nextLine();
        System.out.println("Enter second string: ");
        String str2 = scan.nextLine();

        if (str1.length() > str2.length()){
            System.out.println(str1 + " is longer");
        }else if (str2.length() > str1.length()) {
            System.out.println(str2 + " is longer");
        }else {
            System.out.println("Both strings have the same length");
        }

        System.out.println("First half: " + str1.substring(0, (str1.length() / 2)));
        System.out.println("Second half: " + str1.substring((str1.length() / 2)));

        System.out.println("First half: " + str2.substring(0, (str2.length() / 2)));
        System.out.println("Second half: " + str2.substring((str2.length() / 2)));

        if (str1.contains(str2)){
            System.out.println(str2 + " is found in " + str1 + " at index " + str1.indexOf(str2));
        }else {
            System.out.println(str2 + " is not found in " + str1);
        }
    }
}