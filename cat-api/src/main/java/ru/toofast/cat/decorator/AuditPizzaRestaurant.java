package ru.toofast.cat.decorator;

public class AuditPizzaRestaurant implements PizzaRestaurant{

    private PizzaRestaurant delegate;

    public AuditPizzaRestaurant(PizzaRestaurant delegate) {
        this.delegate = delegate;
    }

    @Override
    public Pizza orderPizza() {
        long timeStart = System.currentTimeMillis();
        Pizza pizza = delegate.orderPizza();
        long timeEnd = System.currentTimeMillis();
        if(timeEnd - timeStart > 1){
            System.err.println("ЭТО НЕПРИЕМЛИМО! ПОЗВОНИТЬ УПРАВЛЯЮЩЕМУ");
        } else {
            System.out.println("Всё ок");
        }
        return pizza;
    }
}
