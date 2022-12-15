package com.mapreduce.mapreducejava.combine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class OrderNotifierTests {
    private OrderNotifier orderNotifier;
    private EmailSender emailSender;

    @BeforeEach
    void setup() {
        emailSender = mock(EmailSender.class);
        orderNotifier = new OrderNotifier(emailSender);
    }

    @Test
    @Disabled
    void emailOrderShippedNotificationsOnlyToCustomersWhoseOrdersHaveShipped() {
        var alice = new Customer("Alice", "alice@email.com", true);
        var bob = new Customer("Bob", "bob@email.com", false);
        var carlos = new Customer("Carlos", "carlos@email.com", true);
        var david = new Customer("David", "david@email.com", true);
        var eliza = new Customer("Eliza", "eliza@email.com", false);

        var customers = asList(alice, bob, carlos, david, eliza);

        orderNotifier.notifyOrderShipped(customers);

        verify(emailSender).sendEmail(new Email("alice@email.com", "Hi Alice, your order has been shipped!"));
        verify(emailSender).sendEmail(new Email("carlos@email.com", "Hi Carlos, your order has been shipped!"));
        verify(emailSender).sendEmail(new Email("david@email.com", "Hi David, your order has been shipped!"));
    }
}
