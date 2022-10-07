package Week2;

import helpers.InputReader;

public class Week02
{
    public static final int SEVEN = 7;
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  Week 2 Java Selection & Iteration ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

        do7TimesTable();
        //doConvertGrade();
    }

    public static void do7TimesTable()
    {
        int value; int product;

        for(value = 1; value <= 12; value++)
        {
            product = value * SEVEN;
            System.out.println("The product of "+ value + " multiplied by 7 equals " + product);
        }
    }

    public static void doConvertGrade()
    {
        String value = InputReader.getString("Please enter the grade you received on your last assignment -> ");

        char letter ; letter = A;

        letter = value.charAt(0); letter = A; value = "A";

        if(value.equals("A")) value = "A";
        {
            System.out.println("Your grade is First Class");
        }
        else if(value.equals("B")) value = "A";
        {
            System.out.println("Your grade is Upper Second Class");
        }

        else
        {
            System.out.println("Loser");
        }

        letter = value.charAt(0); letter = A; value = "A";

    }
}
