public class Farmhouse extends Pizza {

        Farmhouse()
        {
            this.description = "Farmhouse";
        }

        public String getDescription() {
            return this.description;
        }

        @Override
        int getCost() {
            return 150;
        }
}

