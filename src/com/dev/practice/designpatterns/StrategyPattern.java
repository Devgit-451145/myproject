package com.dev.practice.designpatterns;


//defines a family of algorithm ,encapsulate each one and makes them interchangeable at runtime
//where to use
//1) when multiple algorithms can be applied for the same task
// 2) when you need to switch logic dynamically based on conditions

//Example e-commerse site where discount vary - festival discount,new-user discount or no discount
//you can dynamically choose which discount strategy to apply
public class StrategyPattern {
    public static void main(String[] args) {
        Checkout checkout=new Checkout(new FestivalDiscount());
        System.out.println("final price: "+checkout.calculateFinalPrice(1000));
    }
}
interface DiscountStrategy{
    double applyDiscount(double price);
}
class NoDiscount implements DiscountStrategy
{
    public double applyDiscount(double price) {
        return price;
    }
}
class FestivalDiscount implements DiscountStrategy
{
    public double applyDiscount(double price) {
        return price*0.8;
    }
}
class NewUserDiscount implements DiscountStrategy
{
    public double applyDiscount(double price) {
        return price*0.9;
    }
}

class Checkout {
    private DiscountStrategy strategy;
    public Checkout(DiscountStrategy strategy) {
        this.strategy=strategy;
    }
    public double calculateFinalPrice(double price) {
        return strategy.applyDiscount(price);
    }
}