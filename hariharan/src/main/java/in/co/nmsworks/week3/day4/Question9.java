package in.co.nmsworks.week3.day4;

public class Question9 {
    public Question9(int[] integerArray) {
        float mean =0;
        float middle;

        if(integerArray.length % 2 == 0){
           middle = integerArray.length /2;
           mean = (float)(integerArray[(int) middle] + integerArray[(int) (middle-1)] / 2);
        }else{
            middle = (float)integerArray.length/2;
            mean = (float)integerArray[(int) middle];
        }

        System.out.println("Mean"+mean);
    }
}
