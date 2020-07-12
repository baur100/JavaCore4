package HW17;
import java.util.List;
public class Payment {
    private String cardNumber;
    private List<Type> types;

    public Payment(String cardNumber, List<Type> types) {
        this.cardNumber = cardNumber;
        this.types = types;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public List<Type> getTypes() {
        return types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }
}

