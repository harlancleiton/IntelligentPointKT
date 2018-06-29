package br.harlan.intelligentpoint.response

data class Response<T>(
        val data: T? = null,
        val errors: List<String> = ArrayList()

) {
    override fun toString(): String {
        return "Response(" +
                "data=$data," +
                "errors=$errors" +
                ")"
    }
}