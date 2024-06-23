package cc.dello.crm.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
@Table(name = "business_contact")
public class BusinessContact {

  @Id
  @OneToOne(fetch = FetchType.EAGER)
  @Column(name = "business_id")
  private Business business;

  @Id
  @OneToOne(fetch = FetchType.EAGER)
  @Column(name = "contact_id")
  private Contact contact;

  @Column(name = "is_default")
  private String IsDefault;

  @Column(name = "created_at")
  private LocalDateTime CreatedAt;

}
