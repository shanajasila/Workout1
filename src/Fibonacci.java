import java.util.Scanner;

public class Fibonacci {
    static int n1=0,n2=1,n3=0;
    static void fib(int n){
        if (n>=0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3);
            fib(n-1);
        }

    }
    public static void main(String ar[]){
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.print(n1+""+n2);
        fib(n-2);

    }
}
