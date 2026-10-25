package creation.builderpattern;

public class Pizza {
    private final String size;
    private final String crust;
    private final boolean cheese;
    private final boolean pepperoni;
    private final boolean mushrooms;

    private Pizza(Builder builder) {
        
        size = builder.size;
        crust = builder.crust;
        cheese = builder.cheese;
        pepperoni = builder.pepperoni;
        mushrooms = builder.mushrooms;
    }

    public static class Builder {
        private final String size;
        private String crust = "classic";
        private boolean cheese;
        private boolean pepperoni;
        private boolean mushrooms;

        public Builder(String size) {
            this.size = size;
        }

        public Builder crust(String crust) {
            this.crust = crust;
            return this;
        }

        public Builder cheese() {
            this.cheese = true;
            return this;
        }

        public Builder pepperoni() {
            this.pepperoni = true;
            return this;
        }
        public Builder mushrooms() {
            this.mushrooms = true;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    @Override
    public String toString() {
        return size + " pizza, " + crust + " crust, cheese=" + cheese
                + ", pepperoni=" + pepperoni + ", mushrooms=" + mushrooms;
    }
}