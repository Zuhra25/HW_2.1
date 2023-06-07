public class Hufflepuff extends Hogwarts {
    private String fullname;
    private int witchcraft;
    private int transgress;
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String fullname,int witchcraft,int transgress,int industriousness, int loyalty, int honesty) {
        super(fullname, witchcraft, transgress);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
