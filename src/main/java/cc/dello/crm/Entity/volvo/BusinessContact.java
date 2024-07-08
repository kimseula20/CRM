package cc.dello.crm.Entity.volvo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
  @Column(name = "business_id", unique = true, nullable = false)
  private Long businessId;

  @Id
  @Column(name = "contact_id", unique = true, nullable = false)
  private Long contactId;

  @Column(name = "is_default", nullable = false, columnDefinition = "DEFAULT 'N'")
  private String isDefault;

  @Column(name = "created_at")
  private LocalDateTime createdAt;

  @ManyToOne
  @JoinColumn(name = "business_id")
  private Business business;

  @ManyToOne
  @JoinColumn(name = "contact_id")
  private Contact contact;

}
