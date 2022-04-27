package com.example.myapplication

class Comercial(nombre:String, edad:Int, salario: Double, val comision: Double = 0.0) : Empleado2(nombre, edad, salario) {

    fun plus(){
        if (edad > 45 && comision > 250) {
            println("Se le aplica el plus")
            salario = salario + plus
            println(salario)
        } else {
            println("No se le aplica")
        }
    }


}

