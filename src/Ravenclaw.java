public class Ravenclaw  extends Hogwarts{
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
    public static void printRavenclaw(Ravenclaw obj){
            System.out.printf("Ученик - %s, колдовство - %s, трансгрессия - %s%n ум - %s, мудрость - %s, остроумие - %s, творчество - %s%n%n",obj.getFullname(), obj.getWitchcraft(), obj.getTransgress(),obj.getMind(), obj.getWitchcraft(),obj.getWit(),obj.getCreation());
        }
    public static void compareRavenclaw(Ravenclaw name1, Ravenclaw name2) {
        int a = name1.getWitchcraft() + name1.getTransgress() + name1.getMind() + name1.getWisdoml() + name1.getWit() + name1.getCreation();
        int b = name2.getWitchcraft() + name2.getTransgress() + name2.getMind() + name2.getWisdoml() + name2.getWit() + name2.getCreation();

        if (a > b) {
            System.out.printf("%s лучший Когтевранец, чем %s%n", name1, name2);
        } else if (b > a) {
            System.out.printf("%s лучший Когтевранец, чем %s%n", name2, name1);
        } else {
            System.out.printf("эти Когтевранцы одинаково хороши");
        }
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
    @Override
    public String toString() {
        return String.format("%s",getFullname());
    }
}
