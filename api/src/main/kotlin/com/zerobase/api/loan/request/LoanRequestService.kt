package com.zerobase.api.loan.request


interface LoanRequestService {
    fun loanRequestMain(
        loanRequestInputDto: LoanRequestDto.LoanRequestInputDto
    ) : LoanRequestDto.LoanRequestResponseDto
    fun saveUserInfo(
        userInfoDto: UserInfoDto
    )
    fun loanRequestReview(userKey : String)
}