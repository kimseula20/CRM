package cc.dello.crm.Enum;

/**
 * 결재상태값
 * wait : 대기,
 * request : 결재요청,
 * complete : 결재승인,
 * r_cancel : 상신자취소,
 * reject : 반려,
 * a_cancel : 결재자취소)
 */
public enum PaymentApprovalStatusEnum {
  wait, request, complete, r_cancel, reject, a_cancel
}
