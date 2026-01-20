package com.dev.practice.designpatterns;


interface Notification {
     void notifyUser();
}
class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Email...");
    }
}
class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("SMS Notification");
    }
}
class MessageFactory {
    public Notification createNotification(String type) {
        if(type.equals("email")) {
            return new EmailNotification();
        } else if(type.equals("sms")){
            return new SMSNotification();
        }
        return null;
    }
}
public class FactoryEx {
    public static void main(String[] args) {
        MessageFactory messageFactory=new MessageFactory();
        Notification email=messageFactory.createNotification("email");
        email.notifyUser();
        Notification sms=messageFactory.createNotification("sms");
        sms.notifyUser();

    }
}
