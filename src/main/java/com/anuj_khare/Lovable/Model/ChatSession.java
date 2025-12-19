package com.anuj_khare.Lovable.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
public class ChatSession {
    private UserProjectId userProjectId;
    private User user;
    private Project project;
    private String title;
    private Instant createdAt;
    private Instant updatedAt;
    private Instant deletedAt;
}
