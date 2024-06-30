package cc.dello.crm.Entity.volvo;

import cc.dello.crm.Enum.PaymentApprovalStatusEnum;
import cc.dello.crm.Enum.PaymentCmsStatusEnum;
import cc.dello.crm.Enum.PaymentStatusEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "payment")
public class Payment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "contract_type")
  private String contractType;

  @Column(name = "property_id")
  private Long propertyId;

  @Column(name = "is_new")
  private Integer isNew;

  @Column(name = "created_at")
  private LocalDateTime createdAt;

  @Column(name = "updated_at")
  private LocalDateTime updatedAt;

  @Column(name = "confirmed_at")
  private LocalDateTime confirmedAt;

  @Column(name = "status")
  private PaymentStatusEnum status;

  @Column(name = "is_electronic_contract")
  private Boolean isElectronicContract;

  @Column(name = "electronic_contract_url")
  private String electronicContractUrl;

  @Column(name = "electronic_contract")
  private String electronicContract;

  @Column(name = "signature_file")
  private String signatureFile;

  @Column(name = "business_id")
  private Long businessId;

  @Column(name = "user_id")
  private Long userId;

  @Column(name = "request_user_id")
  private Long requestUserId;

  @Column(name = "approval_user_id")
  private Long approvalUserId;

  @Column(name = "approval_status")
  private PaymentApprovalStatusEnum approvalStatus;

  @Column(name = "approval_at")
  private LocalDateTime approvalAt;

  @Column(name = "last_activity_id")
  private Long lastActivityId;

  @Column(name = "product_id")
  private Long productId;

  @Column(name = "name")
  private String name;

  @Column(name = "alias")
  private String alias;

  @Column(name = "product_name")
  private String productName;

  @Column(name = "product_description")
  private String productDescription;

  @Column(name = "price_cal_method")
  private String priceCalMethod;

  @Column(name = "basic_payment_price")
  private Integer basicPaymentPrice;

  @Column(name = "service_payment_price")
  private Integer servicePaymentPrice;

  @Column(name = "support_payment_price")
  private Integer supportPaymentPrice;

  @Column(name = "discount_payment_price")
  private Integer discountPaymentPrice;

  @Column(name = "total_price")
  private Integer totalPrice;

  @Column(name = "turn_price")
  private Integer turnPrice;

  @Column(name = "turn_count")
  private Integer turnCount;

  @Column(name = "turn_persons")
  private Integer turnPersons;

  @Column(name = "total_persons")
  private Integer totalPersons;

  @Column(name = "payment_type")
  private String paymentType;

  @Column(name = "tax_email")
  private String taxEmail;

  @Column(name = "tax_manager")
  private String taxManager;

  @Column(name = "cms_id")
  private Long cmsId;

  @Column(name = "payment_cms_no")
  private Long paymentCmsNo;

  @Column(name = "payment_cms_status")
  private PaymentCmsStatusEnum paymentCmsStatus;

  @Column(name = "payment_description")
  private String paymentDescription;

  @Column(name = "payment_deposit_name")
  private String paymentDepositName;

  @Column(name = "payment_deposit_date")
  private Date paymentDepositDate;

  @Column(name = "payment_day")
  private Integer paymentDay;

  @Column(name = "payment_count")
  private Integer paymentCount;

  @Column(name = "payment_price")
  private Integer paymentPrice;

  @Column(name = "team")
  private String team;

  @Column(name = "anti_forgery_id")
  private String antiForgeryId;

  @Column(name = "visit_date_time")
  private LocalDateTime visitDateTime;

  @Column(name = "expiry_period")
  private Integer expiryPeriod;

  @Column(name = "expiry_start")
  private Date expiryStart;

  @Column(name = "expiry_end")
  private Date expiryEnd;

  @Column(name = "is_marketing_agree")
  private Boolean isMarketingAgree;

  @Column(name = "auth_tel")
  private String authTel;

  @Column(name = "is_manual")
  private Boolean isManual;

  @ManyToOne
  private Business business;

  @ManyToOne
  private User user;

  @ManyToOne
  @JoinColumn(name = "request_user_id")
  private User requestUser;

  @ManyToOne
  @JoinColumn(name = "approval_user_id")
  private User approvalUser;

  @ManyToOne
  private Product product;

  @ManyToOne
  private PaymentCms paymentCms;

  @ManyToOne
  private Property property;

}
