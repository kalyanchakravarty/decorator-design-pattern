public class Olive extends PizzaDecorator {
    Pizza pizza;

    Olive(Pizza pizza)
    {
        this.pizza = pizza;
        this.cost = 20;
        this.description = "Olive";
    }

    @Override
    public int getCost() {
        return this.cost + pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + " + this.description;
    }
}
