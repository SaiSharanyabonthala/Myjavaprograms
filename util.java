import java.util.Scanner;
public class util {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("your name:");
        String name = scanner.nextLine();
        System.out.print("your age:");
        int age = scanner.nextInt();
        System.out.print("your marks:");
        double marks=scanner.nextDouble();
        System.out.print("you're  true/false");
        boolean gpa=scanner.nextBoolean();

        System.out.print("hello"+name);
        System.out.print("your are "+age);
        System.out.print("marks are"+marks);
        System.out.print("gpa "+gpa);
        if(gpa) {
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

        //common issues
        System.out.print("age:");
        int years = scanner.nextInt();
        scanner.nextLine();

        System.out.print("colour");
        String fav = scanner.nextLine();

        System.out.print("hi"+years);
        System.out.print("color"+fav);
        scanner.close();

    }

}