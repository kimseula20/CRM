package cc.dello.crm.dto;

import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Please explain the class!!
 *
 * @author : kimseula
 * @fileName : UserDTO
 * @since : 2024/06/20
 */
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserDTO {

  private Long Id;
  private LocalDateTime CreatedAt;
  private LocalDateTime UpdatedAt;
  private Long RoleId;
  private String Name;
  private String Email;
  private String tel;
  private Long TeamId;

}
