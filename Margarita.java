public class Margarita extends Pizza {

    Margarita()
    {
        this.cost = 200;
        this.description = "Margarita";
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
