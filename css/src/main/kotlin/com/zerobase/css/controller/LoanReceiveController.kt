package com.zerobase.css.controller

@RestController
@RequsetMapping("/css/api/v1")
class LoanReviewController {

    @PostMapping("/request")
    fun loanReceive(@ReauestBody)
}