public class Ravenclaw  extends Hogwarts{
    private String fullname;
    private int witchcraft;
    private int transgress;
    private int mind;
    private int wisdoml;
    private int wit;
    private int creation;

    public Ravenclaw(String fullname,int witchcraft,int transgress,int mind, int wisdoml, int wit, int creation) {
        super(fullname, witchcraft, transgress);
        this.mind = mind;
        this.wisdoml = wisdoml;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdoml() {
        return wisdoml;
    }

    public void setWisdoml(int wisdoml) {
        this.wisdoml = wisdoml;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }
}
