package br.harlan.intelligentpoint.utils

import org.junit.Assert
import org.junit.Test

class PasswordUtilTest {
    private val PASSWORD: String = "123"

    @Test
    fun testEncoder() {
        val hash = PasswordUtil.encoder(PASSWORD)
        Assert.assertTrue(PasswordUtil.validate(PASSWORD, hash))
    }
}