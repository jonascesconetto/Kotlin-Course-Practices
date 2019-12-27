fun main(){

    print ("Informe sua idade: ")
    val age = readLine()!!.toInt()

    if (age >= 18 && age <=40){
        println("Voçê pode se aplicar para a VAGA!!!")
    }else{
        println("Voçê Não pode se aplicar para a VAGA!!!")
    }
}