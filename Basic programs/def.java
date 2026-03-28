import java.util.Scanner;
public class def{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
double num1;
char operator;
double num2;
double result=0;
boolean validoperation = true;
System.out.println("enter a number:");
num1=scanner.nextDouble();
System.out.println("choose an operator(+,-,*,/,^):");
operator =scanner.next().charAt(0); 
System.out.println("enter an another number:");
num2=scanner.nextDouble();
switch(operator){
case '+' -> result= num1 + num2;
case '-' -> result =num1-num2;
case '*' -> result =num1*num2;
case '/' -> {
if(num2 == 0){
System.out.println("cannot be divided");
validoperation= false;
}
else{
result= num1/num2;
}}
case '^' -> result= Math.pow(num1,num2);
default -> {
System.out.println("inavalid");
validoperation = false;
}}
if (validoperation == true){
System.out.println(result);
}

scanner.close();
}} 


