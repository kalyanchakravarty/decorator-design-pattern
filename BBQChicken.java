public class BBQChicken extends Pizza {

    BBQChicken()
    {
        this.cost = 200;
        this.description = "BBQChicken";
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
