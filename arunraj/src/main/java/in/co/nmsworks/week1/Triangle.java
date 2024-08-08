package in.co.nmsworks.week1;

class Triangle{
    int height1;
    int height2;
    int base;

    public float areaTriangle(){
        float s1;
        s1=(base*height1)/2f;
        return s1;
    }

    public float perimeterTriangle(){
        float s2;
        s2=base+height1+height2;
        return s2;
    }
}
