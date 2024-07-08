package cc.dello.crm.Entity.volvo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "business_rel_bmw_advertiser")
public class BusinessRelBmwAdvertiser {

  @Id
  @Column(name = "business_id", nullable = false)
  private Long businessId;

  @Id
  @Column(name = "bmw_advertiser_id", nullable = false)
  private Long bmwAdvertiserId;

  @Column(name = "adcenter_is_show", nullable = false, columnDefinition = "DEFAULT 0")
  private Integer adcenterIsShow;

  @ManyToOne
  @JoinColumn(name = "business_id")
  private Business business;

}
