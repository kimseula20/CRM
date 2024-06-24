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

  @Column(name = "payment_id")
  private Long paymentId;

  @Column(name = "from_user_id")
  private Long fromUserId;

  @Column(name = "to_contact_id")
  private Long toContacId;

  @Column(name = "phone")
  private String phone;

  @Column(name = "template_code")
  private String templateCode;

  @Column(name = "content")
  private String content;

  @Column(name = "attachment")
  private String attachment;

  @Column(name = "created_at")
  private LocalDateTime createdAt;

}
