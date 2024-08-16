package in.co.nmsworks.week2.collections;

/*7. Write a Java program to search
 for an element in an array list.
 */

import java.util.ArrayList;

public class Pq7 {
    ArrayList<Integer> nums=new ArrayList<>();
    public void sortArray(){
        nums.add(7);
        nums.add(1);
        nums.add(6);
        nums.add(9);
        nums.add(2);
        nums.add(8);
        nums.add(4);
        nums.add(3);
        nums.add(5);
        nums.add(10);
        int temp=0;
        for(int i=0;i<nums.size();i++){
            for (int j=0;j<nums.size()-1-i;j++){
                if(nums.get(j)>nums.get(j+1)){
                    temp=nums.get(j);
                    nums.set(j,nums.get(j+1));
                    nums.set(j+1,temp);
                }
            }
        }
        System.out.println(nums);
    }
}
