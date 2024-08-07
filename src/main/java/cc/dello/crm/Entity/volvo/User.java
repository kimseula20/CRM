package cc.dello.crm.Entity.volvo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "user")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long Id;

  @Column(name = "created_at")
  private LocalDateTime CreatedAt;

  @Column(name = "updated_at")
  private LocalDateTime UpdatedAt;

  @Column(name = "role_id")
  private Long RoleId;

  @Column(name = "name")
  private String Name;

  @Column(name = "email")
  private String Email;

  @Column(name = "password")
  private String Password;

  @Column(name = "tel")
  private String tel;

  @Column(name = "remember_token")
  private String RememberToken;

  @Column(name = "team_id")
  private Long TeamId;

  @ManyToOne
  @JoinColumn(name = "team_id")
  private Team team;

}
