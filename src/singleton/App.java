package singleton;

public class App {
    public static void main(String[] args) {
        DataManager dataManager = DataManager.getInstance();
        dataManager.addToCache("key1", "value1");
        dataManager.addToCache("key2", "value2");

        System.out.println(dataManager.getFromCache("key1"));
        System.out.println(dataManager.getFromCache("key2"));
    }
}
