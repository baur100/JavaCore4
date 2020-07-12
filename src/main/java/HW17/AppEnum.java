package HW17;

import java.util.ArrayList;
import java.util.List;

public class AppEnum {
    public static void main(String[] args) {
        Account userAnna = Account.ACTIVE;
        System.out.println(userAnna);
        List<Type> types = new ArrayList<Type>();
        types.add(Type.MASTERCARD);
        Payment annaPayment = new Payment("xxxx", types);
        System.out.println(annaPayment.getTypes());
        System.out.println(annaPayment.getCardNumber());

    }
}
