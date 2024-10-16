package ru.mrfix1033.trafficlaws

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.mrfix1033.trafficlaws.managers.CheckBoxManager
import ru.mrfix1033.trafficlaws.managers.ViewsManager

class MainActivity : AppCompatActivity() {
    lateinit var viewsManager: ViewsManager private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewsManager = ViewsManager(this)
        CheckBoxManager(this)
    }
}