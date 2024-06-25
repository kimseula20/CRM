package cc.dello.crm.Dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
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
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public class UserDTO {

  private Long id;
  private LocalDateTime createdAt;
  private LocalDateTime updateAt;
  private Long roleId;
  private String name;
  private String email;
  private String tel;
  private Long teamId;


}
