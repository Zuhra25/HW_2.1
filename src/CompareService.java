public class CompareService {

    public void compare(Gryffindor[] gryffindors, String name1, String name2) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            if (name1 == gryffindor.getFullname()) {
                a = gryffindor.getWitchcraft() + gryffindor.getTransgress() + gryffindor.getBravery() + gryffindor.getHonor() + gryffindor.getNobility();
            }
            if (name2 == gryffindor.getFullname()) {
                b = gryffindor.getWitchcraft() + gryffindor.getTransgress() + gryffindor.getBravery() + gryffindor.getHonor() + gryffindor.getNobility();
            }
        }
        if (a > b) {
            System.out.printf("%s лучший Гриффиндорец, чем %s%n", name1, name2);
        } else if (b > a) {
            System.out.printf("%s лучший Гриффиндорец, чем %s%n", name2, name1);
        } else {
            System.out.printf("эти Гриффиндорцы одинаково хороши");
        }
    }

    public void compare(Slytherin[] slytherins, String name1, String name2) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            if (name1 == slytherin.getFullname()) {
                a = slytherin.getWitchcraft() + slytherin.getTransgress() + slytherin.getCunning() + slytherin.getDetermination() + slytherin.getAmbition() + slytherin.getResourcefulness() + slytherin.getLustForPower();
            }
            if (name2 == slytherin.getFullname()) {
                b = slytherin.getWitchcraft() + slytherin.getTransgress() + slytherin.getCunning() + slytherin.getDetermination() + slytherin.getAmbition() + slytherin.getResourcefulness() + slytherin.getLustForPower();
            }
        }
        if (a > b) {
            System.out.printf("%s лучший Слизеринец, чем %s%n", name1, name2);
        } else if (b > a) {
            System.out.printf("%s лучший Слизеринец, чем %s%n", name2, name1);
        } else {
            System.out.printf("эти Слизеринцы одинаково хороши");
        }
    }

    public void compare(Hufflepuff[] hufflepuffs, String name1, String name2) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            if (name1 == hufflepuff.getFullname()) {
                a = hufflepuff.getWitchcraft() + hufflepuff.getTransgress() + hufflepuff.getIndustriousness() + hufflepuff.getLoyalty() + hufflepuff.getHonesty();
            }
            if (name2 == hufflepuff.getFullname()) {
                b = hufflepuff.getWitchcraft() + hufflepuff.getTransgress() + hufflepuff.getIndustriousness() + hufflepuff.getLoyalty() + hufflepuff.getHonesty();
            }
        }

        if (a > b) {
            System.out.printf("%s лучший Пуффендуец, чем %s%n", name1, name2);
        } else if (b > a) {
            System.out.printf("%s лучший Пуффендуец, чем %s%n", name2, name1);
        } else {
            System.out.printf("эти Пуффендуйцы одинаково хороши");
        }
    }

    public void compare(Ravenclaw[] ravenclaws, String name1, String name2) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            if (name1 == ravenclaw.getFullname()) {
                a = ravenclaw.getWitchcraft() + ravenclaw.getTransgress() + ravenclaw.getMind() + ravenclaw.getWisdoml() + ravenclaw.getWit() + ravenclaw.getCreation();
            }
            if (name2 == ravenclaw.getFullname()) {
                b = ravenclaw.getWitchcraft() + ravenclaw.getTransgress() + ravenclaw.getMind() + ravenclaw.getWisdoml() + ravenclaw.getWit() + ravenclaw.getCreation();
            }
        }
        if (a > b) {
            System.out.printf("%s лучший Когтевранец, чем %s%n", name1, name2);
        } else if (b > a) {
            System.out.printf("%s лучший Когтевранец, чем %s%n", name2, name1);
        } else {
            System.out.printf("эти Когтевранцы одинаково хороши");
        }
    }

    public void compare(Hogwarts[] students, String name1, String name2) {
        int a1 = 0;
        int a2 = 0;
        int b1 = 0;
        int b2 = 0;


        for (int i = 0; i < students.length; i++) {
            Hogwarts student = students[i];
            if (name1 == student.getFullname()) {
                a1 = student.getWitchcraft();
                b1 = student.getTransgress();
            } else if (name2 == student.getFullname()) {
                a2 = student.getWitchcraft();
                b2 = student.getTransgress();
            }
        }

        if (a1 > a2) {
            System.out.printf("%s обладает бОльшей мощностью магии, чем %s%n", name1, name2);
        } else if (a2 > a1) {
            System.out.printf("%s обладает бОльшей мощностью магии, чем %s%n", name2, name1);
        } else System.out.printf("Ученики обладают одинаковой мощностью магии");

        if (b1 > b2) {
            System.out.printf("%s обладает бОльшим расстоянием трансгрессии, чем %s%n", name1, name2);
        } else if (b2 > b1) {
            System.out.printf("%s обладает бОльшим расстоянием трансгрессии, чем %s%n", name2, name1);
        } else System.out.printf("Ученики обладают одинаковым расстоянием трансгрессии");


    }


}

