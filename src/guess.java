import java.util.Scanner;

public class guess
{
    public static void main(String[] args)
    {
        Scanner a2= new Scanner(System.in);
        int min=1;
        int max=100;
        int range=(max-min)+1;
        int random=(int)(Math.random()*range+min);
        System.out.println("What is your guess?\nType Either\n higher    lower     correct");
        String output1=a2.nextLine();
        output1=output1.toLowerCase();
        if(output1=="higher")
        {
            
        }
        if(output1=="lower")



       /*
        //Put Max-Min variables in if statments
        Scanner a1= new Scanner(System.in);
        int min=1;
        int max=10;
        int range=(max-min)+1;
        int random=(int)(Math.random()*range+min);
        System.out.println("What is your guess?");
        String output1=a1.nextLine();
        int output2=Integer.parseInt(output1);
        while(output2!=random)
        {
            Scanner b1= new Scanner(System.in);
            System.out.println("Wrong Answer");
            output1=b1.nextLine();
            output2=Integer.parseInt(output1);
        }
        System.out.println("You Won");
        */



       /*
        Ask for user name
        Scanner a = new Scanner(System.in);
        String A= "Welcome Player One";
        String B="Choose Your Difficulty";
        String C="Choose from numbers 1 to 4\n(1 is the lowest-4 being the hardest)";
        System.out.println(A+"\n"+B+"\n"+C);
        String D=a.nextLine();
        int Di=Integer.parseInt(D);
        if(Di==1)
        {
            Scanner b = new Scanner(System.in);
            System.out.println("You have chosen Chicken Mode.\nGuess From (1-10)");

        }
        if(Di==2)
        {
            Scanner c = new Scanner(System.in);
            System.out.println("You have chosen Easy Mode.\nGuess From (1-100)");
        }
        if(Di==3)
        {
            Scanner d = new Scanner(System.in);
            System.out.println("You have chosen Hard Mode.\nGuess From (1-1,000)");
        }
        else {
            Scanner e = new Scanner(System.in);
            System.out.println("You have chosen WinnerWinnerChickenDinner Mode.\nGuess From (1-10,000)");
        }



        a.close();
        */
    }
}