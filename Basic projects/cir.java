import java.sql.SQLOutput;
import java.util.Scanner;
public class cir{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        double radius;
        double cir;
        double area;
        double volume;
        System.out.println("Enter a radius:");
        radius= scanner.nextDouble();
        cir=2* Math.PI *radius;
        System.out.println("the circumference:"+cir+"cm");
        area=Math.PI+Math.pow(radius, 2);
        System.out.println("the area:"+area+"cm");
        volume=(4.0/3.0)*Math.PI * Math.pow(radius, 2);
        System.out.println("the volume:"+volume+"cm");
        scanner.close();

    }
}
