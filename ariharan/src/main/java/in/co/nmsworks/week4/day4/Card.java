package in.co.nmsworks.week4.day4;

public class Card{
    private String face;
    private String value;

    public Card( String face, String value ){
        this.face = face;
        this.value = value;
    }

    public String getFace(){
        return face;
    }

    public String getValue(){
        return value;
    }

    @Override
    public String toString(){
        return  face + " " + value ;
    }


}
