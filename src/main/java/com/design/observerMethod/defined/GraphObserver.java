package com.design.observerMethod.defined;

/**
 * Created by kaolafm on 2018/11/30.
 *
 * @author zhangyz
 */
public class GraphObserver implements Observer {
    @Override
    public void update(NumberGenerator object) {
        System.out.println("GraphObserver:");
        for (int i=0; i<object.getNumber();i++){
            System.out.print("*");
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
