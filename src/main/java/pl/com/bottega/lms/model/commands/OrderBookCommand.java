package pl.com.bottega.lms.model.commands;


import pl.com.bottega.lms.model.User;

import java.time.LocalDateTime;

public class OrderBookCommand {

    private String number;
    private User user;
    private LocalDateTime orderDate;

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}