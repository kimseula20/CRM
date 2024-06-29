package cc.dello.crm.Entity.volvo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedAttributeNode;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "label_rel_business")
public class LabelRelBusiness {

  @Id
  @Column(name = "label_id")
  private Long labelId;

  @Id
  @Column(name = "business_id")
  private Long businessId;

  @ManyToOne
  private Label label;

  @ManyToOne
  private Business business;



}
