package in.co.nmsworks.week1;

public class Games {
   public String name;
   protected int version;
   public int playerCount;
   String gameMode;
   protected String releasedYear;

   public Games(){

   }

   public Games(String name, int version){
       this.name = name;
       this.version = version;
   }

   public Games(String gameMode, String releasedYear,int playerCount){
       this.gameMode = gameMode;
       this.releasedYear = releasedYear;
       this.playerCount = playerCount;
   }

   public String showGameDetails(){
       return "Game Name :: "+name+"\nVersion :: "+version+"\nPlayer Count :: "+playerCount+"\nGame Mode :: "+gameMode+"\nReleased Year :: "+releasedYear;
   }
   public String showScoreCard(int score, String result){
       if(result.equalsIgnoreCase("Win")){
           return "You Scored "+score+" and You Won!";
       }
       return "You Scored "+score+" and You Lose!";
   }
}
