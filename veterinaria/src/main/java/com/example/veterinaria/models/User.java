package com.example.veterinaria.models;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "universe", length=50)
    private String universe;

    @Column(name = "password", length=250)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Rolename role;

    @OneToMany(mappedBy = "User", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Characters> characters;

}