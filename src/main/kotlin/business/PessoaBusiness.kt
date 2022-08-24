package business

import entity.Pessoa

class PessoaBusiness {

    fun idadeValida(pessoa:Pessoa): Boolean{
        if(pessoa.idade < 18){
            return false
        }
        return true
    }
}