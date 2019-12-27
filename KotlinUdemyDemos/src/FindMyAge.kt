import java.util.*

fun main(){

    print("Informe seu ano de nascimento: ")
    val anoNascimento = readLine()!!.toInt()

    val anoNoDispositivo = Calendar.getInstance().get(Calendar.YEAR) // funcao para pegar ano do sipositivo

    val idade = anoNoDispositivo - anoNascimento

    print("Você tem $idade anos")
}