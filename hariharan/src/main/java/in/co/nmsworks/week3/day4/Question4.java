package in.co.nmsworks.week3.day4;

public class Question4 {
    public Question4(int[] integerArray) {

        int minValue = integerArray[0];
        int maxVlaue = 0;
        for(int i =0;i<integerArray.length;i++){
            if(integerArray[i] > maxVlaue){
                maxVlaue = integerArray[i];
            }
            if(integerArray[i] < minValue){
                minValue = integerArray[i];
            }
        }

        System.out.println("Min Value: " + minValue + " Max Value:" + maxVlaue);
    }
}
