package com.anuj_khare.Lovable.Model;

import com.anuj_khare.Lovable.enums.ProjectRole;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Entity
@Data
@NoArgsConstructor
public class ProjectMember {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private ProjectMemberId projectMemberId;

    private Project project;
    private User user;
    private ProjectRole projectRole;

    private User acceptedAt;
    private Instant invitedAt;
}
