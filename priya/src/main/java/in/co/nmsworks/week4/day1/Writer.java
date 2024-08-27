package in.co.nmsworks.week4.day1;

import java.io.IOException;
import java.sql.SQLException;

public interface Writer {
    public void open() throws IOException, SQLException;
    public void write(Writer w,String[] arr) throws IOException, SQLException;
    public void close();
}
