package in.co.nmsworks.week5.day4;

public class Geo {
    private Double lat;
    private Double lng;

    public Double getLat(){
        return lat;
    }

    public void setLat( Double lat ){
        this.lat = lat;
    }

    public Double getLng(){
        return lng;
    }

    public void setLng( Double lng ){
        this.lng = lng;
    }

    @Override
    public String toString(){
        return "Geo{" +
                "lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}
