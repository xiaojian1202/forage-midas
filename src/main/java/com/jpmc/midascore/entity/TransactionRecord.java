package com.jpmc.midascore.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "transactions")
public class TransactionRecord {

    @Id
    @GeneratedValue()
    private Long id;

    @ManyToOne
    @JoinColumn(nullable = false)
    UserRecord sender;

    @ManyToOne
    @JoinColumn(nullable = false)
    UserRecord recipient;

    public UserRecord getRecipient() {
        return recipient;
    }

    public void setRecipient(UserRecord recipient) {
        this.recipient = recipient;
    }

    public UserRecord getSender() {
        return sender;
    }

    public void setSender(UserRecord sender) {
        this.sender = sender;
    }


}
