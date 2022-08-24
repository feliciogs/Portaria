package control

import business.ConviteBusiness
import business.PessoaBusiness
import entity.Convite
import entity.Pessoa

class Portaria {

    private val conviteBusiness = ConviteBusiness()
    private val pessoaBusiness = PessoaBusiness()

    init {
        println("------------- Portaria inicializada -------------")
        println(controle())
    }

    private fun controle():String{
        val pessoa = Pessoa(Console.readInt("Qual sua idade? "))
        val convite  = Convite()

        if(!pessoaBusiness.idadeValida(pessoa)){
            return "Negado.. Menores de idade não são permitidos"
        }

        convite.tipo = Console.readString("Qual o tipo de convite? ")
        if(!conviteBusiness.tipoValido(convite)){
            return "Negado. Convite Inválido"
        }

        convite.codigo = Console.readString("Qual o código de convite? ")

        if(!conviteBusiness.codigoValido(convite)){
            return "Negado. Convite Inválido"
        }

        return "Acesso liberado"
    }




}