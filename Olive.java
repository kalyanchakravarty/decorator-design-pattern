public class Olive extends PizzaDecorator {
    Pizza pizza;

    Olive(Pizza pizza)
    {
        this.pizza = pizza;
        this.description = "Olive";
    }

    @Override
    public int getCost() {
        return 20 + pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + " + this.description;
    }
}
