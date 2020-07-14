package HW15Jul10;

public class President {
    private String presidentName;
    private int nthPresident;

    public President(String presidentName, int nthPresident) {
        this.presidentName = presidentName;
        this.nthPresident = nthPresident;
    }

    public String getPresidentName() {
        return presidentName;
    }


    public void setPresidentName(String presidentName) {
        this.presidentName = presidentName;
    }

    public int getNthPresident() {
        return nthPresident;
    }

    public void setNthPresident(int nthPresident) {
        this.nthPresident = nthPresident;
    }
}
