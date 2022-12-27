public class Cheese extends PizzaDecorator{
    Pizza pizza;

    Cheese(Pizza pizza)
    {
        this.pizza = pizza;
        this.cost = 80;
        this.description = "Cheese";
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
