package HW10;

   public class Planet {
        private String PlanetName;
        private int OrbitOrder;
        private int NumberOfMoons;

        public Planet(String PlanetName, int OrbitOrder, int NumberOfMoons ){
            this.PlanetName=PlanetName;
            this.OrbitOrder=OrbitOrder;
            this.NumberOfMoons=NumberOfMoons;
        }

        public Planet(){}

        public void printInfo(){
            System.out.println("Planet: "+PlanetName+" \norbiting on OrbitOrder: " + OrbitOrder+"\nNumber Of Moons: "+ NumberOfMoons );
        }

        public void setPlanetName(String PlanetName){
            this.PlanetName = PlanetName;
        }

        public String getPlanetName(){
            return PlanetName;
        }

        public void setOrbitOrder(int OrbitOrder){
            this.OrbitOrder= OrbitOrder;
        }

        public int getOrbitOrder(){
            return OrbitOrder;
        }

        public void setNumberOfMoons(int NumberOfMoons) {
            this.NumberOfMoons = NumberOfMoons;
        }

        public int getNumberOfMoons() {
            return NumberOfMoons;
        }

    }

