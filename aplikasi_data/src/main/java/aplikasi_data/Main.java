package aplikasi_data;

public class Main {
    public static void main(String[] args) {
    // Contoh penggunaan MemoryStorage
    DataStorage memoryStorage = new MemoryStorage2();
    memoryStorage.writeData("Data stored in memory");
    System.out.println("Memory storage: " + memoryStorage.readData());
    
    // Contoh penggunaan FileStorage
    DataStorage fileStorage = new FileStorage("data.txt");
    fileStorage.writeData("Data stored in file");
    System.out.println("File storage: " + fileStorage.readData());
    
    // Contoh penggunaan DatabaseStorage
    DataStorage databaseStorage = new DatabaseStorage("database.db");
    databaseStorage.writeData("Data stored in database");
    System.out.println("Database storage: " + databaseStorage.readData());
    }
}