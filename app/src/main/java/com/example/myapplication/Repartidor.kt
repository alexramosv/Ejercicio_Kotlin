package com.example.myapplication

class Repartidor (nombre:String, edad:Int, salario: Double, val zona: String = "") : Empleado2(nombre, edad, salario) {

    fun plus() {
        if (edad < 25 && zona == "zona 2") {
            println("Se le aplica el plus")
            salario = salario + plus
            println(salario)
        } else {
            println("No se le aplica")
        }
    }



}
