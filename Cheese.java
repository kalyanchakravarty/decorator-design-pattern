public class Cheese extends PizzaDecorator{
    Pizza pizza;

    Cheese(Pizza pizza)
    {
        this.pizza = pizza;
        this.description = "Cheese";
    }

    @Override
    public int getCost() {
        return 80 + pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + " + this.description;
    }
}
