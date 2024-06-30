package cc.dello.crm.Entity.volvo;

import cc.dello.crm.Enum.PaymentCmsDepositStatusEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "payment_cms_deposit")
public class PaymentCmsDeposit {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "cms_no")
  private Integer cmsNo;

  @Column(name = "payment_id")
  private Long paymentId;

  @Column(name = "sequence")
  private Integer sequence;

  @Column(name = "year")
  private String year;

  @Column(name = "month")
  private String month;

  @Column(name = "day")
  private String day;

  @Column(name = "price")
  private Integer price;

  @Column(name = "status")
  private PaymentCmsDepositStatusEnum status;

  @Column(name = "again_date")
  private Date againDate;

  @ManyToOne
  private Payment payment;

}
