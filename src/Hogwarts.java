public class Hogwarts {
    private String fullname;
    private int witchcraft;
    private int transgress;

    public Hogwarts(String fullname, int witchcraft, int transgress) {
        this.fullname = fullname;
        this.witchcraft = witchcraft;
        this.transgress = transgress;
    }


    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }
}
