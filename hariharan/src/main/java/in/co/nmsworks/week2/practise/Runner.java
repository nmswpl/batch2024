package in.co.nmsworks.week2.practise;

public class Runner {
    public static void main(String[] args) {

        LandAnimal landAnimal1 = new LandAnimal();
        landAnimal1.setEatingtype(Animal.EatingType.Herbivorus);

        LandAnimal landAnimal2 = new LandAnimal();
        landAnimal2.setEats(new String[]{"leaf","grass"});

        WaterAnimal waterAnimal1 = new WaterAnimal();
        waterAnimal1.canSwim();



        Bird bird1 = new Bird();
        bird1.noWings =2;
        bird1.canfly();



    }
}
