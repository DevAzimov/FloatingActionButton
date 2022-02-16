package com.magicapp.floatingactionbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity : AppCompatActivity() {
    private lateinit var addAlarmFab: FloatingActionButton
    private lateinit var addPersonFab: FloatingActionButton
    private lateinit var addFab: ExtendedFloatingActionButton
    private var isAllFabVisible: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addFab = findViewById(R.id.add_fab)
        addPersonFab = findViewById(R.id.add_person_fab)
        addAlarmFab = findViewById(R.id.add_alarm_fab)

        addFab.shrink()

        addFab.setOnClickListener{
            isAllFabVisible = if (!isAllFabVisible){
                addAlarmFab.show()
                addPersonFab.show()
                addFab.extend()
                true
            }else{
                addAlarmFab.hide()
                addPersonFab.hide()
                addFab.shrink()
                false
            }
        }
    }
}