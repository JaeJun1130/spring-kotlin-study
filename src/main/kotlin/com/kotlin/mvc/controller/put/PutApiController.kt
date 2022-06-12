package com.kotlin.mvc.controller.put

import com.kotlin.mvc.dto.Result
import com.kotlin.mvc.dto.UserRequest
import com.kotlin.mvc.dto.UserResponse
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api")
class PutApiController {

    @PutMapping
    fun putMapping(): String {
        return "put-mapping"
    }

    @RequestMapping(value = ["/post-mapping"], method = [RequestMethod.PUT])
    fun requestMapping(): String {
        return "put-request-mapping"
    }

    /**
     * 범위 지정 함수(Scope function)
     * apply : 객체 자기자신을 반환
     */
    @PutMapping("/put-mapping/object")
    fun putMappingObject(@RequestBody userRequest: UserRequest): UserResponse {
        val apply: UserResponse = UserResponse().apply {
            this.result = Result().apply {
                this.resultCode = "OK"
                this.resultMessage = "성공"
            }
        }.apply {
            this.description = "응답 메시지"
        }.apply {
            val userList = mutableListOf<UserRequest>()
            userList.add(userRequest)
            userList.add(UserRequest().apply {
                this.address = "addr1"
                this.age = 20
                this.name = "jaejun"
                this.phoneNumber = "010-1111-2222"
            })
            userList.add(UserRequest().apply {
                this.address = "addr2"
                this.age = 30
                this.name = "jaejun1"
                this.email = "email"
            })

            this.userRequest = userList
        }

        return apply
    }
}