package com.kotlin.mvc.controller.post

import com.kotlin.mvc.dto.UserRequest
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class PostApiController {

    @PostMapping
    fun postMapping() : String {
        return "post-mapping"
    }

    @RequestMapping(value = ["/post-mapping"], method = [RequestMethod.POST])
    fun requestMapping() : String{
        return "post-request-mapping"
    }

    @PostMapping("/post-mapping/object")
    fun postMappingObject(@RequestBody userRequest: UserRequest): UserRequest {
        println(userRequest)
        return userRequest
    }
}