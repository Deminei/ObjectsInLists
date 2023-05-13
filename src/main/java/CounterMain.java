public class CounterMain {
    public static void main(String[] args) {
        // Create a counter with a start value of 5 using the parameterized constructor
        Counter counter1 = new Counter(5);

        // Create a counter with a start value of 0 using the default constructor
        Counter counter2 = new Counter();

        // Get the values of the counters
        System.out.println("Counter 1 value: " + counter1.getValue());
        System.out.println("Counter 2 value: " + counter2.getValue());

        // Increase counter
        counter1.increase();
        System.out.println("Counter 1 value after increase: " + counter1.getValue());

        // Decrease counter
        counter2.decrease();
        System.out.println("Counter 2 value after decrease: " + counter2.getValue());

        // Increase counter
        counter1.increaseBy(-3);
        System.out.println("Counter 1 value after increase by -3: " + counter1.getValue());

        // Decrease counter
        counter2.decreaseBy(-2);
        System.out.println("Counter 2 value after decrease by -2: " + counter2.getValue());
    }
}

