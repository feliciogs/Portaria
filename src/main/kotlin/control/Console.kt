package control

class Console private constructor(){

    companion object{
        //Valida entrada de dados tipo Inteiro
        fun readInt(msg:String): Int{
            var retorno: Int? = null

            do {
                print(msg)
                val info = readLine()

                if(info != null && info != ""){
                    retorno =  info.toInt()

                    if(retorno == null  || retorno <= 0){
                        println("Valor inválido.")
                    }

                }else{
                    println("Valor inválido.")
                }
            }while (retorno == null || retorno <= 0)

            return retorno
        }

        fun readString(msg: String): String {
            var retorno: String? = null

            do {
                print(msg)
                val info = readLine()

                if (info != null && info != "") {
                    retorno = info.lowercase()
                } else {
                    println("Valor inválido.")
                }
            } while (retorno == null)

            return retorno
        }
    }
}

