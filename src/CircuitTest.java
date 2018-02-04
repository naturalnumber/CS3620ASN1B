public class CircuitTest {
    public static void main(String[] args) {
        System.out.println("Initial State: ");
        CircuitInput i1 = new CircuitInput(false);
        CircuitInput i2 = new CircuitInput(true);
        Gate gate1 = new NotGate(i1);
        Gate gate2 = new AndGate(gate1, i2);
        Probe o1 = new Probe(gate2);
        o1.show();
        System.out.println();

        System.out.println("Input1 to true: ");
        i1.setValue(true);
        System.out.println();

        System.out.println("Input2 to false: ");
        i2.setValue(false);
        System.out.println();

        System.out.println("Input1 to false: ");
        i1.setValue(false);
        System.out.println();

        System.out.println("Input2 to true: ");
        i2.setValue(true);
        System.out.println();
    }
}
