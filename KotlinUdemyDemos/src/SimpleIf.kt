fun main(){

    print("Insira sua nota: ")
    val nota = readLine()!!.toInt()

    if (nota>90){
        println("Conceito A!!!")
    }

    if (nota in 80..89){
        println("Conceito B!!!")
    }

    if (nota in 70..79){
        println("Conceito C!!!")
    }

    if (nota < 70){
        println("REPROVADO")
    }
}