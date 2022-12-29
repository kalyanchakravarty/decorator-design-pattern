public class Paneer extends PizzaDecorator {
    Pizza pizza;

    Paneer(Pizza pizza)
    {
        this.pizza = pizza;
        this.description = "Paneer";
    }

    @Override
    public int getCost() {
        return 60 + pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + " + this.description;
    }
}
