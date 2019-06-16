import java.util.Scanner;

public class Main { public static void main(String[] args)
{
    Scanner scan = new Scanner(System.in);
    System.out.println("How is the weather?");
    //String input

    String answers = scan.nextLine();

    if (answers.equalsIgnoreCase("rain")) {
        System.out.println("Take your umbrella!" );
    } else if (answers.equalsIgnoreCase("windy")) {
        System.out.println("Wear your jacket!" );
    } else if (answers.equalsIgnoreCase("stormy")) {
        System.out.println("You should stay inside!");
    } else if (answers.equalsIgnoreCase("snow")) {
        System.out.println("Wear a coat and take a shove!");
    } else {
        System.out.println("Enjoy your day!");
    }
    answers = scan.nextLine();


}




}
