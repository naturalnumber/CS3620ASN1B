import java.util.Observable;
import java.util.Observer;

public class AndGate extends Gate implements Observer {
    private Gate input1, input2;

    public AndGate(Gate inp1, Gate inp2) {
        this.input1 = inp1;
        this.input1.addObserver(this);

        this.input2 = inp2;
        this.input2.addObserver(this);

        this.state = this.input1.getState() && this.input2.getState();
    }

    @Override
    public void update(Observable observable, Object o) {
        this.state = this.input1.getState() && this.input2.getState();
        setChanged();
        notifyObservers();
    }
}