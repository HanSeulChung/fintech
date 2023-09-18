package com.zerobase.domain.persist.repoisitory

import com.zerobase.domain.persist.entity.UserInfo
import org.springframework.data.jpa.repository.JpaRepository

interface UserInfoRepository : JpaRepository<UserInfo, Long>{
    fun findByUserKey(userKey : String): UserInfo
}