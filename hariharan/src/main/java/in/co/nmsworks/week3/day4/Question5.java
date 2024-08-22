package in.co.nmsworks.week3.day4;

public class Question5 {
    public Question5(int[] integerArray) {

        int maxValue =0;
        int secondMaxValue =0;

        if(integerArray[0] > integerArray[1]){
          maxValue = integerArray[0];
            secondMaxValue = integerArray[1];
        } else if (integerArray[1] > integerArray[0]) {
            secondMaxValue = integerArray[0];
            maxValue = integerArray[1];
        }


        for(int i =2;i<integerArray.length;i++){
            if(integerArray[i] > maxValue){
                secondMaxValue = maxValue;
                maxValue = integerArray[i];
            }else if(integerArray[i] > secondMaxValue){
                secondMaxValue = integerArray[i];
            }
        }

        System.out.println("Second largest Number:" + secondMaxValue);
    }
}
