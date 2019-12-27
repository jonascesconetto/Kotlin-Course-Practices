fun main(){

    val ehCasado = false
    val GPA = 3.8

    val ehQualificado =
        if (ehCasado && GPA>=3.8)
            1
        else
            0

    println(ehQualificado)

    val ehBom = when (GPA){
        4.0 -> true
        else -> false
    }

    println(ehBom)
}