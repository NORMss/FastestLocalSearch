package com.norm.myfastestlocalsearch

data class TodoListState(
    val todos: List<Todo> = emptyList(),
    val searchQuery: String = "",
)