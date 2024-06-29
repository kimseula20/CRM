package cc.dello.crm.Entity.volvo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
@Table(name = "payment_product")
public class PaymentProduct {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "created_at")
  private LocalDateTime createdAt;

  @Column(name = "updated_at")
  private LocalDateTime updatedAt;

  @Column(name = "confirmed_at")
  private LocalDateTime confirmedAt;

  @Column(name = "payment_id")
  private Long paymentId;

  @Column(name = "unit_id")
  private Long unitId;

  @Column(name = "property")
  private String property;

  @Column(name = "price")
  private Long price;

  @Column(name = "person_price")
  private Long personPrice;

  @Column(name = "person_service_price")
  private Long personServicePrice;

  @Column(name = "person_discount_price")
  private Long personDiscountPrice;

  @Column(name = "person_support_price")
  private Long personSupportPrice;

  @Column(name = "num_person")
  private Long numPerson;

  @Column(name = "memo")
  private String memo;

  @Column(name = "status")
  private String status;

  @Column(name = "crema_product_url")
  private String cremaProductUrl;

  @Column(name = "crema_product_id")
  private Long cremaProudctId;

  @Column(name = "crema_brand_id")
  private Long cremaBrandId;

  @OneToOne
  private Payment payment;

}
