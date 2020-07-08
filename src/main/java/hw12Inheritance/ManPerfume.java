package hw12Inheritance;

import java.util.Arrays;

public class ManPerfume extends DutyFree {
    private String sellerName;
    private String[] manPerfumList;

    public ManPerfume(String owner, int licenceNumber, Address address, String sellerName, String[] manPerfums) {
        super(owner, licenceNumber, address);
        this.sellerName = sellerName;
        this.manPerfumList = manPerfums;
    }

    public void printManPerfums() {
        System.out.println("ManPerfume{" +
                "sellerName='" + sellerName + '\'' +
                ", manPerfumList=" + Arrays.toString(manPerfumList) +
                ", owner='" + owner + '\'' +
                ", licenceNumber=" + licenceNumber +
                '}');
        this.address.printAddress();
    }
}





