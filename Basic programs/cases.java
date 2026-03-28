import java.util.Scanner;
public class cases{
public static void main(String[] args){
Scanner scanner =new Scanner(System.in);
String name;
System.out.println("enter your name :");
name=scanner.nextLine();
if(name.length() < 5 ||  name.length() > 12 ){
System.out.println("welcome" );
}

scanner.close();
}}