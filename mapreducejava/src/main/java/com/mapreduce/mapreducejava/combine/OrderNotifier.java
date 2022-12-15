package com.mapreduce.mapreducejava.combine;

import java.util.List;

class OrderNotifier {
    private final EmailSender emailSender;

    public OrderNotifier(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    void notifyOrderShipped(List<Customer> customers) {
    }

    private Email buildEmailToCustomer(Customer customer) {
        return new Email(
                customer.email(),
                "Hi " + customer.name() + ", your order has been shipped!"
        );
    }
}
