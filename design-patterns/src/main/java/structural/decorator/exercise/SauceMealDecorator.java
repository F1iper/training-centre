package structural.decorator.exercise;

public class SauceMealDecorator extends MealDecorator  {
    public SauceMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    public void prepareMeal() {
        super.prepareMeal();
        addSauce();
    }

    public void addSauce() {
        System.out.println("Add sauce");
    }
}
