package cc.dello.crm.entity;

import cc.dello.crm.entity.Enum.DepositStatusEnum;
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
@Table(name = "deposit")
public class Deposit {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "name")
  private String Name;

  @Column(name = "price")
  private Long Price;

  @Column(name = "paid_price")
  private Long PaidPrice;

  @Column(name = "biz_number")
  private String BizNumber;

  @Column(name = "input_at")
  private LocalDateTime InputAt;

  @Column(name = "status")
  @Enumerated(EnumType.STRING)
  private DepositStatusEnum Status;

  @Column(name = "created_at")
  private LocalDateTime CreatedAt;

  @Column(name = "deleted_at")
  private LocalDateTime DeletedAt;

  @Column(name = "deleted_user_id")
  private Long DeletedUserId;

}
