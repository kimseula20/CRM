package cc.dello.crm.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/activity-comment")
@RestController
@RequiredArgsConstructor
public class ActivityCommentController {

  /**
   * @Get("/{activityId})
   *
   * @SWG\Get(
   *      tags={"영업활동 댓글"},
   *      path="/api/activity-comment/{activityId}",
   *      summary="영업활동 댓글 목록",
   *      @SWG\Parameter(name="activityId", in="path", type="integer", required=true, description="영업활동 ID"),
   *      @SWG\Response(
   *        response=200,
   *        description="영업활동 댓글 목록",
   *        @SWG\Schema(
   *           @SWG\Property(property="data", type="array", @SWG\Items(ref="#/definitions/ActivityComment")),
   *           @SWG\Property(property="status", type="integer"),
   *           @SWG\Property(property="statusText", type="string")
   *       )
   *   )
   *)
   */
  public void getActivityComment() {

  }

}
