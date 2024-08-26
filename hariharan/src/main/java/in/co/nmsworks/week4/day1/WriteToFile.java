package in.co.nmsworks.week4.day1;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile implements Writer{

    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;

    @Override
    public void open() {
        try {
            fileWriter = new FileWriter("employeesata.txt",true);
            bufferedWriter = new BufferedWriter(fileWriter);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @Override
    public void write(String[] employeeData) {
        try {
            bufferedWriter.append("******************************************************");
            bufferedWriter.newLine();
            bufferedWriter.append("ID\t: "+ employeeData[0]);
            bufferedWriter.newLine();
            bufferedWriter.append("Name:\t"+employeeData[1]);
            bufferedWriter.newLine();
            bufferedWriter.append("Age:\t"+employeeData[2]);
            bufferedWriter.newLine();
            bufferedWriter.append("Email:\t"+employeeData[3]);
            bufferedWriter.newLine();
            bufferedWriter.append("Phone:\t"+employeeData[4]);
            bufferedWriter.newLine();
            bufferedWriter.append("Address:\t"+employeeData[5]);
            bufferedWriter.newLine();
            bufferedWriter.append("City:\t"+employeeData[6]);
            bufferedWriter.newLine();
            bufferedWriter.append("State:\t"+employeeData[7]);
            bufferedWriter.newLine();
            bufferedWriter.append("Zipocde:\t"+employeeData[8]);
            bufferedWriter.newLine();
            bufferedWriter.append("Country\t:"+employeeData[9]);
            bufferedWriter.append("*****************************************************");
            bufferedWriter.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void close() throws IOException {

        fileWriter.close();
        bufferedWriter.close();
    }




}
