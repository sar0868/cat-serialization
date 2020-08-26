package ru.toofast.cat.decorator;

public class RealPizzaRestaurant implements PizzaRestaurant {
    @Override
    public Pizza orderPizza() {

        System.out.println("Make some pizza!");
        return new Pizza();
    }
}
