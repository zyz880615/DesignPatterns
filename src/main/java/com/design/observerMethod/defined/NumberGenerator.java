package com.design.observerMethod.defined;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by kaolafm on 2018/11/30.
 *
 * @author zhangyz
 */
public abstract class NumberGenerator {

    private ArrayList observers = new ArrayList();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.add(observer);
    }

    public void notifyObserver() {
        Iterator it = observers.iterator();
        while (it.hasNext()) {
            Observer object = (Observer) it.next();
            object.update(this);
        }
    }

    public abstract void execute();

    public abstract int getNumber();
}
