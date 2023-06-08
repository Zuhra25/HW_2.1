public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry Potter", 80, 50, 11, 21, 31);
        Gryffindor hermioneGranger = new Gryffindor ("Hermione Granger", 95, 70, 12, 22, 32);
        Gryffindor ronWeasley = new Gryffindor ("Ron Weasley", 60, 50, 13, 23, 33);

        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 70, 60, 41, 15, 60, 52, 33);
        Slytherin grahamMontagu = new Slytherin("Graham Montagu", 65, 50, 52, 70, 15, 62, 12);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 50, 60, 15, 78, 53, 56, 82);

        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias Smith ", 79, 45, 56, 41, 23);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory", 56, 33, 45, 56, 88);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley", 30, 25, 12, 78, 77);

        Ravenclaw zhouChang = new Ravenclaw("Zhou Chang ", 45, 56, 56, 52, 24, 45);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 58, 58, 85, 47, 69, 56);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 69, 25, 89, 72, 43, 78);


        System.out.println("Описание студентов Гриффиндор:");
        Gryffindor.printGriffindor(harryPotter);
        Gryffindor.printGriffindor(hermioneGranger);
        Gryffindor.printGriffindor(ronWeasley);
        System.out.println();

        System.out.println("Описание студентов Слизерин:");
        Slytherin.printSlytherin(dracoMalfoy);
        Slytherin.printSlytherin(grahamMontagu);
        Slytherin.printSlytherin(gregoryGoyle);
        System.out.println();

        System.out.println("Описание студентов Пуффендуй:");
        Hufflepuff.printHufflepuff(zachariasSmith);
        Hufflepuff.printHufflepuff(cedricDiggory);
        Hufflepuff.printHufflepuff(justinFinchFletchley);
        System.out.println();

        System.out.println("Описание студентов Когтевран:");
        Ravenclaw.printRavenclaw(zhouChang);
        Ravenclaw.printRavenclaw(padmaPatil);
        Ravenclaw.printRavenclaw(marcusBelby);
        System.out.println();

        Gryffindor.compareGryffindor(harryPotter,hermioneGranger);
        Slytherin.compareSlytherin(dracoMalfoy,grahamMontagu);
        Hufflepuff.compareHufflepuff(zachariasSmith,cedricDiggory);
        Ravenclaw.compareRavenclaw(zhouChang,padmaPatil);
        System.out.println();
//         если передавать в параметры 2-х случайных учеников
//        Hogwarts.compareHogwarts(harryPotter,dracoMalfoy);

// если сравнивать случайного с Гарри Поттером
        harryPotter.compare(dracoMalfoy);
    }
}