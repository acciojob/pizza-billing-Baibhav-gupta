package com.driver;

public class Pizza {

    private int Price;
    private Boolean isVeg;
    private String bill;

    private boolean isExtraCheeseAdded=false;
    private int ExtraCheesePrice=0;

    private boolean isExtraToppingsAdded=false;
    private int ExtraToppingsPrice=0;
    private boolean isTakeAwayadded=false;
    private int TakeAwayPrice=0;
    //private int basePrice=0;
    private boolean isBillGenerated=false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg)
        {
            this.Price=300;
            this.ExtraToppingsPrice=70;
        }
        else
        {
            this.Price=400;
            this.ExtraToppingsPrice=120;
        }
        this.ExtraCheesePrice=80;
        this.TakeAwayPrice=20;
        bill="Base Price Of The Pizza: "+this.Price+"\n";
        //price+=basePrice;
        // your code goes here
    }

    public int getPrice(){
       // price+=basePrice+ExtraCheesePrice+ExtraToppingsPrice+TakeAwayPrice;
        return this.Price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isExtraCheeseAdded==false)
        {
            Price+=ExtraCheesePrice;
            isExtraCheeseAdded=true;
        }


    }

    public void addExtraToppings(){
        // your code goes here
        if(isExtraToppingsAdded==false)
        {
            Price+=ExtraToppingsPrice;
            isExtraToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAwayadded==false)
        {
            Price+=TakeAwayPrice;
            isTakeAwayadded=true;
        }

    }
//private int Totalprice=0;
    public String getBill(){
        // your code goes here
        if(isBillGenerated==false)
        {
            //bill="Base Price Of The Pizza: "+this.basePrice+"\n";

            if(isExtraCheeseAdded)
            {
                bill+="Extra Cheese Added: "+this.ExtraCheesePrice+"\n";

            }
            if(isExtraToppingsAdded)
            {
                bill+="Extra Toppings Added: "+this.ExtraToppingsPrice+"\n";

            }
            if(isTakeAwayadded){
                bill+="Paperbag Added: "+this.TakeAwayPrice+"\n";

            }
            bill+="Total Price: "+this.Price+"\n";
            isBillGenerated=true;

        }
        return this.bill;
    }
}
