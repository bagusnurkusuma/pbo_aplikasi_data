package aplikasi_data;

import java.util.ArrayList;

public class MemoryStorage2 implements DataStorage {
    private ArrayList<String> data;
    public MemoryStorage2() {
        this.data = new ArrayList<>();
    }
    @Override
    public void writeData(String data) {
        this.data.add(data);
    }
    @Override
    public String readData() {
        StringBuilder sb = new StringBuilder();
        for (String item : this.data) {
            sb.append(item);
        }
        return sb.toString();
    }
}