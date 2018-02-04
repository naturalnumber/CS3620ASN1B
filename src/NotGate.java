import java.util.Observable;
import java.util.Observer;

public class NotGate extends Gate implements Observer {
    private Gate input;

    public NotGate(Gate inp) {
        this.input = inp;
        this.input.addObserver(this);

        this.state = !this.input.getState();
    }

    @Override
    public void update(Observable observable, Object o) {
        this.state = !this.input.getState();
        setChanged();
        notifyObservers();
    }
}