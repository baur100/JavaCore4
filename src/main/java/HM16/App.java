





        package HM16;

import l15Enums.Gender;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

        public class App {
    public static void main(String[] args) {
        Address hospitalAddress = new Address("1122","Chicago","IL",60054);
Hospital stCharls = new Hospital("St.Charls",hospitalAddress);
        stCharls.printHospital();
        System.out.println("******************************");

        List<Doctor> doctor = new ArrayList<>();
        Doctor li = new Doctor("Li", "Peterson",Title.ALLERGIST);
        Doctor amanda = new Doctor("Amanda","Morgan",Title.CARDIOLOGIST);
        Doctor joel = new Doctor("Joel","West",Title.DERMATOLOGIST);
        Doctor lisa = new Doctor("Lisa","Koel",Title.GASTROENTEROLOGIST);
        Doctor nick = new Doctor("Nick","Lumber",Title.OSTEOPATHY);
        li.printDoctors();
        System.out.println("******************************");
        amanda.printDoctors();
        System.out.println("******************************");
        joel.printDoctors();
        System.out.println("******************************");
        lisa.printDoctors();
        System.out.println("******************************");
        nick.printDoctors();
            System.out.println("******************************");
            HashMap<Integer,String> room = new HashMap<>();
            room.put(11,"OSTEOPATHY");
            room.put(22,"ALLERGIST");
            room.put(39,"CARDIOLOGIST");
            room.put(2,"DERMATOLOGIST");
            room.put(21,"GASTROENTEROLOGIST");
            for(Map.Entry<Integer,String> pair :room.entrySet()){
                    System.out.println(pair.getKey()+" "+pair.getValue());
            }
            System.out.println("******************************");
            List<InsuranceCompanies> acceptedInsuranses = new ArrayList<>();
            Insurance humana = new Insurance(InsuranceCompanies.HUMANA);
            Insurance aetna = new Insurance(InsuranceCompanies.AETNA);
            Insurance cigna = new Insurance(InsuranceCompanies.CIGNA);
            Insurance bluecross = new Insurance(InsuranceCompanies.BLUECROSS);
        System.out.println("Accepted Insurance:");
            humana.printInsurance();
            aetna.printInsurance();
            cigna.printInsurance();
            bluecross.printInsurance();

    }
}
