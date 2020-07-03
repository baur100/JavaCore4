package Homework11;

public class Tea {
    private String type;
    private String[] flavor;

    public Tea(String type, String[] flavor) {
        this.type = type;
        this.flavor = flavor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getFlavor() {
        return flavor;
    }

    public void setFlavor(String[] flavor) {
        this.flavor = flavor;
    }

    public void printTeaInfo() {
        System.out.println(this.type);
            for (String v : this.flavor) {
                System.out.println(v);
            }
        }
    }
