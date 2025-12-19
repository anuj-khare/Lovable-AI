package com.anuj_khare.Lovable.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Entity
@Data
@NoArgsConstructor
public class ProjectFile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Project project;
    @NotNull
    private String path;
    private String minioObjectKey;
    @ManyToOne
    @JoinColumn(name = "id")
    private User createdByuser;
    private User lastUpdatedByUser;
    private Instant createdAt;
    private Instant updatedAt;
}
