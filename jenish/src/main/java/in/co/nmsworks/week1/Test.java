package in.co.nmsworks.week1;

public class Test {
    public static void main(String[] args) {

        //Rectangle
        Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.breadth = 5;
        System.out.println("Area of Rect 1 : "+r1.area());
        System.out.println("Perimeter of Rect 1 : "+r1.perimeter());

        Rectangle r2 = new Rectangle();
        r2.length = 20;
        r2.breadth = 15;
        System.out.println("Area of Rect 2: "+r2.area());
        System.out.println("Perimeter of React 2: "+r2.perimeter());

        //Triangle
        Triangle tri1 = new Triangle();
        tri1.side1 = 5;
        tri1.side2 = 3;
        tri1.side3 = 6;
        tri1.base = 3;
        tri1.height = 3;
        System.out.println("Area of Tri 1: "+tri1.area());
        System.out.println("Perimeter of Tri 1: "+tri1.perimeter());

        //Games
        Games game1 = new Games();
        game1.name = "Contra";
        game1.version = 4;
        game1.playerCount = 2;
        game1.gameMode = "Offline";
        game1.releasedYear = "2000";
        System.out.println(game1.showGameDetails());
        System.out.println(game1.showScoreCard(700, "Lose"));

        Games game2 = new Games("Online","2002",2);
        game2.name = "Plants vs Zombies";
        game2.version = 3;
        System.out.println(game2.showGameDetails());
        System.out.println(game2.showScoreCard(1500, "Win"));

        Games game3 = new Games();
        game3.name = "Moto GP Racing";
        game3.version = 2;
        game3.playerCount = 1;
        game3.gameMode = "Offline";
        game3.releasedYear = "1998";
        System.out.println(game3.showGameDetails());
        System.out.println(game3.showScoreCard(900, "win"));

        Games game4 = new Games();
        game4.name = "WWE";
        game4.version = 5;
        game4.playerCount = 2;
        game4.gameMode = "Online";
        game4.releasedYear = "2012";
        System.out.println(game4.showGameDetails());
        System.out.println(game4.showScoreCard(1200,"win"));

        Games game5 = new Games("Genshin Impact", 5);
        game5.playerCount = 1;
        game5.gameMode = "Online";
        game5.releasedYear = "2018";
        System.out.println(game5.showGameDetails());
        System.out.println(game5.showScoreCard(1600,"Lose"));
    }
}