package com.bigelowinventions.bigelozidane.logic

import android.content.ClipData
import android.content.ClipboardManager

class InputManager {
    companion object {
        fun writeToClipboard(text: String, clipboardManager: ClipboardManager) {
            val clipboardLabel = if (text.length > 20) {
                text.substring(0, 20)
            } else {
                text
            }
            clipboardManager.setPrimaryClip(ClipData.newPlainText(clipboardLabel, text))
        }

        fun readFromClipboard(clipboardManager: ClipboardManager): String {
            val clip = clipboardManager.primaryClip
            return clip?.getItemAt(0)?.text.toString()
        }
    }
}