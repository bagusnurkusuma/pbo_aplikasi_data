package aplikasi_data;

public interface DataStorage {
    void writeData(String data);
    String readData();
}