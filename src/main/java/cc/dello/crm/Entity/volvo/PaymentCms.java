package cc.dello.crm.Entity.volvo;

import cc.dello.crm.Enum.PaymentCmsStatusEnum;
import cc.dello.crm.Enum.PaymentCmsTypeEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "payment_cms")
public class PaymentCms {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "cms_no")
  private Integer cmsNo;

  @Column(name = "auth_name")
  private String authName;

  @Column(name = "auth_number")
  private String authNumber;

  @Column(name = "auth_phone")
  private String authPhone;

  @Column(name = "payment_type")
  private PaymentCmsTypeEnum paymentType;

  @Column(name = "account_bank")
  private String accountBank;

  @Column(name = "account_number")
  private String accountNumber;

  @Column(name = "card_number")
  private String cardNumber;

  @Column(name = "card_yy")
  private String cardYy;

  @Column(name = "card_mm")
  private String cardMm;

  @Column(name = "status")
  private PaymentCmsStatusEnum status;

}
