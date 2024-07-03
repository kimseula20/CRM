package cc.dello.crm.Service;

import cc.dello.crm.Entity.volvo.Activity;
import cc.dello.crm.Repository.JpaActivityRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional
public class ActivityService {

  private final JpaActivityRepository jpaActivityRepository;

  public List<Activity> findAllActivity() {
    List<Activity> activities = jpaActivityRepository.findAll();

    return activities;
    //List<ActivityDto> activityDtoList = activityRepository.findAll();
    //return activityDtoList.stream().map(Activity.INSTANCE::).collect(Collectors.toList());
  }

}
