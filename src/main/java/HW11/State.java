package HW11;

public class State {
    private int stateid;
    private String statename;
    private int population;
    private String[] cities;
    private Governor governorstate;

    public State(int stateid, String statename, int population, String[] cities, Governor governorstate) {
        this.stateid = stateid;
        this.statename = statename;
        this.population = population;
        this.cities = cities;
        this.governorstate = governorstate;
    }

    public int getStateid() {
        return stateid;
    }

    public void setStateid(int stateid) {
        this.stateid = stateid;
    }

    public String getStatename() {
        return statename;
    }

    public void setStatename(String statename) {
        this.statename = statename;

    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String[] getCities() {
        return cities;
    }

    public void setCities(String[] cities) {
        this.cities = cities;
    }

    public Governor getGovernorstate() {
        return governorstate;
    }

    public void setGovernorstate(Governor governorstate) {
        this.governorstate = governorstate;
    }

    public void printStateInfo(){
        System.out.println("The state id is " + this.getStateid());
        System.out.println("the state name is " + this.getStatename());
        System.out.println("the state population is " + this.getPopulation());
        System.out.println("The state's cities are:");
        for (String v:this.getCities()             ) {
            System.out.println(v);
        }
        this.governorstate.printGovernorInfo();
    }
}
