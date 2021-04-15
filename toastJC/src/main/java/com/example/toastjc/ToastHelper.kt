package com.example.toastjc

import android.content.Context
import android.widget.Toast

/**
 * Created by Abhin.
 */

class ToastHelper {

    fun getToast(context : Context) {
        Toast.makeText(context, "Lib is Working!!", Toast.LENGTH_LONG).show()
    }
}