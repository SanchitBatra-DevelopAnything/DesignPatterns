package Builder;

public class Burger {

    private boolean mayonese;
    private boolean onions;
    private boolean honeyMustard;

    private int tikkis;

    private Burger(BurgerBuilder builder)
    {
        //do validation , throw exception or create a burger.
        //maanlo har burger me tikki zaroor honi chahiye
        if(builder.tikkis == 0)
        {
            throw new IllegalArgumentException("Tikki is a must");
        }
        this.mayonese = builder.mayonese;
        this.onions = builder.onions;
        this.tikkis = builder.tikkis;
        this.honeyMustard = builder.honeyMustard;
    }

    public boolean isMayonese() {
        return mayonese;
    }

    public void setMayonese(boolean mayonese) {
        this.mayonese = mayonese;
    }

    public boolean isOnions() {
        return onions;
    }

    public void setOnions(boolean onions) {
        this.onions = onions;
    }

    public boolean isHoneyMustard() {
        return honeyMustard;
    }

    public void setHoneyMustard(boolean honeyMustard) {
        this.honeyMustard = honeyMustard;
    }

    public int getTikkis() {
        return tikkis;
    }

    public void setTikkis(int tikkis) {
        this.tikkis = tikkis;
    }

    @Override
    public String toString()
    {
        return
                "Burger is = "+
                        "mayonese = "+this.mayonese+" , "+
                        "onions = "+this.onions+" , "+
                        "tikkis = "+this.tikkis+" , "+
                        "honeyMustard = "+this.honeyMustard+" , ";
    }

    public static class BurgerBuilder
    {
        //inner class to use private constructor of burger.
        private boolean mayonese;
        private boolean onions;
        private boolean honeyMustard;

        private int tikkis;

        public BurgerBuilder Mayonese(boolean mayonese)
        {
            this.mayonese = mayonese;
            return this;
        }

        public BurgerBuilder Onions(boolean onions)
        {
            this.onions = onions;
            return this;
        }

        public BurgerBuilder HoneyMustard(boolean honeyMustard)
        {
            this.honeyMustard=honeyMustard;
            return this;
        }

        public BurgerBuilder Tikkis(int tikkis)
        {
            this.tikkis = tikkis;
            return this;
        }


        //after mayonese set , ye mayonese set wala hi return hona chahiye to set onions on top of it.. thats y
        //these setters are returning BurgerBuilder itself.

        //final method build , which will create a burger from the feature added builder.
        public Burger build()
        {
            return new Burger(this);
        }

    }
}
