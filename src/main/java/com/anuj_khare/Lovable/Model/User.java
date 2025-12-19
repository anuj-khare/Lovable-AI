package com.anuj_khare.Lovable.Model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigInteger;
import java.time.Instant;
import java.util.Set;


@Data
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
    @NotNull
    @Column(unique = true)
    private String email;
    private String passwordHash;
    private String name;
    private String avatarUrl;
    private Instant createdAt;
    private Instant updatedAt;
    private Instant deletedAt;//soft delete
    @OneToMany(mappedBy = "id",cascade = CascadeType.ALL)
    private Set<Subscription> subscriptionList;

}
