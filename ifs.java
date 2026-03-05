import java.util.Scanner;
public class ifs{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String name;
        int age;
        boolean Std;
        System.out.println("enter ur name: ");
        name=scanner.nextLine();

        System.out.println("enter a number: ");
        age= scanner.nextInt();

        System.out.println("are u a student(true/false): ");
        Std=scanner.nextBoolean();
        //string
        if(name.isEmpty()){
            System.out.println("dont you have a name!");
        }else{
            System.out.println("hello"+name);
        }
        //int
        if(age >=0 && age <=10){
            System.out.println("you are a baby");
        }
        else if(age >= 10 && age<= 20){
            System.out.println("you are just a kid");
        }else{
            System.out.println("you are an adult");
        }
        //boolean
        if(Std){
            System.out.println("you are a student");
        }else{
            System.out.println("you are not a student");
        }
        scanner.close();
    }
}