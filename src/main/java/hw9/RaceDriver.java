package hw9;

    public class RaceDriver {
        private String name;
        private String car;
        private String[] model;

        public RaceDriver(String name, String car, String[] model) {
            this.name = name;
            this.car = car;
            this.model = model;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCar() {
            return car;
        }

        public void setCar(String car) {
            this.car = car;
        }

        public String[] getModel() {
            return model;
        }

        public void setModel(String[] model) {
            this.model = model;
        }

        public void printNow() {
            System.out.println("Name = " + this.name + "\ncar = " + this.car);
            for (String model: this.model) {
                System.out.println(model);
            }
        }
    }

