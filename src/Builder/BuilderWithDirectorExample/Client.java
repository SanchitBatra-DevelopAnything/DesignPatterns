package Builder.BuilderWithDirectorExample;

import java.util.Scanner;

public class Client {

    public static void main(String args[])
    {
        //VEG OR NONVEG
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        MealBuilder mealBuilder;

        //ye repeatedly ho to factory b lagaa sakte ho.
        if(input.equals("VEG"))
        {
            mealBuilder = new VegMealBuilder();
        }
        else
        {
            mealBuilder = new NonVegMealBuilder();
        }

        MealDirector director = new MealDirector(mealBuilder);
        Meal yelo = director.prepareMeal();

        System.out.println(yelo);

    }
}
