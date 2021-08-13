import java.util.Scanner;

public class Program{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("This program converts temperatures to and from Celsius (C) and Fahrenheit (F)");

        System.out.println("Please enter '1' to convert to Celsius and '2' to convert to Fahrenheit");
        int tempLetter = input.nextInt(); // the int tempLetter has been given a value of 1 or 2 which will decide-
        //which equation is used later.

        System.out.println("Enter the temperature to convert (e.g, 10.0 or 37.50 ):");
        double tempnum = input.nextDouble(); // the users temperature has been stored as tempnum


        if (tempLetter <= 1){
            double tempnum2 = (tempnum - 32) * 5 / 9; //the original input is converted
            String tempNum3 = String.format("%.02f", tempnum2); //the result is formatted to have 2 decimal places
            System.out.println("The converted temperature is " + tempNum3 + " C");
        }
        else{
            double tempnum2 = tempnum * 9 /5 + 32;
            String tempNum3 = String.format("%.02f", tempnum2);
            System.out.println("The converted temperature is " + tempNum3 + " F");
        }
    }
}