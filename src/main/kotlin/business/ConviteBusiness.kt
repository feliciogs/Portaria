package business

import entity.Convite

class ConviteBusiness {

    fun tipoValido(convite:Convite) = (
            convite.tipo == "comum" || convite.tipo== "premium" || convite.tipo == "luxo")

    fun codigoValido(convite:Convite) = when(convite.tipo){
        "comum" -> convite.codigo.startsWith("xt")
        "premium","luxo" -> convite.codigo.startsWith("xl")
        else -> false
    }
}