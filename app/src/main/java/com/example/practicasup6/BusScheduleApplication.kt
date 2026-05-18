package com.example.practicasup6

import android.app.Application
import com.example.practicasup6.data.AppDatabase


class BusScheduleApplication: Application() {
    val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }
}
