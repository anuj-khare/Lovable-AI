package com.anuj_khare.Lovable.Model;

import com.anuj_khare.Lovable.enums.MessageRole;
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
public class ChatMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private ChatSession chatSession;
    private Project project;
    private User user;
    private String content;
    private Json toolCalls;
    private String toolCallId;
    private Integer tokensUsed;
    private Instant createdAt;
    private MessageRole role;
}
