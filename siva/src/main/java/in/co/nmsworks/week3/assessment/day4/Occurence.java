package in.co.nmsworks.week3.assessment.day4;
import java.io.*;

public class Occurence {



        public static void main(String[] args) {
            Occurence ocuurence = new Occurence();
            ocuurence.occurence("/home/nms/India.txt","diversity");

        }
        public void occurence(String path,String word){
            try {
                FileReader fr = new FileReader(path);
                BufferedReader br = new BufferedReader(fr);
                String line = br.readLine();
                int count = 0;
                while (line != null){
                    String[] words = line.split(" ");
                    for (String s : words) {
                        if (s.toLowerCase().contains(word)){
                            count++;
                        }
                    }
                    line = br.readLine();

                }
                br.close();
                fr.close();
                System.out.println("The Give Word Is :: "+count+"  Occurence");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }

