package cc.dello.crm.controller;

import cc.dello.crm.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/users")
@RestController
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  @GetMapping("/")
  public void getUserInfo() {

  }

}
