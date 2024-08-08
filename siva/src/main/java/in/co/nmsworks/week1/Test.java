package in.co.nmsworks.week1;

public class Test {
        public static void main(String[] args)
        {
            Rectangle Rectangle1=new Rectangle();
            Rectangle1.length=10;
            Rectangle1.breath=5;
            System.out.println("Area of Rectangle1 : "+Rectangle1.area());
            System.out.println("Perimeter of Rectangle1 : "+Rectangle1.perimeter());

            Rectangle Rectangle2=new Rectangle();
            Rectangle2.length=20;
            Rectangle2.breath=15;
            System.out.println("Area of Rectangle2 : "+Rectangle2.area());
            System.out.println("Perimeter of Rectangle2 : "+Rectangle2.perimeter());



            Traingle traingle=new Traingle();
            traingle.height1=3;
            traingle.height2=3;
            traingle.base=3;
            System.out.println("Area of traingle : "+traingle.area());
            System.out.println("Perimeter of traingle : "+traingle.perimeter());


            Car car1=new Car(70000000,"Ferari",7.0f);

            System.out.println("CarName : "+car1.carName());
            System.out.println("Pricelevel : "+car1.pricelevel());
            System.out.println("cartype : " +car1.carType());


            Car car2=new Car(5000000,"bmw",8.0f);

            System.out.println("CarName : "+car2.carName());
            System.out.println("Pricelevel : "+car2.pricelevel());
            System.out.println("cartype : " +car2.carType());

            Car car3=new Car(6000000,"aadi",12f);

            System.out.println("CarName : "+car3.carName());
            System.out.println("Pricelevel : "+car3.pricelevel());
            System.out.println("cartype : " +car3.carType());


            Car car4=new Car(1000000,"shift",15f);

            System.out.println("CarName : "+car4.carName());
            System.out.println("Pricelevel : "+car4.pricelevel());
            System.out.println("cartype : " +car4.carType());


            Car car5=new Car(65000000,"fortuner",11f);

            System.out.println("CarName : "+car5.carName());
            System.out.println("Pricelevel : "+car5.pricelevel());
            System.out.println("cartype : " +car5.carType());


        }
    }


