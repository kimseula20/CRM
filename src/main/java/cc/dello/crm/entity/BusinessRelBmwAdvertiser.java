package cc.dello.crm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
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
  @OneToOne(fetch = FetchType.EAGER)
  @Column(name = "business_id")
  private Business business;

  @Column(name = "bmw_advertiser_id")
  private Long BmwAdvertiserId;

  @Column(name = "adcenter_is_show")
  private Integer AdcenterIsShow;

}
