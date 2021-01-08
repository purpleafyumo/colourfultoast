package com.purpleaf.example

import android.app.Application
import com.purpleaf.ct.ColourfulToast

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        ColourfulToast.initialize(this)
    }
}