package in.co.nmsworks.week4.day1;

public interface Writer {
     void open()throws Exception;
     void write(String[] data)throws Exception;
     void close() throws Exception;

}
