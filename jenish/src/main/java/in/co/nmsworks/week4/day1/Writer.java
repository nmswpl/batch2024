package in.co.nmsworks.week4.day1;

import java.util.List;

public interface Writer {
    public void open();
    public void write(List<String[]> list) throws Exception;
    public void close();
}