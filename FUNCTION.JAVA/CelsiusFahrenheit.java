import java.util.Scanner;
public class CelsiusFahrenheit{
    static void Temperature(float celsius){
            float fahrenheit=((celsius*9)/5)+32;
            System.out.print("CELSIUS INTO FAHRENHEIT :"+fahrenheit);
    }    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER TEMPERATURE :");
        float celsius=sc.nextFloat();
        Temperature(celsius);
        sc.close();
    }
}