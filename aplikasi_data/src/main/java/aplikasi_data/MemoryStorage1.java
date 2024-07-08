package aplikasi_data;

public class MemoryStorage1 implements DataStorage {
    private String data;
    @Override
    public void writeData(String data) {
        this.data = data;
    }
    @Override
    public String readData() {
        return this.data;
    }
}