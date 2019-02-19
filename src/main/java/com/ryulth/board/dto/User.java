package com.ryulth.board.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Data
@Builder
@AllArgsConstructor(onConstructor = @__(@JsonIgnore)) // Lombok builder use this
@Table(name = "testUser")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String userId;

    @Column
    private String userPw;

    @Column(length = 50)
    private String userName;

    @Column
    private boolean isAccountNonExpired; // 계정만료
    @Column
    private boolean isAccountNonLocked; //계정 잠김
    @Column
    private boolean isCredentialsNonExpired; //
    @Column
    private boolean isEnabled;
    @Column(name = "createTime", nullable = false, updatable = false)
    private Calendar createTime;

    @PrePersist
// 새로운 것이 추가되었다. !!!
    void setUp() {

        this.createTime = Calendar.getInstance();
    }

    private User() {
    }
}
