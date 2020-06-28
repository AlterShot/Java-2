package Java2;

public class Main {

    static final int size = 10000000;
    static final int h = size / 2;
    float[] arr = new float[size];
    long a = System.currentTimeMillis();

    public static void main(String[] args) {
        new Count();
        new Divide();
    }
}