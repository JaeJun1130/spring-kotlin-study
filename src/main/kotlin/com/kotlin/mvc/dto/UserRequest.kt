package com.kotlin.mvc.dto

import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming

/**
 * 코틀린에서는 명시적으로 null을 인자로 넣을 수 없다.
 * data class 는 toString(), hashCode(), equals(), copy() 를 자동으로 만들어준다
 * type에 ?을 붙힘으로 null 가능한 변수임으 명시적으로 표현.
 * 코틀린은 변수를 생성하면 자동으로 get, set 를 내부적으로 생성해준다.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
data class UserRequest (
    var name: String? = null,
    var age: Int? = null,
    var email: String? = null,
    var address: String? = null,

//    @JsonProperty(value = "phone_number")
    var phoneNumber: String? = null
)