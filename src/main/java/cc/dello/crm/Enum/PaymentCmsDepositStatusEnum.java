package cc.dello.crm.Enum;

/**
 * 출금상태
 * none : 미등록
 * wait : 출금대기
 * success_paid : 출금성공
 * fail_paid : 출금실패
 * success_confirm : 승인성공
 * fail_confirm : 승인실패
 * cancel_confirm : 승인취소
 * wait_again : 재출금대기
 * success_again : 재출금성공
 * fail_again : 재출금실패
 * stop : 출금중지
 * error : 오류
 */
public enum PaymentCmsDepositStatusEnum {
  none, wait, success_paid, fail_paid, success_confirm, fail_confirm, cancel_confirm, wait_again, success_again, fail_again, stop, error
}
