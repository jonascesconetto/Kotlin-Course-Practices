

fun main(){
    var str:String // tipo de variavel que permite escrita/leitura/alteração
    str="Welcome to Kotlin"

    val name   = "Jonas" // tipo de variavel somente leitura
    val age  = 25
    val GPA  = 3.8

    println("===== User info ===== ")
    println("Name: $name")
    println("Age: $age"   )
    println("GPA: $GPA" )


    var count =1
    println("Count: $count")
    count = 10
    println("Count: $count")


    var department:String?
    department = null
    department = "Software Engineering"
    print("Department ${department!!}")


}