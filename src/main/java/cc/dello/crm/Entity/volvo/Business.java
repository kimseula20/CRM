package cc.dello.crm.Entity.volvo;

import cc.dello.crm.Enum.BusinessStatusEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
@Table(name = "business")
public class Business {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "created_at")
  private LocalDateTime createdAt;

  @Column(name = "updated_at")
  private LocalDateTime updatedAt;

  @Column(name = "customer_at")
  private LocalDateTime customerAt;

  @Column(name = "user_id")
  private Long userId;

  @Column(name = "created_user_id")
  private Long createdUserId;

  @Column(name = "cm_id")
  private Long cmId;

  @Column(name = "last_activity_id")
  private Long lastActivityId;

  @Column(name = "company_id")
  private Long companyId;

  @Column(name = "name")
  private String name;

  @Column(name = "owner_name")
  private String ownerName;

  @Column(name = "biz_number")
  private String bizNumber;

  @Column(name = "biz_division")
  private String bizDivision;

  @Column(name = "biz_type")
  private String bizType;

  @Column(name = "biz_condition")
  private String bizCondition;

  @Column(name = "biz_category")
  private String bizCategory;

  @Column(name = "location")
  private String location;

  @Column(name = "location_sub")
  private String locationSub;

  @Column(name = "address")
  private String address;

  @Column(name = "address2")
  private String address2;

  @Column(name = "homepage")
  private String homepage;

  @Column(name = "bizcenter_id")
  private Long bizcenterId;

  @Column(name = "lead_type")
  private String leadType;

  @Column(name = "lead_source")
  private String leadSource;

  @Column(name = "inbound_channel")
  private String inboundChannel;

  @Column(name = "interest_product")
  private String interestProduct;

  @Column(name = "team")
  private String team;

  @Column(name = "status", nullable = false, columnDefinition = "DEFAULT 'lead'")
  @Enumerated(EnumType.STRING)
  private BusinessStatusEnum status;

  @Column(name = "memo")
  private String memo;

  @Column(name = "relation_brand")
  private String relationBrand;

  @Column(name = "receive_ad", nullable = false, columnDefinition = "DEFAULT 0")
  private Integer receiveAd;

  @Column(name = "receive_ad_date")
  private LocalDateTime receiveAdDate;

  @Column(name = "utm_source")
  private String utmSource;

  @Column(name = "utm_medium")
  private String utmMedium;

  @Column(name = "utm_campaign")
  private String utmCampaign;

  @Column(name = "utm_date")
  private LocalDateTime utmDate;

  @Column(name = "lgu_code")
  private String lguCode;

  @OneToOne
  private User user;

  @OneToOne
  @JoinColumn(name = "created_user_id")
  private User createdUser;

  @OneToOne
  @JoinColumn(name = "cm_id")
  private User cmUser;

  @OneToOne
  private Company company;

}
