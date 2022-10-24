import java.lang.*;
import java.util.Scanner;

public class Character {
    public static void main(String arg[]){
        System.out.println(" Enter a character");
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        char ch1= java.lang.Character.toLowerCase(ch);
        switch (ch1){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Character is vowel");
                break;
            default:
                System.out.println("Character is consonant");
                break;
        }
    }
}
