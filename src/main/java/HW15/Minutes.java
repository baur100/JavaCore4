package HW15;

public class Minutes implements Time{
        private int Minutes;

        public Minutes(int minutes) {
            this.Minutes = minutes;
        }

        @Override
        public double getSeconds() {
            return this.Minutes * 60;
        }
}



