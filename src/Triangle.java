import java.util.Scanner;

public class Triangle {
    public static void main(String a[]){
        System.out.println("Enter the limit");
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        for (int i=1;i<=rows;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i);

            }
            System.out.println();
        }

    }


}
