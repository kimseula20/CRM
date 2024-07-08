package cc.dello.crm.Entity.volvo;

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
@Table(name = "kakao_log")
public class KakaoLog {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "payment_id", nullable = false)
  private Long paymentId;

  @Column(name = "from_user_id", nullable = false)
  private Long fromUserId;

  @Column(name = "to_contact_id")
  private Long toContacId;

  @Column(name = "phone", nullable = false)
  private String phone;

  @Column(name = "template_code", nullable = false)
  private String templateCode;

  @Column(name = "content", nullable = false)
  private String content;

  @Column(name = "attachment")
  private String attachment;

  @Column(name = "created_at", nullable = false)
  private LocalDateTime createdAt;

}
