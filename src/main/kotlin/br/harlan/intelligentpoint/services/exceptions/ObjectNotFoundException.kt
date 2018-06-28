package br.harlan.intelligentpoint.services.exceptions

class ObjectNotFoundException : RuntimeException {
    constructor(message: String) : super(message)
    constructor(message: String, cause: Throwable) : super(message, cause)
}