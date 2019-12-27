fun main(){
    print("Informe o número a ser testado: ")
    val num = readLine()!!.toInt()

    if(num % 2 == 0){
        println("Número é PAR")
    }else{
        println("Número é IMPAR")
    }
}