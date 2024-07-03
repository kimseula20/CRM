package cc.dello.crm.Entity.volvo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString
@Builder
@Entity
@Table(name = "activity")
public class Activity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "user_id", nullable = false)
  private Long userId;

  @Column(name = "ref_source", nullable = false, length = 45)
  private String refSource;

  @Column(name = "ref_key", nullable = false)
  private Long refKey;

  @Column(name = "tag", nullable = false, length = 45)
  private String tag;

  @Column(name = "contents", nullable = false)
  private String contents;

  @Column(name = "files", nullable = false)
  private String files;

  @Column(name = "ref_sub_key", nullable = false)
  private Long refSubKey;

  @Column(name = "created_at")
  private LocalDateTime createdAt;

  @Column(name = "updated_at")
  private LocalDateTime updatedAt;

  @ManyToOne
  private User user;

  @Builder
  public Activity(Long id, Long userId, String refSource, Long refKey, String tag, String contents,
      String files, Long refSubKey, LocalDateTime createdAt, LocalDateTime updatedAt) {
    this.id = id;
    this.userId = userId;
    this.refSource = refSource;
    this.refKey = refKey;
    this.tag = tag;
    this.contents = contents;
    this.files = files;
    this.refSubKey = refSubKey;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }
}
