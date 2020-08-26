package ru.toofast.cat.decorator;

public class ToGoPizzaRestaurant implements PizzaRestaurant {

    private PizzaRestaurant delegate;

    public ToGoPizzaRestaurant(PizzaRestaurant delegate) {
        this.delegate = delegate;
    }

    @Override
    public Pizza orderPizza() {
        Pizza pizza = delegate.orderPizza();
        System.out.println("Положить в коробку!");
        return pizza;
    }
}
