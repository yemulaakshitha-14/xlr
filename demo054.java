public class demo054 {
    public static void main(String[] args) {

        ClassOne classOne = new ClassOne();
        ClassTwo classTwo = new ClassTwo();


        classOne.display();
        classOne.display("Hello");
        classOne.display(42);
        classOne.display("Overloading", 100);


        classTwo.calculate();
        classTwo.calculate(5, 10);
        classTwo.calculate(3.14, 2.71);
        classTwo.calculate(7, 3.5, "Example");
    }
}


class ClassOne {

    void display() {
        System.out.println("Display method with no parameters");
    }

    void display(String message) {
        System.out.println("Display method with a String: " + message);
    }

    void display(int number) {
        System.out.println("Display method with an integer: " + number);
    }

    void display(String message, int number) {
        System.out.println("Display method with a String and an integer: " + message + ", " + number);
    }
}


class ClassTwo {

    void calculate() {
        System.out.println("Calculate method with no parameters");
    }

    void calculate(int a, int b) {
        System.out.println("Calculate method with two integers: " + a + ", " + b);
    }

    void calculate(double a, double b) {
        System.out.println("Calculate method with two doubles: " + a + ", " + b);
    }

    void calculate(int a, double b, String name) {
        System.out.println("Calculate method with an integer, a double, and a String: " + a + ", " + b + ", " + name);
    }
}