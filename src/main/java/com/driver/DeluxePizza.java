package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        //Pizza p=new Pizza(isVeg);
        super.addExtraCheese();
        super.addExtraToppings();
        // your code goes here
    }
}
