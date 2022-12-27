public class Tomato extends PizzaDecorator{
    Pizza pizza;

    Tomato(Pizza pizza)
    {
        this.pizza = pizza;
        this.cost = 30;
        this.description = "Tomato";
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
