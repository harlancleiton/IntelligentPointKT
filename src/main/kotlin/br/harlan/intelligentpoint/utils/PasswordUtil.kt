package br.harlan.intelligentpoint.utils

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

object PasswordUtil {
    fun encoder(password: String): String = BCryptPasswordEncoder().encode(password)

    fun validate(password: String, hash: String): Boolean = BCryptPasswordEncoder().matches(password, hash)
}