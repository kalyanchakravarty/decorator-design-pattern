public class Pepperoni extends Pizza{

    Pepperoni()
    {
        this.cost = 180;
        this.description = "Pepperoni";
    }

    @Override
    String getDescription() {
        return this.description;
    }

    @Override
    int getCost() {
        return this.cost;
    }
}
