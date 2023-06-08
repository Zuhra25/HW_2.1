public class Hogwarts {
    private String fullname;
    private int witchcraft;
    private int transgress;

    public Hogwarts(String fullname, int witchcraft, int transgress) {
        this.fullname = fullname;
        this.witchcraft = witchcraft;
        this.transgress = transgress;
    }
//         если передавать в параметры 2-х случайных учеников

//    public static void compareHogwarts(Hogwarts name1, Hogwarts name2) {
//        if (name1.getWitchcraft() > name2.getWitchcraft()) {
//            System.out.printf("%s обладает бОльшей мощностью магии, чем %s%n", name1, name2);
//        } else if (name2.getWitchcraft() > name1.getWitchcraft()) {
//            System.out.printf("%s обладает бОльшей мощностью магии, чем %s%n", name2, name1);
//        } else System.out.printf("Ученики обладают одинаковой мощностью магии");
//
//        if (name1.getTransgress() > name2.getTransgress()) {
//            System.out.printf("%s обладает бОльшим расстоянием трансгрессии, чем %s%n", name1, name2);
//        } else if (name2.getTransgress() > name1.getTransgress()) {
//            System.out.printf("%s обладает бОльшим расстоянием трансгрессии, чем %s%n", name2, name1);
//        } else System.out.printf("Ученики обладают одинаковым расстоянием трансгрессии");
//    }

    public void compare(Hogwarts name2) {
        if (getWitchcraft() > name2.getWitchcraft()) {
            System.out.printf("Harry Potter обладает бОльшей мощностью магии, чем %s%n", name2);
        } else if (name2.getWitchcraft() > getWitchcraft()) {
            System.out.printf("%s обладает бОльшей мощностью магии, чем Harry Potter %n", name2);
        } else System.out.printf("Ученики обладают одинаковой мощностью магии");

        if (getTransgress() > name2.getTransgress()) {
            System.out.printf("Harry Potter обладает бОльшим расстоянием трансгрессии, чем %s%n", name2);
        } else if (name2.getTransgress() > getTransgress()) {
            System.out.printf("%s обладает бОльшим расстоянием трансгрессии, чем Harry Potter %n", name2);
        } else System.out.printf("Ученики обладают одинаковым расстоянием трансгрессии");
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
