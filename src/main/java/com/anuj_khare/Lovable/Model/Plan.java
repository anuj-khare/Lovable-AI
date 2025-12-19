package com.anuj_khare.Lovable.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.jackson.autoconfigure.JacksonProperties;
import java.math.BigInteger;


@Entity
@Data
@NoArgsConstructor
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger id;
    private String name;
    private String stripePriceId;
    private Integer maxProjects;
    private Integer maxTokensPerDay;
    private Integer maxPreviews;
    private Boolean unlimitedAi;
    private JacksonProperties.Json features;
    private Boolean isActive;
}
