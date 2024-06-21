package com.example.demo.Controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class TodoListController {
    @PostMapping("/api/v1/todo")
    fun createTodo(
        @RequestBody title: String,
        @RequestBody contents: String,
        @RequestBody userId: Long,
    ): Boolean {
        return false
    }
}