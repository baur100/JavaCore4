package hw10;

public class CellPhone {
    private String signal;
    private String operationSoftware;
    private int price;


    public CellPhone() {}


    public CellPhone(String signal, String operationSoftware, int price) {

        this.signal = signal;
        this.operationSoftware = operationSoftware;
        this.price = price;

    }

    public void printData() {
        System.out.println("Cell Phone signal works on " + signal + "\n"
                + "and supports " + operationSoftware + " and the price is " + price);

    }


    public int getPrice() {
        return price;

    }

        public void setPrice(int price) {
        if (price > 100 || price < 200) {
            System.out.println(price);
        } else {
            System.out.println("Invalid Price Range");
        }
    }


    public String getOperationSoftware() {
        return operationSoftware;
    }

        public void setOperationSoftware(String operationSoftware){
            if (operationSoftware == "Android") {
                System.out.println(operationSoftware);
            } else {
                System.out.println("Invalid OS");
            }

        }


        public String getSignal(){
            return signal;
        }


        public void setSignal(String signal) {
            if (signal == "GSM") {
                System.out.println(signal);
            } else {
                System.out.println("Invalid Signal Range");
            }
        }

    }

