import java.util.Scanner;
//Vincent Zhao Period 2-3 9-26-18
public class guess
{
    public static void main(String[] args) {
        int min = 1;
        int max = 0;
        int compG = 0;
        int start = 0;
        Scanner a2 = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = a2.nextLine();
        System.out.println("Welcome " + name);
        System.out.println("Which Game would you like to play, " + name + "?");
        System.out.println("Type 1 if you want to play the game that the computer guesses your number");
        System.out.println("Type 2 if you want to play the game that you guess the computer's number");
        String choice = a2.nextLine();
        int b = Integer.parseInt(choice);
        System.out.println("Choose Your Difficulty");
        System.out.println("Choose from numbers 1 to 4");
        System.out.println("1 is the easiest-4 being the hardest");
        String dif = a2.nextLine();
        int a = Integer.parseInt(dif);
        if (a == 1) {
                max = 10;
                System.out.println("You have chosen Chicken Mode.\nGuess From (1-10)");
        } else if (a == 2) {
                max = 100;
                System.out.println("You have chosen Easy Mode.\nGuess From (1-100)");
        } else if (a == 3) {
                max = 1000;
                System.out.println("You have chosen Hard Mode.\nGuess From (1-1,000)");
        } else if (a == 4) {
                max = 10000;
                System.out.println("You have chosen Eggtreme Mode.\nGuess From (1-10,000)");
        } else {
            System.out.println("You didn't choose a correct number!!");
            System.out.println("You get difficulty 4 ");
            max = 10000;
        }


        if(b==2) {
            int range = (max - min) + 1;
            int random = (int) (Math.random() * range + min);
            System.out.println("What is your guess, " + name + "?");
            String output1 = a2.nextLine();
            int output2 = Integer.parseInt(output1);
            while (output2 != random) {

                System.out.println("Wrong Answer, " + "Mr." + name);
                System.out.println("Guess Again " + name);
                output1 = a2.nextLine();
                output2 = Integer.parseInt(output1);
            }

            System.out.println("You Won " + name);
            a2.close();
        }

        int max1=max+1;
        if (b == 1)
        {


            System.out.println("Is your number 1?");
            System.out.println("Choose From One of These Words Below To Respond " + name);
            System.out.println("higher or  lower  or   correct");
            String output1 = a2.nextLine();
            output1 = output1.toLowerCase();

            while (!output1.equals("correct")) {

                if (output1.equals("higher")) {
                    compG = (int) (Math.random() * max1) + 0;
                    System.out.println("Is your number, " +compG+"? "+ name + "?");
                    output1 = a2.nextLine();

                }
                if (output1.equals("lower")) {
                    compG = (int) (Math.random() * max1) + 0;
                    System.out.println("Is your number, "+compG +"? "+ name + "?");
                    output1 = a2.nextLine();

                }

            }

            if (output1.equals("correct")) {
                System.out.println("I win!");
            }
            a2.close();
        }
    }
}