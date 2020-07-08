package hw12Inheritance;

import java.util.Arrays;

public class WomanPerfume extends DutyFree {
    private String salesAssistant;
    private String[] womanPerfumeList;

    public WomanPerfume(String owner, int licenceNumber, Address address, String salesAssistant, String[] womanPerfumeList) {
        super(owner, licenceNumber, address);
        this.salesAssistant = salesAssistant;
        this.womanPerfumeList = womanPerfumeList;
    }

    public void printWomanPerfumes() {
        System.out.println("WomanPerfume{" +
                "salesAssistant='" + salesAssistant + '\'' +
                ", womanPerfumeList=" + Arrays.toString(womanPerfumeList) +
                ", owner='" + owner + '\'' +
                ", licenceNumber=" + licenceNumber +
                '}');

        this.address.printAddress();
    }
}


