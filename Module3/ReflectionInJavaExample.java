import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionInJavaExample {

    public void show() {
        System.out.println("Hello from show method");
    }

    public void display(String name, int age) {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) throws Exception {

        Class<?> cls = Class.forName("ReflectionInJavaExample");

        Method[] methods = cls.getDeclaredMethods();

        for (Method m : methods) {
            System.out.println("Method: " + m.getName());

            Parameter[] params = m.getParameters();
            System.out.print("Parameters: ");

            for (Parameter p : params) {
                System.out.print(p.getType().getSimpleName() + " " + p.getName() + " ");
            }
            System.out.println();
        }

        Object obj = cls.getDeclaredConstructor().newInstance();

        Method method1 = cls.getDeclaredMethod("show");
        method1.invoke(obj);

        Method method2 = cls.getDeclaredMethod("display", String.class, int.class);
        method2.invoke(obj, "Harshitha", 21);
    }
}