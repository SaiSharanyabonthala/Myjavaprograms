import java.util.Scanner;
    public class scp{
        public static void main(String[] arg){
            Scanner scanner =new Scanner(System.in);
            int price;
            String name;
            int quantity;
            double total;

            System.out.print("enter name of item: ");
            name=scanner.nextLine();
            System.out.print("enter price: ");
            price=scanner.nextInt();
            System.out.print("enter quantity: ");
            quantity=scanner.nextInt();
            total=price*quantity;
            System.out.println(total);
            System.out.println("Total amount for the  "+name+" of "+price+" where you have brought "+quantity+" of them are "+total);
            scanner.close();


        }
    }
