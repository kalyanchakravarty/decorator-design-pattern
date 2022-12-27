public class Farmhouse extends Pizza {

        Farmhouse()
        {
            this.cost = 150;
            this.description = "Farmhouse";
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

