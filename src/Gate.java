import java.util.Observable;

public class Gate extends Observable {
    protected boolean state;

    public boolean getState() {
        return state;
    }
}