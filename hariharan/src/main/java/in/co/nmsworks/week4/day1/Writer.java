package in.co.nmsworks.week4.day1;

import java.io.IOException;

public interface Writer {


    public void open();
    public void write(String[] employeeData);
    public void close() throws IOException;
}



