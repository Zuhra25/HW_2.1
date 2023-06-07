public class PrintService {
    public void print(Gryffindor[] gryffindors){
        System.out.println("Описание студента Гриффиндор:");
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.printf("Ученик - %s, колдовство - %s, трансгрессия - %s%n благородство - %s, честь - %s, храбрость - %s%n",gryffindor.getFullname(), gryffindor.getWitchcraft(), gryffindor.getTransgress(),gryffindor.getNobility(), gryffindor.getHonor(), gryffindor.getBravery());
        }
    }
    public void print(Slytherin[] slytherins){
        System.out.println("Описание студента Слизерин:");
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.printf("Ученик - %s, колдовство - %s, трансгрессия - %s%n хитрость - %s, решительность - %s, амбициозность - %s, находчивость- %s, жажда власти- %s%n",slytherin.getFullname(), slytherin.getWitchcraft(), slytherin.getTransgress(),slytherin.getCunning(), slytherin.getDetermination(), slytherin.getAmbition(),slytherin.getResourcefulness(),slytherin.getLustForPower());
        }
    }
    public void print(Hufflepuff[] hufflepuffs){
        System.out.println("Описание студента Пуффендуй:");
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.printf("Ученик - %s, колдовство - %s, трансгрессия - %s%n трудолюбие - %s, верность - %s, честность - %s%n",hufflepuff.getFullname(), hufflepuff.getWitchcraft(), hufflepuff.getTransgress(),hufflepuff.getIndustriousness(), hufflepuff.getLoyalty(),hufflepuff.getHonesty());
        }
    }
    public void print(Ravenclaw[] ravenclaws){
        System.out.println("Описание студента Когтевран:");
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.printf("Ученик - %s, колдовство - %s, трансгрессия - %s%n ум - %s, мудрость - %s, остроумие - %s, творчество - %s%n",ravenclaw.getFullname(), ravenclaw.getWitchcraft(), ravenclaw.getTransgress(),ravenclaw.getMind(), ravenclaw.getWitchcraft(),ravenclaw.getWit(),ravenclaw.getCreation());
        }
    }
}
