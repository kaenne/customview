package com.example.customview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val teams = listOf(
            Team(
                "Team Spirit",
                "ts_logo",
                1,
                921,
                listOf("donk", "sh1ro", "magixx", "chopper", "zont1x")
            ),
            Team(
                "Team Vitality",
                "vitality_logo",
                2,
                834,
                listOf("ZywOo", "ropz", "flameZ", "apEX", "mezii")
            ),
            Team(
                "Natus Vincere",
                "navi_logo",
                3,
                545,
                listOf("w0nderful", "b1t", "jL", "iM", "Aleksib")
            ),
            Team(
                "MOUZ",
                "mouz_logo",
                4,
                499,
                listOf("frozen", "xertioN", "torzsi", "siuhy", "Jimpphat")
            ),
            Team(
                "Eternal Fire",
                "ef_logo",
                5,
                482,
                listOf("XANTARES", "woxic", "Wicadia", "MAJ3R", "jottAAA")
            ),
            Team(
                "The MongolZ",
                "mongolz_logo",
                6,
                462,
                listOf("blitz", "Techno", "Senzu", "mzinho", "910")
            ),
            Team(
                "G2",
                "g2_logo",
                7,
                424,
                listOf("Snax", "huNter-", "malbsMd", "m0NESY", "HeavyGod")
            ),
            Team(
                "FaZe",
                "faze_logo",
                8,
                350,
                listOf("karrigan", "rain", "EliGE", "frozen", "broky")
            ),
            Team(
                "Liquid",
                "liquid_logo",
                9,
                242,
                listOf("jks", "NAF", "NertZ", "Twistzz", "ultimate")
            ),
            Team(
                "Falcons",
                "falcons_logo",
                10,
                235,
                listOf("NiKo", "Magisk", "TeSeS", "degster", "kyxsan")
            )
        )


        recyclerView.adapter = TeamAdapter(teams)

        recyclerView.addItemDecoration(
            DividerItemDecoration(this, DividerItemDecoration.VERTICAL).apply {
                setDrawable(ContextCompat.getDrawable(this@MainActivity, R.drawable.divider_gray)!!)
            }
        )
    }
}