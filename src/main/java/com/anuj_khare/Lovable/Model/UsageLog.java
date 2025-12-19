package com.anuj_khare.Lovable.Model;

import com.anuj_khare.Lovable.enums.ActionEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.jackson.autoconfigure.JacksonProperties.Json;

import java.time.Instant;

@Entity
@Data
@NoArgsConstructor
public class UsageLog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private User user;
    private Project project;
    private ActionEnum action;
    private Integer tokensUsed;
    private Integer durationInMicroseconds;
    private Json metadata;//JSON of {model_used,prompt_used etc}
    private Instant createdAt;
}
