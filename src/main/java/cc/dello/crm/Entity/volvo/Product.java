package cc.dello.crm.Entity.volvo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "product")
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "price_cal_method")
  private String priceCalMethod;

  @Column(name = "name")
  private String name;

  @Column(name = "nick")
  private String nick;

  @Column(name = "property_id")
  private Long propertyId;

  @Column(name = "total_price")
  private Integer totalPrice;

  @Column(name = "turn_price")
  private Integer turnPrice;

  @Column(name = "turn_count")
  private Integer turnCount;

  @Column(name = "turn_persons")
  private Integer turnPersons;

  @Column(name = "team_id")
  private Long teamId;

  @ManyToOne
  private Property property;

}
