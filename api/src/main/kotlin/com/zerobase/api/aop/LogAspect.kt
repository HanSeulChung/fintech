package com.zerobase.api.aop

import mu.KotlinLogging
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Pointcut
import org.springframework.stereotype.Component
import org.springframework.util.StopWatch


/**
 * joinPoint를 가져오는 부분
 * joinPoint에서 무엇을 할건지 ( 여기서는 log를 찍을 것)
 */
@Aspect
@Component
class LogAspect {
    val logger = KotlinLogging.logger {}

    // 특정 시점을 가져오는 것 (다양하다)
    @Pointcut("within(com.zerobase.api..*)")
    private fun isApi() {}

    @Around("isApi()")
    fun loggingAspect(joinPoint : ProceedingJoinPoint) : Any {
        val stopWatch = StopWatch()
        stopWatch.start()

        val result = joinPoint.proceed()

        stopWatch.stop()

        logger.info { "${joinPoint.signature.name} ${joinPoint.args[0]} ${stopWatch.lastTaskTimeMillis}"}

        return result
    }
}