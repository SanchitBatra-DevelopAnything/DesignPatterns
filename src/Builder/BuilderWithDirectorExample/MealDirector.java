package Builder.BuilderWithDirectorExample;

public class MealDirector {
    private MealBuilder mealBuilder;

    public MealDirector(MealBuilder mealBuilder)
    {
        this.mealBuilder = mealBuilder;
    }

    public Meal prepareMeal()
    {
        this.mealBuilder.addBeverage();
        this.mealBuilder.addBiryani();
        this.mealBuilder.addRoti();
        this.mealBuilder.addRaitaa();
        return this.mealBuilder.build();
    }
}
