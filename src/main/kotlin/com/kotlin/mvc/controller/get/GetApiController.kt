package com.kotlin.mvc.controller.get

import com.kotlin.mvc.dto.UserRequest
import org.springframework.web.bind.annotation.*
import java.util.*

//REST API
@RestController
@RequestMapping("/api")
class GetApiController {

    @GetMapping("/hello")
    fun hello(): String {
        return "hello kotlin"
    }

    @RequestMapping(path = ["/request-mapping"], method = [RequestMethod.GET])
    fun requestMapping(): String {
        return "request-mapping"
    }

    @GetMapping("/get-mapping/path-variable/{name}/{age}")
    fun pathVariable(
        @PathVariable(value = "name") _name: String,
        @PathVariable age: Int
    ): String {
        val name = "Kotlin"

        println("${name}, ${_name}, ${age}")
        return "$_name $age $name"
    }

    //phoneNumber -> phone-number
    @GetMapping("/get-mapping/query-param")
    fun queryParam(
        @RequestParam name: String,
        @RequestParam age: Int
    ): String {
        println("${name}, ${age}")

        return "$name + $age"
    }

    @GetMapping("/get-mapping/query-param/object")
    fun queryParamObject(userRequest: UserRequest): UserRequest {
        println(userRequest)
        return userRequest
    }

    @GetMapping("/get-mapping/query-param/map")
    fun queryParamMap(@RequestParam map: Map<String, Any>): Map<String, Any> {
        println(map)
        return map
    }
}