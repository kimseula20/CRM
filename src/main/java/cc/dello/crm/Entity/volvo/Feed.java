package cc.dello.crm.Entity.volvo;

import cc.dello.crm.Enum.FeedRefSourceEnum;
import cc.dello.crm.Enum.FeedTypeEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
  private Long userId;

  @Column(name = "task_id")
  private Long taskId;

  @Column(name = "activity_id")
  private Long activityId;

  @Column(name = "ref_source")
  @Enumerated(EnumType.STRING)
  private FeedRefSourceEnum refSource;

  @Column(name = "ref_key")
  private Long refKey;

  @Column(name = "type")
  @Enumerated(EnumType.STRING)
  FeedTypeEnum type;

  @Column(name = "contents")
  String contents;

  @Column(name = "files")
  String files;

  @Column(name = "pin")
  Integer pin;

  @Column(name = "created_at")
  LocalDateTime createdAt;

  @Column(name = "updated_at")
  LocalDateTime updatedAt;

  @Column(name = "ref_sub_key")
  String refSubKey;

  @ManyToOne(fetch = FetchType.LAZY)
  private User user;

  @ManyToOne(fetch = FetchType.LAZY)
  private Task task;

  @ManyToOne(fetch = FetchType.LAZY)
  private Activity activity;

}
