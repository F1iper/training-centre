package creative.builder.exercise2;

public class Burger {
    private final String bread;
    private final String sauce;
    private final boolean cucumber;
    private final boolean tomato;
    private final boolean bacon;
    private final boolean onion;

    private Burger(BurgerBuilder burgerBuilder) {
        this.bread = burgerBuilder.bread;
        this.sauce = burgerBuilder.sauce;
        this.cucumber = burgerBuilder.cucumber;
        this.tomato = burgerBuilder.tomato;
        this.bacon = burgerBuilder.bacon;
        this.onion = burgerBuilder.onion;
    }

    @Override
    public String toString() {
        return "Burger with bread: " + bread + ", sauce: " + sauce + ", cucumber: " +
                cucumber + ", tomato: " + tomato + ", bacon: " + bacon + ", onion: "+
                onion;
    }

    public static class BurgerBuilder {
        private String bread;
        private String sauce;
        private boolean cucumber;
        private boolean tomato;
        private boolean bacon;
        private boolean onion;


        public BurgerBuilder bread(final String bread) {
            this.bread = bread;
            return this;
        }

        public BurgerBuilder sauce(final String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BurgerBuilder cucumber(final boolean cucumber) {
            this.cucumber = cucumber;
            return this;
        }

        public BurgerBuilder tomato(final boolean tomato) {
            this.tomato = tomato;
            return this;
        }

        public BurgerBuilder bacon(final boolean bacon) {
            this.bacon = bacon;
            return this;
        }

        public BurgerBuilder onion(final boolean onion) {
            this.onion = onion;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}
