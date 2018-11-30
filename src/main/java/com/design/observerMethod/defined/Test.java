package com.design.observerMethod.defined;

/**
 * Created by kaolafm on 2018/11/30.
 *
 * @author zhangyz
 */
public class Test {
    public static void main(String[] args){
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        numberGenerator.add(new DigitalObserver());
        numberGenerator.add(new GraphObserver());

        numberGenerator.execute();
    }
}
