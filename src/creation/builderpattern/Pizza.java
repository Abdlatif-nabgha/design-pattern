package creation.builderpattern;

public class Pizza {
    private final String size;
    private final String crust;
    private final boolean cheese;
    private final boolean pepperoni;
    private final boolean mushrooms;


    public static class Builder {
        private final String size;
        private String crust = "thin";
        private boolean cheese = true;
        private boolean pepperoni = true;
        private boolean mushrooms = true;

        private Builder (String size) {
            this.size = size;
        }

        public Builder crust(String crust) {
            this.crust = crust;
            return this;
        }

        public Builder cheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder pepperoni(boolean pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }
        public Builder mushrooms(boolean mushrooms) {
            this.mushrooms = mushrooms;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    private Pizza(Builder builder) {
        this.size = builder.size;
        this.crust = builder.crust;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.mushrooms = builder.mushrooms;
    }
    
    public static Builder builder(String size) {
        return new Builder(size);
    }
}