package entities;

import interfaces.Soda;

/**
 * Created by ib on 16/05/2017.
 *
 * @author ib
 */
public class IcedTea implements Soda {
    public String name;
    public float price;


    @Override
    public String getName() {
        return "Iced Tea";
    }

    @Override
    public float getPrice() {
        return (float) 1.70;
    }
}
