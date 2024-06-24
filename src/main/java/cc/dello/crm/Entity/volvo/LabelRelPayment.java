package cc.dello.crm.Entity.volvo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "label_rel_payment")
public class LabelRelPayment {

  @Id
  @Column(name = "label_id")
  private Long labelId;

  @Column(name = "payment_id")
  private Long paymentId;

  @ManyToOne
  private Label label;


  // TODO: payment relationship
//  @ManyToOne
//  private Payment payment;

}
