package l11Hw;

public class Client {
    private int clientCode;
    private String[] fullName;
    Document document;
    private String clientType;

    public Client(int clientCode, String[] fullName, Document document, String clientType) {
        this.clientCode = clientCode;
        this.fullName = fullName;
        this.document = document;
        this.clientType = clientType;
    }

    public int getClientCode() {
        return clientCode;
    }

    public void setClientCode(int clientCode) {
        this.clientCode = clientCode;
    }

    public String[] getFullName() {
        return fullName;
    }

    public void setFullName(String[] fullName) {
        this.fullName = fullName;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }


public void printInfo(){
    System.out.println("Client code: " + this.clientCode);
    System.out.println("Fullname:    " + this.fullName[0] + " " + this.fullName[1] + " " + this.fullName[2]);

//    for (String v:this.fullName) {
//        System.out.println(v);
//    }
    System.out.println("Client type: " + this.clientType);
    System.out.println();
    System.out.println("Client's doc info ");
    System.out.println("Doc type:            " + this.document.getDocType());
    System.out.println("Doc number:          " + this.document.getDocNumber());
    System.out.println("Doc expiration date: " + this.document.getExpirationDate());
}
}
