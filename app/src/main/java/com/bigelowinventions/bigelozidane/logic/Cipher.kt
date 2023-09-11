package com.bigelowinventions.bigelozidane.logic

// Simple substitution cipher
class Cipher {

    companion object {

        private val cipherKey = arrayOf(
            mapOf("decoded" to 'a', "encoded" to 'i'),
            mapOf("decoded" to 'c', "encoded" to 'n'),
            mapOf("decoded" to 'd', "encoded" to 'x'),
            mapOf("decoded" to 'e', "encoded" to 'y'),
            mapOf("decoded" to 'b', "encoded" to 'z'),
            mapOf("decoded" to 'f', "encoded" to 'w'),
            mapOf("decoded" to 'g', "encoded" to 'v'),
            mapOf("decoded" to 'h', "encoded" to 't'),
            mapOf("decoded" to 'i', "encoded" to 'u'),
            mapOf("decoded" to 'j', "encoded" to 's'),
            mapOf("decoded" to 'k', "encoded" to 'r'),
            mapOf("decoded" to 'l', "encoded" to 'q'),
            mapOf("decoded" to 'm', "encoded" to 'p'),
            mapOf("decoded" to 'n', "encoded" to 'c'),
            mapOf("decoded" to 'o', "encoded" to 'a'),
            mapOf("decoded" to 'p', "encoded" to 'm'),
            mapOf("decoded" to 'q', "encoded" to 'l'),
            mapOf("decoded" to 'r', "encoded" to 'k'),
            mapOf("decoded" to 's', "encoded" to 'j'),
            mapOf("decoded" to 't', "encoded" to 'h'),
            mapOf("decoded" to 'u', "encoded" to 'e'),
            mapOf("decoded" to 'v', "encoded" to 'g'),
            mapOf("decoded" to 'w', "encoded" to 'f'),
            mapOf("decoded" to 'x', "encoded" to 'd'),
            mapOf("decoded" to 'y', "encoded" to 'o'),
            mapOf("decoded" to 'z', "encoded" to 'b')
        )

        fun encode(plainText: String): String {
            var encodedText = ""

            plainText.forEach { character ->
                val upperCaseCharacter = character.isUpperCase()

                cipherKey.forEach cipherLoop@{ characterKey ->

                    if (character.lowercaseChar() == characterKey["decoded"]) {

                        val encodedCharacter = if (upperCaseCharacter) {

                            characterKey["encoded"]?.uppercaseChar()

                        } else {

                            characterKey["encoded"]

                        }

                        encodedText.plus(encodedCharacter)

                        return@cipherLoop
                    }
                }
            }

            return encodedText
        }

        fun decode(encodedText: String): String {
            var plainText = ""



            return plainText
        }

    }

}