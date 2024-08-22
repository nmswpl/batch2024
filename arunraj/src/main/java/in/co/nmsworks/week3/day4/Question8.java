package in.co.nmsworks.week3.day4;

public class Question8 {
    public static void main(String[] args) {
        Question8 q8 = new Question8();
        q8.meanOfArray(new int[]{6,2,5,7,9,6,2});
    }

    public void meanOfArray(int[] array){
        float sum=0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        float mean;
        mean = sum / array.length;
        System.out.println("The mean of the array is "+mean);
    }
}
