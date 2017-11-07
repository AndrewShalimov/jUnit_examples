package example;

public class MainClass {


    public static void main(String[] args) {
        try {
            new MainClass();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public MainClass() {
        System.out.println("-- Do something.");

    }
}
