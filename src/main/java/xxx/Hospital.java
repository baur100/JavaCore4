package xxx;

public class Hospital {
    private Doctor[] doctors;

    public Hospital(Doctor[] doctors) {
        this.doctors = doctors;
    }

    public Doctor[] getDoctors() {
        return doctors;
    }

    public void setDoctors(Doctor[] doctors) {
        this.doctors = doctors;
    }

}
