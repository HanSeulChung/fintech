package com.zerobase.api.loan.review

import com.zerobase.domain.persist.entity.LoanReview

interface LoanReviewService {
    fun loanReviewMain(userKey : String) : LoanReviewDto.LoanReviewResponseDto

    fun getLoanResult(userKey : String) : LoanReview?
}