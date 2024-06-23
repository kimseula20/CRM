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
@Table(name = "activity_comment")
public class ActivityComment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "user_id")
  private Long UserId;

  @Column(name = "activity_id")
  private Long ActivityId;

  @Column(name = "comment")
  private String Comment;

  @Column(name = "created_at")
  private LocalDateTime CreatedAt;

  @Column(name = "updated_at")
  private LocalDateTime UpdatedAt;

}
