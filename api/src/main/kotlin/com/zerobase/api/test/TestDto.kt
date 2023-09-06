package com.zerobase.api

class TestDto {
    data class UserInfoDto(
            val userKey : String,
            val userRegistrationNumber : String,
            val userName : String,
            val userIncomeAmount : Long
    )

}