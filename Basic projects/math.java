import java.util.Scanner;
public class math{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("enter value of a:");
        a= scanner.nextDouble();
        System.out.println("enter value of b:");
        b= scanner.nextDouble();
        c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("The hypotenuse of c:"+c);
        scanner.close();
    }
}