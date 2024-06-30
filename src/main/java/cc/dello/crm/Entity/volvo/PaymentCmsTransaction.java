package cc.dello.crm.Entity.volvo;

import cc.dello.crm.Enum.PaymentCmsTypeEnum;
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
@Table(name = "payment_cms_transaction")
public class PaymentCmsTransaction {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "payment_cms_deposit_id")
  private Long paymentCmsDepositId;

  @Column(name = "payment_type")
  private PaymentCmsTypeEnum paymentType;

  @Column(name = "transaction_id")
  private Long transactionId;

  @Column(name = "member_id")
  private Integer memberId;

  @Column(name = "member_name")
  private String memberName;

  @Column(name = "payment_date")
  private LocalDateTime paymentDate;

  @Column(name = "actual_amount")
  private Integer actualAmount;

  @Column(name = "result_flag")
  private String resultFlag;

  @Column(name = "result_code")
  private String resultCode;

  @Column(name = "result_message")
  private String resultMessage;

  @Column(name = "links")
  private String links;

  @Column(name = "log")
  private String log;
}
