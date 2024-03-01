package Builder.BuilderWithDirectorExample;

public class Meal {

    private String biryani;
    private String roti;
    private String raitaa;
    private String beverage;

    @Override
    public String toString()
    {
        return this.biryani+" , "+this.raitaa + " , "+this.roti + "rotis , "+this.beverage+";";
    }

    public String getBiryani() {
        return biryani;
    }

    public void setBiryani(String biryani) {
        this.biryani = biryani;
    }

    public String getRoti() {
        return roti;
    }

    public void setRoti(String roti) {
        this.roti = roti;
    }

    public String getRaitaa() {
        return raitaa;
    }

    public void setRaitaa(String raitaa) {
        this.raitaa = raitaa;
    }

    public String getBeverage() {
        return beverage;
    }

    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }
}
