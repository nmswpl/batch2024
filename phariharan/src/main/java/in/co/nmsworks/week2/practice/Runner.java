package in.co.nmsworks.week2.practice;

public class Runner {
    public static void main(String[] args) {

        System.out.println("Elephant");
        LandAnimals elephant = new LandAnimals();
        elephant.setNoOfLegs(4);
        elephant.setEats(new String[]{"grass", "fruits"});
        elephant.setEatTypes(String.valueOf(Animal.EatingType.HERBIVORES));
        elephant.Details();
        System.out.println("\n\n");

        System.out.println("Lion");
        LandAnimals Lion = new LandAnimals();
        Lion.setNoOfLegs(4);
        Lion.setEatTypes(String.valueOf(Animal.EatingType.CARNIVORES));
        Lion.setEats(new String[]{"Flesh", "meat"});
        Lion.Details();

        System.out.println("\n\n");
        System.out.println("Fish");
        WaterAnimals fish = new WaterAnimals();
        fish.setEatTypes(String.valueOf(Animal.EatingType.OMNIVORES));
        fish.setEats(new String[]{"worms","small fish"});
        fish.displayDetails();

        System.out.println("\n\n");
        WaterAnimals dolphin = new WaterAnimals();
        dolphin.setEatTypes(String.valueOf(Animal.EatingType.HERBIVORES));
        dolphin.setEats(new String[]{"worms","Algae"});
        System.out.println("Dolphin");
        dolphin.displayDetails();
        System.out.println("\n\n");

        System.out.println("Sparrow");
        Birds sparrow = new Birds();
        sparrow.setNoOfWing(2);
        sparrow.setEats(new String[]{"worms","grains"});
        sparrow.setEatTypes(String.valueOf(Animal.EatingType.OMNIVORES));
        sparrow.details();
        System.out.println("\n\n");

        System.out.println("pigeon");
        Birds pigeon = new Birds();
        pigeon.setEats(new String[]{"worms","fruits"});
        pigeon.setEatTypes(String.valueOf(Animal.EatingType.OMNIVORES));
        pigeon.setNoOfWing(2);
        pigeon.details();

    }
}



