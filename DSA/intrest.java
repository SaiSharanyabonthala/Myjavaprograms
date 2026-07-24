import java.util.Scanner;
public class intrest{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        double principal;
        double rate;
        int timecompound;
        int years;
        double amount;
         
        System.out.print("enter principal: ");
        principal = scanner.nextDouble();
        System.out.print("enter rate: ");
        rate = scanner.nextDouble();
        System.out.print("enter timecompound: ");
        timecompound = scanner.nextInt();
        System.out.print("enter years: ");
        years= scanner.nextInt();
        System.out.print("enter amount: ");
        amount = scanner.nextDouble();
        amount=principal*Math.pow(1+rate/timecompound,timecompound * years);
        System.out.print(amount);
        scanner.close();
    }}