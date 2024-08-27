package in.co.nmsworks.week4.day1;

import java.io.IOException;
import java.util.List;

public interface Writer {


    public void open();
    public void write(List<String[]> employeeData);
    public void close() throws IOException;
}



