package HW15;

public class Bags {

    private String tote;
    private String shoulder;
    private String satchel;

    public Bags(String tote, String shoulder, String satchel) {
        this.tote = tote;
        this.shoulder = shoulder;
        this.satchel = satchel;
    }

    public String getTote() {
        return tote;
    }

    public void setTote(String tote) {
        this.tote = tote;
    }

    public String getShoulder() {
        return shoulder;
    }

    public void setShoulder(String shoulder) {
        this.shoulder = shoulder;
    }

    public String getSatchel() {
        return satchel;
    }

    public void setSatchel(String satchel) {
        this.satchel = satchel;
    }


    public String toString() {
        return "Bags{" +
                "tote='" + tote + '\'' +
                ", shoulder='" + shoulder + '\'' +
                ", satchel='" + satchel + '\'' +
                '}';
    }
}
