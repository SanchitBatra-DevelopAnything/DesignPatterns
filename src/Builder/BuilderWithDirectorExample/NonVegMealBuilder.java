package Builder.BuilderWithDirectorExample;

public class NonVegMealBuilder implements MealBuilder{

    private Meal meal;

    public NonVegMealBuilder()
    {
        this.meal = new Meal();
    }

    @Override
    public void addBiryani() {
        this.meal.setBiryani("Chicken biriyani");
    }

    @Override
    public void addRaitaa() {
        this.meal.setRaitaa("Ghantoo raitaa");
    }

    @Override
    public void addBeverage() {
        this.meal.setBeverage("Mutton ka khoon");
    }

    @Override
    public void addRoti() {
        this.meal.setRoti("4");
    }

    @Override
    public Meal build() {
        return this.meal;
    }
}
