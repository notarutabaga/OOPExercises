import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanboi = new Scanner(System.in);

        //ex 1
        /*System.out.print("What is your name? ");
        String name = scanboi.nextLine();
        System.out.println("Hello " + name);

        //ex 2
        System.out.print("What is the input string? ");
        String input = scanboi.nextLine();
        System.out.println(input + " has " + input.length() + " characters");

        //ex 3
        System.out.print("What is the quote? ");
        String quote = scanboi.nextLine();
        System.out.print("Who said it? ");
        String author = scanboi.nextLine();

        System.out.println(author + " says, " + "\"" + quote + "\"");

        //ex 4
        String noun, verb, adjective, adverb;

        System.out.print("Enter a noun: ");
        noun = scanboi.nextLine();
        System.out.print("Enter a verb: ");
        verb = scanboi.nextLine();
        System.out.print("Enter an adjective: ");
        adjective = scanboi.nextLine();
        System.out.print("Enter an adverb: ");
        adverb = scanboi.nextLine();

        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's fucking hilarious!");

        //ex 5
        System.out.print("What is the first number? ");
        String str1 = scanboi.nextLine();
        System.out.print("What is the second number? ");
        String str2 = scanboi.nextLine();

        int int1 = Integer.parseInt(str1);
        int int2 = Integer.parseInt(str2);

        int sum = int1 + int2;
        int diff = int1 - int2;
        int prod = int1 * int2;
        int quot = int1 / int2;

        System.out.println(String.format("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d", int1, int2, sum, int1, int2, diff, int1, int2, prod, int1, int2, quot));

        //ex 6
        System.out.print("What is your current age? ");
        String currentAge = scanboi.nextLine();
        System.out.print("At what age would you like to retire? ");
        String retireAge = scanboi.nextLine();

        int age = Integer.parseInt(currentAge);
        int retire = Integer.parseInt(retireAge);
        int year = Calendar.getInstance().get(Calendar.YEAR);

        System.out.println("You have " + (retire - age) + " years left until you can retire.");
        System.out.println("It's " + year + " , so you can retire in " + (year + (retire - age)));

        //ex 14
        System.out.print("What is the order amount? ");
        double subtotal = scanboi.nextDouble();
        scanboi.nextLine(); //eats the new line
        System.out.print("What is the state? ");
        String state = scanboi.nextLine();

        if(state.equals("WI")) {
            //print subtotal
            System.out.println("The subtotal is $" + String.format("%.2f", subtotal) + ".");
            double tax = subtotal * 0.055;
            System.out.println("The tax is $" + String.format("%.2f", tax) + ".");
            subtotal += tax;
        }

        //print final total
        System.out.println("The total is $" + String.format("%.2f", subtotal));

        //ex 7
        final double convFactor =  0.09290304;

        //ex 8
        System.out.print("How many people? ");
        int people = scanboi.nextInt();
        System.out.print("How many pizzas do you have? ");

        //ex 9
        final double sfPerGal = 350.0;

        System.out.print("Length: ");
        double length = scanboi.nextDouble();
        System.out.print("Width: ");
        double width = scanboi.nextDouble();

        double area = length * width;
        double gallons = Math.ceil(area / sfPerGal);

        System.out.println(String.format("You will need to purchase %.0f gallons of paint to cover %.0f square feet", gallons, area));*/
    }
}
