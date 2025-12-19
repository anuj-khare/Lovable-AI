package com.anuj_khare.Lovable.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.time.Instant;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger id;
    private String name;
    private Boolean isPublic;
    private Instant createdAt;
    private Instant updatedAt;
    private Instant deletedAt;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "id")
    private Set<ProjectFile> projectFileSet;

}
