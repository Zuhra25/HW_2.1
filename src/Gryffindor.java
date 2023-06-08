public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String fullname,int witchcraft,int transgress, int nobility, int honor, int bravery) {
        super(fullname, witchcraft, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    public static void printGriffindor(Gryffindor obj){
            System.out.printf("Ученик - %s, колдовство - %s, трансгрессия - %s%n благородство - %s, честь - %s, храбрость - %s%n%n",obj.getFullname(), obj.getWitchcraft(), obj.getTransgress(),obj.getNobility(), obj.getHonor(), obj.getBravery());

    }
    public static void compareGryffindor(Gryffindor name1, Gryffindor name2) {
        int a = name1.getWitchcraft() + name1.getTransgress() + name1.getBravery() + name1.getHonor() + name1.getNobility();
        int b = name2.getWitchcraft() + name2.getTransgress() + name2.getBravery() + name2.getHonor() + name2.getNobility();
        if (a > b) {
            System.out.printf("%s лучший Гриффиндорец, чем %s%n", name1, name2);
        } else if (b > a) {
            System.out.printf("%s лучший Гриффиндорец, чем %s%n", name2, name1);
        } else {
            System.out.printf("эти Гриффиндорцы одинаково хороши");
        }
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
    @Override
    public String toString() {
        return String.format("%s",getFullname());
    }
}
