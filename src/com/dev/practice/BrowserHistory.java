package com.dev.practice;

import java.util.ArrayList;
import java.util.List;

class BrowserHistory {

    private List<String> history;
    private int currentIndex;
    public BrowserHistory(String homepage) {
        history = new ArrayList<>();
        history.add(homepage);
        currentIndex = 0;
    }
    public void visit(String url) {
        // Remove forward history
        while (history.size() > currentIndex + 1) {
            history.remove(history.size() - 1);
        }
        history.add(url);
        currentIndex++;
    }
    public String move(int steps) {
        currentIndex += steps;
        // Prevent going out of bounds
        if (currentIndex < 0) {
            currentIndex = 0;
        } else if (currentIndex >= history.size()) {
            currentIndex = history.size() - 1;
        }
        return history.get(currentIndex);
    }
    // Optional: get current page
    public String getCurrentPage() {
        return history.get(currentIndex);
    }
    // Example usage
    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory("google.com");
        browser.visit("facebook.com");
        browser.visit("youtube.com");
        System.out.println(browser.move(-1)); // facebook.com
        System.out.println(browser.move(-1)); // google.com
        System.out.println(browser.move(1));  // facebook.com
        System.out.println(browser.move(5));  // youtube.com
    }
}

