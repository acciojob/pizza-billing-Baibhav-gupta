package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public boolean isExtraCheeseAdded=false;
    private int ExtraCheesePrice=0;

    private boolean isExtraToppingsAdded=false;
    private int ExtraToppingsPrice=0;
    private boolean isTakeAwayadded=false;
    private int TakeAwayPrice=0;
    private int basePrice=0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg)basePrice=300;
        else basePrice=400;
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        ExtraCheesePrice=80;
        isExtraCheeseAdded=true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg)
        {
            ExtraToppingsPrice=70;
        }else ExtraToppingsPrice=120;
        isExtraToppingsAdded=true;
    }

    public void addTakeaway(){
        // your code goes here
        TakeAwayPrice=20;
        isTakeAwayadded=true;
    }
private int Totalprice=0;
    public String getBill(){
        // your code goes here
        bill="Base Price Of The Pizza = "+basePrice+"\n";
        Totalprice+=basePrice;
        if(isExtraCheeseAdded)
        {
            bill+="Extra Cheese Added = "+ExtraCheesePrice+"\n";
            Totalprice+=ExtraCheesePrice;
        }
        if(isExtraToppingsAdded)
        {
            bill+="Extra Toppings Added = "+ExtraToppingsPrice+"\n";
            Totalprice+=ExtraToppingsPrice;
        }
        if(isTakeAwayadded){
            bill+="Paperbag Added = "+TakeAwayPrice+"\n";
            Totalprice+=TakeAwayPrice;
        }
        bill+="Total Price = "+Totalprice+"\n";
        return this.bill;
    }
}
