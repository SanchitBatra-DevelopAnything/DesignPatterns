package Builder.BuilderWithDirectorExample;

public class VegMealBuilder implements MealBuilder{

    private Meal meal;

    public VegMealBuilder()
    {
        this.meal = new Meal();
    }

    @Override
    public void addBiryani() {
        this.meal.setBiryani("VEG BIRIYANI");
    }

    @Override
    public void addRaitaa() {
        this.meal.setRaitaa("BOONDI VEG RAITAA");
    }

    @Override
    public void addBeverage() {
        this.meal.setBeverage("Thums up bade waali");
    }

    @Override
    public void addRoti() {
        this.meal.setRoti("2");
    }

    @Override
    public Meal build() {
        return this.meal;
    }
}
