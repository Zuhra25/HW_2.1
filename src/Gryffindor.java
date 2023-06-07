public class Gryffindor extends Hogwarts {
    private String fullname;
    private int witchcraft;
    private int transgress;
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String fullname,int witchcraft,int transgress, int nobility, int honor, int bravery) {
        super(fullname, witchcraft, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}
