import java.util.Scanner;

public class Temperature {
    public static void main(String args[]){
        System.out.println("Enter the temperature value in faherenheit");
        Scanner a=new Scanner(System.in);
        float F=a.nextFloat();
        float c=((F-32)*5)/9;
        System.out.println("Temperature in celsius is: "+c);
    }
}
