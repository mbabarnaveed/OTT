package com.ott.design_system.tools

import android.util.Log
import androidx.compose.ui.graphics.Color

fun String.getColor() : Color {
    return try{
        Color(android.graphics.Color.parseColor(this))
    }catch(e : Exception){
        Log.w("GetColor", "unknow color $this")
        Color.White
    }
}