package ru.mrfix1033.trafficlaws.managers

import androidx.core.view.isVisible
import ru.mrfix1033.trafficlaws.MainActivity
import ru.mrfix1033.trafficlaws.R

class CheckBoxManager(app: MainActivity) {
    init {
        app.run {
            viewsManager.cb.setOnCheckedChangeListener { checkBox, isChecked ->
                if (isChecked) {
                    viewsManager.tvInformation.setText(R.string.trafficLawsLabel)
                    viewsManager.tvTrafficLaws.isVisible = true
                } else {
                    viewsManager.tvInformation.setText(R.string.information)
                    viewsManager.tvTrafficLaws.isVisible = false
                }
            }
        }
    }
}