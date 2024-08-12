package in.co.nmsworks.week1;

public class Training6 {
    public void noOfVowelsAndConsonants(String s){
        String[] arr = s.split("");
        int countOfVowels = 0;
        int countOfConsonants = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i].equalsIgnoreCase("a")){
                countOfVowels += 1;
            }
            else if(arr[i].equalsIgnoreCase("e")){
                countOfVowels += 1;

            }
            else if(arr[i].equalsIgnoreCase("i")){
                countOfVowels += 1;

            }
            else if(arr[i].equalsIgnoreCase("o")){
                countOfVowels += 1;

            }
            else if(arr[i].equalsIgnoreCase("u")){
                countOfVowels += 1;

            }
            else{
                countOfConsonants += 1;
            }
        }
        System.out.println("Vowels : "+countOfVowels);
        System.out.println("Consonants : "+countOfConsonants);
    }
}
