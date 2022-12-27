public class Paneer extends PizzaDecorator {
    Pizza pizza;

    Paneer(Pizza pizza)
    {
        this.pizza = pizza;
        this.cost = 60;
        this.description = "Paneer";
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
