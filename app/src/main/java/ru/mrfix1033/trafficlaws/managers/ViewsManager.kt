package ru.mrfix1033.trafficlaws.managers

import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import ru.mrfix1033.trafficlaws.R

class ViewsManager(app: AppCompatActivity) {
    val cb: CheckBox
    val tvInformation: TextView
    val tvTrafficLaws: TextView

    init {
        app.run {
            cb = findViewById(R.id.cb)
            tvInformation = findViewById(R.id.tvInformation)
            tvTrafficLaws = findViewById(R.id.tvTrafficLaws)
        }
    }
}