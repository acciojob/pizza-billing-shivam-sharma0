package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        if(isVeg){
            setPrice(300+80+70);
        }else{
            setPrice(400+80+70);
        }
        // your code goes here
    }

}
