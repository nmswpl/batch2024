package in.co.nmsworks.weekend;

/*  Write a program to reverse words in a Sentence.
	Input : India is my country.
	Output:	country my is India. */
    public class Q1 {
    public void reverseString(String name) {
        String[] array = name.split(" ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}

