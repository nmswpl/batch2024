package in.co.nmsworks.week1;

import java.util.Scanner;

public class Vegetable {
    public String vegetableName;
    public String vegetableColor;
    public String vegetableTaste;
    public enum vegetableQuality {
        FRESH,
        RATEN,
        OLD
    }
    public Vegetable(){
        System.out.println("This is an Default Constector");
    }
    public Vegetable(String vegetableName){
    this.vegetableName=vegetableName;
        System.out.println("Vegetable name is "+vegetableName);
    }
    public Vegetable(String vegetableName,String taste){
        this.vegetableName=vegetableName;
        String vegetableTaste=taste;
        System.out.println("Vegetable name is "+vegetableName+" Taste is "+vegetableTaste);
    }
    public Vegetable(String vegetableName,String taste,vegetableQuality quality){
        this.vegetableName=vegetableName;
        String vegetableTaste=taste;
        vegetableQuality vegetableQuality=quality;
        System.out.println("Name : "+vegetableName+" Taste : " +taste +"quelity : " +vegetableQuality);
    }
    public void printVegetable(){
        if(vegetableName ==null){
            System.out.println("No vegetable name or updated");
        }
        else {
            System.out.println("Chosen Vegetable");
            System.out.println(vegetableName);
        }

    }
    public void giveDetailVegetable(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Name Vegetable :");
        this.vegetableName=sc.nextLine();
        System.out.println("Enter Taste of :" +vegetableName);
        this.vegetableTaste=sc.nextLine();
        System.out.println("Enter color for vegetable :" +vegetableName);
        this.vegetableColor=sc.nextLine();
        System.out.println("Vegetable :"+vegetableName+"its taste :"+vegetableTaste+"and its color is :"+vegetableColor);
    }

}
