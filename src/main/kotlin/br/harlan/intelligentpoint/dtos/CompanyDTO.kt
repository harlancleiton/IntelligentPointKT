package br.harlan.intelligentpoint.dtos

data class CompanyDTO(
        val socialName: String,
        val cnpj: String,
        var id: String? = null
) {
    override fun toString(): String {
        return "CompanyDTO(" +
                "socialName='$socialName'," +
                "cnpj='$cnpj'," +
                "id=$id" +
                ")"
    }
}