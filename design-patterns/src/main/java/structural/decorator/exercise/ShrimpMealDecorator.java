package structural.decorator.exercise;

public class ShrimpMealDecorator extends MealDecorator {
    public ShrimpMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    public void prepareMeal() {
        super.prepareMeal();
        addShrimp();
    }

    public void addShrimp() {
        System.out.println("Add shrimp.");
    }
}
