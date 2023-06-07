public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor("Harry Potter", 80, 50, 11, 21, 31),
                new Gryffindor("Hermione Granger", 95, 70, 12, 22, 32),
                new Gryffindor("Ron Weasley", 60, 50, 13, 23, 33),
        };
        Slytherin[] slytherins = {
                new Slytherin("Draco Malfoy", 70, 40, 41, 15, 60,52,33),
                new Slytherin("Graham Montagu", 65, 50, 52, 70, 15,62,12),
                new Slytherin("Gregory Goyle", 50, 60, 15, 78, 53,56,82),
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Zacharias Smith. ", 79, 45, 56, 41, 23),
                new Hufflepuff("Cedric Diggory", 56, 33, 45, 56, 88),
                new Hufflepuff("Justin Finch-Fletchley", 30, 25, 12, 78, 77),
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Zhou Chang. ", 45, 56, 52, 24, 45),
                new Ravenclaw("Padma Patil", 58, 58, 47, 69, 56),
                new Ravenclaw("Marcus Belby", 69, 25, 72, 43, 78),
        };
    }
}