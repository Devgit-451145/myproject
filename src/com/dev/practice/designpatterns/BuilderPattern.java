package com.dev.practice.designpatterns;

//builder pattern helps to construct complex objects step by step
//it is used when an object require many optional fields or has a long list of parameters
//where it is used
// 1) to create immutable objects
 //2) when there are multiple optional parameters
// when you want cleaner and more readable object construction
//Example:
//imagine you have a user class with 10 fields,some optional and some mandatory
//instead of writing many constructors you can use the builder pattern
public class BuilderPattern {
    public static void main(String[] args) {
        User user=new User.Builder("DEV","EMAIL").age(22).city("cmh").build();
        System.out.println(user);
    }
}
 class User {
    private final String userName;
    private final String email;
    private final int age;
    private final String city;
    public User(Builder builder) {
        this.userName = builder.userName;
        this.email = builder.email;
        this.age = builder.age;
        this.city = builder.city;
    }
    public static class Builder {
        private final String userName;
        private final String email;
        private  int age;
        private  String city;

        public Builder(String userName,String email) {
            this.userName=userName;
            this.email=email;
        }
        public Builder age(int age) {
            this.age=age;
            return this;
        }
        public Builder city(String city)
        {
            this.city=city;
            return this;
        }
        public User build() {
            return new User(this);
        }
    }


}
