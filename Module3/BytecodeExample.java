public class BytecodeExample {
    public void display() {
        int a = 50;
        int b = 20;
        int sum = a + b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        BytecodeExample obj = new BytecodeExample();
        obj.display();
    }
}
