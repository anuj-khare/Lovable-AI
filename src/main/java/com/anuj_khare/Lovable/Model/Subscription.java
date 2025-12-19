package com.anuj_khare.Lovable.Model;

import com.anuj_khare.Lovable.enums.SubscriptionStatusEnum;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Entity
@Data
@NoArgsConstructor
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    private User user;
    @OneToOne
    private Plan plan;
    private SubscriptionStatusEnum subscriptionStatus;
    private String stripeCustomerId;
    private String stripeSubscriptionId;
    private Instant currentPeriodStart;
    private Instant currentPeriodEnd;
    private Boolean cancelAtPeriodEnd;
    private Instant createdAt;
    private Instant updatedAt;
}
