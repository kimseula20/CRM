package cc.dello.crm.dto;

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
  private String Name;
  private String Email;

}
