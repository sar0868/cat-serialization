package ru.toofast.cat.decorator;

public class BirthdayPizzaRestaurant implements PizzaRestaurant {

    private PizzaRestaurant pizzaRestaurant;

    public BirthdayPizzaRestaurant(PizzaRestaurant pizzaRestaurant) {
        this.pizzaRestaurant = pizzaRestaurant;
    }

    @Override
    public Pizza orderPizza() {
        System.out.println("С ДНЕМ РОЖДЕНИЯ!");
        return pizzaRestaurant.orderPizza();
    }
}
