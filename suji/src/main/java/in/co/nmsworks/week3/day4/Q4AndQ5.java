package in.co.nmsworks.week3.day4;


    public class Q4AndQ5 {

        int array[];
        int min;
        int max;

        public void sortAndCalc(int[] array)
        {
            this.array = array;
            int temp = 0;
            for (int i = 0; i < array.length - 1; i++)
            {
                for (int j = 0; j < array.length - 1; j++)
                {
                    if (array[j] > array[j + 1])
                    {
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
            int max=array[array.length-1];
            int min = array[0];
            System.out.println("  MINIMUM VALUE IN THE ARRAY :: "+min);
            System.out.println("  MAXIMUN VALUE IN THE ARRAY :: "+max);
        }

        public void calcSecondLargestNumber(int []a)
        {
            this.array =a;
            int secondLargestNum=a[a.length-2];
            System.out.println("  THE SECOND LARGEST VALUE IN THE ARRAY :: "+secondLargestNum);
        }

        public static void main(String[] args)
        {
            Q4AndQ5 ob=new Q4AndQ5();
            int []a;
            a= new int[]{1, 5, 8, 3, -3, 7};
            ob.sortAndCalc(a);
            ob.calcSecondLargestNumber(a);
        }
    }


