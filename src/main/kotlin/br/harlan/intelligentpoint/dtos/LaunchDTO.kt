package br.harlan.intelligentpoint.dtos

data class LaunchDTO(
        val date: String? = null,
        val type: String? = null,
        val description: String? = null,
        val location: String? = null,
        val employeeId: String? = null,
        var id: String? = null
) {
    override fun toString(): String {
        return "LaunchDTO(" +
                "date=$date," +
                "type=$type," +
                "description=$description," +
                "location=$location," +
                "employeeId=$employeeId," +
                "id=$id" +
                ")"
    }
}