package in.co.nmsworks.week4.day1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//"ID","Name","Age","Email","Phone","Address","City","State","ZipCode","Country"
public  class WriteTOFIle implements Writer {
    FileWriter fr;
    BufferedWriter br;

    @Override
    public void open() throws Exception{
        fr=new FileWriter("/home/nms/employees.txt",true);
        br=new BufferedWriter(fr);
    }

    public void write(String[] details){
        try{
            br.append("the id of the employee is  ").append(String.valueOf(Integer.parseInt(details[0])));
            br.newLine();
            br.append("the name of the employee:  ").append(details[1]);
            br.newLine();
            br.append("the age of the employee  ").append(String.valueOf(Integer.parseInt(details[2])));
            br.newLine();
            br.append("the email :  ").append(details[3]);
            br.newLine();
            br.append("the phone number :  ").append(details[4]);
            br.newLine();
            br.append("Address:  ").append(details[5]);
            br.newLine();
            br.append("city  :  ").append(details[6]);
            br.newLine();
            br.append("state :  ").append(details[7]);
            br.newLine();
            br.append("zipcode:  ").append(String.valueOf(Integer.parseInt(details[8])));
            br.newLine();
            br.append("country :  ").append(details[9]);
            br.newLine();
            br.newLine();
            br.newLine();
            System.out.println("Successfully writed");


        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void closes() throws Exception{
        fr.close();
        br.close();

    }
}
