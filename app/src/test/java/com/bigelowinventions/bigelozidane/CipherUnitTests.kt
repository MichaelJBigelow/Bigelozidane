package com.bigelowinventions.bigelozidane

import com.bigelowinventions.bigelozidane.logic.Cipher
import org.junit.Test

import org.junit.Assert.*

/**
 * Unit tests for the Cipher class.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class CipherUnitTests {
    @Test
    fun encode_pass() {
        // Manual text entry
        val inputText = "Sample text to process."
        val encodedInput = "Jipmqy hydh ha mkanyjj."
        assertEquals(encodedInput, Cipher.encode(inputText))

        // Cipher character sweep
        //assertEquals(4, 2 + 2)
    }

    @Test
    fun decode_pass() {
        // Manual text entry
        val encodedText = "Jipmqy hydh ha mkanyjj."
        val decodedText = "Sample text to process."
        assertEquals(decodedText, Cipher.decode(encodedText))
    }
}