public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;


    public Slytherin(String fullname,int witchcraft,int transgress,int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(fullname, witchcraft, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }
    public static void printSlytherin(Slytherin obj){
            System.out.printf("Ученик - %s, колдовство - %s, трансгрессия - %s%n хитрость - %s, решительность - %s, амбициозность - %s, находчивость- %s, жажда власти- %s%n%n",obj.getFullname(), obj.getWitchcraft(), obj.getTransgress(),obj.getCunning(), obj.getDetermination(), obj.getAmbition(),obj.getResourcefulness(),obj.getLustForPower());
    }
    public static void compareSlytherin(Slytherin name1, Slytherin name2) {
        int a = name1.getWitchcraft() + name1.getTransgress() + name1.getCunning() + name1.getDetermination() + name1.getAmbition() + name1.getResourcefulness() + name1.getLustForPower();
        int b = name2.getWitchcraft() + name2.getTransgress() + name2.getCunning() + name2.getDetermination() + name2.getAmbition() + name2.getResourcefulness() + name2.getLustForPower();

        if (a > b) {
            System.out.printf("%s лучший Слизеринец, чем %s%n", name1, name2);
        } else if (b > a) {
            System.out.printf("%s лучший Слизеринец, чем %s%n", name2, name1);
        } else {
            System.out.printf("эти Слизеринцы одинаково хороши");
        }
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
    @Override
    public String toString() {
        return String.format("%s",getFullname());
    }
}
