package Hw13;

public class Square implements Area {
        private double side;

    public Square(double side) {
        this.side = side;

    }

        @Override
        public double getArea() {return side * side;
        }

}
