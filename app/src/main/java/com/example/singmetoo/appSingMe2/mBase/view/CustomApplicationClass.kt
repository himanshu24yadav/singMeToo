package com.example.singmetoo.appSingMe2.mBase.view

import android.app.Application
import com.google.firebase.FirebaseApp

class CustomApplicationClass : Application() {
    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)
    }
}