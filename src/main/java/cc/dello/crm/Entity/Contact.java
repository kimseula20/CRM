package cc.dello.crm.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "contact")
public class Contact {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "name")
  private String Name;

  @Column(name = "Tel")
  private String Tel;

  @Column(name = "email")
  private String Email;

  @Column(name = "created_at")
  private LocalDateTime CreatedAt;

  @Column(name = "updated_at")
  private LocalDateTime UpdatedAt;

}
