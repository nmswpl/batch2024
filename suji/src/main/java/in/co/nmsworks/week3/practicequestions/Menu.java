package in.co.nmsworks.week3.practicequestions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu
{
    static List<Menu> listOfMenu=new ArrayList<>();
   String choice;
   String item;
   String description;
   int price;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Menu{" +

                "item='" + item + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    public Menu(String[] s)
    {
        setItem(s[0].trim());
        setDescription(s[1].trim());
        setPrice((Integer.parseInt(s[2])));
    }

    public static void readMenu(String choice) throws IOException {
        String path = "";
        switch (choice)
        {
            case "A": path ="/home/nms/Practice/MenuA.txt";
            break;

            case "B":path="/home/nms/Practice/Menu2.txt";
            break;

            case "C": path="/home/nms/Practice/Menu3.txt";
            break;
        }

        FileReader fr=new FileReader(path);
        BufferedReader br=new BufferedReader(fr);


        while (br.readLine()!=null)
        {

            String line= br.readLine();
            String []s=line.split(",");
            Menu ob=new Menu(s);
            listOfMenu.add(ob);
          //  System.out.println(line);
        }

        for (Menu ofMenu : listOfMenu)
        {
            System.out.println(ofMenu);
        }

        System.out.println(listOfMenu);
        br.close();
        fr.close();

    }

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int quit=0;
        String whichMenu;
    /*    while(quit!=1)
        {
            System.out.println(" Enter one option \n 1 :: Viewing the menu \n 2 :: To Quit");
            int option=sc.nextInt();
            switch (option)
            {
                case 1:

           */       System.out.println(" Enter which menu you want to view ?");
                    System.out.println(" A :: Juices & Milkshake");
                    System.out.println(" B :: South Indian food");
                    System.out.println(" C :: Burgers & Pizza");
                    whichMenu=sc.nextLine();
                    readMenu(whichMenu);
                /*    break;

                case 2:
                    System.out.println("Quiting ..");
                    quit=1;
            }
        }  */

    }
}
