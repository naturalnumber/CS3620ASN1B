import java.util.Observable;
import java.util.Observer;

public class Probe implements Observer {
    private Gate input;
    private boolean state;

    public Probe(Gate inp) {
        this.input = inp;
        this.input.addObserver(this);

        this.state = this.input.getState();
    }

    public void show() {
        System.out.println(this.state ? "1" : "0");
    }

    @Override
    public void update(Observable observable, Object o) {
        this.state = this.input.getState();
        this.show();
    }
}