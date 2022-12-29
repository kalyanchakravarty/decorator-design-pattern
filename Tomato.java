public class Tomato extends PizzaDecorator{
    Pizza pizza;

    Tomato(Pizza pizza)
    {
        this.pizza = pizza;
        this.description = "Tomato";
    }

    @Override
    public int getCost() {
        return 30 + pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + " + this.description;
    }
}
