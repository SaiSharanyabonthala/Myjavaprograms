import java.util.Scanner;
public class temp{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
double temp;
double newtemp;
String value;
System.out.println("enter temp:");
temp=scanner.nextDouble();
System.out.println("enter value(celcius or fahrenhiet)");
value=scanner.next().toUpperCase();
newtemp=(value.equals("C"))?(temp -32)*5/9:(temp*9/5)+32;
System.out.println(newtemp);
scanner.close();
}}
