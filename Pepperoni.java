public class Pepperoni extends Pizza{

    Pepperoni()
    {
        this.description = "Pepperoni";
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    int getCost() {
        return 180;
    }
}
