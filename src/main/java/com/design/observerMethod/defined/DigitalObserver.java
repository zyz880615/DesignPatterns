package com.design.observerMethod.defined;

/**
 * Created by kaolafm on 2018/11/30.
 *
 * @author zhangyz
 */
public class DigitalObserver implements Observer {

    @Override
    public void update(NumberGenerator object) {
        System.out.println("DigitalObserver: " + object.getNumber());
        try {
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
