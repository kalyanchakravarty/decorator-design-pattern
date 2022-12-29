public class Margarita extends Pizza {

    Margarita()
    {
        this.description = "Margarita";
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    int getCost() {
        return 200;
    }
}
