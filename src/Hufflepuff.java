public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String fullname,int witchcraft,int transgress,int industriousness, int loyalty, int honesty) {
        super(fullname, witchcraft, transgress);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    public static void printHufflepuff(Hufflepuff obj){
            System.out.printf("Ученик - %s, колдовство - %s, трансгрессия - %s%n трудолюбие - %s, верность - %s, честность - %s%n%n",obj.getFullname(), obj.getWitchcraft(), obj.getTransgress(),obj.getIndustriousness(), obj.getLoyalty(),obj.getHonesty());
        }
    public static void compareHufflepuff(Hufflepuff name1, Hufflepuff name2) {
        int a = name1.getWitchcraft() + name1.getTransgress() + name1.getIndustriousness() + name1.getLoyalty() + name1.getHonesty();
        int b = name2.getWitchcraft() + name2.getTransgress() + name2.getIndustriousness() + name2.getLoyalty() + name2.getHonesty();
        if (a > b) {
            System.out.printf("%s лучший Пуффендуец, чем %s%n", name1, name2);
        } else if (b > a) {
            System.out.printf("%s лучший Пуффендуец, чем %s%n", name2, name1);
        } else {
            System.out.printf("эти Пуффендуйцы одинаково хороши");
        }
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
    @Override
    public String toString() {
        return String.format("%s",getFullname());
    }
}
