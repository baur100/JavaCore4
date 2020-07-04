package l11Hw;

public class Document {
    private String docType;
    private int docNumber;
    private String expirationDate;

    public Document(String docType, int docNumber, String expirationDate) {
        this.docType = docType;
        this.docNumber = docNumber;
        this.expirationDate = expirationDate;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public int getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(int docNumber) {
        this.docNumber = docNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
