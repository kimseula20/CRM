package cc.dello.crm.Service;

import cc.dello.crm.Entity.volvo.Activity;
import cc.dello.crm.Repository.ActivityRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ActivityService {

  private final ActivityRepository activityRepository;

  public List<Activity> findAllActivity() {
    List<Activity> activities = activityRepository.findAll();

    return activities;
    //List<ActivityDto> activityDtoList = activityRepository.findAll();
    //return activityDtoList.stream().map(Activity.INSTANCE::).collect(Collectors.toList());
  }

}
