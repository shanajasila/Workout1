import java.util.Scanner;

public class Palindrome {
    public static void main(String arg[]){
        System.out.println(" Enter your string");
        Scanner sc=new Scanner(System.in);
        String L= sc.nextLine();
        String rev="";
        for (int i=0;i<L.length();i++){
            char ch=L.charAt(i);
            rev=ch+rev;
        }
        if (L.equals(rev))
                System.out.println("The given String is palindrome");
        else
            System.out.println(" The given string is not palindrome");


    }
}
