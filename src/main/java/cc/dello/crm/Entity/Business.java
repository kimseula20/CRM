package cc.dello.crm.Entity;

import cc.dello.crm.Enum.BusinessStatusEnum;
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
@Table(name = "business")
public class Business {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "created_at")
  private LocalDateTime CreatedAt;

  @Column(name = "updated_at")
  private LocalDateTime UpdatedAt;

  @Column(name = "customer_at")
  private LocalDateTime CustomerAt;

  @Column(name = "user_id")
  private Long UserId;

  @Column(name = "created_user_id")
  private Long CreatedUserId;

  @Column(name = "cm_id")
  private Long CmId;

  @Column(name = "last_activity_id")
  private Long LastActivityId;

  @Column(name = "company_id")
  private Long CompanyId;

  @Column(name = "name")
  private String Name;

  @Column(name = "owner_name")
  private String OwnerName;

  @Column(name = "biz_number")
  private String BizNumber;

  @Column(name = "biz_division")
  private String BizDivision;

  @Column(name = "biz_type")
  private String BizType;

  @Column(name = "biz_condition")
  private String BizCondition;

  @Column(name = "biz_category")
  private String BizCategory;

  @Column(name = "location")
  private String Location;

  @Column(name = "location_sub")
  private String LocationSub;

  @Column(name = "address")
  private String Address;

  @Column(name = "address2")
  private String Address2;

  @Column(name = "homepage")
  private String Homepage;

  @Column(name = "bizcenter_id")
  private Long BizcenterId;

  @Column(name = "lead_type")
  private String LeadType;

  @Column(name = "lead_source")
  private String LeadSource;

  @Column(name = "inbound_channel")
  private String InboundChannel;

  @Column(name = "interest_product")
  private String InterestProduct;

  @Column(name = "team")
  private String Team;

  @Column(name = "status")
  @Enumerated(EnumType.STRING)
  private BusinessStatusEnum Status;

  @Column(name = "memo")
  private String Memo;

  @Column(name = "relation_brand")
  private String RelationBrand;

  @Column(name = "receive_ad")
  private Integer ReceiveAd;

  @Column(name = "receive_ad_date")
  private LocalDateTime ReceiveAdDate;

  @Column(name = "utm_source")
  private String UtmSource;

  @Column(name = "utm_medium")
  private String UtmMedium;

  @Column(name = "utm_campaign")
  private String UtmCampaign;

  @Column(name = "utm_date")
  private LocalDateTime UtmDate;

  @Column(name = "lgu_code")
  private String LguCode;


}
