package ru.mrfix1033.trafficlaws

import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    lateinit var cb: CheckBox
    lateinit var tvInformation: TextView
    lateinit var tvTrafficLaws: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cb = findViewById(R.id.cb)
        tvInformation = findViewById(R.id.tvInformation)
        tvTrafficLaws = findViewById(R.id.tvTrafficLaws)

        cb.setOnCheckedChangeListener { checkBox, isChecked ->
            if (isChecked) {
                tvInformation.setText(R.string.trafficLawsLabel)
                tvTrafficLaws.isVisible = true
            } else {
                tvInformation.setText(R.string.information)
                tvTrafficLaws.isVisible = false
            }
        }
    }
}