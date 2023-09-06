package com.zerobase.api

import com.zerobase.domain.persist.entity.UserInfo
import com.zerobase.domain.persist.repoisitory.UserInfoRepository
import org.springframework.stereotype.Service

@Service
class TestService (private val userInfoRepository : UserInfoRepository
){
    fun testGetService(userKey : String) = userInfoRepository.findByUserKey(userKey).toDto()

    fun UserInfo.toDto() = TestDto.UserInfoDto(
            userKey, userRegistrationNumber, userName, userIncomeAmount
    )
}