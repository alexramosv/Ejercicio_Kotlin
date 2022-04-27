package com.example.myapplication

/*

fun main() {
    val programador = Programmer("Alex", 23, "Python")
    programador.work()
    programador.sayLanguage()
    programador.goToWork()

    val diseñador = Designer("Antonio", 24, "Kotlin")
    diseñador.work()
    diseñador.sayLanguage()
    diseñador.goToWork()
}

*/

// Ejer 1

// Plantear una clase Persona que contenga dos propiedades: nombre y edad y un
//método que muestre por pantalla tanto el nombre como la edad.
//Declarar una segunda clase llamada Empleado que herede de la clase Persona y
//agregue una propiedad sueldo. Además, debes de agregar un método que muestre
//si debe pagar impuestos si el sueldo superior a 600 €.
//En la función main del programa definir un objeto de la clase Persona y llamar a sus
//métodos y crear un objeto de la clase Empleado y llamar a sus métodos.

/*

fun main() {
    val persona1 = Persona("Al", 23)
    persona1.imprimir()
   // persona1
    //persona1

    val empleado1 = Empleado("Alex", 23, 80.0)
    empleado1.salario()
    val empleado2 = Empleado("Antonio", 24, 1800.0)
    empleado2.salario()
}

 */


// Ejer 2

// Se pide realizar programa para la gestión de empleados. Los empleados se definen
//por tener los siguientes atributos: Nombre, Edad, Salario y una constante llamada
//PLUS con un valor de 250€.
//Existen dos tipos de empleados: repartidor y comercial. El comercial, aparte de los
//atributos anteriores, tiene uno más llamado comisión (Double). El repartidor, aparte
//de los atributos de empleado, tiene otro llamado zona (String).
//Las clases tendrán un método llamado plus, que según en cada clase tendrá una
//implementación distinta. Este plus básicamente aumenta el salario del empleado.
//En la clase comercial, si tiene más de 45 años y cobra una comisión de más de 250
//euros, se le aplicara el plus. En la clase repartidor, si tiene menos de 25 años y
//reparte en la “zona 2”, este recibirá el plus en caso contrario no.
//En la función main del programa definir un objeto para la clase repartidor y otro para
//la clase comercial y llamar a sus métodos.

/*

fun main() {
    val comercial1 = Comercial("A", 23, 2000.0, 50.0)
    comercial1.imprimir()
    comercial1.plus()
    println("///////////////////////////////////////")
    val comercial2 = Comercial("Al", 50, 2000.0, 251.0)
    comercial2.imprimir()
    comercial2.plus()
    println("///////////////////////////////////////")
    val repartidor1 = Repartidor("Alex", 23, 2500.0, "zona 2")
    repartidor1.imprimir()
    repartidor1.plus()
    println("///////////////////////////////////////")
    val repartidor2 = Repartidor("Ale", 32, 2500.0, "zona 3")
    repartidor2.imprimir()
    repartidor2.plus()
}

*/

// Ejer 3

// Plantea un ejercicio mediante herencias de clases para calcular el área de formas
//geométricas. Debes partir de una clase que sea FormasGeometricas y definir dos
//clases heredadas de esta (por ejemplo, circulo y cuadrado)

/*
fun main() {
    val circulo1 = Circulo(0,0,4)
    circulo1.area()
    println("///////////////////////////////////////")
    val cuadrado1 = Cuadrado(5,2,0)
    cuadrado1.area()

}

*/

// Ejer 4

// Estamos interesados en guardar información sobre los Animales que emiten sonidos característicos. De los Animales, en general me interesa saber la siguiente información:
//* Raza, sexo, número de patas
//Crear un método llamado grito que me devuelva la onomatopeya del grito de
//un animal específico: Ej.: Perro ”guau”
//De los Perros a mayores me interesa saber:
//* Si es o no un perro peligroso
//* Si está o no adiestrado
//Del Pato a mayores me interesa saber:
//* Si tiene o no un plumaje exótico
//En el futuro se prevé añadir más clases y todas deberán implementar obligatoriamente el método grito debidamente personalizado.
//Diseña las clases oportunamente. Los constructores inicializarán todos los atributos de las clases.

/*

abstract class Animales (val raza:String, val sexo: String, val nPatas:Int) {
    abstract fun grito()
}


class Perro(raza:String, sexo: String, nPatas:Int, val peligroso:String, val adiestrado:String) : Animales(raza, sexo, nPatas) {
    override fun grito() {
        val grito = "guau"
        println("El perro es de raza $raza, $sexo, con $nPatas patas y hace $grito")
        peligroso()
        adiestrado()
    }

    fun peligroso() {


        if (peligroso == "Si") {
            println("Es un perro pegriloso")
        } else {
            println("El perro no es pegriloso")
        }
    }
    fun adiestrado() {
        if (adiestrado == "Si") {
            println("El perro está adiestrado")
        } else {
            println("El perro no está adiestrado")
        }
    }
}


class Pato(raza:String, sexo: String, nPatas:Int, val plumaje:String) : Animales(raza, sexo, nPatas) {
    override fun grito() {
        val grito = "cuac"
        println("El pato es de raza $raza, $sexo, con $nPatas patas y hace $grito")
        plumas()
    }

    fun plumas() {
        if (plumaje == "Si") {
            println("El pato tiene plumaje exótico")
        } else {
            println("El pato NO tiene plumaje exótico")
        }
    }

}

fun main() {
    val perro1 = Perro("A", "macho", 4, "Si", "Si")
 //   perro1.imprimir()
    perro1.grito()
    println("///////////////////////////////////////")

    val pato1 = Pato("Donald", "macho", 2, "Si")

    pato1.grito()
    println("///////////////////////////////////////")

}

*/

// Versión Martín con INTERFACE

/*

abstract class Animales (raza:String, sexo: String, numeroPatas: Int){
}

interface Grito {
    val grito: String
    fun grito()
}

class Perros(raza:String, sexo: String, numeroPatas: Int, val peligroso: Boolean, val adiestrado: Boolean ): Animales(raza, sexo, numeroPatas), Grito {

    override val grito: String
        get() = "guau"

    override fun grito() {
        println("El perro hace $grito")
    }

    fun peligroso() {
        if (peligroso == true) println("El perro es peligroso")
        else println("El perro no es peligroso")
    }

    fun adiestrado() {
        if (adiestrado == true) println("El perro está adiestrado")
        else println("El perro no está adiestrado")
    }
}

class Pato(raza:String, sexo: String, numeroPatas: Int, val plumajeExotico: Boolean): Animales(raza, sexo, numeroPatas), Grito {

    override val grito: String
        get() = "quack"

    override fun grito() {
        println("El pato hace $grito")
    }

    fun plumaje() {
        if (plumajeExotico == true) println("El pato tiene plumaje exótico")
        else println("El pato tiene plumaje exótico")
    }

}

class Gatos (raza:String, sexo: String, numeroPatas: Int): Animales(raza, sexo, numeroPatas), Grito {
    override val grito: String
        get() = "miau"

    override fun grito() {
        println("El gato hace $grito")
    }

}

fun main() {

    val perro1 = Perros("Border Collie", "Femenino", 4, false, true)
    perro1.grito()
    perro1.adiestrado()
    perro1.peligroso()

/*val animales1 = arrayOf(Perros("Border Collie", "Femenino", 4, false, true),
Pato("Rosado", "Masculino", 2, true))

for(i in animales1)
i.grito()*/

}

*/









