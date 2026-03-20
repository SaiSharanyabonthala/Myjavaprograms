import java.util.Scanner;
public class wconvt{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
String name;
double kgs;
double lbs;
int choice;

System.out.println("enter you name: ");
name=scanner.nextLine();
System.out.println("hello" +name+ "choose an option");


System.out.println("option 1: kgs to lbs " );
System.out.println("option 2: lbs to kgs " );
choice=scanner.nextInt();
if(choice ==1 ){
System.out.println("enter weight in kgs ");
kgs =scanner.nextDouble();
lbs=kgs/2.024;
System.out.println("weight in lbs"+lbs);
}
else{
System.out.println("invalid");
}
if(choice == 2){
System.out.println("enter weight in lbs ");
lbs = scanner.nextDouble();
kgs = lbs *2.024;
System.out.println("weight in kgs"+kgs);

}
scanner.close();
}}







