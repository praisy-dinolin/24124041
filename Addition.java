
class Addition {
    int add(int a, int b) {
        return a + b;    
}
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class Main {
    public static void main(String[] args) {
        Addition obj = new Addition();
        System.out.println("Sum of 2 numbers: " + obj.add(10, 20));
        System.out.println("Sum of 3 numbers: " + obj.add(5, 7, 9));
    }
}
