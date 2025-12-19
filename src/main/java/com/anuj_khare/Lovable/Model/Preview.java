package com.anuj_khare.Lovable.Model;

import com.anuj_khare.Lovable.enums.PreviewStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.time.Instant;

@Entity
@Data
@NoArgsConstructor
public class Preview {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger id;
    @NotNull
    private Project project;
    private String namespace;
    private String podName;
    private String previewURL;
    private PreviewStatus status;
    private Instant startedAt;
    private Instant terminatedAt;
    private Instant createdAt;

}
