package ru.toofast.cat.decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RealPizzaRestaurantTest {


    @Test
    public void testPizza(){
        PizzaRestaurant pizzaRestaurant = new ToGoPizzaRestaurant(new AuditPizzaRestaurant(new RealPizzaRestaurant()));
        boolean birthday = false;
        if(birthday){
           pizzaRestaurant = new BirthdayPizzaRestaurant(pizzaRestaurant);
        }

        Pizza pizza = pizzaRestaurant.orderPizza();

        Assertions.assertNotNull(pizza);


    }

}