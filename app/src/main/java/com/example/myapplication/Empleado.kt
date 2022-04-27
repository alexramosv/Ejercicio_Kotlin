package com.example.myapplication
/*
class Empleado(nombre:String, edad:Int, val salario: Double): Persona(nombre, edad) {

    fun salario (){
        if (salario > 600) {
            println("Mengano se llama $nombre, tiene $edad años y su sueldo es $salario")
            println("Tiene que pagar impuestos")
        } else {
            println("Mengano se llama $nombre, tiene $edad años y su sueldo es $salario")
            println("No paga nada")
        }
    }
}
*/
open class Empleado2(val nombre:String, val edad:Int, var salario: Double ) {

    val plus: Double = 250.0

    fun imprimir (){

        println("El empleado se llama $nombre, tiene $edad años, un salario de $salario€ ")
    }
}