package com.example.customview

data class Team(
    val name: String,      // Название команды (например, "Natus Vincere")
    val logoName: String,  // Имя файла логотипа (например, "navi_logo")
    val rank: Int,         // Позиция в рейтинге (1, 2, 3...)
    val hltvRating: Double // рейтинг команды
)