package cc.dello.crm.Entity;

import cc.dello.crm.Enum.FeedRefSourceEnum;
import cc.dello.crm.Enum.FeedTypeEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Table(name = "feed")
public class Feed {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "user_id")
  private Long UserId;

  @Column(name = "task_id")
  private Long TaskId;

  @Column(name = "activity_id")
  private Long ActivityId;

  @Column(name = "ref_source")
  @Enumerated(EnumType.STRING)
  private FeedRefSourceEnum RefSource;

  @Column(name = "ref_key")
  private Long RefKey;

  @Column(name = "type")
  @Enumerated(EnumType.STRING)
  FeedTypeEnum Type;

  @Column(name = "contents")
  String Contents;

  @Column(name = "files")
  String Files;

  @Column(name = "pin")
  Integer Pin;

  @Column(name = "created_at")
  LocalDateTime CreatedAt;

  @Column(name = "updated_at")
  LocalDateTime UpdatedAt;

  @Column(name = "ref_sub_key")
  String RefSubKey;

}
