package in.co.nmsworks.week4.day1;

import java.io.IOException;

public interface Writer {
   public void open() throws Exception;
   public void write(String[] details);
   public  void closes() throws Exception;
}
