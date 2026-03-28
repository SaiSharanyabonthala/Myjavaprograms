import java.util.Scanner;
public class def{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
double num1;
char operator;
double num2;
double result;
System.out.println("enter a number:");
num1=scanner.nextLine();
System.out.println("choose an operator(+,-,*,/,^):");
operator =scanner.next().charAt(0); 
System.out.println("enter an another number:");
num2=scanner.nextLine();
switch(operator){
case '+' -> result= num1 + num2;
case '-' -> result =num1-num2;
case '*' -> result =num1*num2;
case '/' -> result= num1/num2;
case '^' -> result= num1^num2;
default -> System.out.println("inavalid");
System.out.println(result);
scanner.close();
}}} 


