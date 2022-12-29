abstract class Pizza {
    public String description = "unknown";

    public String getDescription() {
        return this.description;
    }

    abstract int getCost();
}