package cc.dello.crm.Entity.volvo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "company")
public class Company {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "biz_number", unique = true, nullable = false)
  private String BizNumber;

  @Column(name = "name", nullable = false)
  private String Name;

  @Column(name = "owner_name")
  private String OwnerName;

  @Column(name = "address")
  private String Address;

  @Column(name = "address2")
  private String Address2;

  @Column(name = "biz_condition")
  private String BizCondition;

  @Column(name = "biz_category")
  private String BizCategory;

  @Column(name = "created_at")
  private LocalDateTime CreatedAt;

  @Column(name = "updated_at")
  private LocalDateTime UpdatedAt;

}
