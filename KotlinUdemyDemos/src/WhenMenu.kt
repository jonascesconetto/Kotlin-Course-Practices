fun main(){

    print("Informe o código de área: ")

    val codID = readLine()!!.toInt()

    when(codID){

        48 -> {
            println("Santa Catarina")
        }

        21 -> {
            println("Rio de Janeiro")
        }

        11 -> {
            println("São Paulo")
        }
    }
}