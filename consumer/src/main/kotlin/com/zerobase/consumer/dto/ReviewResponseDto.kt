package com.zerobase.consumer.dto

import com.zerobase.domain.persist.entity.LoanReview

data class ReviewResponseDto (
    val userKey : String,
    val limitAmount: Long,
    val interest: Double
) {
    fun toLoanReviewEntity(): LoanReview =
        LoanReview(
            userKey = userKey,
            loanInterest = interest,
            loanLimitedAmount = limitAmount
        )
}