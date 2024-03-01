package Builder.BuilderWithDirectorExample;

public interface MealBuilder {
    public void addBiryani();
    public void addRaitaa();
    public void addBeverage();
    public void addRoti();

    public Meal build();
}
