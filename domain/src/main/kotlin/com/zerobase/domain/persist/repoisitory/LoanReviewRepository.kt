package com.zerobase.domain.persist.repoisitory

import com.zerobase.domain.persist.entity.LoanReview
import org.springframework.data.jpa.repository.JpaRepository

interface LoanReviewRepository : JpaRepository<LoanReview, Long>{
    fun findByUserKey(userKey : String) : LoanReview?
}