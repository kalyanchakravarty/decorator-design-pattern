public class BBQChicken extends Pizza {

    BBQChicken()
    {
        this.description = "BBQChicken";
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    int getCost() {
        return 200;
    }
}
