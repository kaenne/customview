package com.example.customview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val teams = listOf(
            Team("Team Spirit", "ts_logo", 1, 921),
            Team("Team Vitality", "vitality_logo", 2, 834),
            Team("Natus Vincere", "navi_logo", 3, 545),
            Team("MOUZ", "mouz_logo", 4, 499),
            Team("Eternal Fire", "ts_logo", 5, 482)
        )

        recyclerView.adapter = TeamAdapter(teams)
    }
}