package com.example.c001apk.util

import android.content.Context.MODE_PRIVATE
import androidx.appcompat.app.AppCompatDelegate
import com.example.c001apk.MyApplication.Companion.context

object PrefManager {

    private const val PREF_DARK_THEME = "dark_theme"
    private const val PREF_BLACK_DARK_THEME = "black_dark_theme"
    private const val PREF_FOLLOW_SYSTEM_ACCENT = "follow_system_accent"
    private const val PREF_THEME_COLOR = "theme_color"
    private const val SHOW_EMOJI = "show_emoji"
    private const val ALL_HUAJI = "all_huaji"
    private const val IS_LOGIN = "is_login"
    private const val UID = "uid"
    private const val NAME = "name"
    private const val TOKEN = "token"

    private val pref = context.getSharedPreferences("settings", MODE_PRIVATE)

    var darkTheme: Int
        get() = pref.getInt(PREF_DARK_THEME, AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
        set(value) = pref.edit().putInt(PREF_DARK_THEME, value).apply()

    var blackDarkTheme: Boolean
        get() = pref.getBoolean(PREF_BLACK_DARK_THEME, false)
        set(value) = pref.edit().putBoolean(PREF_BLACK_DARK_THEME, value).apply()

    var followSystemAccent: Boolean
        get() = pref.getBoolean(PREF_FOLLOW_SYSTEM_ACCENT, true)
        set(value) = pref.edit().putBoolean(PREF_FOLLOW_SYSTEM_ACCENT, value).apply()

    var themeColor: String
        get() = pref.getString(PREF_THEME_COLOR, "MATERIAL_DEFAULT")!!
        set(value) = pref.edit().putString(PREF_THEME_COLOR, value).apply()

    var showEmoji: Boolean
        get() = pref.getBoolean(SHOW_EMOJI, true)
        set(value) = pref.edit().putBoolean(SHOW_EMOJI, value).apply()

    var allHuaji: Boolean
        get() = pref.getBoolean(ALL_HUAJI, false)
        set(value) = pref.edit().putBoolean(ALL_HUAJI, value).apply()

    var isLogin: Boolean
        get() = pref.getBoolean(IS_LOGIN, false)
        set(value) = pref.edit().putBoolean(IS_LOGIN, value).apply()

    var uid: String
        get() = pref.getString(UID, "")!!
        set(value) = pref.edit().putString(UID, value).apply()

    var name: String
        get() = pref.getString(NAME, "")!!
        set(value) = pref.edit().putString(NAME, value).apply()

    var token: String
        get() = pref.getString(TOKEN, "")!!
        set(value) = pref.edit().putString(TOKEN, value).apply()

    var test: String
        get() = pref.getString("test", "")!!
        set(value) = pref.edit().putString("test", value).apply()

}