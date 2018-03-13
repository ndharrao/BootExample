package com.boot.example

import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/boot")
open class BootRestController {

    @RequestMapping("/quote")
    fun quote(@RequestBody request : String) : String {
        println("The request is \n $request")
        return xmlString()
    }

    private fun xmlString() = "<XML>This is going to be XML Response Content</XML>"
}