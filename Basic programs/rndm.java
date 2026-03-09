import java.util.Random;
public class rndm{
    public static void main(String[] args){
        Random random =new Random();
        int num1;
        int num2;
        int num3;
        num1= random.nextInt(1,5);
        num2= random.nextInt(1,7);
        num3= random.nextInt(3,6);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        //using double
        double numb1;
        numb1= random.nextDouble();
        System.out.println(numb1);
        //using boolean
        boolean isstd;
        isstd=random.nextBoolean();
        System.out.println(isstd);
    }
}
