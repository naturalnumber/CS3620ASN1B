public class CircuitInput extends Gate {
    public CircuitInput(boolean initstate) {
        this.state = initstate;
    }

    public void setValue(boolean newstate) {
        this.state = newstate;
        setChanged();
        notifyObservers();
    }
}