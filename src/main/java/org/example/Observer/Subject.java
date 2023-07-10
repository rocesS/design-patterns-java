package Observer;

import java.util.ArrayList;
import java.util.List;

class Subject {

    private final List<Observer> observers = new ArrayList<>();
    private int state;

    int getState() {
        return state;
    }

    void setState(final int state) {
        this.state = state;
        notifyAllObservers();
    }

    void attach(final Observer observer){
        observers.add(observer);
    }

    private void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
