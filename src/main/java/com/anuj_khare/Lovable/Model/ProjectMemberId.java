package com.anuj_khare.Lovable.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProjectMemberId {
    private Long projectId;
    private Long userId;
}
