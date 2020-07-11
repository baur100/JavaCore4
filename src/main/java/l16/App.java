package l16;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        final double PI = 3.1415196;
//        PI = 2;
        List<String> list = new ArrayList<String>();
        list.add("Hey");
        list.add("Hello");
        try {
            list.get(1);
//            int x = 5/0;
//            throw new SocketException("Some error happened");
            System.out.println("Line after potential problem");
        } catch (IndexOutOfBoundsException error) {
            System.out.println("I just catch an exception!!!" +error.getMessage());
        } catch (ArithmeticException error) {
            System.out.println(error.getMessage());
//            throw error;
        } catch (Exception error) {
            System.out.println("Some weird error " + error.getMessage());
        } finally {
            System.out.println("Finally block will run in any case");
        }

        System.out.println("I'm good");
    }
}
