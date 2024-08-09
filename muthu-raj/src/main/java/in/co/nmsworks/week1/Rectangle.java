package in.co.nmsworks.week1;
class Rectangle{
    int length;
    int breadth;
//    constructor
    public Rectangle(int l,int b){
        this.length =  l;
        this.breadth = b;
    }
    public int area(){
        return length*breadth;
    }

    public int perimeter(){
        return 2*(length+breadth);
    }
}

