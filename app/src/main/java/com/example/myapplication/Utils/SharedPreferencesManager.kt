package com.example.myapplication.Utils

import android.content.Context
import android.content.SharedPreferences

object SharedPreferencesManager {
    private const val MyPreferencesName = "MySharedPreferencesStorage"
    private const val TimesOpenAppKey = "AppOpenTimes"
    private val shared: SharedPreferences by lazy { MyApp.Context.getSharedPreferences(
        MyPreferencesName, Context.MODE_PRIVATE) }
    private val editor: SharedPreferences.Editor by lazy { shared.edit() }


    public var TimesOpenApp: Int
        get() = shared.getInt(TimesOpenAppKey, 0)
        set(value) {
            editor.putInt(TimesOpenAppKey, value)
            editor.apply()
        }
}