package com.example.customview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class TeamAdapter(
    private val teams: List<Team>
) : RecyclerView.Adapter<TeamAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvRank: TextView = itemView.findViewById(R.id.tv_rank)
        val ivLogo: ImageView = itemView.findViewById(R.id.iv_logo)
        val tvName: TextView = itemView.findViewById(R.id.tv_name)
        val tvPoints: TextView = itemView.findViewById(R.id.tvRating)
        val tvPlayers: TextView = itemView.findViewById(R.id.tvPlayers) // Добавляем поиск tvPlayers
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_team, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val team = teams[position]

        holder.tvRank.text = "#${team.rank}"
        holder.tvName.text = team.name
        holder.tvPoints.text = "HLTV Points: ${team.hltvRating}" // Установка рейтинга

        val logoId = holder.itemView.context.resources.getIdentifier(
            team.logoName, "mipmap", holder.itemView.context.packageName
        )
        holder.ivLogo.setImageResource(logoId)

        // Добавляем список игроков, разделяя их " • "
        holder.tvPlayers.text = team.players.joinToString(" • ")

        holder.itemView.setOnClickListener {
            Toast.makeText(
                holder.itemView.context,
                "${team.name}\nPoints: ${team.hltvRating}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    override fun getItemCount(): Int = teams.size
}
