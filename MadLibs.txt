import java.util.Scanner;
public class MadLibs{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1;
        String word2;
        String word3;
        String word4;

        System.out.println("enter a word in for action" );
        word1 = scanner.nextLine();
        System.out.println("enter a word (name)" );
        word2 = scanner.nextLine();
        System.out.println("enter a word (name)" );
        word3 = scanner.nextLine();
        System.out.println("enter a word (name)" );
        word4 = scanner.nextLine();

        System.out.println("hi this is"+word1+"how are you"+word2+"hello"+word3+"hi sweety"+word4);

    }}
