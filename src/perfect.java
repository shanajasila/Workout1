import java.util.Scanner;

public class perfect {
    public static void main(String arg[]){
        System.out.println("Enter lower limit");
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        System.out.println("Enter upper limit");
        int u=sc.nextInt();
        for (int i=l;i<u;i++){
            if (Math.sqrt(i)==(int)Math.sqrt(i)){
                System.out.print(i+" ");
            }

        }
    }
}
