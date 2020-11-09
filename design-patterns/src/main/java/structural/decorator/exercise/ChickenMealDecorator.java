package structural.decorator.exercise;

public class ChickenMealDecorator extends MealDecorator {
    public ChickenMealDecorator(Meal decorateMeal) {
        super(decorateMeal);
    }

    @Override
    public void prepareMeal() {
        super.prepareMeal();
        addChicken();
    }

    public void addChicken() {
        System.out.println("Add chicken.");
    }
}
