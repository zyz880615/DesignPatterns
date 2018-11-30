package com.design.observerMethod.defined;

import java.util.Random;

/**
 * Created by kaolafm on 2018/11/30.
 *
 * @author zhangyz
 */
public class RandomNumberGenerator extends NumberGenerator {

    private Random random = new Random();
    private int number;

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i=0;i<20;i++){
            number = random.nextInt(60);
            notifyObserver();
        }
    }
}
