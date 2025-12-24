import windows.SimuladorUI;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Thread th = new Thread(new SimuladorUI());
        th.start();
        
    }
}
