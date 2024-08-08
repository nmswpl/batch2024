package in.co.nmsworks.week1;

public class Animal {
     String color;
     String breed;
     int age;
     String animalName;
     int num;

     public void name(String a){
         animalName=a;
         System.out.println("The dog name is "+animalName);
         System.out.println("It eats Three times a day");
     }

     public void appearance(){
         System.out.println("The animal is "+animalName);
         System.out.println("The color is "+color);
         System.out.println("The breed is "+breed);
         System.out.println("The age is "+age);
     }

     public Animal(){
     }

     public Animal(int num){
         this.num=num;
         System.out.println("There are "+this.num+" number of breeds");
     }

     String cname;
     int l;
     public void cow(String cowName,int lit){
         cname=cowName;
         l=lit;
         System.out.println(cname+" cow gives "+l+" liters milk a day");
     }

     /*float litre;
     public void cow(String cowName,float litre){
        cname=cowName;
        float this.litre =litre;
        System.out.println(cname+" cow gives "+ litre +" liters milk a day");
    }*/
}
