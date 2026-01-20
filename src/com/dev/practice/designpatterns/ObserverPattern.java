package com.dev.practice.designpatterns;

import java.util.ArrayList;
import java.util.List;

//defines a one to many relationship between objects
//when one object changes the state all its dependencies are notified
//where it is used
// 1) event handling systems
// 2) notification system
// 3) UI frameworks
// 4) Messaging and pub/sub systems
//Example :: when the stock price changes all registered users should get notified
public class ObserverPattern {
    public static void main(String[] args) {
       StockMarket market=new StockMarket();
       market.register(new MobileDisplay());
       market.register(new WebDisplay());
       market.notifyAllObservers("TCS",3675);
    }
}
interface Observer {
    void update(String stockName,double price);
}

class StockMarket {
    private final List<Observer> observers=new ArrayList<>();
    public void register(Observer observer) {
        observers.add(observer);
    }
    public void notifyAllObservers(String stockName,double price) {
        for(Observer observer:observers) {
            observer.update(stockName,price);
        }
    }
}

class MobileDisplay implements Observer
{
    public void update(String stockName, double price) {
        System.out.println("Mobile:: "+stockName+" updated to "+price);
    }
}
class WebDisplay implements Observer {
   public void update(String stockName, double price) {
       System.out.println("Web::"+stockName+" updated to  "+price);
    }
}