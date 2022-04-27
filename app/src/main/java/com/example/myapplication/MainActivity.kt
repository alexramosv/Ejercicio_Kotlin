package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.UserHandle
import android.support.v4.app.INotificationSideChannel
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.*
import kotlin.random.Random.Default.nextInt


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}






/*

fun main() {
    println("Ingresa un número: ")
    val num1: Int = readLine()!!.toInt()
    println("Ingresa un número: ")
    val num2: Int = readLine()!!.toInt()

    var resultado: Double = num1.toDouble() - num2.toDouble()
    println(resultado)

    resultado = num1.toDouble() / num2.toDouble()
    println(resultado)
}
*/
/*
// Ejer 2

fun main() {

    println("Ingresa un número: ")
    val num1: Int = readLine()!!.toInt()
    println("Ingresa un número: ")
    val num2: Int = readLine()!!.toInt()
    println("Ingresa un número: ")
    val num3: Int = readLine()!!.toInt()
    println("Ingresa un número: ")
    val num4: Int = readLine()!!.toInt()

    var resultado: Double = num1.toDouble() + num2.toDouble() + num3.toDouble() + num4.toDouble()
    println(resultado)

    resultado = (num1.toDouble() + num2.toDouble() + num3.toDouble() + num4.toDouble()) / 4
    println(resultado)
}

*/
/*
//Ejer3

fun main() {

    println("Ingresa una nota: ")
    val num1: Int = readLine()!!.toInt()
    println("Ingresa una nota: ")
    val num2: Int = readLine()!!.toInt()
    println("Ingresa una nota: ")
    val num3: Int = readLine()!!.toInt()

    var resultado: Double = (num1.toDouble() + num2.toDouble() + num3.toDouble()) / 3

    if (resultado >= 7.0) {
        println("Enhorabuena, has promocionado!")
    } else {
        println("Suspendisto o sacaste una nota normal")
    }
    println(resultado)
}

*/
/*

//Ejer4

fun main() {

    println("Ingresa un número: ")
    val num: Int = readLine()!!.toInt()

    if (num in 1..9) {
        println("Tiene un dígito")
    }
    else
    if (num in 10..99) {
        println("Tiene dos dígitos")
    } else{
        println("Valor no válido")
        }


}
*/
/*
//Ejer 5

fun main() {

    println("Ingresa un número: ")
    val num: Int = readLine()!!.toInt()
    var cuadradoPerfecto = 0
    var cuboPerfecto = 0

    if ((num % 2) == 0) {
        println("Es par")
        cuadradoPerfecto = num * num
        println("El cuadrado perfecto es $cuadradoPerfecto")
    } else {
        println("Es impar")
        cuboPerfecto = num * num * num
        println("El cuadrado perfecto es $cuboPerfecto")
    }
    if (cuboPerfecto == 0) {
        println("Es un cuadrado perfecto: $cuadradoPerfecto")
    } else {
        println("Es un cubo: $cuboPerfecto")
    }
}
*/
/*
// Ejercicio de IF ANIDADOS

fun main() {

    println("Ingresa una nota: ")
    val num1: Int = readLine()!!.toInt()
    println("Ingresa una nota: ")
    val num2: Int = readLine()!!.toInt()
    println("Ingresa una nota: ")
    val num3: Int = readLine()!!.toInt()

    var resultado: Double = (num1.toDouble() + num2.toDouble() + num3.toDouble()) / 3

    if (resultado >= 7.0) {
        println("Notable")
    } else if (resultado >= 5){
        println("Aprobado")
    } else {
        println("Suspenso")
    }
}
*/


// Otros ejercicios

/*
// 1- Escribe un programa en el que se ingresen por consola 3 número enteros, y que
//muestre por pantalla el mayor de ellos.

fun main() {

    println("Ingresa un número: ")
    val num1: Int = readLine()!!.toInt()
    println("Ingresa un número: ")
    val num2: Int = readLine()!!.toInt()
    println("Ingresa un número: ")
    val num3: Int = readLine()!!.toInt()

    if (num1 > num2 && num1 > num3) {
        println("El $num1 es el mayor")
    } else if (num2 > num1 && num2 > num3){
        println("El $num2 es el mayor")
    } else if (num3 > num1 && num3 > num2) {
        println("El $num3 es el mayor")
    }
}
*/
/*
// 2- Realiza un programa en el que se ingresen 1 valor numéricos y muestre un mensaje
//que indique si el número es positivo, nulo o negativo.

fun main() {

    println("Ingresa un número: ")
    val num: Int = readLine()!!.toInt()

    if (num > 0 ){
        println("El valor es positivo")
    } else if (num < 0) {
        println("El numero es negativo")
    } else if (num == 0) {
        println("Nulo")
    }

}
*/

// 3- Realiza un programa en el que se permita cargar un número entero positivo de hasta
//3 dígitos y muestre un mensaje indicando si tiene 1, 2 o 3 dígitos. En el caso de no
//cumplir ninguna de las condiciones mostrar un mensaje de error.

/*
// Opción 1

fun main() {

    println("Ingresa un número: ")
    val num: Int = readLine()!!.toInt()

    if (num in 1..999) {
        when (num) {
            in 1..9 -> println("1 cifra")
            in 10..99 -> println("2 cifras")
            in 100..999 -> println("3 cifras")
        }
    } else {
        println("ERROR")
    }
}
*/
// Opción 2
/*
fun main() {

    println("Ingresa un número: ")
    val num: Int = readLine()!!.toInt()

    if (num in 1..999) {
        if (num in 1..9) {
            println("1 cifra")
        } else if (num in 10..99) {
            println("2 cifras")
        } else if (num in 100..999) {
            println("3 cifras")
        }
    } else {
            println("ERROR")
        }

}
*/

// 4- Se pide realizar un programa para evaluar el nivel de los empleados de una empresa.
//Para ello debes introducir por consola la cantidad total de preguntas que se realizaron
//y la cantidad de preguntas que contesta correctamente el empleado, y a continuación,
//muestre un mensaje informe del nivel del mismo según el porcentaje de respuestas
//correctas que ha obtenido sabiendo que :

//a. Nivel máximo: Porcentaje >= 90%.
//b. Nivel medio: Porcentaje >= 75% y <90%.
//c. Nivel regular: Porcentaje >= 50% y <75%.
//d. Nivel por debajo de lo esperado: Porcentaje < 50%.

/*

fun main() {

    println("Preguntas totales: ")
    val num1: Int = readLine()!!.toInt()

    println("Preguntas realizadas correctamente: ")
    val num2: Int = readLine()!!.toInt()

    var porcentaje = (num2 * 100) / num1

    if (porcentaje >= 90) {
        println("Nivel máximo + 90%")
    } else if (porcentaje >= 75 && porcentaje < 90) {
        println("Nivel medio + 75 - de 90%")
    } else if (porcentaje >= 50 && porcentaje < 75) {
        println("Nivel regular + 50 - de 75%")
    }else if (porcentaje < 50) {
        println("Nivel por debajo de lo esperado - de 50%")
    }
}

*/

//Problemas Condicional Compuesta con Operadores Lógicos KOTLIN

// 1- Escribe un programa en el que insertes una fecha cualquiera para verificar si dicha
//fecha corresponde con Navidad. (Importante: La carga de una fecha se hace por
//partes, ingresamos las variables día, mes y año).

/*

fun main() {

    println("Inserta el DÍA: ")
    val dia: Int = readLine()!!.toInt()

    println("Inserta el MES: ")
    val mes: Int = readLine()!!.toInt()

    println("Inserta el AÑO: ")
    val anho: Int = readLine()!!.toInt()

    if (dia == 25 && mes == 12) {
        println("Es navidad!!!")
    } else {
        println("Es $dia/$mes/$anho")
    }

}

*/

// 2- Realiza un programa en el que se ingresen por consola 3 valor numéricos, si todos
//son iguales calcular el cubo del número y mostrarlo.

/*

fun main() {

    println("Número 1: ")
    val num1: Int = readLine()!!.toInt()

    println("Número 2: ")
    val num2: Int = readLine()!!.toInt()

    println("Número 3: ")
    val num3: Int = readLine()!!.toInt()


    if (num1 == num2 && num1 == num3) {
        var resultado = num1 * num2 * num3
        println(resultado)
    }
}
*/

// 3- Realiza un programa en el que se ingrese por consola 3 números, si todos los valores
//ingresados son menores a 10, imprimir el mensaje "Todos los números son menores
//de diez".

/*

fun main() {

    println("Número 1: ")
    val num1: Int = readLine()!!.toInt()

    println("Número 2: ")
    val num2: Int = readLine()!!.toInt()

    println("Número 3: ")
    val num3: Int = readLine()!!.toInt()

    if (num1 <10 && num2 < 10 && num3 < 10) {
        println("Los tres números son menores que 10")
    } else {
        println("ERROR")
    }
}

*/

//4. Realiza un programa en el que se ingrese por consola 3 números, si al menos uno de
//los valores ingresados es menor a 10, imprimir el mensaje "Alguno de los números
//es menor de diez".

/*

fun main() {

    println("Número 1: ")
    val num1: Int = readLine()!!.toInt()

    println("Número 2: ")
    val num2: Int = readLine()!!.toInt()

    println("Número 3: ")
    val num3: Int = readLine()!!.toInt()

    if (num1 <10 || num2 < 10 || num3 < 10) {
        println("Al menos uno de los tres números es menor que 10")
    } else {
        println("ERROR")
    }
}

*/

//5. Escribir un programa que pida ingresar la coordenada de un punto en el plano, es
//decir dos valores enteros x e y (distintos a cero). Posteriormente imprimir en
//consola en que cuadrante se ubica dicho punto.

//a. 1o Cuadrante si x > 0 e y > 0
//b. 2o Cuadrante si x < 0 e y > 0
//c. 3o Cuadrante si x < 0 e y < 0
//d. 4o Cuadrante si x > 0 e y < 0


/*

fun main() {

    println("Introduce coordenada X: ")
    val num1: Int = readLine()!!.toInt()

    println("Introduce coordenada Y: ")
    val num2: Int = readLine()!!.toInt()

    if (num1 != 0 && num2 != 0) {
        if (num1 > 0 && num2 > 0) {
            println("Pertenece al 1er cuadrante")
        } else if (num1 < 0 && num2 > 0) {
            println("Pertenece al 2º cuadrante")
        } else if (num1 < 0 && num2 < 0) {
            println("Pertenece al 3er cuadrante")
        } else if (num1 > 0 && num2 < 0) {
            println("Pertenece al 4º cuadrante")
        }
    } else {
        println("ERROR")
    }
}

 */

////////////////////////////////////////////////////////////////////////////////////////////
// Explicación del WHILE
////////////////////////////////////////////////////////////////////////////////////////////

// Realizar un programa que imprima en pantalla los números del 1 al 100.

// Opción 1

/*

fun main() {
    var x: Int = 1
    while (x <= 100) {
        println(x)
        x ++
    }
}

*/

//Opción 2

/*

fun main() {
    var x: Int = 1
    while (x <= 100) {
        println(x)
        x = x + 1
    }
}

*/

// Opción 3

/*

fun main() {
    var x: Int = 1
    while (x <= 100) {
        println(x)
        x += 1
    }
}

*/

// Escribir un programa que solicite la carga de un valor positivo y nos muestre desde 1 hasta el valor ingresado de uno en uno.
// Ejemplo: Si ingresamos 30 se debe mostrar en pantalla los números del 1 al 30.

/*

fun main() {
    println("Ingrese un numero: ")
    var valor = readLine()!!.toInt()
    var x: Int = 1
    while (x <= valor) {
        println(x)
        x ++
    }
}

*/

//Desarrollar un programa que permita la carga de 10 valores por teclado y nos muestre posteriormente
//la suma de los valores ingresados y su promedio.

/*

fun main() {
    var x: Int = 1
    var suma: Int = 0
    while (x <= 10) {
        println("Inserte valores: ")
        var valor = readLine()!!.toInt()
        suma = suma + valor
        x ++
    }
    println("La suma es $suma")
    val promedio = suma / 10
    println("El promedio es $promedio")
}

*/

//Una planta que fabrica perfiles de hierro posee un lote de n piezas.
//Confeccionar un programa que pida ingresar por teclado la cantidad de piezas a procesar y
//luego ingrese la longitud de cada perfil; sabiendo que la pieza cuya longitud esté comprendida en el rango de 1.20 y 1.30 son aptas.
//Imprimir por pantalla la cantidad de piezas aptas que hay en el lote.

/*

fun main() {
    println("Cuantas piezas para procesar?")
    var piezas: Int = readLine()!!.toInt()
    var x = 1
    var cantidad = 0
    while (x <= piezas) {
        println("Ingrese la medida de la pieza: ")
        var medida: Double = readLine()!!.toDouble()
        if (medida >= 1.20 && medida <= 1.30) cantidad = cantidad + 1
        x++
    }
    println("El numero de piezas validas es $cantidad")
}

*/

// 1. Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe
//cuántos tienen notas mayores o iguales a 7 y cuántos menores.

/*

fun main() {
    var notasIntroducidad = 0
    var notasAltas = 0
    var notasBajas = 0

    while (notasIntroducidad < 10){
        println("Introduce una nota")
        var nota: Int = readLine()!!.toInt()
        notasIntroducidad = notasIntroducidad + 1

        if (nota >= 7) {
            notasAltas = notasAltas + 1
        } else if (nota < 7) {
            notasBajas = notasBajas + 1
        }
    }
    println("Tiene $notasAltas notas por encima de 7")
    println("Tiene $notasBajas notas por debajo de 7")

}

*/

// 2. Se ingresan un conjunto de n alturas de personas por teclado (n se ingresa por
//teclado). Mostrar la altura promedio de las personas.

/*

fun main() {

    println("Cuantas alturas vas a pasar?")
    var personas: Int = readLine()!!.toInt()
    var contador = 0
    var suma: Double = 0.0

    while (contador != personas) {
        println("Cuanto mides?")
        var altura: Double = readLine()!!.toDouble()
        suma = suma + altura
        contador = contador + 1
    }
    println("La media de alturas es " + (suma / personas) + " para $personas personas")

}

*/


// 3. En una empresa trabajan n empleados cuyos sueldos oscilan entre €1000 y €3500,
//realizar un programa que lea los sueldos que cobra cada empleado e informe cuántos
//empleados cobran entre €1000 y €1800 y cuántos cobran más de €2500. Además, el
//programa deberá informar el importe que gasta la empresa en sueldos al personal.

/*

fun main() {

    println("Cuantas personas trabajan en la empresa?")
    var empleados: Int = readLine()!!.toInt()
    var contador = 0
    var suma: Double = 0.0
    var sueldo1000a1800: Int = 0
    var sueldoMas2500: Int = 0

    while (contador != empleados) {
        println("Cuanto cobra?")
        var sueldo: Double = readLine()!!.toDouble()
        contador = contador + 1

        if (sueldo in 1000.0..3500.0) {
            suma = suma + sueldo
            if (sueldo in 1000.0..1800.0 && sueldo in 1000.0..3500.0) {
                sueldo1000a1800 = sueldo1000a1800 + 1
            } else if (sueldo >= 2500.0 && sueldo in 1000.0..3500.0) {
                sueldoMas2500 = sueldoMas2500 + 1
            }
        }
    }
    println("La empresa gasta un total de $suma€ en el salario de sus empleados")
    println("Hay $sueldo1000a1800 empleados que cobran entre 1000€ y 1800€")
    println("Hay $sueldoMas2500 empleados que cobran más de 2500€")

}

*/

// 1. Realizar un programa que imprima 25 términos de la serie 11 - 22 - 33 – 44 -...
//(No se ingresan valores por teclado).

/*

fun main() {

    var serieSuma: Int = 0
    var contador = 0

    while (contador != 25) {
        serieSuma = serieSuma + 11
        println(serieSuma)
        contador += 1
    }
}

*/

// 2. Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla la serie 8 -
//16 – 24.... (No se ingresan valores por teclado).

/*

fun main() {

    var serieSuma: Int = 0
    var contador = 0

    while (contador != 5000) {
        serieSuma = serieSuma + 8
        println(serieSuma)
        contador += 1
    }
}

*/

// 3. Realizar un programa que permita cargar dos listas de 5 valores cada una. Informar
//con un mensaje cual de las dos listas tiene un valor acumulado mayor (mensajes
//"Lista 1 mayor", "Lista 2 mayor", "Listas iguales")
//Tener en cuenta que puede haber dos o más estructuras repetitivas en un algoritmo.
//(Pista: Para cargar cada lista fíjate en el ejemplo 3 visto en clase: Desarrollar un
//programa que permita la carga de 10 valores por teclado y nos muestre
//posteriormente la suma de los valores ingresados y su promedio.)

// Opción 1

/*

fun main() {

    var contador = 0
    var lista1 = 0
    var lista2 = 0

    while (contador < 5) {
        println("Valor para Lista 1")
        var aumentarLista = readLine()!!.toInt()
        lista1 = lista1 + aumentarLista
        contador += 1
    }
    contador = 0

    while (contador < 5) {
        println("Valor para Lista 2")
        var aumentarLista = readLine()!!.toInt()
        lista2 = lista2 + aumentarLista
        contador += 1
    }

    //println("Lista 1: $lista1")
    //println("Lista 2: $lista2")

    if (lista1 > lista2) {
        println("El sumatorio de la lista 1 es mayor $lista1")
    } else if (lista2 > lista1) {
        println("El sumatorio de la lista 2 es mayor. $lista2")
    } else {
        println("El sumatorio de las dos listas son iguales")
    }
}

*/

// Opción 2

/*

fun main() {

    var lista1: MutableList<Int> = mutableListOf()
    var lista2: MutableList<Int> = mutableListOf()

    while (lista1.size < 5) {
        println("Valor para Lista 1")
        var aumentarLista = readLine()!!.toInt()
        lista1.add(aumentarLista)
    }

    while (lista2.size < 5) {
        println("Valor para Lista 2")
        var aumentarLista = readLine()!!.toInt()
        lista2.add(aumentarLista)
    }

    println("Lista 1: $lista1")
    println("Lista 2: $lista2")

    var maximoLista1 = Collections.max(lista1)
    var maximoLista2 = Collections.max(lista2)
    println("Maximo lista1: " + maximoLista1)
    println("Maximo lista2: $maximoLista2")

    if (maximoLista1 > maximoLista2) {
        println("La lista 1 tiene el mayor valor. $maximoLista1")
    } else if (maximoLista2 > maximoLista1) {
        println("La lista 2 tiene el mayor valor. $maximoLista2")
    } else {
        println("Los máximos son iguales")
    }
}

*/

// 4. Desarrollar un programa que permita cargar n números enteros y luego nos
//informe cuántos valores fueron pares y cuántos impares.
//(Pista: Emplear el operador "%" en la condición de la estructura condicional:
//if (valor % 2 == 0) //Si el if se verifica verdadero luego es par.)

/*

fun main() {

    println("Cuántos números vas a cargar?")
    var numerosACargar = readLine()!!.toInt()
    var pares = 0
    var impares = 0
    var contador = 0

    while (contador != numerosACargar) {
        println("Introduce un número")
        var pedirNumero = readLine()!!.toInt()
        contador += 1

        if (pedirNumero % 2 == 0) {
            pares += 1
        } else {
            impares += 1
        }
    }
    println("Se pusieron $pares números pares")
    println("Se pusieron $impares números impares")
}

*/

///////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////

//Escribir un programa que solicite la carga de un número entre 0 y 999, y nos muestre un mensaje de
//cuantos dígitos tiene el mismo. Finalizar el programa cuando insertemos el valor 0.

/*

fun main () {
    do {
        println("Ingresa un valor entre 0 y 999: ")
        var valor: Int = readLine()!!.toInt()
        if (valor in 1.. 9) println("El número tiene 1 dígito")
        else if (valor in 10.. 99) println("El número tiene 2 dígito")
        else println("El número tiene 3 dígito")
    } while (valor != 0)
}

*/

/* EXCRIBE UN PROGRAMA QUE SOLICITE LA CARGA DE NUMEROS POR TECLADO Y OBTEN SU PROMEDIO.
FINALIZAR LA DE VALORES CUANDO SE CARGUE EL VALOR 0
*/

/*

fun main () {
    var suma: Int = 0
    var cantidad: Int = -1
    do {
        println("Ingresa un valor: ")
        var valor: Int = readLine()!!.toInt()
        suma = suma + valor
        cantidad ++
    } while (valor != 0)

    val promedio = suma/ cantidad
    println("El promedio: $promedio ")
}

*/

/* Realizar un programa que permita ingresar el peso en KG de piezas. El proceso termina cuando
ingresamos el valor 0.
Se debe informar de lo siguiente:
1. Cuantas piezas tienen un peso entre 9.8 y 10.2Kg? Cuantas con más de 10.2 Kg?
2. La cantidad de piezas procesadas
*/

/*

fun main () {
    var cantidad1:Int=0
    var cantidad2:Int=0
    var cantidad3:Int=0
    do {
        println("Ingresa el peso de la pieza: ")
        var peso: Double = readLine()!!.toDouble()
        if (peso> 9.8 && peso < 10.2) cantidad1 = cantidad1 +1
        else if (peso> 10.2) cantidad2 = cantidad2 +1
        else if (peso > 0.0 && peso < 9.8) cantidad3 = cantidad3 +1
    } while(peso != 0.0)

    println("Cantidad peso> 9.8 && peso < 10.2: $cantidad1 ")
    println("Cantidad peso> 10.2: $cantidad2 ")
    println("Cantidad peso > 0.0 && peso < 9.8: $cantidad3 ")
    val cantidadTotal: Int = cantidad1 + cantidad2 + cantidad3
    println("Cantidad total: $cantidadTotal ")
}

*/


// 1. Realizar un programa que acumule (sume) valores ingresados por teclado hasta
//ingresar el 9999 (no sumar dicho valor, indica que ha finalizado la carga). A
//continuación, imprimir el valor acumulado e informar si dicho valor es cero, mayor
//a cero o menor a cero.

/*

fun main () {
    var sumaTotal: Int = 0

    do {
        println("Insertar número")
        var isertarNumero: Int = readLine()!!.toInt()

        if (isertarNumero == 9999) {
            break
        }
        sumaTotal = sumaTotal + isertarNumero
    } while (isertarNumero != 9999)
    println(sumaTotal)

}

*/

//2. En un banco se procesan datos de las cuentas corrientes de sus clientes. De cada
//cuenta corriente se conoce: número de cuenta y el ingreso. El ingreso de datos
//debe finalizar al ingresar un valor negativo en el número de cuenta.
//Se pide confeccionar un programa que lea los datos de las cuentas corrientes e
//informe:
//a) De cada cuenta: número de cuenta y estado del ingreso realizado, sabiendo que
//el estado puede ser:
//• “Ingreso” si el ingreso es > 0.
//• “Pago” si el ingreso es < 0.
//• “Nulo” si el ingreso es = 0.
//b) La suma total de los ingresos.

/*

fun main () {

    var suma = 0

    do {
        println("Ingrese el número de cuenta")
        var numCuenta = readLine()!!.toInt()

        if (numCuenta <= 0){
            break
        }
        println("Ingresa una cantidad")
        var ingreso = readLine()!!.toInt()

        suma = suma + ingreso

        if (ingreso > 0) {
            println("Ingreso")
        } else if (ingreso < 0) {
            println("Pago")
        } else {
            println("Nulo")
        }
    } while (numCuenta > 0)
    println(suma)
}

*/

// Ejer monedero
// 1. Escribe un programa que simule una hucha. El programa solicitará primero una cantidad,
// que será la cantidad de dinero que queremos ahorrar. A continuación, el programa solicitará
// una y otra vez las cantidades que se irán ahorrando, hasta que el total ahorrado iguale o
// supere al objetivo.

/*

fun main () {

    var suma = 0.0
    println("¿Cuanto quieres ahorrar?")
    var cerdito = readLine()!!.toDouble()

    do {
        println("Ingrese la cantidad que vas a ahorrar")
        var llenarCerdito = readLine()!!.toDouble()
        suma = suma + llenarCerdito
    } while (suma < cerdito)
    println("Ya puedes romper el cerdito")
}

*/

// 2. Escribe un programa que pida primero dos números enteros (mínimo y máximo) y que después
// pida números enteros situados entre ellos. El programa terminará cuando se escriba un número
// que no esté comprendido entre los dos valores iniciales. El programa termina escribiendo la
// cantidad de números escritos.

/*

fun main(){
    var contador = -1
    println("Inserte un número")
    var numMin = readLine()!!.toInt()
    println("Inserte otro número, mayor que el anterior")
    var numMax = readLine()!!.toInt()
    if (numMin < numMax){
        do{
            println("Inserte un número situado entre los anteriores")
            var num = readLine()!!.toInt()
            contador ++
        } while (num in numMin..numMax)
        println("Se han escrito $contador números entre el máximo y el mínimo")
    } else {
        println("Error, el número introducido no es mayor al anterior")
    }
}

*/

// Ejer número random

/*

fun main () {

    println("Adivina el número entre 0 y 100")
    var numeroRandom = (0..100).random()
    // println(numeroRandom) // Saber el valor random
    var num = 0

    while (num != numeroRandom) {
        println("Introduce un número: ")
        num = readLine()!!.toInt()

        if (num > numeroRandom) {
            println("Te has pasado")
            println("Vuelve a intentarlo")
            println() // Para qie deje una línea de separación
        } else if (num < numeroRandom) {
            println("Te has quedado corto")
            println("Vuelve a intentarlo")
            println() // Para qie deje una línea de separación
        }
    }
    println("¡¡Enhorabuena!!")

}

*/

// Escribir un programa en el que ingreses un número por consola y determine si
// es capicúa o no. (Buscar en información en internet de que es un número capicúa
// y que operaciones tengo que hacer para calcularlo).

/*

fun main() {
    println("Introduce un número: ")
    var numInicialSinEspacio = readLine()!!.toString()
    var numInicial = ""
    var contadorEspacios = 0
    var contadorEspaciosFinal: Int = numInicialSinEspacio.length.toInt()

    while (contadorEspacios < contadorEspaciosFinal) {

        if (numInicialSinEspacio[contadorEspacios].toString() == " ") {
            contadorEspacios = contadorEspacios + 1
        } else {
            numInicial = numInicial + numInicialSinEspacio[contadorEspacios].toString()
            contadorEspacios = contadorEspacios + 1
        }
    }

    var textoCapicua = ""
    var contador: Int = numInicial.length.toInt()
    contador = contador - 1     // Porque empieza en 1 y necesitamos que sea 0

    while (contador > -1) {
        textoCapicua = textoCapicua + numInicial[contador].toString()
        contador = contador - 1
    }
    if (numInicial == textoCapicua) {
        if (numInicial[0].toString() in "a".."z") {
            println("$numInicialSinEspacio es palíndromo")
        } else {
            println("$numInicialSinEspacio es capicua")
        }
    } else {
        println("$numInicialSinEspacio NO es capicúa")
    }
}

*/


///////////////////////////////////////////////////////////////////////////////////////////////
//// Explicación FOR
///////////////////////////////////////////////////////////////////////////////////////////////

//var numero: IntRange = 1 .. 9
//var letras = 'a' .. 'z'

/*

fun main() {
    println("Inserte un numero: ")
    val numInsert = readLine()!!.toInt()
    val numero = 1 .. 9

    if (numInsert in numero) print("El numero esta entre los valores 1 y 9")

    if (numInsert !in numero) println("El numero no esta entre los valores 1 y 9")

}

*/

// Realizar un proyecto que imprima por patanlla los numeros entre 1 y 100

/*

fun main() {
    //var n: Int = 0
    for (n in 1 .. 100) {
    println(n)}
}

*/

// Realiza un programa que permita la carga de 10 valores por consola y nos muestre posteriormente la suma de los valores y su promedio.

/*

fun main() {

    var suma: Int = 0
    for (x in 1 .. 10) {
        println("Ingrese un numero: ")
        val valor: Int = readLine()!!.toInt()
        suma += valor
    }
    println("la suma es de valores es: $suma")
    val promedio = suma/10
    println("el promedio es: $promedio")

}

*/

// Realiza un programa que permita la carga de un numero de valores difnidos por ti por consola y nos muestre posteriormente la suma de los valores y su promedio.

/*

fun main() {
    println("Cantiadad de valores a ingresar?")
    var cantidad: Int = readLine()!!.toInt()
    var suma: Int = 0
    for (x in 1 .. cantidad) {
        println("Ingrese un numero: ")
        val valor: Int = readLine()!!.toInt()
        suma += valor
    }
    println("la suma es de valores es: $suma")
    val promedio = suma/cantidad
    println("el promedio es: $promedio")
}

*/

// Escribir un programa que cuente cuantos múltiplos de 3, 5 y 9 hay en el rango de 1 a 1000

/*

fun main() {
    var multiplo3: Int = 0
    var multiplo5: Int = 0
    var multiplo9: Int = 0
    for (x in 1 .. 1000) {
        if(x%3 == 0)
        multiplo3 = multiplo3 + 1
        if(x%5 == 0)
        multiplo5 = multiplo5 + 1
        if(x%9 == 0)
        multiplo9 = multiplo9 + 1
    }
    println("Los multiplos de 3 son: $multiplo3")
    println("Los multiplos de 5 son: $multiplo5")
    println("Los multiplos de 9 son: $multiplo9")
}

 */

//Para que reciba valores comprendidos en el rango de 2 en 2

/*

fun main () {
    for(x in 0..10 step 2)
    println(x)
}

*/

// Para que haga el recorrido inverso

/*

fun main () {
    for (x in 10 downTo 1) {
        println(x)
    }
}

*/

/////////////////////////////////////////////////////////////////////////////
// Otros ejercicios
/////////////////////////////////////////////////////////////////////////////

// Problemas For y Expresiones de Rango KOTLIN – PARTE I

// 1. Crea un programa que muestre la tabla de multiplicar del 5 (del 5 al 50)

/*

fun main () {
    for (x in 1..10) {
        println("5 X $x = " + x*5)
    }
}

*/

// 2. Realizar un programa que lea n pares de datos, cada par de datos corresponde a la
//medida de la base y la altura de un triángulo. El programa deberá informar:

//a) Para cada triángulo informar por consola de la medida de su base, su altura y
//su superficie (la superficie se calcula multiplicando la base por la altura y
//dividiendo por dos).
//b) La cantidad de triángulos cuya superficie es mayor a 12.

/*

fun main () {
    println("Introduzca los triángulos que va a calucar: ")
    var repeticiones = readLine()!!.toInt()
    var contador = 0

    for (x in 1..repeticiones) {
        println("Introduzca la base: ")
        var base = readLine()!!.toInt()
        println("Introduzca la altura: ")
        var altura = readLine()!!.toInt()

        var resultado = (base * altura) / 2

        if (resultado > 12) {
            contador = contador + 1
        }
    }
    println("Tiene $contador triángulos mayores de 12")
}

*/

// 3. Desarrollar un programa que solicite la carga de 10 números e imprima la suma de
// los últimos 5 valores ingresados.

/*

fun main () {

    var contador = 0
    var suma = 0

    for (x in 1..10) {
        println("Introduzca un número: ")
        var num = readLine()!!.toInt()
        contador += 1

        if (contador >=6) {
            suma = suma + num
        }
    }
    println(suma)
}

*/

// 4. Realizar un programa que permita ingresar un valor del 1 al 10 y nos muestre la
//tabla de multiplicar del mismo (los primeros 12 términos)
//Ejemplo: Si ingresó 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el 36.

/*

fun main () {
    println("Introduzca el número: ")
    var num = readLine()!!.toInt()

    for (x in 1..12) {
        println("$num X $x = " + (num * x))
    }
}

*/

/////////////////////////////////////////////////////////////////////////////
// Otros ejercicios
/////////////////////////////////////////////////////////////////////////////

// 1. Realizar un programa que lea los lados de n triángulos, e informar:
//a) De cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales),
//isósceles (dos lados iguales), o escaleno (ningún lado igual)
//b) Cantidad de triángulos de cada tipo

/*

fun main () {
    println("Introduzca los triángulos que va a calucar: ")
    var repeticiones = readLine()!!.toInt()
    var contador1 = 0
    var contador2 = 0
    var contador3 = 0

    for (x in 1..repeticiones) {
        println("Introduzca el 1er lado: ")
        var lado1 = readLine()!!.toInt()
        println("Introduzca el 2º lado: ")
        var lado2 = readLine()!!.toInt()
        println("Introduzca el 3er lado: ")
        var lado3 = readLine()!!.toInt()


        if (lado1 == lado2 && lado1 == lado3) {
            println("Es equilátero")
            contador1 ++
        } else if (lado1 == lado2 && lado1 != lado3) {
            println("Es isósceles")
            contador2 ++
        } else if (lado1 != lado2 && lado1 != lado3) {
            println("Es escaleno")
            contador3 ++
        }
    }
    println("Tiene: ")
    println("$contador1 triágulos equilátero")
    println("$contador2 triágulos isósceles")
    println("$contador3 triágulos escaleno")
}

*/

// 2. Realiza un programa que permita la carga de 10 valores enteros por consola. Se
//desea conocer:
//a) La cantidad de valores ingresados negativos.
//b) La cantidad de valores ingresados positivos.
//c) La cantidad de múltiplos de 15.
//d) La cantidad de los números ingresados que son pares

/*

fun main () {
    var contadorNegativo = 0
    var contadorPositivo = 0
    var contadorMul15 = 0
    var contadorPares = 0

    for (x in 1..10) {
        println("Introduzca el número $x: ")
        var num = readLine()!!.toInt()

        if (num < 0) {
            contadorNegativo ++
        } else if (num > 0) {
            contadorPositivo ++
        }

        if ((num % 2) == 0) {
            contadorPares ++
        }
        if ((num % 15) == 0) {
            contadorMul15 ++
        }

    }
    println("Existen $contadorPositivo valores positivos")
    println("Existen $contadorNegativo valores negativos")
    println("Existen $contadorMul15 valores que son múltiplos de 15")
    println("Existen $contadorPares valores pares")
}

*/

// 3. Escribe un programa que imprima por pantalla los 100 primeros números de la
//sucesión de Fibonacci.

/*

fun main () {

    var primNumero = 1.0
    var seguNumero = 1.0
    var resulNumero = 0.0

    for (x in 0..100) {
        primNumero = seguNumero
        seguNumero = resulNumero
        resulNumero = primNumero + seguNumero

        var num3 = resulNumero.toString()

        if ("$num3".endsWith(".0")) {
            num3 = "$num3".replace(".0", "")
        }
        println("$num3")
    }
}

*/

/////////////////////////////////////////////////////////////////////////////
// Otros ejercicios
/////////////////////////////////////////////////////////////////////////////

// Problemas Estructura condicional When

// 1. Crea un programa en el que se ingrese un número entero, y a continuación muestre
//si el número es positivo, nulo o negativo.

/*

fun main () {

    println("Inserte un número: ")
    var num = readLine()!!.toInt()

    when  {
        (num > 0) -> println("Es positivo")
        (num < 0) -> println("Es negativo")
        (num == 0) -> println("Nulo")
    }

}

*/

// 2. Realizar un programa en el que se plantee una estructura que se repita 3 veces y
//dentro de la misma se carguen 3 valores enteros. Finalmente saca por pantalla el
//acumulado del mayor valor de cada lista de 3 valores.

/*

fun main() {
    var total = 0
    for (x in 1..3){
        println("Inserte el primer número")
        var num1 = readLine()!!.toInt()
        println("Inserte el segundo número")
        var num2 = readLine()!!.toInt()
        println("Inserte el tercer número")
        var num3 = readLine()!!.toInt()
        total += when{
            num1 > num2 && num1 > num3 -> {
                println("El mayor es $num1, el primer número introducido")
                num1
            }
            num2 > num3 -> {
                println("El mayor es $num2, el segundo número introducido")
                num2
            }
            else -> {
                println("El mayor es $num3, el tercer número introducido")
                num3
            }
        }
    }
    println("El acumulado de los valores mayores es $total")
}

*/

// 3. Realizar un programa que lea los lados de n triángulos, e informar:
//a. De cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales),
//isósceles (dos lados iguales), o escaleno (ningún lado igual).
//b. Cantidad de triángulos de cada tipo.

/*

fun main () {
    println("Introduzca los triángulos que va a calucar: ")
    var repeticiones = readLine()!!.toInt()
    var contador1 = 0
    var contador2 = 0
    var contador3 = 0

    for (x in 1..repeticiones) {
        println("Introduzca el 1er lado: ")
        var lado1 = readLine()!!.toInt()
        println("Introduzca el 2º lado: ")
        var lado2 = readLine()!!.toInt()
        println("Introduzca el 3er lado: ")
        var lado3 = readLine()!!.toInt()


        when {

            (lado1 == lado2 && lado1 == lado3) -> {
                println("Es equilátero")
                contador1++
            }
            (lado1 == lado2 && lado1 != lado3) -> {
                println("Es isósceles")
                contador2++
            }
            (lado1 != lado2 && lado1 != lado3) -> {
                println("Es escaleno")
                contador3++
            }
        }
    }
    println("Tiene: ")
    println("$contador1 triágulos equilátero")
    println("$contador2 triágulos isósceles")
    println("$contador3 triágulos escaleno")
}

*/

// 4. Realizar un programa que permita cargar la cantidad de hijos de 5 familias y una vez
//cargados muestre por pantalla cuantos tienen 0,1,2 o más hijos.

/*

fun main () {
    var contadorCero = 0
    var contadorUno = 0
    var contadorDos = 0
    var contadorNumerosa = 0
    for (i in 1..5) {
        println("Introduzca cuántos hijos tiene la familia: ")
        var hijos = readLine()!!.toInt()

        when {
            (hijos == 0) -> {
                println("La familia no tiene ningún hijo")
                contadorCero ++
            }
            (hijos == 1) -> {
                println("La familia tiene un hijo")
                contadorUno ++
            }
            (hijos == 2) -> {
                println("La familia tiene dos hijos")
                contadorDos ++
            }
            (hijos > 2) -> {
                println("Es una familia numerosa: $hijos hijos")
                contadorNumerosa ++
            }
        }
    }

    println("Familias con ningún hijo $contadorCero")
    println("Familias con un hijo $contadorUno")
    println("Familias con dos hijo $contadorDos")
    println("Familias con más de dos hijos $contadorNumerosa")

}

*/


// 5. Ingresar un valor entero positivo comprendido entre 1 y 10000. Imprimir un
//mensaje indicando cuantos dígitos tiene.

/*

fun main () {

    println("Ingresa un valor entre 1 y 1000: ")
    var num = readLine()!!.toInt()
    var contador = 0

    for (i in num.toString()) {
        contador ++
    }

    when {
        (contador == 1) -> println("Tiene una unidad")
        (contador == 2) -> println("Tiene dos unidades")
        (contador == 3) -> println("Tiene tres unidades")
    }

}

*/

// 6. Ingresar 10 valores enteros por teclado. Contar cuantos de dichos valores ingresados
//fueron cero y cuantos 1,5 o 10.

/*

fun main () {

    var contadorUno = 0
    var contadorCinco = 0
    var contadorDiez = 0

    for (i in 1..10) {
        println("Ingresa el valor $i ")
        var num = readLine()!!.toInt()

        when {
            num == 1 -> contadorUno ++
            num == 5 -> contadorCinco ++
            num == 10 -> contadorDiez ++
        }
    }

    println("Se ingresaron $contadorUno valores con el número 1, " +
            "$contadorCinco valores con 5 y $contadorDiez con valor 10")
}

*/

/////////////////////////////////////////////////////////////////////////////
// Otros ejercicios
/////////////////////////////////////////////////////////////////////////////

// Problemas Concepto Funciones – PARTE I


// 1. Desarrollar un programa con dos funciones. La primer solicite el ingreso de un
//entero y muestre el cuadrado de dicho valor. La segunda que solicite la carga de dos
//valores y muestre el producto de los mismos. Llamar desde la main a ambas
//funciones.

/*

fun cuadrado () {

    println("Ingresa un valor: ")
    var num = readLine()!!.toInt()

    println("El cuadrado de $num es: " + (num * num))
}

fun producto () {

    println("Ingresa el 1er valor: ")
    var num1 = readLine()!!.toInt()
    println("Ingresa el 2º valor: ")
    var num2 = readLine()!!.toInt()

    println("El producto de $num1 y $num2 es: " + (num1 * num2))
}

fun main () {
    cuadrado()
    producto()
}

*/

// 2. Desarrollar una función que solicite la carga de tres valores y muestre el menor.
//Desde la función main del programa llamar 2 veces a dicha función, realiza esta
//parte utilizando y sin utilizar una estructura repetitiva.

/*

fun menor () {

    println("Ingresa el 1er valor: ")
    var num1 = readLine()!!.toInt()
    println("Ingresa el 2º valor: ")
    var num2 = readLine()!!.toInt()
    println("Ingresa el 3er valor: ")
    var num3 = readLine()!!.toInt()

    when {
        (num1 > num2 && num1 > num3) -> println("El $num1 es el mayor")
        (num2 > num1 && num2 > num3) -> println("El $num2 es el mayor")
        (num3 > num1 && num3 > num2) -> println("El $num3 es el mayor")
    }

}

fun main () {
    menor()
    menor()
}

*/

// Opcion 2

/*

fun menor () {

    println("Ingresa el 1er valor: ")
    var num1 = readLine()!!.toInt()
    println("Ingresa el 2º valor: ")
    var num2 = readLine()!!.toInt()
    println("Ingresa el 3er valor: ")
    var num3 = readLine()!!.toInt()

    when {
        (num1 > num2 && num1 > num3) -> println("El $num1 es el mayor")
        (num2 > num1 && num2 > num3) -> println("El $num2 es el mayor")
        (num3 > num1 && num3 > num2) -> println("El $num3 es el mayor")
    }

}

fun main () {
    for (i in 1..2) {
        menor()
    }
}

*/

/////////////////////////////////////////////////////////////////////////////
// Otros ejercicios
/////////////////////////////////////////////////////////////////////////////

// Problemas Concepto Funciones – PARTE II

// 1. En la función main solicitar que se ingrese una contraseña dos veces por consola
//(1. “Ingresa la contraseña” ; 2. “Repite el ingreso de la contraseña”).
//Desarrollar una función que reciba dos String como parametros y muestre un
//mensaje si las dos contraseñas ingresadas son iguales o si son distintas.

/*

fun compararContra (contra1: String, contra2:String) {

    if (contra1 == contra2) {
        println("La contraseña es la misma")
    } else {
        println("Contraseña incorrecta")
    }
}

fun main () {

    println("Ingresa el 1er valor: ")
    var contra1 = readLine()!!.toString()
    println("Ingresa el 2º valor: ")
    var contra2 = readLine()!!.toString()

    compararContra(contra1, contra2)

}

*/

// 2. Escribe una función que reciba tres enteros como parámetros y los muestre
//ordenados de menor a mayor (*). En la función main solicitar la carga de 3 enteros
//por consola y proceder a llamar a la primera función definida.

//* Para ello lo que tienes que hacer es realizar un when donde establezcas que
//número es el mayor y según eso ordenar con if el orden de impresión por
//consola y repetir el proceso 3 veces por ser 3 valores, por ejemplo, si estableces
//que el valor 1 es el mayor:

/*

fun numMayor (valor1: Int, valor2: Int, valor3: Int) {

    when {
        (valor1 > valor2 && valor1 > valor3) -> {
            if (valor2 > valor3) {
                println("$valor3, $valor2, $valor1")
            } else {
                println("$valor2, $valor3, $valor1")
            }
        }
        (valor2 > valor1 && valor2 > valor3) -> {
            if (valor1 > valor3) {
                println("$valor3, $valor1, $valor2")
            } else {
                println("$valor1, $valor3, $valor2")
            }
        }
        (valor3 > valor1 && valor3 > valor2) -> {
            if (valor1 > valor2) {
                println("$valor2, $valor1, $valor3")
            } else {
                println("$valor1, $valor2, $valor3")
            }
        }
    }
}


fun main () {

    println("Ingresa el 1er valor: ")
    var valor1 = readLine()!!.toInt()
    println("Ingresa el 2º valor: ")
    var valor2 = readLine()!!.toInt()
    println("Ingresa el 3er valor: ")
    var valor3 = readLine()!!.toInt()

    numMayor(valor1, valor2, valor3)

}

*/

// 3. Crea dos funciones, una para calcular el perímetro de un cuadrado y otra para calcular el
// área del cuadrado, ambos resultados los debe mostrar por pantalla.

//En la función main debes ingresar el lado del cuadrado por consola y crear un procedimiento
// que me pregunte si quiero calcular y mostrar su perímetro o su superficie
// (PISTA: Se realiza con When).

/*

fun perimetro (val1: Int) {

    var total = val1 * 4

    println("El perímetro de $val1 es $total")

}

fun area (val1: Int) {

    var total = val1 * val1

    println("El área de $val1 es $total")

}

fun main () {

    println("Ingresa un número: ")
    var valor1 = readLine()!!.toInt()

    perimetro(valor1)
    area(valor1)
}

*/

/////////////////////////////////////////////////////////////////////////////
// Otros ejercicios
/////////////////////////////////////////////////////////////////////////////

// Problemas Funciones con Return– PARTE III

// 1. Elaborar una función que reciba tres valores enteros como parámetro y nos retorne
//el valor promedio de los mismos. Ingresar los valores por consola en la función
//main y sacar por consola el resultado del promedio.

/*

fun promedio (v1: Int, v2: Int, v3: Int): Double {

    var total: Double = (v1.toDouble() + v2.toDouble() + v3.toDouble())/3.0

    return total
}



fun main () {

    println("Ingresa el 1er número: ")
    var valor1 = readLine()!!.toInt()
    println("Ingresa el 2º número: ")
    var valor2 = readLine()!!.toInt()
    println("Ingresa el 3er número: ")
    var valor3 = readLine()!!.toInt()

    println("El promedio de $valor1, $valor2 y $valor3 es: ${promedio(valor1, valor2, valor3)}")

}

*/

// 2. Elaborar una función que nos retorne el perímetro de un cuadrado pasando como
//parámetros el valor del lado.

/*

fun perimetro (val1: Int): Int {

    var total = val1 * 4

    return total

}

fun main () {

    println("Ingresa un número: ")
    var valor1 = readLine()!!.toInt()

    println("El perímetro de $valor1 es ${perimetro(valor1)}")
}

*/

// 3. Confeccionar una función que calcule el perímetro de un triángulo y lo retorne, la
//función recibe como parámetros los valores de los tres lados:

//En la función main del programa cargar los lados de dos triángulos y luego
//mostrar cual de los dos tiene un perímetro mayor.

/*

fun perimetro (val1: Int, val2: Int, val3: Int): Int {

    var total = val1 + val2 + val3

    return total

}

fun main () {

    println("Ingresa el 1er número: ")
    var valor1 = readLine()!!.toInt()
    println("Ingresa el 2º número: ")
    var valor2 = readLine()!!.toInt()
    println("Ingresa uel 3er número: ")
    var valor3 = readLine()!!.toInt()
    println("Ingresa el 1er número: ")
    var valor4 = readLine()!!.toInt()
    println("Ingresa el 2º número: ")
    var valor5 = readLine()!!.toInt()
    println("Ingresa uel 3er número: ")
    var valor6 = readLine()!!.toInt()

    println("El perímetro del 1er triángulo es: ${perimetro(valor1, valor2, valor3)}")
    println("El perímetro del 2º triángulo es: ${perimetro(valor4, valor5, valor6)}")

    when {
        perimetro(valor1, valor2, valor3) > perimetro(valor4, valor5, valor6) -> {
            println("El 1er triángulo es mayor, con un perímetro = ${perimetro(valor1, valor2, valor3)}")
        } else -> {
            println("El 2º triángulo es mayor, con un perímetro = ${perimetro(valor4, valor5, valor6)}")
        }

    }

}

*/

// Valor mayor en una línea

/*

fun valorMayor (v1: Int, v2: Int) = if (v1 > v2) v1 else v2

fun main () {

    println("Ingresa el 1er valor: ")
    var valor1 = readLine()!!.toInt()
    println("Ingresa el 2º valor: ")
    var valor2 = readLine()!!.toInt()

    println("el valor mayo es ${valorMayor(valor1, valor2)}")

}

*/

/////////////////////////////////////////////////////////////////////////////
// Otros ejercicios
/////////////////////////////////////////////////////////////////////////////

// Problemas Funciones con una Unica Expresión– PARTE IV

// 1. Elaborar una función que reciba tres enteros y nos retorne el valor promedio de los
//mismos.

/*

fun promedio (v1: Int, v2: Int, v3: Int): Double = ((v1.toDouble() +
        v2.toDouble() + v3.toDouble())/3.0)




fun main () {

    println("Ingresa el 1er número: ")
    var valor1 = readLine()!!.toInt()
    println("Ingresa el 2º número: ")
    var valor2 = readLine()!!.toInt()
    println("Ingresa el 3er número: ")
    var valor3 = readLine()!!.toInt()

    println("El promedio de $valor1, $valor2 y $valor3 es: ${promedio(valor1, valor2, valor3)}")

}

*/

// 2. Elaborar una función que nos retorne el perímetro de un cuadrado pasando como
//parámetros el valor del lado.

/*

fun perimetro (val1: Int) = (val1 * 4)


fun main () {

    println("Ingresa un número: ")
    var valor1 = readLine()!!.toInt()

    println("El perímetro de un cuadrado de $valor1 es ${perimetro(valor1)}")
}

*/

// 3. Confeccionar una función que calcule la superficie de un rectángulo y la retorne, la
//función recibe como parámetros los valores de dos de sus lados:

// En la función main del programa debe cargar los lados de dos rectángulos y
//luego mostrar cual de los dos tiene una superficie mayor.

/*

fun area (val1: Int, val2: Int): Int = (val1 * val2)

fun main () {

    println("Ingresa la base: ")
    var valor1 = readLine()!!.toInt()
    println("Ingresa la altura: ")
    var valor2 = readLine()!!.toInt()

    println("Ingresa la base: ")
    var valor3 = readLine()!!.toInt()
    println("Ingresa la altura: ")
    var valor4 = readLine()!!.toInt()

    println("El área del 1er rectángulo es: ${area(valor1, valor2)}")
    println("El área del 2º rectángulo es: ${area(valor3, valor4)}")

    when {
        area(valor1, valor2) > area(valor3, valor4) -> {
            println("El 1er rectángulo es mayor, con una área = ${area(valor1, valor2)}")
        }
        else -> {
            println("El 2º rectángulo es mayor, con una área = ${area(valor3, valor4)}")
        }
    }
}

*/

// 4. Confeccionar una función que le enviemos como parámetro un String y nos retorne
//la cantidad de caracteres que tiene. En la función main solicitar la carga de dos
//nombres por teclado y llamar a la función dos veces. Imprimir en la main cual de las
//dos palabras tiene más caracteres.

/*

fun caracteres (val1: String) = (val1.length)


fun main () {

    println("Ingresa un nombre: ")
    var valor1 = readLine()!!.toString()
    println("Ingresa otro nombre: ")
    var valor2 = readLine()!!.toString()

    println("El 1er nombre tiene: ${caracteres(valor1)}")
    println("El 2º nombre tiene: ${caracteres(valor2)}")

    when {
        caracteres(valor1) == caracteres(valor2) -> {
            println("El 1er nombre y el 2º ($valor1 y $valor2), tienen los mismos caracteres")
        }
        caracteres(valor1) > caracteres(valor2) -> {
            println("El 1er nombre, $valor1, es mayor y tiene ${caracteres(valor1)} caracteres")
        }
        else -> {
            println("El 2º nombre, $valor2, es mayor y tiene ${caracteres(valor2)} caracteres")
        }
    }
}

*/

///////////////////////////////////////////////////////////////////////////////////////////////
//// Explicaciones
///////////////////////////////////////////////////////////////////////////////////////////////

//Confeccionar unha función que permita ingresar 10 valores por teclado e contar cantos son pares e cantos son impares.

// Opción Profe

/*


fun calculoParImpar(){
    fun par (valor1: Int) = valor1 % 2 == 0
    //fun impar (valor1: Int) = valor1 % 2 != 0

    var contPar = 0
    var contImpar = 0
    for (i in 1 .. 10) {
        println("Inserte un número")
        val num: Int = readLine()!!.toInt()
        if (par(num)) contPar++
        else contImpar++
    }
    println("La cantidad de números pares es $contPar y de impares $contImpar")
}

fun main() {
    calculoParImpar()
}

*/

// Opción mía

/*

fun contarParesEImpares () {
    var contadorPar = 0
    var contadorImpar = 0
    fun contadorPares(num:Int) = ((num % 2) == 0)
    println("Introducir 10 numeros")

    for (x in 1..10) {
        println("Introduzca el número $x: ")
        var num = readLine()!!.toInt()



        if (contadorPares(num)) {
            contadorPar ++
        } else {
            contadorImpar ++
        }

    }
    println("Existen $contadorPar valores pares")
    println("Existen $contadorImpar valores impares")
}

fun main () {
    contarParesEImpares()
}

*/

// Se desea guardar los sueldos de 5 empleados, para ello empleamos un array.
// A continuación mediante un indice del array muestra todos los sueldos ingresados por pantalla.

// Opción Profe

/*

fun main() {
    var sueldos = IntArray(5)
    for (i in 0 .. sueldos.size-1){
        println("Ingrese sueldo $i")
        sueldos[i] = readLine()!!.toInt()
    }

    for(i in 0 .. sueldos.size-1){
        println(sueldos[i])
    }

}

*/

// Opción mía

/*

fun main() {

  //  var contador = 0
    var sueldos = IntArray(5)

    for (i in 0..4) {
        println("Ingrese sueldo ${i + 1}")
        sueldos[i] = readLine()!!.toInt()
    }

    for(i in 0..4) {
        println("El sueldo del empleado ${i + 1} es: " + sueldos[i])
    }

}

*/

// Ingresa 5 alturas y calcula la suma de todas ellas

// Opción Profe

/*

fun main() {
    var alturas = FloatArray(5)
    var suma = 0f

    for (i in 0 .. alturas.size-1){
        println("Ingrese la altura $i")
        alturas[i] = readLine()!!.toFloat()
        suma = suma + alturas[i]
    }
    println("La suma de las alturas es $suma")
    println("La suma de las alturas es ${alturas.sum()}")

    val promedio = suma / alturas.size
    println("La altura promedio es $promedio")
    var alto = 0
    var bajo = 0
    for (i in 0 .. alturas.size-1){
        if (alturas[i] > promedio) alto++
        else bajo++
    }
    println("La cantidad de personas mas altas que el promedio es $alto y la de personas bajas es $bajo")
}

*/

// Opción Richi

/*

fun main() {

    var alturas = FloatArray(5)

    for(x in 0..alturas.size-1) {
        println("Ingrese altura: ")
        alturas[x] = readLine()!!.toFloat()
    }

    println("La suma total de alturas es: ${alturas.sum()}")
}

*/

// Opción mía

/*

fun main() {

    var suma = 0.0
    var alturas = FloatArray(5)

    for(x in 0..4) {
        println("Ingrese altura: ")
        alturas[x] = readLine()!!.toFloat()

        suma = suma + alturas[x]
    }

    println("La suma total de alturas es: $suma")

    val media = suma / alturas.size

    println("La altura promedio es $media")
    var alto = 0
    var bajo = 0

    for (i in 0..4){
        if (alturas[i] > media) alto++
        else bajo++
    }
    println("La cantidad de personas mas altas que el promedio es $alto y la de personas bajas es $bajo")

}

*/

// Desarrollar un programa que permita ingresar un Array de 8 elementos enteros,
// y saque por pantalla:
//1. El valor acumulado de todos los elementos.
//2. El valor acumulado de los elementos que sean mayores a 36.
//3. Cantidad de valores mayores a 50.

//(Definir dos for, en el primero realizar la carga de datos en el Array y en
// el segundo proceder a analizar cada elemento)

// Opción Profe

/*

fun main() {
    var valores = IntArray(8)
    for (i in 0 .. valores.size-1){
        println("Inserte el valor")
        valores[i] = readLine()!!.toInt()
    }
    var acumulado = 0
    var acumuladoMayor36 = 0
    var cantidadMayor50 = 0
    for (i in 0 .. valores.size-1){
        acumulado += valores[i]
        if (valores[i] > 36) acumuladoMayor36 += valores[i]
        if (valores[i] > 50) cantidadMayor50++
    }
    println("El acumulado de valores es $acumulado")
    println("El cumulado de valores > 36 es $acumuladoMayor36")
    println("La cantidad de valores > 50 es $cantidadMayor50")
}

*/

// Opción mía

/*

fun main() {

    var valores = IntArray(8)

    var sumaTotal = 0
    var acumuladoMayor36 = 0
    var cantidadMayor50 = 0

    for (i in 0..7){
        println("Inserte el valor ${i + 1}")
        valores[i] = readLine()!!.toInt()
    }

    for (i in 0..7){
        sumaTotal = sumaTotal + valores[i]
        if (valores[i] > 36) acumuladoMayor36 += valores[i]
        if (valores[i] > 50) cantidadMayor50++
    }
    println("El acumulado de valores es $sumaTotal")
    println("El cumulado de valores > 36 es $acumuladoMayor36")
    println("La cantidad de valores > 50 es $cantidadMayor50")

}

*/

// Más opcoines de los Array

/*

fun main() {
    val numeros = IntArray(3)

    for(i in numeros.indices) //Esto es igual a for(i in 0 .. numeros.size-1)
    {
        print("Ingrese numero:")
        numeros[i] = readLine()!!.toInt()
    }

    println("Imprime todos los componentes del Array")
    for(x in numeros )
        println(x)

    println("Primera componente del array ${numeros.first()}")
    println("Ultima componente del array ${numeros.last()}")
}

*/

// Escriba un programa que pida la anchura y altura de un rectángulo y que escriba su
// área, su perímetro y la longitud de su diagonal.

// Nota: Se recuerda que, por el teorema de Pitágoras, la relación entre diagonal y lados
// de un rectángulo es diagonal2 = anchura2 + altura2.

// Se recuerda que la raíz cuadrada de un número es el número elevado a 0,5.

/*

fun main() {

    var alto = readLine()!!.toDouble()
    var ancho = readLine()!!.toDouble()

    var area = 0.0
    var perimetro = 0.0
    //var diagonal = 0.0
    var diagonal2 = 0.0

    // diagonal = pow(((alto * alto) + (ancho * ancho)), 0.5)
    diagonal2 = sqrt((pow(alto, 2.0) + pow(ancho, 2.0)))

    area = alto * ancho
    perimetro = 2*alto + 2*ancho


    println("La diagonal del rectángulo es $diagonal2")
    println("El área del rectángulo es $area")
    println("El perímetro del rectángulo es $perimetro")

    println("Funciones")
    println()
    println("La diagonal del rectángulo es " + diagonal(alto, ancho))
    println("El área del rectángulo es " + area(alto, ancho))
    println("El perímetro del rectángulo es " + perimetro(alto, ancho))

}

fun area (num1: Double, num2: Double) = num1 * num2
fun perimetro (num1: Double, num2: Double) = ((2 * num1) + (2 * num2))
fun diagonal (num1: Double, num2: Double) = sqrt((pow(num1, 2.0) + pow(num2, 2.0)))

*/

// Escriba un programa que pida dos números enteros y escriba la suma de todos los enteros
// desde el primer número hasta el segundo.

/*

fun main() {

    println("num 1")
    var num1 = readLine()!!.toInt()
    println("num 2")
    var num2 = readLine()!!.toInt()
    var suma = 0

    if (num1 < num2) {
        for (i in num1..num2) {
            suma = suma + i
        }
    } else {
        println("Error con los numeros")
    }
    println("Suma")
    println(suma)
}

*/

///////////////////////////////////////////////////////////////////////////////////////////////
//// Examen
///////////////////////////////////////////////////////////////////////////////////////////////

// Escribir un programa que permita ao usuario ingresar 6 números enteiros por consola. Os
// números enteiros a ingresar poden ser positivos, negativos ou nulos.
// O programa debe amosar o promedio dos números positivos e o sumatoria dos números
// negativos e nulos.
// (NOTA: Ten en conta que non é posible dividir por cero, polo que é necesario evitar que
// o programa amose un erro si só se ingrésansen números negativos ou nulos.)


// Mío

/*

fun main () {

    println("Introduce los números que vas a ingresar: ")
    var numTotales = readLine()!!.toInt()
    var sumaNegativos = 0
    var sumaPositivos = 0
    var contadorPositivos = 0
    var mediaPositivo = 0.0

    for (i in 1..numTotales) {

        println("Introduce el número ${i}: ")
        var num = readLine()!!.toInt()

        if (num > 0) {
            contadorPositivos = contadorPositivos + 1
            sumaPositivos = sumaPositivos + num
        }
        if (num < 0 || num == 0) {
            sumaNegativos = sumaNegativos + num
        }

    }
    mediaPositivo = sumaPositivos.toDouble() / contadorPositivos.toDouble()

    println("Suma de números negativos o nulos $sumaNegativos")
    println("Promedio de números positivos $mediaPositivo")

}

*/

// Del profe

/*

fun main() {
    var sumaPositivos = 0
    var sumatorioNegativos = 0
    var cantidadPositivos = 0
    for (i in 1..6) {
        println("Ingrese el numero $i")
        val num = readLine()!!.toInt()
        if (num > 0) {
            sumaPositivos += num
            cantidadPositivos += 1
        } else sumatorioNegativos += num
    }
    if (cantidadPositivos == 0) println("No metiste numeros positivos")
    else {
        var promedio = sumaPositivos / cantidadPositivos
        println(promedio)
    }
    println(sumatorioNegativos)
}

*/

///////////////////////////////////////////////////////////////////////////////////////////////
//// + Ejercicios
///////////////////////////////////////////////////////////////////////////////////////////////

// Programa para almacenar sueldos de trabajadores.
//Cuando se ejecuta el programa se debe pedir la cantidad de sueldos a ingresar. El tamaño
// del array debe ser el numero de sueldos.
//Definir una función de carga y otra de impresión

/*

fun cargar(): IntArray {
    println("Cantidad de sueldos a ingresar")
    var numSueldos = readLine()!!.toInt()
    val sueldos = IntArray(numSueldos)
    for (i in sueldos.indices) {
        println("Ingrese el sueldo del operario ${i + 1}")
        sueldos[i] = readLine()!!.toInt()
    }
    return sueldos
}

fun impresion(sueldos: IntArray) {
    println("Listado de todos los sueldos")
    for (x in sueldos)
        println(x)
}

fun main() {//La función main es la primera linea de código, no tiene sentido que tenga un párametro de entrada distinto de void (vacío)
//ya que no hay un código anterior que pueda hacer algo con ese valor.
    var sueldos = cargar() //por eso definimos la variable sueldos
    impresion(sueldos)
}

*/

///////////////////////////////////////////////////////////////////////////////////////////////
//// + Ejercicios
///////////////////////////////////////////////////////////////////////////////////////////////

// Problemas ARRAYS – PARTE I

// 1. Desarrollar un programa que permita ingresar un array de n elementos por consola.
//Elaborar tres funciones una donde se cargue el array, otra que imprima el valor del
//array, otra que sume todos sus elementos y retorne dicho valor a la main donde se
//imprima la suma del array.

/*

fun carga(): IntArray {
    println("Cantidad de números a ingresar")
    var numeros = readLine()!!.toInt()
    val array0 = IntArray(numeros)
    for (i in array0.indices){
        println("Ingrese el número entero ${i+1}:")
        array0[i]= readLine()!!.toInt()
    }
    return array0
}

fun imprimir(array1:IntArray){
    println("Listado completo del array")
    for (x in array1){
        println(x)
    }
}

fun suma (array2:IntArray):Int{
    var suma = array2.sum()
    return suma
}


fun main(){
    var array= carga()
    imprimir(array)
    println("La suma de los elementos del array es ${suma(array)}")
}

*/


// 2. Escribe un programa que que permita ingresar un array de  5 números enteros por
// teclado. Elabora funciones donde se cargue el array, otra que imprima el valor del array
// y otra que muestre el máximo valor insertado del array.

/*

fun carga(): IntArray {

    var numeros = 5
    val array0 = IntArray(numeros)
    for (i in array0.indices){
        println("Ingrese el número entero ${i+1}:")
        array0[i]= readLine()!!.toInt()
    }
    return array0
}

fun imprimir(array1:IntArray){
    println("Listado completo del array")
    for (x in array1){
        println(x)
    }
}

fun maximo (array2:IntArray):Int{
    var maxi = array2.maxOrNull()
    var maximo: Int = maxi!!.toInt()

    return maximo
}


fun main(){
    var array= carga()
    imprimir(array)
    println("El máximo valor del array es ${maximo(array)}")
}

*/

///////////////////////////////////////////////////////////////////////////////////////////////
//// Explicación de las clases (class)
///////////////////////////////////////////////////////////////////////////////////////////////


////////////////////////////////////
//// Ejer 1

/*

class persona {
    var nombre: String = ""
    var edad: Int = 0
    fun inicializar(nombre: String, edad: Int) {
        this.nombre = nombre
        this.edad = edad
    }
    fun imprimir() {
        println("Nombre: $nombre y tiene una edad de $edad")
    }
    fun esMayorEdad() {
        if (edad >= 18)
            println("Es mayor de edad $nombre")
        else
            println("No es mayor de edad $nombre")
    }
}

fun main() {
    val persona1: persona
    persona1 = persona()
    persona1.inicializar("Juan", 12)
    persona1.imprimir()
    persona1.esMayorEdad()
    val persona2: persona
    persona2 = persona()
    persona2.inicializar("Ana", 50)
    persona2.imprimir()
    persona2.esMayorEdad()

}

*/

////////////////////////////////////
//// Ejer 2

/*

class persona {
    var nombre: String = ""
    var edad: Int = 0

    fun inicializar(nombre: String, edad: Int) {
        this.nombre = nombre//Como los parámetros se llaman en este caso igual que las propiedades las diferenciamos antecediendo la palabra clave this
        this.edad = edad
    }

    fun imprimir() {
        println("Nombre: $nombre y tiene una edad de $edad")
        //println("Nombre: ${this.nombre} y tiene una edad de ${this.edad}")// No hay parametros que se llamen igual que las propiedades por lo que no hace falta
    }

    fun esMayorEdad() {
        if (edad >= 18)
            println("Es mayor de edad $nombre")
        else
            println("No es mayor de edad $nombre")
    }
}

fun main() {
    //val persona1: Persona
    //persona1 = Persona() // esto se puede escribir como val persona1 = Persona() y seriamos mas concisos

    val persona1: persona = persona()

    persona1.inicializar("Juan", 12)
    persona1.imprimir()
    persona1.esMayorEdad()

            /*val persona2: Persona
            persona2 = Persona()
            persona2.inicializar("Ana", 50)
            persona2.imprimir()
            persona2.esMayorEdad()*/
}

*/

////////////////////////////////////
//// Ejer 3

//Implementar una clase que cargue los lados de un triángulo e implemente los siguientes métodos:
//inicializar las propiedades por consola, imprimir el valor del lado mayor y otro método que muestre si es equilátero o no.

/*

class Triangulo {
    var lado1: Int = 0
    var lado2: Int = 0
    var lado3: Int = 0

    fun inicializar() {
        print("Ingrese lado 1:")
        lado1 = readLine()!!.toInt()
        print("Ingrese lado 2:")
        lado2 = readLine()!!.toInt()
        print("Ingrese lado 3:")
        lado3 = readLine()!!.toInt()
    }

    fun ladoMayor() {
        print("Lado mayor:")
        when {
            lado1 > lado2 && lado1 > lado3 -> println(lado1)
            lado2 > lado3 -> println(lado2)
            else -> println(lado3)
        }
        /*if (lado1 > lado2 && lado1 > lado3) println(lado1)
        else if (lado2 > lado3) println(lado2)
        else println(lado3)*/
    }

    fun esEquilatero() {
    if (lado1 == lado2 && lado1 == lado3)
        print("Es un triángulo equilátero")
    else
        print("No es un triángulo equilátero")
    }
}

fun main() {
    val triangulo1: Triangulo = Triangulo()
    triangulo1.inicializar()
    triangulo1.ladoMayor()
}

*/

////////////////////////////////////////////////////////////////////////////

/*

class Alumno {
    var nombre: String = ""
    var nota: Int = 0

    fun inicializar() {
        print("Ingrese el nombre del alumno:")
        nombre = readLine()!!.toString()
        print("Ingrese su nota:")
        nota = readLine()!!.toInt()
    }

    fun imprimir() {
        println("Alumno: $nombre tiene una nota de $nota")
    }

    fun nota() {
        when (nota) {
            in 0..4 -> println("Suspenso")
            5 -> println("Aprobado")
            in 6..6 -> println("Bien")
            in 7..8 -> println("Notable")
            in 9..10 -> println("Sobresaliente")
        }
    }
}

fun main() {
    val alumno1 = Alumno() //Instanciar un objeto a una clase
    alumno1.inicializar()
    alumno1.imprimir()
    alumno1.nota()

    val alumno2 = Alumno()
    alumno2.inicializar()
    alumno2.imprimir()
    alumno2.nota()
}

*/

////////////////////////////////////
//// Ejer 4

//Un constructor es un método que se ejecuta inicialmente y en forma automática.
// - Es el primer método que se ejecuta.
// - Se ejecuta de forma automática.
// - Se ejecuta una única vez.
// - Tiene por objetivo inicializar propiedades.
// Una clase puede tener varios constructores pero solo uno es el principal.

/*

class Triangulo constructor (var lado1: Int, var lado2: Int, var lado3: Int) {

    constructor() : this(0, 0, 0) {
        print("Ingrese lado 1:")
        lado1 = readLine()!!.toInt()
        print("Ingrese lado 2:")
        lado2 = readLine()!!.toInt()
        print("Ingrese lado 3:")
        lado3 = readLine()!!.toInt()
    }

    fun ladoMayor() {
        print("Lado mayor:")
        when {
            lado1 > lado2 && lado1 > lado3 -> println(lado1)
            lado2 > lado3 -> println(lado2)
        else -> println(lado3)
        }
    }
}



fun main(){
    val triangulo1 = Triangulo()
    triangulo1.ladoMayor()
}



*/


/*
fun main(){
    val triangulo1 = Triangulo(3,5,9)//inserto los datos en el código
    triangulo1.ladoMayor()
    val triangulo2 = Triangulo()//inserto los datos por consola
    triangulo2.ladoMayor()
}

*/

////////////////////////////////////
//// Ejer 5


// Ejercicio de Clase persona con el constructor

/*

class Person constructor(var nombre: String, var edad: Int){

    fun imprimir() {
        println("Nombre: $nombre y tiene una edad de $edad")
        //println("Nombre: ${this.nombre} y tiene una edad de ${this.edad}")// No hay parametros que se llamen igual que las propiedades por lo que no hace falta
    }

    fun esMayorEdad() {
        if (edad >= 18)
            println("Es mayor de edad $nombre")
        else
            println("No es mayor de edad $nombre")
    }
}

fun main() {
    //val persona1: Persona
    //persona1 = Persona() // esto se puede escribir como val persona1 = Persona() y seriamos mas concisos

    val persona1: Person = Person("Juan", 12)
    persona1.imprimir()
    persona1.esMayorEdad()

}


 */

///////////////////////////////////

/*

class Alumno constructor(var nombre: String, var nota: Int){

    constructor(): this("",0) {
        print("Ingrese el nombre del alumno:")
        nombre = readLine()!!.toString()
        print("Ingrese su nota:")
        nota = readLine()!!.toInt()
    }

    fun imprimir() {
        println("Alumno: $nombre tiene una nota de $nota")
    }

    fun nota () {
        when(nota){
            in 0 .. 4 -> println("Suspenso")
            5 -> println("Aprobado")
            in 6 .. 6 -> println("Bien")
            in 7 .. 9 -> println("Notable")
            in 9 .. 10 -> println("Sobresaliente")
        }
    }
}

fun main() {
    val alumno1 = Alumno() //Los datos del alumno los pide por consola
    alumno1.imprimir()
    alumno1.nota()
    val alumno2 = Alumno("Pepe", 0)// Los datos del alumno los insertas en el codigo
    alumno2.imprimir()
    alumno2.nota()
}

*/

////////////////////////////////////
//// Ejer 6

// Crear una clase llamada Hijos, que tenga como propiedad un array de tamaño 5, que me permita
// almacenar las edades de 5 hijos (val edades = IntArray(5)).

//- Definir un método donde se carguen las edades por consola.
//- Definir otro método que calcule e imprima el de mayor edad.
//- Define otro método que que sume todas las edades de los hijos y lo imprima.
//- Definir que en el método de carga se llame a los otros dos métodos mayor edad y suma edades.

/*

class Edades (var edades: IntArray = IntArray(5)) {

    fun cargar () {
        for (i in 0..4) {
            print("Ingrese la edad ${i + 1}:")
             edades[i] = readLine()!!.toInt()
        }

        mayor()
        suma()
    }

    fun mayor() {
        var mayor = edades.maxOrNull()
        println("La persona más mayor tine $mayor")
    }

    fun suma() {
        var total = edades.sum()
        println("La suma de todas las edades es: $total")
    }
}

fun main() {
    val persona1 = Edades() //Los datos del alumno los pide por consola
    persona1.cargar()

}

*/

// 1. Crea una clase llamada Reloj, que almacene la siguiente información:
//* Marca, modelo, precio, stock, esDigital  Serán atributos (propiedades) con los tipos de
// datos más oportunos para cada caso.
//
//* Crea dos objetos de esta clase y asígnale respectivamente a sus atributos, los siguientes
// valores:
//
//- “Casio”, “X-300”, 100 euros, 10 unidades, Si
//
//-  “Rolex”, “J-5000”, 400 euros, 5 unidades, No
//
// Una vez asignado sus valores muestra por pantalla la suma de sus precios.

/*

class Reloj (var marca: String, var modelo: String, var precio: Float, var stock: Int,
             var esDigital: Boolean) {

}

fun main() {
    val reloj1 = Reloj("Casio", "X-300", 100f, 10, true)
    val reloj2 = Reloj("Rolex", "J-5000", 400f, 5, false)

    fun suma() {
        var num1 = reloj1.precio
        var num2 = reloj2.precio

        var suma: Float = (num1 + num2)
        println("La suma de los dos relojes es: $suma")
    }

    suma()

}

*/

// 2. Construye una clase que represente un Rectángulo. Debe tener dos atributos de tipo float,
// uno para almacenar la base y otro para almacenar la altura.
//
//* Define dos métodos, uno que devuelva el perímetro (2*altura + 2*base) y otro que devuelva
// el área del rectángulo (base*altura).

//* Una vez definida la clase crea ahora en el programa un constructor para insertar la base y
// la altura por consola. Muestra por pantalla su perímetro y área.

/*

class Rectangulo constructor(var base: Float, var altura: Float) {

    constructor() : this(0f, 0f) {
        println("Introduce la Base")
        base = readLine()!!.toFloat()
        println("Introduce la Altura")
        altura = readLine()!!.toFloat()
    }

    fun perimetro() {

        var resultado = (2 * base + 2 * altura)
        println("Perímetro = $resultado")
    }

    fun area() {

        var resultado = (base * altura)
        println("Área = $resultado")
    }

}


fun main() {

    val rectangulo1 = Rectangulo()
    val rectangulo2 = Rectangulo()

    println("Rectángulo 1: ")
    rectangulo1.perimetro()
    rectangulo1.area()
    println()
    println("Rectángulo 2: ")
    rectangulo2.perimetro()
    rectangulo2.area()

}

*/

//3. Crear una clase Vehículo con los siguientes atributos con los tipos de datos más oportunos:

// Atributos: marca, modelo, precio

// Crea dos objetos de esta clase mediante carga y asígnales los siguientes valores:

//“Seat”, “Ibiza”, 11500

//“Yamaha”, “MT-03”, 6000

// Crea un método que muestre en pantalla sus valores.

// Crea un método que devuelva el precio de los vehículos con el IVA añadido y lo muestre por
// pantalla.

/*

class Vehiculo (var marca: String = "", var modelo: String = "", var precio: Float = 0f) {

    fun cargar () {
        println("Marca")
        marca = readLine()!!.toString()
        println("Modelo")
        modelo = readLine()!!.toString()
        println("Precio: ")
        precio = readLine()!!.toFloat()

        imprimir()
        suma()
    }

    fun imprimir() {
        println("La marca es $marca, el modelo es $modelo y tiene un precio de $precio€")
    }


    fun suma() {

        var IVA = (precio * 0.21)
        var resultado = precio + IVA
        println("El precio con el IVA incluido es: $resultado")
    }

}


fun main() {

    val vahiculo1 = Vehiculo()
    val vehiculo2 = Vehiculo()

    vahiculo1.cargar()
    vehiculo2.cargar()
}

*/


// Crea una clase que sea CuentaBancaria que tenga como atributos el nombre y el saldo cuenta de
// un cliente (crea los atributos con los tipos de datos más oportunos).

//Crea un método que sea ingresar dinero en el saldo de la cuenta.
//Crea un método que sea retirar dinero en el saldo de la cuenta.
//Crea un método que muestre en pantalla el saldo final de la cuenta.

//Ten en cuenta que el saldo inicial de la cuenta debe ser 0.

/*

class CuentaBancaria (var nombre: String = "", var saldo: Double = 0.0) {

    fun cargar () {
        println("Nombre")
        nombre = readLine()!!.toString()


    }

    fun ingresar() {

        do {
            println("Ingreso: ")
            var ingreso = readLine()!!.toDouble()
            saldo = saldo + ingreso
        } while (ingreso != 0.0)

    }

    fun sacar() {

        do {
            println("Retirada: ")
            var retirar = readLine()!!.toDouble()
            saldo = saldo - retirar
        } while (retirar != 0.0)

    }

    fun resultado() {

        println("Total en el banco: $saldo")
    }

}



    fun main() {

        var persona1 = CuentaBancaria()
        persona1.cargar()
        persona1.ingresar()
        persona1.sacar()
        persona1.resultado()
    }

*/

/////////////////////////////////////////////////////
// Cases dentro de clases
/////////////////////////////////////////////////////

/*

class Cliente (var nombre: String, var saldo: Float) {

    fun ingresar(cantidad: Float) {
        saldo += cantidad
    }

    fun retirar(cantidad: Float) {
        saldo -= cantidad
    }

    fun imprimir() {
        println("El saldo de la cuenta de $nombre es $saldo")
    }
}

class Banco() {
    var cliente1 = Cliente("Juan", 0f)
    var cliente2 = Cliente("Marcos", 0f)
    var cliente3 = Cliente("Pedro", 0f)

    fun operar(){
        cliente1.ingresar(300f)
        cliente2.ingresar(500f)
        cliente3.ingresar(200f)
        cliente1.retirar(100f)
        cliente3.imprimir()
    }

    fun saldoTotal () {
        var saldoTotal = cliente1.saldo + cliente2.saldo + cliente3.saldo
        println("El saldo total del banco es $saldoTotal")
    }
}

fun main() {
    val banco = Banco()
    banco.operar()
    banco.saldoTotal()
}

*/

// Plantear un programa que tenga una clase Club y otra clase Socio.
//La clase Socio debe tener los siguientes atributos:

//- Nombre
//- Antigüedad en el club (en años).
//La clase Club debe tener como atributos:
//- 3 objetos de la clase Socio.
//La clase Club debe tener un método que clacule el socio de mayor antigüedad añadido.

/*

class Socio constructor(var nombre: String, var antiguedad: Int) {

    constructor() : this("", 0) {
        println("Introduce el nombre del empleado")
        nombre = readLine()!!.toString()
        println("Introduce la antigüedad del empleado")
        antiguedad = readLine()!!.toInt()

    }

}

class Club() {

    var socio1 = Socio()
    var socio2 = Socio()
    var socio3 = Socio()

    fun mayor() {
        if (socio1.antiguedad > socio2.antiguedad && socio1.antiguedad > socio3.antiguedad){
            println("El socio ${socio1.nombre} es el de mayor antigüedad")
        } else if (socio2.antiguedad > socio3.antiguedad){
            println("El socio ${socio2.nombre} es el de mayor antigüedad")
        } else {
            println("El socio ${socio3.nombre} es el de mayor antigüedad")
        }
    }
}


fun main() {
val club = Club()
    club.mayor()
}

*/

// Plantear un programa que permita jugar a los dados. El juego consiste en tirar 2 dados y en el
// momento que se obtenga el mismo valor ganas.

//Las clases a crear son Dados y JuegoDados.
//Los atributos y métodos de cada clase son:

//Dado
//    Atributo
//        valor
//    Métodos
//        tirar
//        imprimir
//
//JuegoDados
//    Atributos
//        2 Dado (2 objetos de la clase Dado)
//    Métodos
//        jugar

/*

class Dados (var tirada: Int=0){


    fun tirar () {
        tirada = (1..6).random()
        imprimir()
    }

    fun imprimir() {
       println("El valor del dado es $tirada")
    }

}

class JuegoDados () {

    var dado1 = Dados()
    var dado2 = Dados()

    fun jugar(){
        do {
            dado1.tirar()
            dado2.tirar()
            if (dado1.tirada > dado2.tirada) {
                println("dado 1 es mayor")
            } else if (dado1.tirada < dado2.tirada) {
                println("dado 2 mayor")
            } else {
                println("¡¡Son iguales!!")
            }
        } while (dado1.tirada != dado2.tirada)
    }
}

fun main() {
    var dado1 = JuegoDados()
    dado1.jugar()

}

*/

///////////////////////////////////////////////////
// Ejercicios refuerzo
///////////////////////////////////////////////////

// Implementar una clase llamada Persona que tendrá como propiedades su nombre y edad.
//Plantear un constructor donde debe llegar como parámetros el nombre y la edad.
//Definir además dos métodos, uno que imprima las propiedades y otro muestre si es mayor de edad.

/*

class Persona constructor(var nombre:String, var edad:Int) {

    constructor() : this("", 0) {
        println("Introduce nombre")
        nombre = readLine()!!.toString()
        println("Introduce la edad de $nombre")
        edad = readLine()!!.toInt()
    }

    fun imprimir() {
        println("Mengano se llama $nombre y tiene $edad años")
    }

    fun mayor() {
        if (edad >= 18) {
            println("Es mayor")
        } else {
            println("Es menor")
        }
    }

}

fun main (){
    var mengano = Persona()
    mengano.imprimir()
    mengano.mayor()

    var fulano = Persona()
    fulano.imprimir()
    fulano.mayor()

    if (mengano.edad > fulano.edad) {
        println("${mengano.nombre} es mayor que ${fulano.nombre}")
    } else {
        println("${mengano.nombre} es menor que ${fulano.nombre}")
    }
}

*/

// Implementar una clase que cargue los lados de un triángulo e implemente los siguientes
// métodos: inicializar las propiedades, imprimir el valor del lado mayor y otro método que
// muestre si es equilátero o no.

/*

class Triangulo constructor(var lado1: Int, var lado2: Int, var lado3: Int) {

    constructor(): this (0,0,0) {
        println("Lado 1:")
        lado1 = readLine()!!.toInt()
        println("Lado 2:")
        lado2 = readLine()!!.toInt()
        println("Lado 3:")
        lado3 = readLine()!!.toInt()
    }

}

class Mayor (){

    var triangulo = Triangulo()

    fun mayor() {
        if (triangulo.lado1 > triangulo.lado2 && triangulo.lado1 > triangulo.lado3) {
            println("Lado 1 mayor")
        } else if (triangulo.lado2 > triangulo.lado3) {
            println("Lado 2 mayor")
        } else {
            println("Lado 3 mayor")
        }
    }
}

class Igual (var lado1: Int, var lado2: Int, var lado3: Int) {

    //var triangulo = Triangulo()

    fun igual() {
        if (lado1 == lado2 && lado1 == lado3) {
            println("Es un triángulo equilátero")
        }
    }
}

fun main () {

    var mayo = Mayor()
    mayo.mayor()
    var ig = Igual(mayo.triangulo.lado1, mayo.triangulo.lado2, mayo.triangulo.lado3)
    ig.igual()
}

*/

////////////////////////////////////////////////////
// Clases privadas
////////////////////////////////////////////////////

/*

class Operacion (){
    private var valor1 = 0
    private var valor2 = 0

    fun cargar (){
        println("Ingrese el primer valor ")
        valor1= readLine()!!.toInt()
        println("Ingrese el primer valor ")
        valor2= readLine()!!.toInt()
        suma()
        producto()
    }

    private fun suma(){
        var suma = valor1 + valor2
        println("La suma es $suma")
    }

    private fun producto(){
        var producto = valor1 * valor2
        println("El producto es $producto")
    }
}

fun main() {
    val operacion1 = Operacion()
    operacion1.cargar()
}

*/

//Desarrolla una clase que tenga un atributo privado de tipo Array de 5 enteros.
//Utiliza el bloque init para llamar a un método privado que cargue valores aleatorios de 1 a 10 en el Array.
//Realizar 2 métodos privados que calculen el valor maximo y minimo del Array, y se ejecuten en el bloque init.

/*

class Array (){
    private var array = IntArray(5)
    init {
        cargar()
    }
    private fun cargar() {
        for (i in array.indices){
            array[i] = (1..10).random()
        }
        for (x in array) println(x)
    }
}

fun main(){
    val array1 = Array()
}

*/

/*
class Array (){
    private var array = IntArray(5)
    init {
        cargar()
        maximo()
        minimo()
    }
    private fun cargar() {
        for (i in array.indices){
            array[i] = (1..10).random()
        }
        for (x in array) println(x)
    }

    private fun maximo(){
        var maximo = array.maxOrNull()!!
        println("El maximo valor es $maximo")
    }

    private fun minimo(){
        var minimo = array.minOrNull()!!
        println("El minimo valor es $minimo")
    }
}

fun main(){
    val array1 = Array()
}

*/


////////////////////////////////////////////////////
// Prueba de nivel
////////////////////////////////////////////////////

// Esta prueba consistirá en realizar el ejercicio FIZZ BUZZ.
//¿En que consiste el ejercicio FIZZ BUZZ en programación?
//Es un test de código muy famoso por ser utilizado en un gran número de entrevistas
//técnicas de trabajo para programadores/as.
//Básicamente se trata de escribir un programa que cumpla lo siguiente:
//• Mostrar los números del 1 al 100.
//• Sustituir los múltiplos de 3 por la palabra "fizz".
//• Sustituir los múltiplos de 5 por la palabra "buzz".
//• Sustituir los múltiplos de 3 y 5 por la palabra "fizzbuzz".

/*

fun main() {

    for (i in 1..100) {
        if (i%3==0 && i%5==0) {
            println("fizzbuzz")
        } else if (i % 3 == 0) {
            println("fizz")
        } else if (i % 5 == 0) {
            println("buzz")
        } else {
            println(i)
        }
    }
}

*/

// Otro ejercicio

/*
class Person (val name: String, val age: Int){

    fun print () {
        println("El nombre es $name y tiene $age años")
    }

    fun mayorEdad(): Boolean {
        return age > 18
    }
}

fun main() {
    val personas: Array<Person> = arrayOf(Person("Paco", 25), Person("Lucía", 12))
    for (i in personas)
        i.print()

    var contador = 0
    for (i in personas){
        if (i.mayorEdad()) {
            contador++
        }
    }
    println("La cantidad de personas mayores de 18 es $contador")
    //personas[0].print() // sacar solo el 1er array
}

*/

// Partiendo de la siguiente clase Artículo:
//class Articulo(val codigo: Int, val descripcion: String, var precio: Float)
//Implementa dos métodos en la clase, una que le enviemos el Array y nos muestre todos sus
// componentes, y otra que también reciba el Array de artículos y proceda a aumentar un 10%
// el precio de todos los productos.

//Realiza el ejercicio empleando un Array con 3 elementos de tipo Artículo, por ejemplo pantalón,
// sudadera y camiseta.

/*

class Articulo(val codigo: Int, val descripcion: String, var precio: Float) {

    fun imprimir() {
        incrementar()
        println("El código del artículo es $codigo,es $descripcion y su precio es de $precio€")
    }

    fun incrementar() {
        var aumento = precio * 0.10f
        precio = precio + aumento
    }
}

fun main() {
    val personas: Array<Articulo> = arrayOf(Articulo(23, "un pantalón Jack & Jones", 100f),
        Articulo(24, "una sudadera", 66.50f),
        Articulo(25, "una camiseta", 30f)
    )
    for (i in personas)
        i.imprimir()
}

*/

// Versión Profe

/*

class Articulo(val codigo: Int, val descripcion: String, var precio: Float){

    fun imprimir(){
        println("El articulo $descripcion con codigo $codigo y precio $precio")
    }

    fun aumentarPrecio(){
        precio = precio + precio*0.1f
        println("El precio nuevo del articulo $codigo es $precio")
    }

}

fun main() {

    val array = arrayOf(Articulo(1,"Camiseta", 19.9f),
        Articulo(2, "Pantalon",24.90f),
        Articulo(3, "Sudadera", 35f))

    for(i in array){
        i.imprimir()
        i.aumentarPrecio()
    }
}

*/

// EJERCICIOS HERENCIA – KOTLIN


//Tengo que diseñar las clases necesarias para gestionar los pagos de la empresa. De
//cualquier pago me interesa saber la base imponible (en euros) y el IVA. En base a
//estos dos valores se debe poder obtener el total (total=base imponible*(1+IVA)).
//• En particular para cada forma de pago me interesa saber:
//o Tarjeta de crédito: No de tarjeta, fecha de caducidad (guárdala como un
//String)
//§ Tiene un recargo fijo de 5€ a sumar al total del pago.
//§ Si está caducada
//o Efectivo:
//§ Efectuado con o sin recibo
//o Transferencia Bancaria: No de cuenta, Titular
//• Crea las clases necesarias con los atributos y métodos necesarios.
//• En el programa (fun main):
//o Registrar la siguiente información:
//§ Pago1:
//• Base imponible: 100€, IVA:18%, Forma de Pago: “Tarjeta
//de crédito” no : 1267-8765-9876-0543-891, que caduca
//el 12/11/2020
//
//§ Pago2:
//• Base imponible: 140,67€, IVA:16%, Forma de Pago:
//“Efectivo” con recibo
//
//§ Pago3:
//• Base imponible: 256€, IVA:18%, Forma de Pago:
//”Transferencia bancaria”, no cuenta:1234-5437-2890-
//0021, titular: José Pagador Pronto.
//
//§ Pago4:
//• Base imponible: 333€, IVA:7%.
//§ Mostrar el total todos los pagos (Para el caso de la forma de
//pago “Tarjeta de crédito”, el total debería haberse
//incrementado por el recargo de 5€) .
//§ Para el “Pago 1” indicar si la tarjeta está o no caducada.
//§ Muestra el no de cuenta y el titular del pago 3.
//§ Crea en la clase donde hayas definido la función que calcula el
//total, otra función con el mismo nombre pero que reciba como
//argumento un String (cuyos posibles valores son “dólar” ó
//“libras”), que representa una nueva moneda para calcular el
//total en dicha moneda. Usa la siguiente tabla de conversión:
//• 1 euro = 1,3 dólares USA.
//• 1 euro = 0,8 libras inglesas.

/*

open class Pagos(val baseImpo: Float, val IVA: Float, var total:Float) {
    open fun total() {
        total = (baseImpo * (baseImpo + IVA/100))

    }
    /*
    fun moneda() {
        var moneda = ""
        if (moneda == "dolar") {
            total = total * 1.3f
        } else if (moneda == "libra") {
            total = total * 0.8f
        }
    }
    */
}

class Tarjeta(baseImpo: Float, IVA: Float, val nTarjeta: Int,
              val fecha: String="", total: Float): Pagos(baseImpo, IVA, total) {

    var recargo = 5.0f
    override fun total(){
        total = (baseImpo * (1 + IVA))+recargo
        caducidad()
    }



    fun caducidad() {
        if (fecha < "21/03/2022") {
            println("La tarjeta está caducada")
        } else {
            println("La tarjeta no está caducada")
        }
    }


}

class Efetivo(baseImpo: Float, IVA: Float,
              val recibo: String="", total: Float): Pagos(baseImpo, IVA, total) {

    override fun total(){
        total = (baseImpo * (1 + IVA))
        recibo()
    }

    fun recibo() {
        if (recibo == "Si" || recibo == "si") {
            println("Paga en efectivo pidiendo un recibo")
        } else {
            println("Paga en efectivo sin recibo")
        }
    }
}

class Transferencia(baseImpo: Float, IVA: Float, val nCuenta: Int,
                    val titular: String, total: Float):Pagos(baseImpo, IVA, total) {

    override fun total(){
        total = (baseImpo * (1 + IVA))
        imprimir()
    }

    fun imprimir() {
        println("El Nº de cuenta es $nCuenta, y el titular es $titular")
    }

}


fun main() {

    val pagos = arrayOf(Tarjeta(100f,0.18f, 123456789, "12/11/2020", 0.0f),
        Efetivo(140.67f,0.16f, "Si", 0.0f),
        Transferencia(256f,0.18f, 123456789, "José Pagador Pronto", 0.0f),
        Pagos(333f,0.07f, 0.0f))
    var sumaTotal = 0.0f
    for (i in pagos) {
        i.total()
        sumaTotal = sumaTotal + i.total
    }
    println("Suma total: $sumaTotal")

}

*/

// Solución del profe

/*

open class Pagos(var baseImponible: Float, var IVA: Float){

    open fun total(moneda: String){
        var total = baseImponible*(1+IVA)
        if (moneda == "Euros"){
            println("El total es $total")
        }
        else if (moneda == "Dolar"){
            val dolares = total*1.3f
            println("El precio en dolares es $dolares $")
        }
        else if (moneda == "Libras"){
            val librasInglesas = total*0.8f
            println("El precio en libras es $librasInglesas Libras")
        }
    }

}

class TarjetaCredito(baseImponible: Float, IVA: Float, var nTarjeta:String, val fechaCaducidad: String): Pagos(baseImponible, IVA){

    override fun total(moneda: String) {
        var total = baseImponible*(1+IVA)+5
        if (moneda == "Euros"){
            println("El total es $total")
        }
        else if (moneda == "Dolar"){
            val dolares = total*1.3f
            println("El precio en dolares es $dolares $")
        }
        else if (moneda == "Libras"){
            val librasInglesas = total*0.8f
            println("El precio en libras es $librasInglesas Libras")
        }
    }

    fun caducada() {
        var fechaActual = "22/03/2022"
/*fechaCaducidad.compareTo(fechaActual)
SimpleDateFormat
*/
        val sdf = SimpleDateFormat("dd/MM/yyyy")
        val currentdate = sdf.format(Date())
        if (currentdate > fechaCaducidad )
            println("Para el pago1:La tarjeta no esta caducada")
        else
            println("Para el pago1:La tarjeta esta caducada")


/*if(fechaCaducidad == "22/03/2022") println("La tarjeta es valida")
else println("La tarjeta está caducada")*/

    }

}

class Efectivo(baseImponible: Float, IVA: Float, var recibo: Boolean): Pagos(baseImponible, IVA){

    fun pagoRecibo(){
        if (recibo == true) println("Se ha obtenido recibo")
        else println("No se ha obtenido recibo")
    }

}

class TransferenciaBancaria(baseImponible: Float, IVA: Float, var nCuenta: String, var titular: String): Pagos(baseImponible, IVA){

    fun imprimir(){
        println("El titular de la cuenta es $titular y el numero de cuenta es $nCuenta")
    }

}

fun main() {
    val pago1 = TarjetaCredito(100f, 0.18f, "1267-8765-9876-0543-891", "10/11/2020")
    val pago2 = Efectivo(140.67f, 0.16f, true)
    val pago3 = TransferenciaBancaria(256f, 0.18f, "1234-5437-2890-0021", "José Pagador Pronto")
    val pago4 = Pagos(333f, 0.07f)
    pago1.caducada()
    pago3.imprimir()

    val pagos: Array<Pagos> = arrayOf(pago1, pago2, pago3, pago4)
    for (i in pagos){
        i.total("Euros")
        i.total("Dolar")
        i.total("Libras")
    }
}

 */

// Crear las clases (utilizando herencia) que sean necesarias para guardar los distintos tipos
// de contratos de los empleados de una empresa. Para todos los contratos se necesita saber:
//
//  Numero de contrato, dni, nombre, apellidos, salario bruto mensual, IRPF
//
//  Para cada tipo de contrato se quiere saber además:
//
//      Indefinido: Si las pagas extras están prorrateadas o no
//
//      Temporal: Meses de duración
//
//      Prácticas: Titulación que cursa, meses de duración
//
//  Crea un constructor en la clase base/padre que inicialice sólo Número de contrato y
//  DNI. Ajusta adecuadamente los constructores en las clases hijas/derivadas, para que
//  inicialicen también estos dos atributos.
//
//  Crea una método llamado “salario_neto” donde corresponda para obtener el salario neto
//  (salario neto = salario bruto – salario bruto*IRPF) en todos los contratos.
//
//  Crea un método llamado “imprimir” en todas las clases, para visualizar todos los datos
//  de los contratos (incluyendo el salario neto).
//
//  En el programa crea un objeto por cada una de las clases hijas y muestra sus valores
//  por pantalla.


//open class Contratos(val NContrato: Int, val dni: String, val nombre:String, val apellidos:String,
 //                    val salario:Double, val IRPF:Int) {
 //   open fun total() {

// Vesión Alex

/*

open class Contratos(val dni: String, val nombre:String) {

    constructor() : this ("", ""){

    }
}

class Indefinido(val NContrato: Int, dni: String, nombre:String, val apellidos:String,
                 val salario:Double, val IRPF:Double, val pagas: String):
            Contratos(dni, nombre) {

    fun imprimir(){
        var total = salario - ( salario * IRPF)
        println("Es un contrato indefinido, el número del contrato es el $NContrato, el DNI y nombre " +
                "del titular es $dni - $nombre, $apellidos, su salario neto es $total y las pagas " +
                "extra $pagas están prorrateadas")
    }


}


class Temporal(val NContrato: Int, dni: String, nombre:String, val apellidos:String,
                 val salario:Double, val IRPF:Double, val mese:Int):
            Contratos(dni, nombre) {

    fun imprimir(){
        var total = salario - ( salario * IRPF)
        println("Es un contrato temporal, el número del contrato es el $NContrato, el DNI y nombre " +
                "del titular es $dni - $nombre, $apellidos, su salario neto es $total y tiene un " +
                "contrato de $mese meses")
    }

            }

class Practicas(val NContrato: Int, dni: String, nombre:String, val apellidos:String,
                 val salario:Double, val IRPF:Double, val titulacion:String, val meses: Int):
            Contratos(dni, nombre) {

    fun imprimir(){
        var total = salario - ( salario * IRPF)
        println("En un contrato en prácticas, el número del contrato es el $NContrato, el DNI y nombre " +
                "del titular es $dni - $nombre, $apellidos, su salario neto es $total su titulación es" +
                " $titulacion y trabajará $meses meses")
    }
            }

fun main(){

    val persona1 = Temporal(123456789, "12345678A", "Pepito", "Pérez", 2300.0, 0.5, 7)
    val persona2 = Indefinido(123456569, "12345678B", "Pepita", "García", 2500.0, 0.8, "si")
    val persona3 = Practicas(123456788, "12345678C", "Popote", "Da Silva", 2000.0, 0.10, "técnico superior", 4)

    persona1.imprimir()
    persona2.imprimir()
    persona3.imprimir()

}

*/

// Versión Tatiana

/*

open class Contratos(val nContrato:Int, val dni: String, val nombre:String, val apellidos:String, var salarioBrutoMensual:Float, var IRPF:Float, var salarioNeto:Float){
    open fun iniciar (nContrato: Int, dni: String){
        println("El contrato $nContrato pertenece al trabajador con dni $dni")
    }
    open fun salarioNeto(){
        salarioNeto= salarioBrutoMensual - salarioBrutoMensual*IRPF
    }

    open fun imprimir (){
        println("El contrato $nContrato corresponde al empleado $nombre $apellidos, con dni $dni, que cobra un salario neto de $salarioNeto euros")
    }
}

class Indefinido (nContrato:Int, dni: String, nombre:String, apellidos:String, salarioBrutoMensual:Float, IRPF:Float, salarioNeto: Float, var extrasP: Boolean): Contratos(nContrato, dni, nombre, apellidos, salarioBrutoMensual, IRPF, salarioNeto){
    override fun iniciar(nContrato: Int, dni: String) {
        super.iniciar(nContrato, dni)
        salarioNeto()
        imprimir()
    }

    override fun salarioNeto() {
        super.salarioNeto()
    }

    override fun imprimir() {
        super.imprimir()

        if(extrasP==true){
            println("Las pagas extras están prorrateadas")
        }else {
            println("Las pagas extras no están prorrateadas")
        }
    }
}

class Temporal (nContrato:Int, dni: String, nombre:String, apellidos:String, salarioBrutoMensual:Float, IRPF:Float, salarioNeto: Float, var duracion: Int): Contratos(nContrato, dni, nombre, apellidos, salarioBrutoMensual, IRPF, salarioNeto){
    override fun iniciar(nContrato: Int, dni: String) {
        super.iniciar(nContrato, dni)
        salarioNeto()
        imprimir()
    }

    override fun salarioNeto() {
        super.salarioNeto()
    }

    override fun imprimir() {
        super.imprimir()
        println("El contrato tiene $duracion meses de duración")
    }
}

class Prácticas (nContrato:Int, dni: String, nombre:String, apellidos:String, salarioBrutoMensual:Float, IRPF:Float, salarioNeto: Float, val titulacion:String, val duracion: Int): Contratos(nContrato, dni, nombre, apellidos, salarioBrutoMensual, IRPF, salarioNeto){

    override fun iniciar(nContrato: Int, dni: String) {
        super.iniciar(nContrato, dni)
        salarioNeto()
        imprimir()
    }

    override fun salarioNeto() {
        super.salarioNeto()
    }

    override fun imprimir() {
        super.imprimir()
        println("El alumno cursa la titulación de $titulacion y las prácticas tienen $duracion meses de duración")
    }
}

fun main(){
    val contrato1= Indefinido(1, "11111111A", "Pepe", "Pepito Pupote", 1545f, 0.53f, 0f, false)
    val contrato2= Temporal(2, "22222222B", "Pedro", "Pedrito Pedrote", 1456f, 0.28f, 0f, 6)
    val contrato3= Prácticas(3, "33333333C", "Juan", "Juanito Juanete", 560f, 0f, 0f, "Psicología", 3)
    contrato1.iniciar(1, "11111111A")
    contrato2.iniciar(2, "22222222B")
    contrato3.iniciar(3, "33333333C")
}

*/

// Versión 2 de Tatiana

/*

open class Contratos constructor(val nContrato:Int, val dni: String){
    constructor():this(0, "")
    open fun salarioNeto(){

    }
    open fun imprimir(){
        println("El número de contrato es $nContrato y el dni es $dni")
    }

}

class Indefinido (nContrato:Int, dni: String, var nombre:String, var apellidos:String, var salarioBrutoMensual:Float, var IRPF:Float, var salarioNeto:Float, var extrasP: Boolean): Contratos(nContrato, dni){
    override fun salarioNeto() {
        salarioNeto= salarioBrutoMensual - salarioBrutoMensual*IRPF
    }

    override fun imprimir() {
        super.imprimir()
        salarioNeto()
        println("El contrato $nContrato corresponde al empleado $nombre $apellidos, con dni $dni, que cobra un salario neto de $salarioNeto euros")

        if(extrasP==true){
            println("Las pagas extras están prorrateadas")
        }else {
            println("Las pagas extras no están prorrateadas")
        }
    }
}

class Temporal (nContrato:Int, dni: String, var nombre:String, var apellidos:String, var salarioBrutoMensual:Float, var IRPF:Float, var salarioNeto:Float, var duracion: Int): Contratos(nContrato, dni){
    override fun salarioNeto() {
        salarioNeto= salarioBrutoMensual - salarioBrutoMensual*IRPF
    }

    override fun imprimir() {
        super.imprimir()
        salarioNeto()
        println("El contrato $nContrato corresponde al empleado $nombre $apellidos, con dni $dni, que cobra un salario neto de $salarioNeto euros")
        println("El contrato tiene $duracion meses de duración")
    }
}
class Prácticas (nContrato:Int, dni: String, var nombre:String, var apellidos:String, val salarioBrutoMensual:Float, val IRPF:Float, var salarioNeto:Float, val titulacion:String, val duracion: Int): Contratos(nContrato, dni){
    override fun salarioNeto() {
        salarioNeto= salarioBrutoMensual - salarioBrutoMensual*IRPF
    }

    override fun imprimir() {
        super.imprimir()
        salarioNeto()
        println("El contrato $nContrato corresponde al empleado $nombre $apellidos, con dni $dni, que cobra un salario neto de $salarioNeto euros")
        println("El alumno cursa la titulación de $titulacion y las prácticas tienen $duracion meses de duración")
    }
}

fun main(){
    val contrato1= Indefinido(1, "11111111A", "Pepe", "Pepito Pupote", 1545f, 0.53f, 0f, false)
    val contrato2= Temporal(2, "22222222B", "Pedro", "Pedrito Pedrote", 1456f, 0.28f, 0f, 6)
    val contrato3= Prácticas(3, "33333333C", "Juan", "Juanito Juanete", 560f, 0f, 0f, "Psicología", 3)
    contrato1.imprimir()
    contrato2.imprimir()
    contrato3.imprimir()
}
*/

// Versión Profe

/*

open class Contrato (val numeroContrato : Int, val DNI : String) {

    open fun salarioNeto(): String {
        return " "
    }

    open fun imprimir() {
        println("El contrato de $DNI es el $numeroContrato")
    }
}

class Indefinido(numeroContrato: Int,
                 DNI: String,
                 val nombre: String,
                 val apellidos: String,
                 val salarioBruto: Int,
                 val IRPF: Float,
                 val pagaExtraPro : Boolean): Contrato(numeroContrato, DNI) {

    override fun salarioNeto() : String {
        var salarioNeto = salarioBruto - salarioBruto*IRPF
        return "$salarioNeto"
    }

    fun pagasExtra(): String {
        if (pagaExtraPro == true) return "si"
        else return "no"
    }

    override fun imprimir() {
        super.imprimir()
        println("El contrato corresponde a $nombre $apellidos y tiene un salario ${salarioNeto()} y ${pagasExtra()} tiene pagas extra prorrateadas")
    }

}

fun main() {
    val contrato1 = Indefinido(18,"46789013F","Martín", "Rodriguez Mendez", 1200, 0.01f, true)
    contrato1.imprimir()
}

*/

////////////////////////////////////////////////////
// Ejemplo de clases para los private y public
////////////////////////////////////////////////////

/*

class Car (val model:String, private val doors:Int, private val power:Int, private val seats:Int){

    fun run(){
    }
    fun brake(){
    }
    fun getCarDescription():String{
        return "El $model es un estupendo coche de $doors puertas con $power caballos y $seats asientos."
    }
    fun getNumberDoors() {
        println("El numero de puertas es $doors")
    }
}

fun main() {
    val hondaCivic = Car("Civic", 4, 120, 5)
    println(hondaCivic.model)
    hondaCivic.getNumberDoors()
    println(hondaCivic.getCarDescription())

}

 */

////////////////////////////////////////////////////
// Ejercicios de Clases Y Objetos
////////////////////////////////////////////////////

// 1.- Define una clase “Pendrive”. Sus atributos serán:
//• marca, modelo, (Strings) privados
//• capacidad, precios públicos (de tipo Decimal)
//• IVA como una constante de tipo Decimal con valor 0.18 privada.

// Crea un constructor que inicialice la marca y modelo.
// Crea una función que haciendo uso de la constante IVA calcule el
//precio+IVA.
//
//• En la función main pide al usuario que introduzca por consola la marca,
//modelo, capacidad y precio. Crea un objeto de tipo Pendrive con dichos
//datos y muestra por pantalla su precio+IVA haciendo uso de la función
//declarada en la clase.

/*

class Pendrive (private val marca:String, private val modelo:String, val capacidad:Double, val precioPublico:Double,
                private val IVA: Double = 0.18){

    open fun iniciar (marca: String, modelo: String){
        println("El USB es el modelo $modelo de la marca $marca")
    }

    fun precio() {
        var precioTotal = 0.0
        precioTotal = precioPublico + (precioPublico * IVA)
        println("El precio con el IVA aplicado es: $precioTotal")
    }


}

fun main() {
    println("Introduce la marca:")
    var marca = readLine()!!.toString()
    println("Introduce el modelo: ")
    var modelo = readLine()!!.toString()
    println("Introduce la capacidad: ")
    var capacidad = readLine()!!.toDouble()
    println("Introduce el precio: ")
    var precio = readLine()!!.toDouble()

    val USB1 = Pendrive(marca, modelo, capacidad, precio)
    USB1.iniciar(marca, modelo)
    USB1.precio()

}

*/

// Versión 2

/*

class Pendrive (private var marca:String, private var modelo: String){

    var capacidad: Double= 0.0
    var precio:Double=0.0
    private val IVA:Double= 0.18

    fun precioIVA(){
        var precioConIVA= precio +precio * IVA
        println("El precio con IVA es $precioConIVA")
    }

}

fun main(){
    println("Introduzca la marca del pendrive")
    var marca= readLine()!!
    println("Introduzca el modelo del pendrive")
    var modelo= readLine()!!
    val pendrive1= Pendrive(marca, modelo)
    println("Introduzca la capacidad del pendrive")
    pendrive1.capacidad= readLine()!!.toDouble()
    println("Introduzca el precio del pendrive")
    pendrive1.precio= readLine()!!.toDouble()
    pendrive1.precioIVA()
}

*/

// Versión Martín

/*

class PenDrive(private val marca: String, private val modelo: String) {
    var capacidad: Double = 0.0
    var precioPublico: Double = 0.0
    private val IVA: Double = 0.18

    fun precioFinal(): Double {
        return precioPublico+precioPublico*IVA
    }
}

fun main() {
    println("Inserte la marca del Pendrive: ")
    var marca = readLine()!!
    println("Inserte el modelo: ")
    val modelo = readLine()!!
    val penDrive1 = PenDrive(marca, modelo)
    println("Inserte la capacidad: ")
    penDrive1.capacidad = readLine()!!.toDouble()
    println("Inserte el precio: ")
    penDrive1.precioPublico = readLine()!!.toDouble()
    println("El precio final es: ")
    println(penDrive1.precioFinal())
}

*/

// 2.- Construir una clase Punto. El objetivo de esta clase es almacenar las
//coordenadas x e y de un punto en un plano. La clase ha de tener los siguientes
//atributos privados: x, y , nombre:
//• Crea un constructor que inicialice las coordenadas del punto
//• Crea un método para asignarle un nombre al punto
//• Crea un segundo constructor que inicialice las coordenadas del punto y
//su nombre
//• Crea dos métodos, uno para desplazar(sumar un valor entero) el punto a
//lo largo del eje x (“desplazaX”) y otro para desplazar el punto a lo largo
//del eje y (“desplazaY”)
//• Crea un procedimiento “verPunto” que muestre la información del punto
//en el formato: nombre(x,y)
//En la función main:
//• Crea el punto llamado “miPunto” con las coordenadas 10,40. Haciendo
//uso del procedimiento anterior muestra los datos del punto en pantalla.
//• Desplaza 5 unidades el punto en el eje x y vuelve a mostrar los datos del
//punto en pantalla
//Revisar documentación:
//https://www.tutorialesprogramacionya.com/kotlinya/detalleconcepto.php?punto=
//24&codigo=24&inicio=15

/*

class Punto (private var x:Int, private var y:Int){

    var nombre:String=""
    constructor(x: Int, y: Int, nombre:String ): this(0,0)

    open fun nombre (){
        println("Introduce el nombre: ")
        this.nombre = readLine()!!.toString()
        println("X tiene el valor $x e Y tiene el valor $y asignado al nombre $nombre")
    }

    fun desplazarX() {

        println("Desplazamiento: ")
        var desplazo = readLine()!!.toInt()
        x = x + desplazo
    }

    fun verPunto() {
        println("$nombre ($x, $y)")
    }

}


fun main() {
    val punto1 = Punto(10,50)
    punto1.nombre()
    punto1.desplazarX()
    punto1.verPunto()
}

*/

// Versión Martín

/*

class Punto (private var x: Int, private var y: Int) {

    private var nombre: String = ""

    constructor( x: Int, y:Int, nombre: String ): this(0,0){
        this.x=x
        this.y=y
        this.nombre=nombre
    }

    fun desplazaX(cantidad: Int) {
        x=x+cantidad
    }

    fun desplazaY(cantidad: Int) {
        y=y+cantidad
    }

    fun verPunto() {
        println("$nombre($x,$y)")
    }

}

fun main() {
    val punto1 = Punto(10, 4, "Mi Punto")
    punto1.verPunto()
    punto1.desplazaX(5)
    punto1.verPunto()
}

*/

// 3.- Crea la clase Círculo. Un Círculo se define por un punto y un radio. Crea por
//lo tanto una clase Círculo con dos atributos privados: uno para almacenar un
//objeto de tipo Punto y otro para almacenar el radio.
//• Crea un constructor que inicialice el círculo dado un punto y un radio.
//Crea una función que calcule el área del círculo (área=Pi*radio2, siendo
//Pi una constante con valor: 3,14159).
//• En el programa crea un círculo situado en el punto 10,20 y de radio 4,5.
//Muestra su área.

/*

class Ciruclo (private var x:Int, private var y:Int, private var radio:Double){

    var area:Double=0.0

    fun area (){
        val pi = 3.14159
        this.area = pi * radio.pow(2)

    }

    fun imprimir() {
        area()
        println("El círculo con tiene los puntos X e Y: $x, $y. Y el radio $radio tiene una área $area ")
    }
}

fun main() {

    val area1 = Ciruclo(10,20,4.5)
    area1.imprimir()
}

*/

// 4.- Abre el proyecto del ejercicio anterior, vamos a ampliar la clase Círculo.
//• Añade una función que calcule la longitud de su circunferencia
//(longitud=2*Pi*radio).
//• Añade dos métodos “desplazaX” y “desplazaY”. El primero desplazará
//un número de unidades dado el punto “x” del Círculo y el segundo
//desplazará el punto “y”. Estos desplazamientos se efectuarán llamando
//a los procedimientos respectivos del objeto “punto”.
//• Crea un procedimiento llamado “verDatos” que muestre los datos del
//círculo, es decir, el punto y el radio. Para mostrar los datos del punto usa
//el procedimiento de mismo nombre del objeto punto.
//• En La función main:
//o Crea un círculo situado en el punto 20,30 y de radio 6 unidades.
//o Muestra su longitud
//o Desplaza el punto 10 unidades en el eje x
//o Muestra los datos del círculo por pantalla
//o Haz lo que sea necesario para cambiar el valor del radio del
//círculo a 7,5.
//o Muestra de nuevo los datos del círculo.

/*

class Ciruclo (private var x:Int, private var y:Int, var radio:Double){

    var area:Double=0.0
    var longitud = 0.0


    fun area (){
        val pi = 3.14159
        this.area = pi * radio.pow(2)

    }

    fun longitud() {

        val pi = 3.14159
        longitud = 2* pi * radio
    }

    fun punto(x: Int, y: Int){
        desplazarX(x)
        desplazarY(y)
    }

    fun desplazarX(nuevaX:Int) {

        var nuevaX = nuevaX
        x = x + nuevaX
    }

    fun desplazarY(nuevaY:Int) {

        var nuevaY = nuevaY
        y = y + nuevaY
    }


    fun verDatos() {
        longitud()
        area()
        println("Los nusvos puntos son: $x, $y")
        println("Área = $area, Longitud= $longitud")
    }
}

fun main() {

    val area1 = Ciruclo(20,30,6.0)
    area1.longitud()
    area1.punto(10,0)
    area1.verDatos()
    area1.radio=7.5
    area1.verDatos()
}

*/

//Versión Martín de 3 y 4

/*

class Punto (private var x: Int, private var y: Int) {

    private var nombre: String = ""

    constructor( x: Int, y:Int, nombre: String ): this(0,0){
        this.x=x
        this.y=y
        this.nombre=nombre
    }

    fun desplazaX(cantidad: Int) {
        x=x+cantidad
    }

    fun desplazaY(cantidad: Int) {
        y=y+cantidad
    }

    fun verPunto() {
        println("$nombre($x,$y)")
    }
}

class Circulo (private var punto: Punto, private var radio: Double) {
    private val PI: Double = 3.14159

    fun areaCirculo(): Double {
        return PI*radio*radio
    }

    fun longitudCirculo(): Double {
        return 2*PI*radio
    }

    fun getRadio(radioNuevo: Double): Double {
        radio = radioNuevo
        return radioNuevo
    }
}

fun main() {
/*val punto1 = Punto(10, 4, "Mi Punto")
punto1.verPunto()
punto1.desplazaX(5)
punto1.verPunto()*/
    val punto2 = Punto(10,20)
    val circulo1 = Circulo(punto2,4.5)
    println(circulo1.areaCirculo())
    val punto3 = Punto(20,30)
    val circulo2 = Circulo(punto3, 6.0)
    println(circulo2.longitudCirculo())
    punto3.desplazaX(10)
    circulo2.getRadio(7.5)
    println(circulo2.longitudCirculo())
}

 */

// Crea una clase “Artista” con los siguientes atributos privados: nombre, país,
//año de nacimiento
//• Crea un constructor que inicialice los 3 atributos
//• Crea una función “edad()” que devuelva los años del artista.
//• Crea un procedimiento “verDatos” que muestre los datos por pantalla
//Crea una clase “Disco” con los siguientes atributos privados: título, objeto
//Artista, año de lanzamiento, número de canciones
//• Crea un constructor que inicialice título y artista.
//• Crea una función “antigüedad()” que devuelva los años del disco.
//• Crea un procedimiento “verDatos” que muestre los datos por pantalla
//En la función main crea los objetos necesarios para guardar la siguiente
//información:
//o Artista: “Shakira”, País: “Colombia”, Año nacimiento: “1977”
//o Disco de Shakira: “Sale el sol”, Año de lanzamiento: “2009”, 15 canciones.
//o Utilizando el método “verDatos”, muestra los datos por pantalla.

/*

class Artista (private var nombre:String, private var pais:String, var nacimineto:Int) {

    var edad= 0

    fun edad() {
        val calendar = Calendar.getInstance()
        val year = calendar[Calendar.YEAR]
        edad = year - nacimineto
    }

    fun verDatos() {
        edad()
        println("$nombre tiene $edad años")

    }
}


class Disco (private var titalo:String, private var artista:String) {

    var lanzamiento:Int = 0
    var canciones:Int = 0
    var antigüedad= 0

    fun antigüedad() {
        val calendar = Calendar.getInstance()
        val year = calendar[Calendar.YEAR]
        antigüedad = year - lanzamiento
    }

    fun verDatos() {
        antigüedad()
        println("El disco de $artista, $titalo, tiene $antigüedad años desde su lanzamiento")

    }

}


fun main() {

    val artista1 = Artista("Shakira","Colombia", 1977)
    artista1.verDatos()
    var album1 = Disco("Sale el sol", "Shakira")
    album1.lanzamiento =2009
    album1.canciones = 15
    album1.verDatos()
}

*/

// Versión profe

/*

class Artista (private var nombre: String, private var pais: String, private var anhoNacimiento: Int) {

    fun getNombre(): String {
        return nombre
    }

    fun getPais(): String {
        return pais
    }

    fun getAnhoNacimiento(): Int {
        return anhoNacimiento
    }

    fun edad(): Int {
        return 2022 - anhoNacimiento
    }

    fun verDatos() {
        println("Artista: $nombre")
        println("Pais: $pais")
        println("Año nacimiento: $anhoNacimiento")
        println("Edad: ${edad()}")
    }
}

class Disco (private var titulo: String, private var artista: Artista, private var anhoLanzamiento: Int, private var numCanciones: Int) {

    fun getTitulo(): String {
        return titulo
    }

    fun getArtista(): Artista {
        return artista
    }

    fun getAnhoLanzamiento(): Int {
        return anhoLanzamiento
    }

    fun getCanciones(): Int {
        return numCanciones
    }

    fun antiguedad(): Int {
        return 2022 - anhoLanzamiento
    }

    fun verDatos() {
        println("Disco: ")
        println("El titulo del disco es: $titulo")
        artista.verDatos()
        println("Año lanzamiento: $anhoLanzamiento")
        println("Numero canciones: $numCanciones")
        println("Antiguedad: ${antiguedad()}")

    }
}

fun main() {

    val artista1 = Artista("Shakira", "Colombia", 1977)
    val artista2 = Artista("Beyonce", "EEUU", 1985)
    val disco1 = Disco("Sale el sol", artista1, 2009, 15)
    val disco2 =Disco("Crazy in Love", Artista("Beyonce", "EEUU", 1985), 2008, 12)
    disco1.verDatos()
    disco2.verDatos()

}

*/

// 1.- Crea una clase llamada Encuesta para almacenar los votos de una encuesta de dos posibles
//respuestas (Ej. ¿Lee libros habitualmente?(S/N), ¿Quién es el mejor jugador de fútbol del
//mundo, Leo Messi o Cristiano Ronaldo?). Sus atributos privados son:
//• Pregunta, VotosA, VotosB
//El constructor recibirá la pregunta a inicializar. Las variables de los votos VotosA y VotosB se
//inicializarán en el constructor a cero, indicando con este valor que no se han emitido votos
//hasta el momento para ninguna de las dos respuestas. La pregunta no puede cambiarse una
//vez creada la encuesta y los votos se registran de uno en uno. Crea los siguientes métodos
//para gestionar los datos de la encuesta:
//• incA : Aumenta el número de votosA en 1
//• incB: Aumenta el número de votosB en 1
//• totalVotos: Devuelve la suma de los votos de las dos posibles respuestas.
//• porcentajeA: Devuelve el porcentaje de votosA.
//o (votosA/totalVotos)*100
//• porcentajeB: Devuelve el porcentaje de votosB.
//o (votosB/totalVotos)*100
//
//Las funciones que calculan el porcentaje pueden fallar si se ejecutan cuando el número total
//de votos es cero, puesto que se haría una división por cero. Obviamente si no existen votos los
//porcentajes deben devolver cero y evitar la división. Añade esta corrección a dichas funciones
//(PISTA: Emplea un condicional If).
//• En la función main():
//Crea un objeto de tipo Encuesta, muestra por pantalla los porcentajes de ambas respuestas.
//Incrementa el número de veces que quieras los votos de las dos respuestas y muestra por
//pantalla la pregunta, el total de votos, votas A, votos B y los porcentajes de ambas respuestas.

/*

class Encuesta (private var pregunta:String, private var votosA:Boolean, var votosB:Boolean) {

    var contador1 = 0
    var contador2 = 0
    var repeticion = 0
    var votacionesTotales = 0
    var votacA = 0
    var votacB = 0

    fun preguntar() {

        while (repeticion == 0) {
            println("$pregunta (responder con true or false)")
            println("Opción 1")
            votosA = readLine()!!.toBooleanStrict()
            println("Opción 2")
            votosB = readLine()!!.toBooleanStrict()

            if (votosA == true) {
                incA()
            } else if (votosB == true) {
                incB()
            } else if (votosA == false && votosB == false) {
                break
            }
            votosTotales()
        }

        println("Los resultados a la pregunta $pregunta son: ")
        println("Votos Cris $contador1")
        println("Votos Messi $contador2")
        println("Votos totales $votacionesTotales")
        println("El porcentaje de la 1ª respuesta es ${porcentajeA()}%")
        println("El porcentaje de la 2ª respuesta es ${porcentajeB()}%")

    }
    fun incA() {
        contador1 = contador1 + 1
    }

    fun incB() {
        contador2 = contador2 + 1
    }

    fun votosTotales() {
        votacionesTotales += 1
    }

    fun porcentajeA(): Int {
        votacA = contador1*100/votacionesTotales
        return votacA
    }

    fun porcentajeB(): Int {
        votacB = contador2*100/votacionesTotales
        return votacB
    }

}

fun main() {

    val crisOMessi = Encuesta("Quien es mejor? CR7 o M10?", false, false)

    crisOMessi.preguntar()
}

*/

// 2.- Crea una clase llamada EncedidoLuces que sirva para controlar el encendido automático de
//las luces de una fábrica. La fábrica está abierta de 8 a 23 horas. Las luces podrán encenderse y
//apagarse en 2 franjas horarias (no se tienen en cuenta los minutos), por lo que tendremos que
//manejar la siguiente información (atributos):
//• HoraEncendidoA, HoraApagadoA,FranjaHorariaAestablecida(Si/No)
//• HoraEncendidoB ,HoraApagadoB, FranjaHorariaBestablecida(Si/No)
//Crea esta clase para poder establecer las 2 franjas horarias teniendo en cuenta que:
//• Una hora de encendido debe ser posterior o igual a las 8 y una hora de apagado
//anterior o igual a las 23 horas
//• Una hora de apagado debe ser siempre posterior a la de encendido
//• Si la franja horaria B ha sido establecida la hora de apagado A debe ser anterior a la
//hora de encendido B.
//• La franja horaria B sólo puede establecerse una vez establecida la franja horaria A.
//• La hora de encendido B debe ser posterior a la hora de apagado A.
//Los atributos serán privados y el constructor no recibirá argumentos, inicializando
//correctamente los valores de las variables de la clase. Crear los siguientes métodos con los
//parámetros y valores a devolver que estimes oportunos:
//• establecerFranjaHorariaA
//• anularFranjaHorariaA
//• establecerFranjaHorariaB
//• anularFranjaHorariaB
//• encender: Nos indicará si hay que encender las luces o no según la hora actual.

// En la función main():
//• Crea un objeto de EncendicoLuces e intenta realizar las siguientes operaciones:
//o Establecer franja horaria A de 6 a 7. (No debe permitirlo).
//o Establecer franja horaria A de 16 a 14. (No debe permitirlo).
//o Establecer franja horaria B de 18 a 22. (No debe permitirlo).
//o Establecer franja horaria A de 8 a 14. (Debe permitirlo).
//o Establecer franja horaria B de 13 a 22. (No debe permitirlo).
//o Establecer franja horaria B de 16 a 23. (Debe permitirlo).
//o Establecer franja horaria A de 8 a 17. (No debe permitirlo).
//o Comprobar si las luces se deben encender.

/*
class EncendidoLuces(){

    private var horaEncendidoA=0
    private var horaApagadoA=0
    private var franjaHorariaAEstablecida:Boolean= false
    private var horaEncendidoB=0
    private var horaApagadoB=0
    private var franjaHorariaBEstablecida:Boolean= false


    fun establecerFranjaHorariaA(horaEncendidoA:Int, horaApagadoA:Int){
        if(horaEncendidoA>= 8 && horaEncendidoA<horaApagadoA && horaApagadoA<= 23 && franjaHorariaBEstablecida==false){
            franjaHorariaAEstablecida==true
            println("Se ha establecido la franja horaria A")
        }else {
            franjaHorariaAEstablecida ==false
            println("No es posible establecer la franja horaria")
        }
        encender(horaEncendidoA, horaApagadoA)
    }

    fun anularFranjaHorariaA(){
        if(horaApagadoA<= 23 && horaApagadoA < horaEncendidoB && franjaHorariaAEstablecida==true){
            franjaHorariaAEstablecida==false
        }
    }

    fun establecerFranjaHorariaB(horaEncendidoB:Int, horaApagadoB:Int){
        if(horaEncendidoB > horaApagadoA && franjaHorariaAEstablecida == false && encender==true){
            franjaHorariaBEstablecida==true
            println("Se ha establecido la franja horaria B")
        } else {
            franjaHorariaBEstablecida ==false
            println("No es posible establecer la franja horaria")
            horaEncendidoA >= 8 && horaApagadoA <= 23
        }
        encender(horaEncendidoB, horaApagadoB)
    }

    fun anularFranjaHorariaB(){
        if(horaApagadoB <= 23 && horaApagadoB > horaEncendidoB && franjaHorariaBEstablecida ==true){
            franjaHorariaBEstablecida ==false
        }
    }
    var  encender = false

    fun encender(horaEncendidoA: Int, horaApagadoA: Int) {
        if (horaEncendidoA >= 8 && horaEncendidoA< horaApagadoA ) {
            println("Hay que encender las luces")
            encender = true
        } else {
            println("No es necesario encender las luces")
            encender = false
        }
    }

    fun cargarDatos(EncendidoA: Int, ApagadoA: Int, EncendidoB:Int, ApagadoB:Int) {
        horaEncendidoA = EncendidoA
        horaApagadoA = ApagadoA
        horaEncendidoB = EncendidoB
        horaApagadoB = ApagadoB

        if (horaEncendidoA == 0 &&  horaApagadoA == 0) {
            establecerFranjaHorariaB(horaEncendidoB, horaApagadoB)
        } else if (horaEncendidoB == 0 && horaApagadoB == 0) {
            establecerFranjaHorariaA(horaEncendidoA, horaApagadoA)
        } else {
            establecerFranjaHorariaA(horaEncendidoA, horaApagadoA)
            establecerFranjaHorariaB(horaEncendidoB, horaApagadoB)
        }
    }
}

fun main(){
    val luz= EncendidoLuces()
  /*  luz.establecerFranjaHorariaA(6,7)

    luz.establecerFranjaHorariaA(16,14)

    luz.establecerFranjaHorariaB(18,22)

    luz.establecerFranjaHorariaA(8,14)//

    luz.establecerFranjaHorariaB(13,22)

    luz.establecerFranjaHorariaB(16,23)//

    luz.establecerFranjaHorariaA(8,17)*/

 //   luz.cargarDatos(6,7,0,0)
//    luz.cargarDatos(16,14,0,0)
 //   luz.cargarDatos(0,0,18,22)
   // luz.cargarDatos(8,14,0,0)
  //  luz.cargarDatos(8, 14, 13, 22)
  //  luz.cargarDatos(8, 14, 16, 23)
    luz.cargarDatos(8, 17, 0, 0)
}
*/

// Versión Martín

/*

class EncendidoLuces {
    private var horaEncendidoA: Int = 0
    private var horaEncendidoB: Int = 0
    private var horaApagadoA: Int = 0
    private var horaApagadoB: Int = 0
    private var franjaHorariaAestablecida: Boolean = false
    private var franjaHorariaBestablecida: Boolean = false

    fun anularFranjaHorariaA() {
        franjaHorariaAestablecida = false
    }

    fun anularFranjaHorariaB() {
        franjaHorariaBestablecida = false
    }

    fun establecerFranjaHorariaA(heA: Int, haA: Int) {
        if (heA>=8 && haA<=23){
            if(haA>heA){
                if(franjaHorariaAestablecida == true){
                    if(haA<horaEncendidoB) {
                        horaEncendidoA=heA
                        horaApagadoA=haA
                        franjaHorariaAestablecida = true
                    }else println("Error, la hora de apagado de A debe ser anterior a la hora de encendido B")
                }else {
                    horaEncendidoA=heA
                    horaApagadoA=haA
                    franjaHorariaAestablecida=true
                    println("Franja horaria A establecida de $heA a $haA")
                }
            }else println("Error, las horas de apagado debe ser posterior a la de encendido")

        }else println("Error, las horas deben de estar entre las 8 y las 23")

    }

    fun establecerFranjaHorariaB(heB: Int, haB: Int) {
        if(heB>=8 && haB<=23){
            if(haB>heB){
                if(franjaHorariaAestablecida == true){
                    if(heB>horaApagadoA){
                        horaEncendidoB=heB
                        horaApagadoB=haB
                        franjaHorariaBestablecida=true
                        println("Franja horaria B establecida de $heB a $haB")
                    }else println("Error, la hora de encendido de B debe ser posterior a la hora de apagado A")
                }else println("Error, solo puede estabecerse B si ha sido establecido A")
            }else println("Error, las horas de apagado debe ser posterior a la de encendido")
        }else println("Error, las horas deben de estar entre las 8 y las 23")
    }

    fun encender(horaActual: Int): Boolean{
        if (franjaHorariaAestablecida && horaActual>=horaEncendidoA && horaActual<horaApagadoA) return true
        else return franjaHorariaBestablecida && horaActual>=horaEncendidoB && horaActual<horaApagadoB
    }
}

fun main() {
    val luces1 = EncendidoLuces()
    luces1.establecerFranjaHorariaA(6,7)
    luces1.establecerFranjaHorariaA(16,14)
    luces1.establecerFranjaHorariaB(18,22)
    luces1.establecerFranjaHorariaA(8,14)
    luces1.establecerFranjaHorariaA(8,15)
    luces1.establecerFranjaHorariaB(13,22)
    luces1.establecerFranjaHorariaB(16,23)
    luces1.establecerFranjaHorariaA(8,17)

    if (luces1.encender(7)) println("Encender las luces");
    else println("No encender las luces");
}

*/

// 3.- Crea una clase Pelicula, con los siguientes miembros:
//• Atributos privados: Título, director, duración(en minutos)
//• Dos constructores, uno que inicializa sólo el título, y otro que inicializa todos los
//parámetros
//• Crea un método verDatos que muestre los datos de la película en pantalla. Dado que
//el primer constructor sólo inicializa el título, se podrá crear un objeto Película sin
//duración ni director, en caso de que no exista duración ni director, el método verDatos
//lo indicará por pantalla.
//En la función main():
//• Utilizando el primer constructor, crea un objeto Película con el título: “War Horse”
//• Crea un objeto Película con el título: “Gran Torino”, director: “Clint Eastwood”,
//duración:119 minutos.
//• Usando el método verDatos, muestra los datos de los dos objetos en pantalla.
//• Añade al primer objeto el director “Steven Spielberg” y la duración: 146 minutos.
//Muestra los datos por pantalla.
//• Añade un nuevo atributo privado llamado puntuación, para almacenar una puntuación
//para la película de 0 a 10 (con parte decimal). Se debe exigir que los valores para este
//atributo, estén siempre comprendidos entre 0 y 10, en caso de que se intente asignar
//un valor erróneo se mostrará un mensaje de error y no se establecerá dicho valor.
//• Modifica el método verDatos para que muestre también la puntuación.
//Parte 2 del ejercicio. Crea una nueva clase llamada Productora con los siguientes miembros:
//• Nombre, Página Web
//• Constructor que inicialice todos los parámetros
//• Método verDatos que muestre los valores de sus atributos por pantalla.
//• Ajusta ahora adecuadamente la clase Pelicula para que almacene obligatoriamente un
//objeto de tipo Productora. Modifica también el método verDatos, para muestre
//también los datos de la productora.
//En la función main(), a los dos objetos creados anteriormente añádeles los datos de sus
//productoras:
//• Para “War Horse”: “Dreamworks Pictures”, http://www.dreamworksstudios.com/
//• Para “Gran Torino”: “Warner Bros. Pictures”, http://www.warnerbros.com/
//Comprueba que se visualizan todos los datos de PELÍCULA Y PRODUCTORA.


// Crea una nueva clase llamada Productora con los siguientes miembros:
//• Nombre, Página Web
//• Constructor que inicialice todos los parámetros
//• Método verDatos que muestre los valores de sus atributos por pantalla.

// Versión Alex

/*

open class Productora (var nombre:String, var web: String) {
    constructor() : this("", "")

    open fun verDatos() {
        println("La productora es $nombre y su web $web")


    }

class Pelicula(private var titulo: String): Productora("","") { //: Productora("", "") {

    private var director: String = ""
    private var duracion: Int = 0
    private var puntuacion: Double = 0.0


    constructor(titulo: String, director: String, duracion: Int, puntuacion: Double, nombre: String, web: String, ) : this("") {

        this.titulo = titulo
        this.director = director
        this.duracion = duracion
        this.puntuacion = puntuacion
        this.nombre=nombre
        this.web=web
    }


    override fun verDatos() {
        puntos()
        println("La película $titulo")

        if (director == "") {
            println("No se sabe quien es el director")
        } else {
            println("Es del director $director")
        }

        if (duracion > 0) {
            println("Dura $duracion minutos")
        } else {
            println("No tiene una duración registrada")
        }

        println(puntos())

        super.verDatos()
    }

    fun puntos(): String {

        var texto = ""

        if (puntuacion in 0.0..10.0) {
            texto = "Tienen una puntuación de $puntuacion"
        } else {
            texto = "Error, la puntuación está fuera de los límites"
        }
        return texto
    }

}



fun main() {

    var pelicula1 = Pelicula("War Horse")
    var pelicula2 = Pelicula("Gran Torino", "Clint Eastwood", 119, 8.5, "DreamWorks", "www.")
    pelicula1.verDatos()
    pelicula2.verDatos()
    pelicula1= Pelicula("War Horse", "Steven Spielberg", 146, 18.0)
    pelicula1.verDatos()

}

 */

// Versión Martín

/*

class Pelicula(private var titulo: String, var productora: Productora) {

    private var director: String = ""
    private var duracion: Int = 0
    private var puntuacion: Double = 0.0

    constructor(titulo: String,productora: Productora, director: String, duracion: Int, puntuacion: Double): this(titulo, productora){
        this.director=director
        this.duracion=duracion
        this.puntuacion=puntuacion
        this.productora=productora
    }


    fun verDatos() {
        println("Pelicula: ")
        println("Título: $titulo")
        if (duracion == 0) println("La película no tiene duración asignada")
        else println("La duracion de la pelicula es $duracion")
        if (director == "") println("La película no tiene director asignado")
        else println("Director: $director")
        if (puntuacion<0 && puntuacion>10) println("La puntuación no es correcta")
        else println("la puntuación de la película: $puntuacion")
        productora.verDatos()
    }

}

class Productora(private var nombre: String, private var paginaWeb: String){

    fun verDatos() {
        println("La productora es: ")
        println("Nombre: $nombre")
        println("Página Web: $paginaWeb")
    }
}

fun main() {

    var productora1 = Productora("Dreamworks Pictures", "http://www.dreamworksstudio.com")
    productora1.verDatos()

    var pelicula1 = Pelicula("War Horse", productora1,"Steven Spielberg", 152, 9.5)
    var pelicula2 = Pelicula("Gran Torino", Productora("Warner Bros", "www.warnerbros.com"))

    pelicula1.verDatos()

}

*/

////////////////////////////////////////////////////
// Ejercicios de Clases Y Objetos
////////////////////////////////////////////////////

// 1.- Crea una clase Autor con los siguientes atributos privados:
//Nombre, Apellidos, año de nacimiento, país
//• Crea un constructor que inicialice los 2 primeros atributos
//• Crea un método para el año de nacimiento, añade la comprobación de que el
//año de nacimiento no sea superior al año actual. Si el año de nacimiento es
//correcto se guarda, si fuese superior al actual se muestra un mensaje de error
//en pantalla.
//• Crea un método verDatos(), que muestre los datos de la clase en pantalla.
//• Crea un método edad() que devuelva la edad del autor.
//Crea una clase Libro con los siguientes atributos privados:
//• Objeto Autor, ISBN, Titulo, número de páginas
//• Crea un constructor que reciba e inicialice los 3 primeros atributos.
//• Crea un método para el número de páginas, añade la comprobación para que el
//número de páginas sea positivo.
//• Crea un método verDatos, que muestro los datos de la clase en pantalla
//En la función main() crea los objetos necesarios para guardar la siguiente información:
//• Autor: “Carlos, Ruiz Zafón”,”25 de septiembre de 1964”, “España”
//• Libro de Carlos Ruiz Zafón: ISBN: “9788408105824”, Título: “El prisionero del
//Cielo”, páginas: 245
//• Intenta asignar como fecha de nacimiento el 1/1/2020 al objeto Autor y -100
//como número de páginas al objeto Libro.(Se deberían mostrar los errores por
//pantalla y no modificar el valor de los atributos)
//• Visualiza por pantalla los datos del libro (visualizará también los datos de su
//autor).

/*

class Autor(private var nombre: String, var apellidos: String) {

    private var nacimiento: Int = 0
    private var pais: String = ""

    constructor(nombre: String, apellidos: String, nacimiento: Int, pais: String) : this("", "") {
        this.nombre=nombre
        this.apellidos=apellidos
        this.nacimiento = nacimiento
        this.pais = pais
    }

    fun nacimi(): String {

        val calendar = Calendar.getInstance()
        val year = calendar[Calendar.YEAR]
        var texto = ""

        if (nacimiento > year) {
            texto="Error"
        }
        return texto
    }

    fun edad(): Int {
        var edad = 0
        var calendar = Calendar.getInstance()
        var year = calendar[Calendar.YEAR]
        edad = year - nacimiento

        return edad
    }

    fun verDatos() {

        nacimi()

        if (nacimi() == "Error") {
            println("ERROR!! - El año de nacimiento introducido es incorrecto")
        } else {
            println("Mengano se llama $nombre $apellidos, y nació en el $nacimiento en $pais")
            println("$nombre tiene ${edad()} años")
        }
    }
}

class Libro(private var autor: String, var ISBN: String, var titulo:String) {

    private var paginas: Int = 0

    constructor(autor: String, ISBN: String, titulo: String, paginas: Int) : this("", "", "") {
        this.autor = autor
        this.ISBN = ISBN
        this.titulo = titulo
        this.paginas = paginas
    }

    fun contarPagi(): String {
        var texto = ""
        if (paginas < 0) {
            texto = "Error"
        }
        return texto
    }
    fun verDatos() {

        contarPagi()

        if (contarPagi() == "Error") {
            println("ERROR!! - Los valores de las páginas son negativos")
        } else {
            println("El libro tiene de título $titulo")
            println("El ISBN es $ISBN")
            println("Cuenta con $paginas páginas")
        }
    }
}
fun main() {
    var autor1= Autor("Carlos", "Ruiz Zafón", 2020, "España" )
    autor1.verDatos()
    var libro1 = Libro("Carlos", "9788408105824", "El prisionero del Cielo", 245)
    libro1.verDatos()
    autor1= Autor("Carlos", "Ruiz Zafón", 2023, "España")
    autor1.verDatos()
    libro1= Libro("Carlos", "9788408105824", "El prisionero del Cielo", -100)
    libro1.verDatos()
}

*/

// 2.-Crea una clase llamada SocioClub:
//Tendrá los siguientes atributos definidos como private:
//dni, nombre, apellidos, y cuotaMensual
//• Crea tres constructores:
//o El primero que sólo inicialice el DNI, otro los tres primeros atributos y el
//tercero que inicialice todos los atributos.
//
//• Crea un método verSocio que muestre por pantalla los datos del socio.
//• Crea un método controlDNI(), para que impida asignar un DNI de una longitud
//distinta a nueve caracteres, en caso de que se intente asignar un DNI de una
//longitud diferente a nueve caracteres, mostraremos un mensaje de error y no
//se asignará dicho DNI. (Nota: Emplea la función .length que devuelve la longitud/número
//de caracteres de un String.)
//• Crea el metodo controlCuota() similar al de controlDNI() pero en este caso para
//evitar asignar valores negativos en la cuotaMensual del socio.
//En la función main(), crea dos objetos de la clase SocioClub, utilizando los valores y
//constructores que quieras e imprime sus datos utilizando el método verSocio.
//Haciendo uso de alguno de los objetos, intenta asignar un DNI y una cuota incorrectos
//y comprueba que efectivamente se evita su asignación y no se modifica el valor actual
//de sus atributos.

/*

class SocioClub(private var dni: String) {

    private var apellidos: String = ""
    private  var coutaMensual: Double = 0.0

    constructor(dni: String, apellidos: String) : this("") {
        this.dni=dni
        this.apellidos=apellidos
    }
    constructor(dni: String, apellidos: String, coutaMensual: Double) : this("", "") {
        this.dni=dni
        this.apellidos=apellidos
        this.coutaMensual = coutaMensual
    }


    // Crea un método controlDNI(), para que impida asignar un DNI de una longitud
    //distinta a nueve caracteres, en caso de que se intente asignar un DNI de una
    //longitud diferente a nueve caracteres, mostraremos un mensaje de error y no
    //se asignará dicho DNI. (Nota: Emplea la función .length que devuelve la longitud/número
    //de caracteres de un String.)

    fun controlDNI(): String {
        var brumBrum = ""
        if ( dni.length != 9 ) {
            brumBrum = "Error"
        } else {
            brumBrum = dni
        }
        return brumBrum
    }


    fun controlCuota(): Int {
        var brumBrum = 0
        if ( coutaMensual < 0 ) {
            brumBrum = 0
        } else {
            brumBrum = 2
        }
        return brumBrum
    }


    fun verSocio() {
        if (controlDNI() == "Error") {
            println("ERROR!! - Faltan o sobran caracteres en el campo DNI")
        } else if (controlCuota() == 0) {
                println("La cuota no puede ser negativa")
            } else {
                println("El DNI del socio es $dni, sus apellidos son $apellidos y su cuota mensual son " +
                        "$coutaMensual€")
                }
    }

}

fun main() {
    var socio1 = SocioClub("12345678A", "Pérez Álvarez", 79.5)
    var socio2 = SocioClub("123456789A", "Pérez Álvarez", 79.5)
    var socio3 = SocioClub("1789A", "Pérez Álvarez", 79.5)
    var socio4 = SocioClub("12345678A", "Pérez Álvarez", -79.5)
    var socio5 = SocioClub("178A", "Pérez Álvarez", -79.5)

    socio1.verSocio()
    println("////////////////////////")
    socio2.verSocio()
    println("////////////////////////")
    socio3.verSocio()
    println("////////////////////////")
    socio4.verSocio()
    println("////////////////////////")
    socio5.verSocio()
}

*/


// Ejercicios de repaso
//
//1. Dados 4 números, es decir 4 valores. Crear una función que siempre me devuelva el valor mayor.
//

// Versión Alex

/*

fun main() {

    println("Introduce el primer valor: ")
    var valor1 = readLine()!!.toInt()
    println("Introduce el segundo valor: ")
    var valor2 = readLine()!!.toInt()
    println("Introduce el tercer valor: ")
    var valor3 = readLine()!!.toInt()
    println("Introduce el cuarto valor: ")
    var valor4 = readLine()!!.toInt()

    if (valor1 > valor2 && valor1 > valor3 && valor1 > valor4) {
        println("El valor 1, el $valor1, es el mayor")
    } else if (valor2 > valor1 && valor2 > valor3 && valor2 > valor4) {
        println("El valor 2, el $valor2, es el mayor")
    } else if (valor3 > valor1 && valor3 > valor2 && valor3 > valor4) {
        println("El valor 3, el $valor3, es el mayor")
    } else {
        println("El valor 4, el $valor4, es el mayor")
    }
}

*/
// Opción 2
/*
fun main() {

    var valorGrande = 0
    var contador = 0

    while (contador < 4) {
        println("Introduce un número:")
        var numero = readLine()!!.toInt()

        if (numero > valorGrande) {
            valorGrande = numero
        }
        contador++
    }
    println("El número más grande es $valorGrande")
}

*/

// VersionES Tati

// Opción 3

/*fun main(){
   val num1=100
   val num2=8
   val num3=47
   val num4=89

   fun calculaMayor(){
       var maximo =0
       if(num1> maximo) maximo=num1
       if(num2> maximo) maximo=num2
       if(num3> maximo) maximo=num3
       if(num4> maximo) maximo=num4

       println(maximo)
   }
   calculaMayor()
}*/

// Opción 4

/*fun main(){
   val num1=(0..999).random()
   println(num1)
   val num2=(0..999).random()
   println(num2)
   val num3=(0..999).random()
   println(num3)
   val num4=(0..999).random()
   println(num4)

   fun calculaMayor(){
       var maximo =0
       if(num1> maximo) maximo=num1
       if(num2> maximo) maximo=num2
       if(num3> maximo) maximo=num3
       if(num4> maximo) maximo=num4

       println("El valor máximo es $maximo")
   }
   calculaMayor()
}
*/

// Versión Profe

/*

fun main() {
    val num1 = 100
    val num2 = 8
    val num3 = 47
    val num4 = 89

    fun calculaMayor(): Int {
        var maximo = num1
        if(num2>maximo) maximo = num2
        if(num3>maximo) maximo = num3
        if(num4>maximo) maximo = num4
        return maximo
    }

    println(calculaMayor())

}

*/

//2. Crear una clase persona que tenga de atributos un nombre y un número asociado
// (entre 1 y 100), además añadir un método que sirva para calcular la persona con el número más
// alto y devuelva el nombre de esa persona, y otro método que sirva para mostrar los datos de la
// persona.

/*

class Persona(var nombre:String, var numAsociado:Int){

    fun numAsociadoCorrecto():Boolean {

        if (numAsociado in 1..100) {
            return true
        } else {
            return false
        }
    }

    fun verDatos() {

        if (numAsociadoCorrecto() == true) {
            println("Se llama $nombre y su número de asociado es $numAsociado")
        } else {
            println("Número incorrecto")
        }
    }
}

fun main() {
    var persona1 = Persona("Peter1", 97)
//    persona1.verDatos()
//    println("/////////////////")
    var persona2 = Persona("Peter2", 72)
//    persona2.verDatos()
//    println("/////////////////")
    var persona3 = Persona("Peter3", 3)
//    persona3.verDatos()
//    println("/////////////////")
    var persona4 = Persona("Peter4", 23)
//    persona4.verDatos()
//    println("////////////////////////")
    var persona5 = Persona("Peter5", 616) // Error
    persona5.verDatos()
    println("////////////////////////")
//    println("Sacar el máximo: ")

    var valorGrande = 0
    var contador = 0

    while (contador < 5) {
        when {
            (valorGrande < persona1.numAsociado) -> valorGrande = persona1.numAsociado
            (valorGrande < persona2.numAsociado) -> valorGrande = persona2.numAsociado
            (valorGrande < persona3.numAsociado) -> valorGrande = persona3.numAsociado
            (valorGrande < persona4.numAsociado) -> valorGrande = persona4.numAsociado
        }
        contador++
    }

    when {
        (valorGrande == persona1.numAsociado) -> persona1.verDatos()
        (valorGrande == persona2.numAsociado) -> persona2.verDatos()
        (valorGrande == persona3.numAsociado) -> persona3.verDatos()
        (valorGrande == persona4.numAsociado) -> persona4.verDatos()
    }
}

*/

// Versión Tati

/*

class Persona2(val nombre:String,  val num:Int){

    fun numCorrecto():Int{
        if(num in (1..100)) {
            return num
        } else {
            return 0
        }
    }

    fun imprimir(){
        if (numCorrecto() > 0) {
            println("El nombre es $nombre y su número asociado es $num")
        } else {
            println("El número asociado a la persona no es correcto")
        }
    }
}

fun main(){
    val personas: Array<Persona2> = arrayOf(Persona2("Pepito", 25),
        Persona2("Pepita", 26), Persona2("Pupote", 5),
        Persona2("Pepe", 12))


    fun maximo() {
        var maximo = personas[0]
        for (i in personas.indices) {
            if (personas[i].numCorrecto() > maximo.numCorrecto())
                maximo = personas[i]
        }
        maximo.imprimir()
    }
    maximo()
}

*/

// Versión Profe

/*

class Person (private var nombre: String, private var numero: Int){

    fun obtenNumero() = numero

    fun verDatos() {
        println("Nombre: $nombre")
        println("Numero: $numero")
    }
}

fun main() {
    val persona1 = Person("Martin", 89)
    val persona2 = Person("Carlos", 12)
    val persona3 = Person("Juan", 99)
    val persona4 = Person("Matias",35)

    fun calcularMayor(): Person {
        var maximo = persona1
        if(persona2.obtenNumero()>maximo.obtenNumero()) maximo = persona2
        if(persona3.obtenNumero()>maximo.obtenNumero()) maximo = persona3
        if(persona4.obtenNumero()>maximo.obtenNumero()) maximo = persona4
        return maximo
    }

    calcularMayor().verDatos()

    //A partir de aqui es con Array
    val arrayPersonas = arrayOf(persona2,persona4, Person("Lourdes", 55))

    fun calculaMayor2(arrayList: Array<Person>): Person {
        var maximo = arrayPersonas[0]
        for(i in arrayPersonas.indices){
            if(arrayPersonas[i].obtenNumero()>maximo.obtenNumero()) maximo = arrayPersonas[i]
        }
        return maximo
    }

    calculaMayor2(arrayPersonas)
}

*/

////////////////////////////////////////////////////
// Examen
////////////////////////////////////////////////////

// 2. Realiza o seguinte programa seguindo as instrución que aparecen a countinuación:

// Crea unha clase chamada Xogador, esta clase terá os seguintes atributos privados:
//• Nome, Apelidos, Dorsal e Media de Puntos por partido.
//• O constructor principal debe incluír todos os atributos.
//• Crea un método que verifique que a media de puntos por partidos sexa positivo, e en
//caso contrario devolva 0.
//• Crea un método que comprobe que o dorsal se atopa entre 1 e 100, en caso contrario
//imprima unha mensaxe de “ERRO: O dorsal ten que estar entre 1 e 100”.
//• Crea un método chamado amosarDatos() que permita visualizar todos os atributos do
//xogador.



// Crea unha clase chamada EquipoXogadores cos seguintes atributos privados:
//Nome, Data de fundación (ano) e Cinco xogadores (xogador1, xogador2, xogador3, xogador4 e
//xogador5)
//• O construtor principal só debe incluír o nome do equipo.
//• Crea un método que verifique que a data de fundación (ano) sexa menor que a data
//actual e maior que 1891 (ano de invención do baloncesto), en caso contrario imprimir
//unha mensaxe de erro.
//• Crea un método chamado amosarDatos() que permita visualizar os datos do equipo
//(Nome e Ano de fundación) e dos seus cinco xogadores (Nome, Apelidos, Dorsal e
//Media).
//• Crea un método chamado maximoAnotador() que calcule cal é o xogador coa media de
//puntos por partido máis alta e devolva ese xogador. Para iso é aconsellable empregar a
//estrutura condicional if.

//Na función main():
//• Crea 5 obxectos xogadores de clase Xogador.
//• Crea un obxecto de Equipo e asígnalle eses cinco xogadores. Mostra por pantalla os
//datos do equipo e os seus 5 xogadores.
//• Mostra por pantalla os datos do máximo anotador.
//(1 punto) Na función main() almacena nun array de 5 elementos os 5 xogadores, en lugar de en
//5 variables. A continuación, realiza unha función que calcule cal é o xogador coa media de
//puntos por partido máis alta e devolve ese xogador.

/*

class Xogador(private var nome:String, private var apelidos:String, private var dorsal:Int, private var puntos:Int) {

    fun mediaPuntos():Int {
        if (puntos >= 0) {
            return puntos
        } else {
            return 0
        }
    }

    fun comprobarDorsal(): Boolean {
        if (dorsal in 1..100) {
            return true
        } else {
            return false
        }
    }

    fun amosarDatos() {
        if (comprobarDorsal() == true && mediaPuntos() != 0) {
            println("O xogador $nome $apelidos")
            println("Ten o dorsal $dorsal e a súa media de puntos por partido é de $puntos puntos")
        } else if (mediaPuntos() == 0) {
            println("O valor ten que ser positivo")
        } else {
            println("ERRO: O dorsal ten que estar entre 1 e 100")

        }
    }
}

class EquipoXogadores(private var nome:String) {
    private var fundacion:Int=0
    private var xogador1:Xogador= Xogador("","",0,0)
    private var xogador2:Xogador= Xogador("","",0,0)
    private var xogador3:Xogador= Xogador("","",0,0)
    private var xogador4:Xogador= Xogador("","",0,0)
    private var xogador5:Xogador= Xogador("","",0,0)


    constructor(nome: String,
                fundacion:Int,
                xogador1: Xogador,
                xogador2: Xogador,
                xogador3: Xogador,
                xogador4: Xogador,
                xogador5: Xogador):this(nome){
        this.fundacion=fundacion
        this.xogador1=xogador1
        this.xogador2=xogador2
        this.xogador3=xogador3
        this.xogador4=xogador4
        this.xogador5=xogador5
    }

    fun verificarFundacion():Boolean {
        if (fundacion < 2022 && fundacion >= 1891) {
            return true
        } else {
            return false
        }
    }

    fun maximoAnotador() {
        var puntosXog1= xogador1.mediaPuntos()
        var puntosXog2= xogador1.mediaPuntos()
        var puntosXog3= xogador1.mediaPuntos()
        var puntosXog4= xogador1.mediaPuntos()
        var puntosXog5= xogador1.mediaPuntos()

        var maximo=0

        for (i in 1..5) {
            when {
                (maximo<puntosXog1) -> maximo=puntosXog1
                (maximo<puntosXog2) -> maximo=puntosXog2
                (maximo<puntosXog3) -> maximo=puntosXog3
                (maximo<puntosXog4) -> maximo=puntosXog4
                (maximo<puntosXog5) -> maximo=puntosXog5
            }
        }

        when {
            (maximo == puntosXog1) -> {
                xogador1.amosarDatos()
                }
            (maximo == puntosXog2) -> {
                xogador2.amosarDatos()
                }
            (maximo == puntosXog3) -> {
                xogador3.amosarDatos()
                }
            (maximo == puntosXog4) -> {
                xogador4.amosarDatos()
                }
            (maximo == puntosXog5) -> {
                xogador5.amosarDatos()
                }
        }
    }

    fun amosarDatos() {

        if (verificarFundacion() == true) {
            println("O equipo $nome, fundouse no $fundacion")
            println()
            println("O quinteto principal está formado por: ")
            println()
            print("---  ")
            xogador1.amosarDatos()
            print("---  ")
            xogador2.amosarDatos()
            print("---  ")
            xogador3.amosarDatos()
            print("---  ")
            xogador4.amosarDatos()
            print("---  ")
            xogador5.amosarDatos()
        } else {
            println("O ano de fundación é incorrecto")
        }

    }
}

fun main() {
    var xogador1= Xogador("LeBron", "James", 6, 48)
    var xogador2= Xogador("Kobe", "Bryant", 24, 45)
    var xogador3= Xogador("Shaq", "O´Neal", 34, 30)
    var xogador4= Xogador("Pau", "Gasol", 16, 30)
    var xogador5= Xogador("Larry", "Bird", 32, 40)

    //var xogador6= Xogador("Michael", "Jordan", 223, 40) // Error dorsal
    //var xogador7= Xogador("Michael", "Jordan", 23, -40) // Error puntos

    //xogador6.amosarDatos()    // Ten que dar: "ERRO: O dorsal ten que estar entre 1 e 100"
    //xogador7.amosarDatos()      // Ten que dar: "O valor ten que ser positivo"
    //println("/////////////////////////////")

    var equipo1= EquipoXogadores("Los Ángeles Lakers", 1903,
        xogador1,xogador2, xogador3, xogador4, xogador5)

    //var equipo2= EquipoXogadores("Los Ángeles Lakers", 1803,
       // xogador1,xogador2, xogador3, xogador4, xogador5)                    // Ten que fallar na fundación

    //equipo2.amosarDatos() // Ten que dar: "O ano de fundación é incorrecto"

    equipo1.amosarDatos()
    println()
    println("/////////////////////////////")
    println()
    println("O máximo anotador do equipo é:")
    equipo1.maximoAnotador()

    println()
    println("/////////////////////////////")
    println()

    val arrayXogadores = arrayOf(xogador1,xogador2, xogador3, xogador4, xogador5)

    fun calculaMayor2(arrayList: Array<Xogador>) {
        var maximo = 0

        for (i in arrayXogadores.indices) {
            var puntos = arrayXogadores[i].mediaPuntos()
            if (maximo < puntos) {
                maximo = puntos
            }
        }
        println("Os datos do xogador con máis puntos son os seguintes:")
        when {
            (maximo == arrayXogadores[0].mediaPuntos()) -> {
                xogador1.amosarDatos()
            }
            (maximo == arrayXogadores[1].mediaPuntos()) -> {
                xogador2.amosarDatos()
            }
            (maximo == arrayXogadores[2].mediaPuntos()) -> {
                xogador3.amosarDatos()
            }
            (maximo == arrayXogadores[3].mediaPuntos()) -> {
                xogador4.amosarDatos()
            }
            (maximo == arrayXogadores[4].mediaPuntos()) -> {
                xogador5.amosarDatos()
            }
        }

    }
    calculaMayor2(arrayXogadores)
}

*/

////////////////////////////////////////////////////
// Ejercicio de repaso Herencias
////////////////////////////////////////////////////


//Crea una clase Persona que contenga los siguientes atributos en su
//constructor:
//• DNI
//• Nombre
//• Apellidos
//• Edad
//En la clase escribir un método que compruebe si la persona es o no mayor
//de edad.
//Crea una segunda clase Empleado que contenga los mismos atributos que
//la clase Persona y además contenga el atributo salarioBruto.
//En esta clase escribir además del método para que compruebe si el
//empleado es mayor de edad o no, añadir un método en el se obtenga el
//salarioNeto (salarioNeto = salarioBruto – salarioBruto*0.12).
//1) Realiza el ejercicio sin herencias.
//2) Realiza el ejercicio de modo que la clase Empleado herede de la
//clase Persona.

/*

class Persona (var DNI:String, var nombre:String, var apellidos: String, var edad:Int) {

    fun calcularEdad():String {
        if (edad >= 18) {
            return "mayor de edad"
        } else {
            return "menor de edad"
        }
    }


    fun verDatos() {
        println("El chavo se llama $nombre, $apellidos. Su DNI es $DNI y tiene $edad años")
        println("Por lo tanto es ${calcularEdad()}.")
    }
}

class Empleado(var persona: Persona, var salarioBruto: Double) {

    var salarioNeto = 0.0

    fun calcularSalario() {
        if (persona.calcularEdad() == "mayor de edad") {
            salarioNeto = salarioBruto - (salarioBruto * 0.12)
            println("El salario neto es: $salarioNeto")
        } else {
            println("El chavo es menor")
        }
    }
}

fun main() {


    var persona1 = Persona("12345678A", "Pepito", "Pérez", 18);
    persona1.verDatos()
    var persona2 = Persona("12345678A", "Pepita", "Pérez", 16);
    persona2.verDatos()

    var empleado1= Empleado(persona1, 1176.23)
    empleado1.calcularSalario()
    var empleado2= Empleado(persona2, 1176.23)
    empleado2.calcularSalario()

}

*/

// Versión Martín

/*

class Persona (private val DNI: String, private val nombre: String, private val apellidos: String, private val edad: Int){

    fun mayorEdad(): Boolean {
        return edad>18
    }
}

class Empleado ( private val DNI: String, private val nombre: String, private val apellidos: String, private val edad: Int, private val salarioBruto: Double) {


    fun mayorEdad(): Boolean {
        return edad>18
    }

    fun salarioNeto(): Double {
        return salarioBruto - salarioBruto*0.12
    }

}

fun main(){
    val persona1 = Persona("45863938F", "Ana", "vazquez", 34)
    val empleado1 = Empleado("73737373G", "Juan", "Fernandez", 32, 1450.0)

    println("La persona es mayor de edad: ${persona1.mayorEdad()}")
    println("El salario neto del empleado es ${empleado1.salarioNeto()}")
}

*/




// Con herencia

/*

open class Persona (var DNI:String, var nombre:String, var apellidos: String, var edad:Int) {

    open fun calcularEdad():String {
        if (edad >= 18) {
            return "menor de edad"
        } else {
            return "menor de edad"
        }
    }


    open fun verDatos() {
        println("El chavo se llama $nombre, $apellidos. Su DNI es $DNI y tiene $edad años")
        println("Por lo tanto es ${calcularEdad()}.")
    }
}

class Empleado(DNI:String, nombre:String, apellidos: String, edad:Int, var salarioBruto: Double): Persona(DNI, nombre, apellidos, edad ) {

    var salarioNeto = 0.0

    override fun verDatos() {
        calcularSalario()
        super.verDatos()
        println("Cobra $salarioNeto")
    }

    fun calcularSalario() {
        if (edad >= 18) {
            salarioNeto = salarioBruto - (salarioBruto * 0.12)
            println("El salario neto es: $salarioNeto")
        }
    }
}

fun main() {

    var empleado1= Empleado("12345678A", "Pepito", "Pérez", 16, 1176.23)
    empleado1.verDatos()

}

*/

// Versión Martín

/*

open class Persona (private val DNI: String,
                    private val nombre: String,
                    private val apellidos: String,
                    private val edad: Int){

    open fun mayorEdad(): Boolean {
        return edad>18
    }
}

class Empleado ( DNI: String,
                 nombre: String,
                 apellidos: String,
                 edad: Int,
                 private val salarioBruto: Double): Persona(DNI, nombre, apellidos,edad) {


    fun salarioNeto(): Double {
        return salarioBruto - salarioBruto*0.12
    }

}

fun main(){
    val persona1 = Persona("45863938F", "Ana", "vazquez", 34)
    val empleado1 = Empleado("73737373G", "Juan", "Fernandez", 32, 1450.0)

    println("La persona es mayor de edad: ${persona1.mayorEdad()}")
    println("La persona es mayor de edad: ${empleado1.mayorEdad()}")
    println("El salario neto del empleado es ${empleado1.salarioNeto()}")
}

*/

// EJERCICIO REPASO HERENCIA


//Para gestionar una tienda de mascotas, define una clase padre/superclase llamada Mascota
//con los siguientes atributos públicos en el constructor:
//• nombre, numPatas, raza
//• Define dos clases hijas/subclases/derivadas de Mascota, llamadas Perro y Loro. A la
//clase Perro añádele un atributo público patita (Boolean) para saber si el perro sabe dar
//la pata o no y a Loro añádele el atributo público habla (Boolean) para indicar si saben
//hablar (aunque puedan no todos saben hablar).
//En la función main() crea los siguientes objetos:
//• Un perro llamado “Lucky” de raza “bóxer” que sabe dar la patita.
//• Un loro llamado “Andresito” de raza “cacatúa” que, como tal, sabe hablar.
//• Obviamente habrá́que indicar correctamente el número de patas en ambos objetos (y
//sabemos que ninguna mascota ha sufrido amputaciones)

//Surge la necesidad de guardar el precio sin IVA de las mascotas. ¿En qué clase sería correcto
//añadir este nuevo atributo?
//• Define este atributo en la clase apropiada y en dicha clase define también un método
//llamado “pvp()” que calcule y devuelva el precio con el IVA añadido.
//• “Lucky” se vende por 380€ y “Andresito” por 110€, precios sin IVA.
//• Muestra por pantalla el pvp de las dos mascotas.

//Una vez hecho esto convierte todos los atributos de la clase Mascota a privados. Después de
//haber hecho esto tendremos varios errores en la función main(). ¿Por qué? ¿A que se deben
//los errores? ¿ Como los solucionarías?
//En la case Mascota, sobrescribe el método:

//Es un método heredado de clase padre Object (clase de Kotlin, padre de todas las clases). Este
//método se utiliza para devolver en formato String una representación de los valores de los
//atributos de una clase. Por defecto lo único que hace es mostrar el nombre de la clase y su
//referencia en memoria.

//Haz que el método toString() devuelva un String, con todos los valores de los atributos de la
//clase Mascota.
//Nota: Si una clase tiene implementado el método toString(), es posible imprimir directamente
//un objeto. Ejemplo, suponiendo que “p” es un objeto de tipo Perro: println(p); , pues realmente
//lo que hará Kotlin automáticamente, será: println(p.toString());
//• Queremos que el método “toString()” aparte de mostrar todos los datos, cuando el
//objeto sea de tipo Perro nos indique si da la patita o no y si el objeto es de tipo Loro
//nos indique si habla o no.
//o Para lograrlo, tendremos que redefinir/sobrescribir adecuadamente el método
//“toString()” en las clases Perro y Loro. No olvides colocar la palabra reservada
//Override. Para ello, llama en primer lugar al método del padre con la palabra
//reservada super para obtener los datos de la clase padre Mascota.
//• Queremos saber el color de las mascotas, añade este atributo en la clase que
//corresponda y modifica todos los constructores para inicializar dicho atributo.
//o Modifica también el método “toString()” para que muestre ahora también el
//color.
//o Ajusta ahora la creación de los objetos en el programa. “Lucky” es marrón y
//“Andresito” verde.
//o Comprueba que se visualizan correctamente todos los datos.

/*

open class Mascota(private var nombre:String, private var numPatas:Int, private var raza:String, private var precioSinIVA: Double, private var color:String) {

    var precioConIVA = 0.0

    open fun pvp() {
        precioConIVA = precioSinIVA + (precioSinIVA * 0.21)
        //println("$nombre se vende por $precioSinIVA, precio sin IVA")
        //println("El pvp de $nombre es $precioConIVA")
    }

    override fun toString(): String {
        pvp()
        return "La masocta se llama $nombre, es de raza $raza, de color $color, tiene $numPatas patas, cuesta $precioConIVA"
    }

    class Perro(nombre: String, numPatas: Int, raza: String, private var patita:Boolean, precioSinIVA: Double, color: String): Mascota(nombre, numPatas, raza, precioSinIVA, color) {

        override fun pvp(){
            super.pvp()
        }

        override fun toString(): String {
            if (pata() == true) {
                return "${super.toString()} y el perrete sabe dar la pata"
            } else {
                return "${super.toString()} y el perrete no sabe dar la pata"
            }
        }

        fun pata(): Boolean {
            return patita
        }

    }

    class Loro(nombre: String, numPatas: Int, raza: String, private var habla:Boolean, precioSinIVA: Double, color: String): Mascota(nombre, numPatas, raza, precioSinIVA, color) {

        override fun toString(): String {
            if (hablar() == true) {
                return "${super.toString()} y el lorito sabe hablar"
            } else {
                return "${super.toString()} y el lorito no sabe hablar"
            }
        }
        fun hablar(): Boolean {
            return habla
        }
    }
}

fun main() {
    var perro1 = Mascota.Perro("Lucky", 4, "Bóxer", true, 380.0, "marrón");
    //perro1.pvp();
    println(perro1)
println("//////////////")
    var lorito1 = Mascota.Loro("Andresito", 2, "Cacatúa", true, 110.0, "verde");
    //lorito1.pvp();
    println(lorito1)
}

*/

// Versión Profe

/*

open class Mascota(private val nombre: String, private val numPatas: Int, private val raza: String, private val precio:Float, private val color: String){


    open fun pvp(): Float{
        val IVA: Float = 21/100f
        return (precio + precio*IVA)
    }

//open fun nombre() = nombre

/*override fun toString(): String {
return super.toString()
}*/

    override fun toString(): String {
        return "El nombre de la mascota es $nombre, con $numPatas patas, de raza $raza, el color es $color y precio ${pvp()} €"
    }

}

class Perro(nombre: String, numPatas: Int, raza: String, val patita: Boolean, precio: Float, color: String): Mascota(nombre,numPatas,raza,precio, color){



    override fun toString(): String {
        if (patita==true) return "${super.toString()} y sabe dar la patita"
        else return "${super.toString()} y no sabe dar la patita"
    }

}

class Loro(nombre: String, numPatas: Int, raza: String, val habla: Boolean, precio: Float, color: String): Mascota(nombre,numPatas,raza,precio, color){

    override fun toString(): String {
        if (habla==true) return "${super.toString()} y sabe hablar"
        else return "${super.toString()} y no sabe hablar"
    }

}

fun main() {
    val perro1 = Perro("Lucky", 4, "Boxer", true, 380f, "marrón")
    val loro1 = Loro("Andresito", 2, "cacatúa", true, 110f, "verde")

//println("El precio del perro es ${perro1.pvp()} €")
//println(loro1.pvp())

    println(perro1)
    println(loro1)
}

*/

// Ejercicio 2 Repaso Herencias

//La facturación del agua, puede ser de 2 tipos, con los siguientes elementos comunes:
// No factura
// Fecha (guardarla como String)
// DNI-Cliente
// Precio metro cúbico
// Metros cúbicos consumidos
// Importe por consumo = metros cúbicos consumidos x precio metro cúbico
// Importe por saneamiento (uso del alcantarillado)
// Importe por residuales (depuración de agua)
// Total factura = importe consumo + importe saneamiento + importe residuales.
//El primer tipo de factura, corresponde a facturas para familias numerosas de tipo A, y este
//caso el total es la suma del consumo, pero con un descuento fijo del 20% en los importes de
//saneamiento y residuales
//El segundo tipo de factura, corresponde a familias numerosas de tipo B, y en este caso el total
//es la suma del consumo, pero tienen un descuento fijo del 75% en el importe de saneamiento
//y otro fijo del 50% en el importe de residuales.
//Diseña las clases que estimes oportunas. En el programa crea tres facturas, una para un
//cliente normal, otra para familia numerosa de tipo A y otra para familia numerosa de tipo B,
//con los datos que estimes oportunos. Muestra su importe final y chequea que el cálculo sea
//correcto en los tres casos.

/*

open class Agua(var numFactura:Int,
           var fecha:String,
           var DNI:String,
           var precioM3:Double,
           var m3Consumidos:Double,
           var importSaneamiento:Double,
           var importResiduales:Double) {

    var importePorConsumo = m3Consumidos * precioM3
    var totalFactura = importePorConsumo + importSaneamiento + importResiduales

    open fun verDatos(){
        println("La factura con número $numFactura, en fecha $fecha, paga un total de $totalFactura")
    }

    constructor(numFactura: Int,
                fecha: String,
                DNI: String,
                precioM3: Double,
                m3Consumidos: Double,
                importSaneamiento: Double,
                importResiduales: Double,
                importePorConsumo:Double,
                totalFactura:Double):this(numFactura, fecha, DNI, precioM3, m3Consumidos, importSaneamiento, importResiduales){
                    this.importePorConsumo = importePorConsumo
                    this.totalFactura = totalFactura
                }


    class FamiliasNumerosasA(
        numFactura: Int,
        fecha: String,
        DNI: String,
        precioM3: Double,
        m3Consumidos: Double,
        importSaneamiento: Double,
        importResiduales: Double,
        importePorConsumo:Double,
        totalFactura:Double
    ): Agua(numFactura, fecha, DNI, precioM3, m3Consumidos, importSaneamiento, importResiduales, importePorConsumo, totalFactura) {

        fun consumo(){
            importePorConsumo = m3Consumidos * precioM3
            totalFactura = importePorConsumo + importSaneamiento - (importSaneamiento * 0.2) + importResiduales - (importResiduales * 0.2)
        }

        override fun verDatos(){
            consumo()
            super.verDatos()
        }
    }

    class FamiliasNumerosasB(
        numFactura: Int,
        fecha: String,
        DNI: String,
        precioM3: Double,
        m3Consumidos: Double,
        importSaneamiento: Double,
        importResiduales: Double,
        importePorConsumo:Double,
        totalFactura:Double
    ): Agua(numFactura, fecha, DNI, precioM3, m3Consumidos, importSaneamiento, importResiduales, importePorConsumo, totalFactura) {

        fun consumo(){
            importePorConsumo = m3Consumidos * precioM3
            totalFactura = importePorConsumo + importSaneamiento - (importSaneamiento * 0.75) + importResiduales - (importResiduales * 0.5)
        }

        override fun verDatos(){
            consumo()
            super.verDatos()
        }
    }
}
fun main() {
    var x = Agua(626, "31/03/2022", "12345678A", 1.91, 15.4, 10.0, 15.0)
    x.verDatos()


    var y = Agua.FamiliasNumerosasA(627, "31/03/2022", "12345678B", 1.91, 15.4, 10.0, 15.0,0.0,0.0)
    y.verDatos()

    var z = Agua.FamiliasNumerosasB(625, "31/03/2022", "12345678C", 1.91, 15.4, 10.0, 15.0, 0.0, 0.0)
    z.verDatos()
}

*/

// Versión Tati

/*

open class Factura(private val numFactura:Int, private val fecha:String, private val DNICliente:String,
                    private val preciom3:Float, private val m3Consumidos:Float, private val saneamiento:Float,
                    private val residuales:Float) {

   private var importeConsumido: Float = 0f
   private var total: Float = 0f

   open fun precioPagar() {
       importeConsumido = preciom3 * m3Consumidos
       total = importeConsumido + saneamiento + residuales
       println(" debe pagar un importe de $total")
   }

   open fun imprimir() {
       print("El cliente con número de factura $numFactura que corresponde a la fecha $fecha, cuyo dni es $DNICliente")
       precioPagar()
   }
}

class FacNumerosaA(numFactura: Int, fecha: String, DNICliente: String, val preciom3: Float,
                   val m3Consumidos: Float, var saneamiento: Float, var residuales: Float): Factura(numFactura, fecha, DNICliente,
                   preciom3, m3Consumidos, saneamiento, residuales){

   private var importeConsumido:Float =0f
   private var total: Float=0f
   private val descuento:Float= 0.20f

   override fun precioPagar() {
       saneamiento -= saneamiento * descuento
       residuales -= residuales * descuento
       importeConsumido= preciom3 * m3Consumidos
       total = importeConsumido + saneamiento + residuales
       println(" debe pagar un importe de $total")
   }

   override fun imprimir() {
       super.imprimir()
   }
}

class FacNumerosaB(numFactura: Int, fecha: String, DNICliente: String,  val preciom3: Float,
                  val m3Consumidos: Float, var saneamiento: Float, var residuales: Float):
                   Factura(numFactura, fecha, DNICliente, preciom3, m3Consumidos, saneamiento, residuales){

   private var importeConsumido:Float =0f
   private var total: Float=0f
   private val descuentoSaneamiento:Float= 0.75f
   private val descuentoResiduales: Float = 0.5f

   override fun precioPagar() {
       saneamiento-= saneamiento * descuentoSaneamiento
       residuales -= residuales * descuentoResiduales
       importeConsumido= preciom3 * m3Consumidos
       total = importeConsumido + saneamiento + residuales
       println(" debe pagar un importe de $total")
   }

   override fun imprimir() {
       super.imprimir()
   }
}

fun main(){
   val familia1 = Factura(1, "25/2/2022", "11111111A", 1.91f, 15.4f, 10f, 15f)
   val familia2 = FacNumerosaA(2, "25/2/2022", "22222222B", 1.91f, 23.8f, 10f, 15f)
   val familia3 = FacNumerosaB(3, "25/2/2022", "33333333C", 1.91f, 38.2f, 10f, 15f)
   familia1.imprimir()
   familia2.imprimir()
   familia3.imprimir()
}

 */

// Ejercicios Repaso Herencias Parte 3

//1. Crear las clases (utilizando herencia) que sean necesarias para guardar los distintos tipos
//de contratos de los empleados de una empresa. Para todos los contratos se necesita
//saber:

//• Numero de contrato, DNI, nombre, apellidos, salario bruto mensual, IRPF.
//• Para cada tipo de contrato se quiere saber, además:
//o Indefinido: Si las pagas extras están prorrateadas o no.
//o Temporal: Meses de duración.
//o Practicas: Titulación que cursa, meses de duración.
//• Crea un método llamado “salarioNeto” donde corresponda para obtener el salario
//neto (salario neto = salario bruto – salario bruto*IRPF) en todos los contratos.
//• Crea adecuadamente el método llamado “toString()” en todas las clases, para
//visualizar todos los datos de los contratos (incluyendo el salario neto).
//En la función main() crea un objeto con todos los datos, por cada una de las clases hijas y
//muestra sus valores por pantalla.

/*

open class Contratos(var numContrato: Int,
                     var nombre:String,
                     var apellidos:String,
                     var salario:Double,
                     var IRPF:Double) {

    var salarioNeto = 0.0
    fun salarioNeto(): Double {
        salarioNeto = salario - (salario * IRPF)
        return salarioNeto
    }


    override fun toString(): String {

        salarioNeto();
        return "Los datos para el contrato con número $numContrato son: \n" +
                "- Nombre y apellidos del titular: $nombre, $apellidos \n" +
                "- Salario bruto: $salario \n" +
                "- IRPF: $IRPF \n" +
                "- Salario neto: $salarioNeto"
    }


    class Temporal(
        numContrato: Int,
        nombre: String,
        apellidos: String,
        salario: Double,
        IRPF: Double,
        var mesesDuración: Int
    ) : Contratos(numContrato, nombre, apellidos, salario, IRPF) {

        override fun toString(): String {
            return "${super.toString()} \n" +
                    "- Meses de duración: $mesesDuración"
        }
    }

    class Indefinido(
        numContrato: Int,
        nombre: String,
        apellidos: String,
        salario: Double,
        IRPF: Double,
        var prorrateadas: Boolean
    ) : Contratos(numContrato, nombre, apellidos, salario, IRPF) {

        var textoProrrateadas = ""

        fun comprobar() {
            if (prorrateadas == true) {
                textoProrrateadas= "Las pagas son prorrateadas"
            } else {
                textoProrrateadas= "Las pagas NO son prorrateadas"
            }
        }

        override fun toString(): String {
            comprobar()
            return "${super.toString()} \n" +
                    "- Pagas prorrateadas: $textoProrrateadas"
        }
    }

    class Practicas(
        numContrato: Int,
        nombre: String,
        apellidos: String,
        salario: Double,
        IRPF: Double,
        var titulacion: String,
        var mesesDuración: Int
    ) : Contratos(numContrato, nombre, apellidos, salario, IRPF) {

        override fun toString(): String {
            return "${super.toString()} \n" +
                    "- Titulación: $titulacion \n" +
                    "- Los meses de duración del contrato son: $mesesDuración"
        }
    }
}


fun main() {

    var persona1 = Contratos.Temporal(625, "Pepita", "Palotes", 999.99, 0.5,9);
    println(persona1)
    println("///////////////////////////")
    var persona2 = Contratos.Indefinido(626, "Pepito", "Palotes", 999.99, 0.4,true);
    println(persona2)
    println("///////////////////////////")
    var persona3 = Contratos.Practicas(627, "Pupote", "Palotes", 999.99, 0.2,"Bachiller", 12);
    println(persona3)

}

*/

// 2. En una tienda de informática se guarda información de distintos componentes de
//ordenador, de todos ellos es necesario saber:
//• Referencia(valor alfanumérico), precio y marca
//• De los discos duros nos interesa saber:
//o Capacidad en TB, tipo bus de datos (IDE, Serial Ata2, ...)
//• De las tarjetas gráficas:
//o Modelo, Memoria en MB, tipo de bus
//• Crea las clases necesarias para guardar la información de estos productos.
//• Se necesita un método al que se le pueda enviar un porcentaje de descuento por
//consola(Ej. 0.18) y me calcule el precio final del componente, tras aplicarle ese
//descuento.
//o Fórmula: precio con descuento aplicado = precio – precio*descuento.
//o Declara el método, en la clase que corresponda.
//• Para poder hacer cambios de unidades, declara donde sea preciso un método que
//reciba una cantidad dada en MB y me la devuelva transformada en a GB.
//• Se decide que a las tarjetas gráficas no se les puede aplicar descuento, por lo tanto, el
//método que calcula el precio final tras aplicar el descuento, para las tarjetas gráficas
//devolverá́siempre el precio original del componente, sin descuento.
//En la función main():
//• Crea los objetos según los datos de los siguientes componentes:
//o Disco Duro: referencia: “HD1050”, marca: “Western Digital”, precio: 118,77€,
//capacidad: 2TB, bus: SATA3.
//o Tarjeta gráfica: referencia:” TG0004”, marca: “ASUS”, precio: 131,28€,
//modelo: “GTX550”, memoria: 1024 MB, bus: “PCI Express”.
//
//• Muestra el precio de los dos componentes
//• Utilizando el método creado, muestra el precio aplicándole un descuento del 15% a los
//dos componentes. Chequea que a la tarjeta gráfica no se le aplica como queríamos el
//descuento.
//
//• Muestra la capacidad de memoria de la tarjeta gráfica en GB. (haciendo uso del
//método que realiza este cálculo).
//• Necesito guardar la información del siguiente componente:
//o Pendrive: referencia:”USB1001”, marca: “SanDisk”, precio: 18€, capacidad:
//16GB.
//o Crea un objeto con la información anterior del pendrive, muestra su precio
//con un descuento de 10%.

/*

open class Componenetes (var referencia:String, var precio:Double, var marca:String){

    var descuento = 0.0
    open fun aplicarDescuento(): Double {
        println("Introduce descuento: ")
        var desc = readLine()!!.toDouble()
        descuento = precio - ( precio * desc)
        println("El producto finalmente costará $descuento€")
        return descuento
    }
    class DiscosDuros (referencia: String, precio: Double, marca: String, var capacidad:Int, var tipoBus:String): Componenetes(referencia, precio, marca) {

        override fun aplicarDescuento(): Double {
            return super.aplicarDescuento()
        }
    }

    class TarjetasGraficas (referencia: String, precio: Double, marca: String, var modelo:String, var memoriaMB:Int, var tipoBus: String): Componenetes(referencia, precio, marca) {

        var memoriaGB= 0

        fun pasarAGB(): Int {
            memoriaGB = memoriaMB / 1024
            return memoriaGB
        }
    }
}

fun main() {

    //Muestra el precio de los dos componentes. Utilizando el método creado, muestra el precio aplicándole un descuento del 15%
    var discoDuro1 = Componenetes.DiscosDuros("HD1050", 118.77,"Western Digital", 2000, "SATA3");
    println("El precio final del componente con referencia ${discoDuro1.referencia} es ${discoDuro1.aplicarDescuento()}");

    var tarjeta1 = Componenetes.TarjetasGraficas("TG0004", 131.28, "ASUS", "GTX550", 1024, "PCI Express");
    //Chequea que a la tarjeta gráfica no se le aplica como queríamos el
    //descuento.
    println("Comprobamos que el precio del componente ${tarjeta1.referencia} no cambió: ${tarjeta1.precio}");

    // Muestra la capacidad de memoria de la tarjeta gráfica en GB. (haciendo uso del
    //método que realiza este cálculo).
    println("La capacidad de la tarjeta grafica cuenta con ${tarjeta1.memoriaMB}MB que serían ${tarjeta1.pasarAGB()}GB")


    //o Crea un objeto con la información anterior del pendrive, muestra su precio
    //con un descuento de 10%.
    var USB1 = Componenetes.DiscosDuros("USB1001", 18.0, "SanDisk", 16, "");
    println("El componente con referencia ${USB1.referencia} es de la marca ${USB1.marca}, cuesta ${USB1.aplicarDescuento()}€ " +
            "y su capacidad es de ${USB1.capacidad}GB ");


}

*/

// Versión Martín

/*

open class Componentes(private val referencia: String,
                       private val precio: Float,
                       private val marca: String){

    open fun precioFinal(descuento: Float): Float {
        return precio-precio*descuento
    }
}

class discosDuros(referencia: String,
                  precio: Float,
                  marca: String,
                  private val capacidad: Int,
                  private val tipoBus: String): Componentes(referencia,precio,marca){

}

class tarjetaGrafica(referencia: String,
                     precio: Float,
                     marca: String,
                     private val modelo: String,
                     private val memoria: Double,
                     private val tipoBus: String): Componentes(referencia,precio,marca){

    private var precio: Float = precio

    fun cambioGB (): Double {
        return memoria*0.00097
    }

    override fun precioFinal(descuento: Float): Float {
        return precio
    }
}

fun main() {
    val componente1 = discosDuros("HD1050", 118.17f, "WesternDigital", 2, "SATA3" )
    val componente2 = tarjetaGrafica("TG0004", 131.28f, "ASUS", "GTX550", 1024.0, "PCI Express")
    println("${componente1.precioFinal(0.15f)}")
    println("${componente2.cambioGB()}")
    println("${componente2.precioFinal(0.15f)}")
}

 */

// EJERCICIOS REPASO HERENCIA 04/04/2022

//En el sistema informático del banco debemos reflejar las características de las cuentas
//corrientes que maneja el banco. De cada cuenta necesitamos saber el titular de la cuenta, el
//número de cuenta, porcentaje de interés y el saldo. En cada cuenta podremos realizar
//ingresos y retiros, chequeando siempre que para los ingresos el valor a ingresar sea positivo y
//para los retiros el valor sea positivo y menor que el saldo actual.
//El banco tiene los siguientes tipos de cuenta:
//• Cuenta Roja: Permite descubiertos, esto es, que el saldo quede en negativo, pero al
//obtener el interés, si estamos en esa situación, el interés se devuelve negativo.
//• Cuenta Verde: El interés devuelto es cero si no se supera un valor mínimo de saldo
//fijado en la cuenta.
//• Cuenta Morada: Es una cuenta donde el interés se fija en el momento de crear la
//cuenta y ya no se podrá́modificar nunca más.
//Crea las clases que estimes oportunas utilizando herencia, con los constructores que estimes
//oportunos y declara siempre como privados todos los atributos.
//Para probar las clases crea las siguientes cuentas y realiza las siguientes operaciones:
//• Se crea una Cuenta Roja:
//o Titular: “José́Rodríguez”, no cuenta=1, interés=3% con un saldo inicial de 50 €
//o Realizar un ingreso de 50 €.
//o Mostrar el saldo y el interés
//o Realizar un retiro de 150 euros
//o Mostrar el saldo y el interés.
//§ Ahora el saldo debe ser -50 y el interés -3%.
//
//• Se crea una Cuenta Verde:
//o Titular: “Verónica Jiménez”, no cuenta=2, interés=8%, saldo=0, saldo mínimo
//para aplicar interés: 2500 €
//o Realizar un retiro de 75 €
//o Realizar un ingreso de 25 €
//o Mostrar el saldo y el interés
//§ El saldo deberá́ser 25 € y el interés 0%
//o Realizar un retiro de 80 €
//o Realizar un ingreso de 3000 €
//o Mostrar el saldo y el interés
//§ El saldo debería ser 3025 € y el interés 8%
//
//• Se crea una Cuenta Morada:
//o Titular: “Esmerigildo Chuchurrío”, no cuenta=3, interés=2%, saldo=100€
//o Intentar cambiar el interés al 4%
//o Mostrar el interés. Debería seguir siendo 2%.


//En el sistema informático del banco debemos reflejar las características de las cuentas
//corrientes que maneja el banco. De cada cuenta necesitamos saber el titular de la cuenta, el
//número de cuenta, porcentaje de interés y el saldo. En cada cuenta podremos realizar
//ingresos y retiros, chequeando siempre que para los ingresos el valor a ingresar sea positivo y
//para los retiros el valor sea positivo y menor que el saldo actual.

/*

open class Banco(var titular:String, var numCuenta:Int, private var porcentajeInteres:Int, var saldo:Double){

    var opcion = 0
    var ingresar = 0.0
    var retirar = 0.0
    var porcentajeInteresINICIAL = porcentajeInteres


    open fun operaciones(){
        println()
        println("Qué operación vas a realiazar?")
        println("1 - Ingreso")
        println("2 - Retirada")
        opcion = readLine()!!.toInt()

        if (opcion == 1 ) {
            println("Introduce el efectivo: ")
            ingresar = readLine()!!.toDouble()
        } else if (opcion == 2) {
            println("Cuanto desea retirar:")
            retirar = readLine()!!.toDouble()
        } else {
            "Operación INCORRECTA"
        }
    }

    class CuentaRoja(titular: String, numCuenta: Int, var porcentajeInteres: Int, saldo: Double): Banco(titular, numCuenta, porcentajeInteres, saldo) {

        override fun operaciones() {
            super.operaciones()
            if (opcion == 1) {
                saldo = saldo + ingresar
            } else if (opcion == 2) {
                saldo = saldo - retirar
            }

            if (saldo<0) {
                porcentajeInteres = -porcentajeInteres
            }
        }

        fun verDatos() {
            println("El saldo es: $saldo")
            println("Los intereses son: $porcentajeInteres")
        }
    }

    class CuentaVerde(titular: String, numCuenta: Int, var porcentajeInteres: Int, saldo: Double, var saldoMinimo: Double): Banco(titular, numCuenta, porcentajeInteres, saldo) {
        override fun operaciones() {

            super.operaciones()
            if (opcion == 1) {
                saldo = saldo + ingresar
            } else if (opcion == 2) {

                saldo = saldo - retirar
                if (saldo < 0) {
                    saldo = saldo + retirar
                    println("No se puede sacar de donde no hay")
                }
            }

            if (saldo<saldoMinimo) {
                porcentajeInteres = 0
            } else {
                porcentajeInteres = porcentajeInteresINICIAL
            }
        }

        fun verDatos() {
            println("El saldo es: $saldo")
            println("Los intereses son del: $porcentajeInteres%")
            println("//////////////")
            println()
        }
    }

    class CuentaMorada(titular: String, numCuenta: Int, val porcentajeInteres: Int, saldo: Double): Banco(titular, numCuenta, porcentajeInteres, saldo) {
        fun cambiarInteres(){
            println("Introduce el nuevo interés:")
            var x = readLine()!!.toInt()
            println("No se puede cambiar el interés incial ya que es un valor fijo")
            println("Interés actual: $porcentajeInteres")
        }
    }
}

fun main() {


    //o Realizar un ingreso de 50 €.
    //o Mostrar el saldo y el interés
    //o Realizar un retiro de 150 euros
    //o Mostrar el saldo y el interés.
    //§ Ahora el saldo debe ser -50 y el interés -3%.
    var persona1 = Banco.CuentaRoja("José Rodríguez", 1, 3, 50.0)
    //persona1.verDatos()
    //persona1.operaciones()
    //persona1.verDatos()
    //persona1.operaciones()
    //persona1.verDatos()

////////////////////////////////////////////////////////////////////////

    //o Realizar un retiro de 75 €
    //o Realizar un ingreso de 25 €
    //o Mostrar el saldo y el interés
    //§ El saldo deberá́ser 25 € y el interés 0%
    //o Realizar un retiro de 80 €
    //o Realizar un ingreso de 3000 €
    //o Mostrar el saldo y el interés
    //§ El saldo debería ser 3025 € y el interés 8%

    var persona2 = Banco.CuentaVerde("Verónica Jiménez", 2, 8, 0.0, 2500.0)
    //persona2.verDatos()
    //persona2.operaciones()
    //persona2.operaciones()
    //persona2.verDatos()

    //persona2.operaciones()
    //persona2.operaciones()
    //persona2.verDatos()

////////////////////////////////////////////////////////////////////////

    //Se crea una Cuenta Morada:
    //o Titular: “Esmerigildo Chuchurrío”, no cuenta=3, interés=2%, saldo=100€
    //o Intentar cambiar el interés al 4%
    //o Mostrar el interés. Debería seguir siendo 2%.
    var persona3 = Banco.CuentaMorada("Esmerigildo Chuchurrío", 3, 2, 100.0)
    //persona3.cambiarInteres()
}

*/

// EJERCICIOS REPASO HERENCIA 04/04/2022
//Una empresa se dedica a alquilar barcos. Un BARCO se caracteriza por su matrícula, su eslora
//y manga en metros y año de fabricación. Se pretende diferenciar la información de algunos
//tipos de barcos:
//• Número de mástiles para Veleros
//• Potencia en CV para Embarcaciones deportivas a motor
//• Potencia en CV y número de camarotes para Yates de lujo
//El precio por día base de un alquiler de un barco es un precio por día común para todas las
//embarcaciones que se establece en 40€, modificado con los siguientes incrementos:
//• Veleros: 10€ x no de mástiles
//• Embarcaciones deportivas: 15€ x no CV
//• Yates de lujo: (15€ x no CV ) + (5€ x número de camarotes).
//Los datos de un ALQUILER son el DNI del cliente, días de alquiler y el BARCO alquilado. El
//alquiler se calcula como:
//• Días de alquiler x precio por día alquiler barco
//Usando clases, atributos privados y constructores que inicialicen todos los atributos, registrar
//los siguientes alquileres y mostrar su precio final
//• Alquiler 1:
//o DNI cliente: “12345678Y”
//o 5 días de alquiler
//o Barco alquilado:
//§ Velero de 3 mástiles:
//• Matrícula: “3GI1199”
//• Eslora: 70 metros y manga: 12 metros
//• Año fabricación: 1980
//
//• Alquiler 2:
//o DNI cliente: “27654376T”
//o 6 días de alquiler
//o Barco alquilado:
//§ Embarcación deportiva de 10 CV:
//• Matrícula: “9XP1188”
//• Eslora: 30 metros y manga: 5 metros
//• Año fabricación: 1990
//
//• Alquiler 3:
//o DNI cliente: “378641985H”
//o 3 días de alquiler
//o Barco alquilado:
//§ Yate de lujo de 18 CV y 3 camarotes:
//• Matrícula: “6TK2476”
//• Eslora: 40 metros y manga:10 metros
//• Año fabricación: 1995
//• Verifica que los precios por alquiler obtenidos son correctos.

/*

open class Barco(private var matricula:String, private var eslora:Double, private var manga:Double, private var anhoFabricacion:Int){

    open fun precios(): Int {
        var precioPorDia = 40
        return precioPorDia
    }

    open fun verDatos() {
        println("El barco con mátricula $matricula, fue fabricado en el año $anhoFabricacion y cuenta " +
                "con $eslora metros de eslora y $manga metros de manga")
    }

    class Veleros (matricula:String, eslora:Double, manga:Double, anhoFabricacion:Int, private var numMastiles:Int): Barco(matricula, eslora, manga, anhoFabricacion) {


        override fun precios(): Int {
            var total = super.precios()
            total = total + (10 * numMastiles)
            return total
        }

        override fun verDatos() {
            super.verDatos()
            println("Es un velero que cuenta con $numMastiles mástiles")
        }
    }

    class EmbarcacionesDeportivas (matricula:String, eslora:Double, manga:Double, anhoFabricacion:Int, private var potencia:Int): Barco(matricula, eslora, manga, anhoFabricacion) {


        override fun precios(): Int {
            var total = super.precios()
            total = total + ( 15 * potencia)
            return total
        }

        override fun verDatos() {
            super.verDatos()
            println("Es una embarcación deportiva que cuenta con $potencia CV de potencia")
        }
    }

    class Yates(matricula:String, eslora:Double, manga:Double, anhoFabricacion:Int, private var potencia:Int, private var numCamarotes:Int): Barco(matricula, eslora, manga, anhoFabricacion) {

        override fun precios(): Int {
            var total = super.precios()
            total = total + ( 15 * potencia) + (5 * numCamarotes)
            return total
        }

        override fun verDatos() {
            super.verDatos()
            println("Es un yate de lujo que cuenta con $potencia CV de potencia y $numCamarotes camarotes")
        }
    }
}

class Alquiler(private var DNI:String, private var numDias:Int, private var barco: Barco){

    var alquiler = numDias * barco.precios()

    fun verDatos() {
        println("El precio por alquilar este barco $numDias días es: $alquiler€")
    }
}

fun main() {
    var velerito = Barco.Veleros("3GI1199", 70.0,12.0,1980,3);
    velerito.verDatos()
    var alquilerVelero = Alquiler("12345678Y", 5, velerito);
    alquilerVelero.verDatos()

    println("///////////////////////////")

    var deportivito = Barco.EmbarcacionesDeportivas("9XP1188", 30.0,5.0,1990,10);
    deportivito.verDatos()
    var alquilerDeportivo = Alquiler("27654376T", 6, deportivito);
    alquilerDeportivo.verDatos()

    println("///////////////////////////")

    var yatesito = Barco.Yates("6TK2476", 40.0,10.0,1995,18, 3);
    yatesito.verDatos()
    var alquilerYatesito = Alquiler("378641985H", 3, yatesito);
    alquilerYatesito.verDatos()

}
*/

// Versión Abstracta

/*

abstract class Barco(private var matricula:String, private var eslora:Double, private var manga:Double, private var anhoFabricacion:Int){
    var precioPorDia = 40

    abstract fun precios(): Int

    open fun verDatos() {
        println("El barco con mátricula $matricula, fue fabricado en el año $anhoFabricacion y cuenta " +
                "con $eslora metros de eslora y $manga metros de manga")
    }

    class Veleros (matricula:String, eslora:Double, manga:Double, anhoFabricacion:Int, private var numMastiles:Int): Barco(matricula, eslora, manga, anhoFabricacion) {


        override fun precios(): Int {
            var total = precioPorDia
            total = total + (10 * numMastiles)
            return total
        }

        override fun verDatos() {
            super.verDatos()
            println("Es un velero que cuenta con $numMastiles mástiles")
        }
    }

    class EmbarcacionesDeportivas (matricula:String, eslora:Double, manga:Double, anhoFabricacion:Int, private var potencia:Int): Barco(matricula, eslora, manga, anhoFabricacion) {


        override fun precios(): Int {
            var total = precioPorDia
            total = total + ( 15 * potencia)
            return total
        }

        override fun verDatos() {
            super.verDatos()
            println("Es una embarcación deportiva que cuenta con $potencia CV de potencia")
        }
    }

    class Yates(matricula:String, eslora:Double, manga:Double, anhoFabricacion:Int, private var potencia:Int, private var numCamarotes:Int): Barco(matricula, eslora, manga, anhoFabricacion) {

        override fun precios(): Int {
            var total = precioPorDia
            total = total + ( 15 * potencia) + (5 * numCamarotes)
            return total
        }

        override fun verDatos() {
            super.verDatos()
            println("Es un yate de lujo que cuenta con $potencia CV de potencia y $numCamarotes camarotes")
        }
    }
}

class Alquiler(private var DNI:String, private var numDias:Int, private var barco: Barco){

    var alquiler = numDias * barco.precios()

    fun verDatos() {
        println("El precio por alquilar este barco $numDias días es: $alquiler€")
    }
}

fun main() {
    var velerito = Barco.Veleros("3GI1199", 70.0,12.0,1980,3);
    velerito.verDatos()
    var alquilerVelero = Alquiler("12345678Y", 5, velerito);
    alquilerVelero.verDatos()

    println("///////////////////////////")

    var deportivito = Barco.EmbarcacionesDeportivas("9XP1188", 30.0,5.0,1990,10);
    deportivito.verDatos()
    var alquilerDeportivo = Alquiler("27654376T", 6, deportivito);
    alquilerDeportivo.verDatos()

    println("///////////////////////////")

    var yatesito = Barco.Yates("6TK2476", 40.0,10.0,1995,18, 3);
    yatesito.verDatos()
    var alquilerYatesito = Alquiler("378641985H", 3, yatesito);
    alquilerYatesito.verDatos()

}

*/

// Versión Tati Abstracta

/*

abstract class Barco (val matricula:String, val eslora: Int, val manga:Int, val añoFabricacion:Int){

    var precioAlquiler = 0
    var fijo=40

    abstract fun precioDia():Int

}

class Velero(matricula: String, eslora: Int, manga: Int, añoFabricacion: Int, val mastiles:Int): Barco(matricula, eslora, manga, añoFabricacion){

    override fun precioDia():Int {
        precioAlquiler = fijo + (10 * mastiles)
        return precioAlquiler
    }
}

class EmbarcacionDeportiva(matricula: String, eslora: Int, manga: Int, añoFabricacion: Int, val CV:Int): Barco(matricula, eslora, manga, añoFabricacion){

    override fun precioDia():Int{
        precioAlquiler = fijo + (15 * CV)
        return precioAlquiler
    }
}

class Yate(matricula: String, eslora: Int, manga: Int, añoFabricacion: Int, val CV:Int, val camarotes:Int): Barco(matricula, eslora, manga, añoFabricacion){

    override fun precioDia():Int{
        precioAlquiler = fijo + (15 * CV) + (5 * camarotes)
        return precioAlquiler
    }
}

class Alquiler(val DNI:String, val dias:Int, val barco:Barco){

    fun alquiler(){
        var precioFinal= dias * barco.precioDia()
        println("El precio por día es de ${barco.precioDia()} y precio total por el alquiler de $dias dias es de $precioFinal euros.")
    }
}
fun main(){
    val velero = Velero("3GI1199", 70, 12 , 1980, 3)
    val embarcacionDeportiva = EmbarcacionDeportiva( "9XP1188", 30, 5, 1990, 10)
    val yate = Yate("6TK2476", 40, 10, 1995, 18, 3)
    val alquiler1 = Alquiler("12345678Y", 5, velero)
    alquiler1.alquiler()
    val alquiler2 = Alquiler("27654376T", 6, embarcacionDeportiva)
    alquiler2.alquiler()
    val alquiler3 = Alquiler("378641985H", 3, yate)
    alquiler3.alquiler()
}

*/

// Versión Martín

/*

open class Barco(private val matricula: String,
                 private val eslora: Int,
                 private val manga: Int,
                 private val anoFabricacion: Int){

    open fun precioPorDia(): Double {
        return 40.0
    }
}

class Veleros(matricula: String,
              eslora: Int,
              manga: Int,
              anoFabricacion: Int,
              private val mastiles:Int): Barco(matricula, eslora, manga, anoFabricacion){

    override fun precioPorDia(): Double {
        return super.precioPorDia()+(10.0*mastiles)
    }

}
class EmbarcacionDeportiva (matricula: String,
                            eslora: Int,
                            manga: Int,
                            anoFabricacion: Int,
                            private val CV:Int): Barco(matricula, eslora, manga, anoFabricacion){

    override fun precioPorDia(): Double {
        return super.precioPorDia()+(15*CV)
    }

}

class Yates (matricula: String,
             eslora: Int,
             manga: Int,
             anoFabricacion: Int,
             private val CV:Int,
             private val camarotes: Int): Barco(matricula, eslora, manga, anoFabricacion){

    override fun precioPorDia(): Double {
        return super.precioPorDia()+(15*CV)+(5*camarotes)
    }

}

class Alquiler(private val DNI: String,
               private val diasAlquiler: Int,
               private val barco: Barco){

    fun alquiler():Double {
        return diasAlquiler*barco.precioPorDia()
    }
}

fun main() {
    val velero = Veleros("3GI1199", 70, 12, 1980,3)
    val alquiler1 = Alquiler("12345678Y", 5, velero)
    println("${alquiler1.alquiler()}")
}

*/

// Versión Martín Abstracta con interfaces

/*

interface PrecioExtra{

    fun precioExtra(): Double

}

abstract class Barco(private val matricula: String,
                     private val eslora: Int,
                     private val manga: Int,
                     private val anoFabricacion: Int){

    var precioBase = 40.0

    abstract fun precioPorDia(): Double


}

class Veleros(matricula: String,
              eslora: Int,
              manga: Int,
              anoFabricacion: Int,
              private val mastiles:Int): Barco(matricula, eslora, manga, anoFabricacion), PrecioExtra{

    override fun precioPorDia(): Double {
        return precioBase+(10.0*mastiles)
    }

    override fun precioExtra(): Double { //método implementado por la interface PrecioExtra
        return precioPorDia()+5.0
    }

}
class EmbarcacionDeportiva (matricula: String,
                            eslora: Int,
                            manga: Int,
                            anoFabricacion: Int,
                            private val CV:Int): Barco(matricula, eslora, manga, anoFabricacion){

    override fun precioPorDia(): Double {
        return precioBase+(15*CV)
    }

}

class Yates (matricula: String,
             eslora: Int,
             manga: Int,
             anoFabricacion: Int,
             private val CV:Int,
             private val camarotes: Int): Barco(matricula, eslora, manga, anoFabricacion){

    override fun precioPorDia(): Double {
        return precioBase+(15*CV)+(5*camarotes)
    }

}

class Alquiler(private val DNI: String,
               private val diasAlquiler: Int,
               private val barco: Barco){

    fun alquiler():Double {
        return diasAlquiler*barco.precioPorDia()
    }
}



fun main() {

    val velero = Veleros("3GI1199", 70, 12, 1980,3)
    val alquiler1 = Alquiler("12345678Y", 5, velero)
    println("${alquiler1.alquiler()}")
}

 */

// Versión Tati Abstracta con Interfaces

/*

interface Embarcacion{
    fun precioDia():Int
}

abstract class Barco (val matricula:String, val eslora: Int, val manga:Int, val añoFabricacion:Int):Embarcacion{

    var precioAlquiler = 0
    var fijo=40

}

class Velero(matricula: String, eslora: Int, manga: Int, añoFabricacion: Int, val mastiles:Int): Barco(matricula, eslora, manga, añoFabricacion){

    override fun precioDia():Int {
        precioAlquiler = fijo + (10 * mastiles)
        return precioAlquiler
    }
}

class EmbarcacionDeportiva(matricula: String, eslora: Int, manga: Int, añoFabricacion: Int, val CV:Int): Barco(matricula, eslora, manga, añoFabricacion){

    override fun precioDia():Int{
        precioAlquiler = fijo + (15 * CV)
        return precioAlquiler
    }
}

class Yate(matricula: String, eslora: Int, manga: Int, añoFabricacion: Int, val CV:Int, val camarotes:Int): Barco(matricula, eslora, manga, añoFabricacion){

    override fun precioDia():Int{
        precioAlquiler = fijo + (15 * CV) + (5 * camarotes)
        return precioAlquiler
    }
}

class MotoAgua(private val caballos:Int):Embarcacion{
    override fun precioDia(): Int {
        val precioBase= 25
        var precioAlquiler = precioBase+ (5 * caballos)
        return precioAlquiler
    }

}


class Alquiler(val DNI:String, val dias:Int, val embarcacion:Embarcacion){

    fun alquiler(){
        var precioFinal= dias * embarcacion.precioDia()
        println("El precio por día es de ${embarcacion.precioDia()} y precio total por el alquiler de $dias dias es de $precioFinal euros.")
    }
}
fun main(){
    val velero = Velero("3GI1199", 70, 12 , 1980, 3)
    val embarcacionDeportiva = EmbarcacionDeportiva( "9XP1188", 30, 5, 1990, 10)
    val yate = Yate("6TK2476", 40, 10, 1995, 18, 3)
    val motoagua=MotoAgua(120)
    val alquiler1 = Alquiler("12345678Y", 5, velero)
    alquiler1.alquiler()
    val alquiler2 = Alquiler("27654376T", 6, embarcacionDeportiva)
    alquiler2.alquiler()
    val alquiler3 = Alquiler("378641985H", 3, yate)
    alquiler3.alquiler()
    val alquiler4 = Alquiler("46097151E", 3, motoagua)
    alquiler4.alquiler()
}

*/

// Examen

// Versión Alex

/*

open class Bombons (var nomeComercial:String, var gramosChocolate:Int, var prezoGramo:Double, var porcentaxeBeneficio:Double) {


    open fun prezos(): Double {
        var prezoVenta=0.2
        return prezoVenta
    }

    open fun verDatos() {
        println("O bombón $nomeComercial ten $gramosChocolate gramos de chocolate")
    }

    class Licor(nomeComercial:String, gramosChocolate:Int, prezoGramo:Double, porcentaxeBeneficio:Double, var mililitrosLicor:Int, var prezoMililitro:Double): Bombons(nomeComercial, gramosChocolate, prezoGramo, porcentaxeBeneficio) {

        override fun prezos(): Double {
            var total = super.prezos()
            total = total + ((gramosChocolate * prezoGramo) + (mililitrosLicor * prezoMililitro)) * (1 + porcentaxeBeneficio)
            return total
        }

        override fun verDatos() {
            super.verDatos()
            println("Ten $mililitrosLicor ml de licor e a unidade custa ${prezos()}")
        }
    }

    class Amendoa (nomeComercial:String, gramosChocolate:Int, prezoGramo:Double, porcentaxeBeneficio:Double, var gramosAmendoa:Int, var prezoAmendoa:Double): Bombons (nomeComercial, gramosChocolate, prezoGramo, porcentaxeBeneficio) {

        override fun prezos(): Double {
            var total = super.prezos()
            total = total + ((gramosChocolate * prezoGramo) + (gramosAmendoa * prezoAmendoa)) * (1 + porcentaxeBeneficio)
            return total
        }

        override fun verDatos() {
            super.verDatos()
            println("Ten $gramosAmendoa gramos de amendoa e a unidade custa ${prezos()}")
        }
    }
}

class Pastelaria (var NIF:Int, var cantidadeCaixasVendidas:Int, var bombons: Bombons) {

    fun prezoCompra(): Double {

        var unidades = 12
        var total = cantidadeCaixasVendidas * unidades * bombons.prezos()
        return total
    }

    fun verDatos() {
        println("O prezo total para a pastalaría con NIF $NIF, que compra $cantidadeCaixasVendidas caixas de bombóns é ${prezoCompra()}")
    }
}

fun main() {

    var licorsito = Bombons.Licor("Licorito", 5, 0.01, 0.20, 2, 0.15);
    licorsito.verDatos();

    var delicias = Pastelaria(123456, 10, licorsito);
    delicias.verDatos();

    println("///////////////////////////////////////////////////////////////////////////////////////////")
/*
    var almendrito = Bombons.Amendoa("Almendrito", 8, 0.04, 0.25, 3, 0.09);
    almendrito.verDatos();

    var delicias2 = Pastelaria(123456, 10, almendrito);
    delicias2.verDatos();

    println("///////////////////////////////////////////////////////////////////////////////////////////")
*/
    var almendritoPremium = Bombons.Amendoa("Almendrito Premium", 10, 0.04, 0.25, 5, 0.13);
    almendritoPremium.verDatos()

    var lestedo = Pastelaria(908734, 12, almendritoPremium);
    lestedo.verDatos()
}

*/

// Versión Profe

/*

open class Bombones(val nombre : String,
                    val gramosChocolate: Int,
                    val precioPorGramo: Float,
                    val beneficio: Float){

    open fun precioVenta(): Float{
        return 0.20f
    }

    override fun toString(): String {
        return " El precio de venta del $nombre es ${precioVenta()}€"
    }
}

class BombonesLicor (nombre : String,
                     gramosChocolate: Int,
                     precioPorGramo: Float,
                     beneficio: Float,
                     val licor: Int, val precioLicor: Float): Bombones(nombre,gramosChocolate,precioPorGramo,beneficio){

    override fun precioVenta(): Float {
        return super.precioVenta()+(gramosChocolate*precioPorGramo+licor*precioLicor)*(1+beneficio)
    }
}

class BombonesAlmendra(nombre : String,
                       gramosChocolate: Int,
                       precioPorGramo: Float,
                       beneficio: Float,
                       val gramosAlmendra: Int,
                       val precioGramoAlmendra: Float): Bombones(nombre,gramosChocolate,precioPorGramo,beneficio){

    override fun precioVenta(): Float {
        return super.precioVenta()+(gramosChocolate*precioPorGramo+gramosAlmendra*precioGramoAlmendra)*(1+beneficio)
    }
}

class Chocolateria (val NIF: String, val cantidadCajas: Int, val bombones: Bombones){

    fun precioCompra(): Float {
        return cantidadCajas*12*bombones.precioVenta()
    }

}

fun main() {
    val licorito = BombonesLicor("Licorito", 5, 0.01f, 0.2f, 2, 0.15f)
    val almendrito = BombonesAlmendra("Almendrito", 8, 0.04f, 0.25f, 3, 0.09f)
    val almendritoPremium = BombonesAlmendra("Almendrito Premium", 10, 0.04f, 0.25f, 5, 0.13f)
    println(licorito)
    println(almendrito)
    println(almendritoPremium)

    val vitoria = Chocolateria("12345", 10, licorito)
    val lestedo = Chocolateria("908734", 12, almendritoPremium)
    println("El precio de compra la pastelería Vitoria es ${vitoria.precioCompra()}€")
    println("El precio de compra de la pastelería Lestedo es ${lestedo.precioCompra()}€")
}

*/

// EJERCICIOS HERENCIAS 05/04/2022
//1. En una aplicación de gestión de personal queremos manejar información acerca de
//becarios, comerciales y dirección. La información que nos interesa de cada uno es la
//siguiente:
//• BECARIO:
//o Nombre y Apellidos
//o Fecha de Alta
//o Departamento
//o Salario (se inicializará a cero euros)
//o Meses de prueba
//• COMERCIAL:
//o Nombre y Apellidos
//o Fecha de Alta
//o Departamento
//o Salario
//o Comisión
//• DIRECCIÓN
//o Nombre y Apellidos
//o Fecha de Alta
//o Departamento
//o Salario
//o Bonificación (es un porcentaje que aumenta su salario).
//
//Para hacer informes necesitamos dos métodos, uno que muestre la información común:
//Nombre, Apellidos, Fecha de Alta , Departamento, y salario, y otro que muestre la información
//particular: Meses de prueba, comisión y bonificación. Define las clases necesarias utilizando los
//conceptos de herencia. Todas las clases definen sus atributos como privados y todas las clases
//tienen un constructor que inicializan todos sus atributos.
//En el programa crea un array de 3 elementos y almacena en el mismo 1 objeto de tipo
//BECARIO ,1 objeto de tipo COMERCIAL y 1 objeto de tipo DIRECCIÓN. Recorre el array
//mostrando la información común y la particular de los objetos contenidos utilizando un solo
//método.

/*

open class Empleados (var nombre:String, var apellidos:String, var fechaAlta:String, var departamento:String, var salario:Double) {

    open fun verDatos() {
        println("Se llama $nombre, $apellidos, se dió de alta el $fechaAlta, trabaja en el departamento $departamento y su salario es $salario")
    }

    class Becario(
        nombre: String,
        apellidos: String,
        fechaAlta: String,
        departamento: String,
        salario: Double): Empleados(nombre, apellidos, fechaAlta, departamento, salario) {

        var mesesPrueba: Int=0

        fun introducirMeses() {
            println("Meses: ")
            mesesPrueba = readLine()!!.toInt()
        }

        override fun verDatos() {
            super.verDatos()
            introducirMeses()
            println("El becario estará $mesesPrueba meses de prueba")
        }
    }

    class Comercial(
        nombre: String,
        apellidos: String,
        fechaAlta: String,
        departamento: String,
        salario: Double): Empleados(nombre, apellidos, fechaAlta, departamento, salario) {

        var comision: Double = 0.0

        fun comis() {
            println("Comisión: ")
            comision = readLine()!!.toDouble()
        }

        override fun verDatos() {
            super.verDatos()
            comis()
            var total = comision * salario
            println("El comercial cobrará una comisión de $total€")
        }
    }

    class Direccion(
        nombre: String,
        apellidos: String,
        fechaAlta: String,
        departamento: String,
        salario: Double): Empleados(nombre, apellidos, fechaAlta, departamento, salario) {

        var bonificacion: Double=0.0

        fun boni() {
            println("Bonificación: ")
            bonificacion = readLine()!!.toDouble()
            salario = (bonificacion * salario) + salario
        }

        override fun verDatos() {
            super.verDatos()
            boni()
            println("El comercial cobrará una comisión de ${salario}€")
        }
    }
}


fun main() {

    var becar = Empleados.Becario("Pepito", "Palotes", "05/02/2021", "Departamento1",1500.0);
    var comer = Empleados.Comercial("Pepita", "Palotes", "06/02/2021", "Departamento2",1600.0);
    var direc = Empleados.Direccion("Pupote", "Palotes", "07/02/2021", "Departamento3",1700.0);

    val arrayEmpleados = arrayOf(becar, comer, direc)

    fun imprimir(arrayList: Array<Empleados>) {

        for (i in arrayEmpleados.indices) {
            arrayEmpleados[i].verDatos()
        }
    }
    imprimir(arrayEmpleados);
}

*/

// 2. La empresa de telefonía móvil KKPhone tiene 2 tipos de TARIFAS. Tenemos que crear las
//distintas clases para gestionar su facturación (todos los atributos serán privados y se
//crearán los constructores que inicialicen todos sus atributos). La TARIFA BASE(no incluye
//servicio de Internet) incluye:
//• Precio por minuto
//• Precio por SMS
//La TARIFA INTERNET que incluye servicio de Internet, tiene a mayores:
//• Cuota tarifa plana Internet (Precio fijo por el servicio de Internet)
//• MBs máximos cuota Internet (MBs hasta donde cubre la tarifa plana)
//• Precio por MB una vez superada la cuota

//Las FACTURA incluyen:
//• Una TARIFA
//• Número de factura
//• IVA (21%)
//• DNI cliente
//• Minutos consumidos
//• Número SMS enviados
//• MBs consumidos
//• El total de la factura se calcula siguiendo estos pasos:
//o Total_sin_IVA= minutos_consumidos x precio_por_minuto_TARIFA+
//número_SMS_enviados x precio_por_SMS_TARIFA
//o Si la TARIFA es de Internet , incrementaremos el total sin IVA:
//§ Total_sin_IVA = Total_sin_IVA + cuota_tarifa_plana_Internet
//§ Si se han superado los MBs máximos de cuota de Internet:
//§ Total_sin_IVA = Total_sin_IVA + (MBS_consumidos -
//MBs_máximos_cuota_Internet_TARIFA) x
//precio_por_MB_una_vez_superada_la _cuota_TARIFA
//
//§ Total final = total_sin_IVA x (1 + IVA)
//
//En el programa calcula las siguientes facturaciones y muestra su total (chequea que el cálculo
//sea correcto):
//• Factura no 1
//o TARIFA BASE:
//§ Precio por minuto = 8 céntimos minuto (0,08 €)
//§ Precio por SMS = 35 céntimos (0,35 €) o DNI: “12345678Y”
//o Minutos consumidos: 200
//o SMS enviados: 10
//• Factura no 2
//o TARIFA INTERNET:
//§ Precio por minuto = 4 céntimos minuto (0,04 €)
//§ Precio por SMS = 25 céntimos (0,25 €)
//§ Cuota tarifa plana Internet (Precio fijo por el servicio de Internet) =
//20€
//§ MBs máximos cuota Internet (MBs hasta donde cubre la tarifa plana)=
//600
//§ Precio por MB una vez superada la cuota = 2,5 céntimos (0,025 €)
//o DNI: “12345678Y”
//o Minutos consumidos: 180
//o SMS enviados: 2
//o MBs consumidos: 700 MB


//La TARIFA BASE(no incluye
////servicio de Internet) incluye:
////• Precio por minuto
////• Precio por SMS
////La TARIFA INTERNET que incluye servicio de Internet, tiene a mayores:
////• Cuota tarifa plana Internet (Precio fijo por el servicio de Internet)
////• MBs máximos cuota Internet (MBs hasta donde cubre la tarifa plana)
////• Precio por MB una vez superada la cuota

/*

open class Tarifas(private var precioMinuto:Double, private var precioSMS:Double) {

    open fun precioMinuto(): Double {
        return precioMinuto
    }

    open fun precioSMS(): Double {
        return precioSMS
    }

    open fun cuotaFija(): Double {
        return 0.0
    }

    open fun megasMaximos(): Int {
        return 0
    }

    open fun precioPorMB(): Double {
        return 0.0
    }
}

    class TarifaInternet(precioMinuto:Double, precioSMS:Double, private var cuotaFija:Double, private var megasMaximos: Int, private var precioPorMB:Double):Tarifas(precioMinuto, precioSMS) {

        override fun cuotaFija() : Double {
            return cuotaFija
        }

        override  fun megasMaximos():Int {
            return megasMaximos
        }

        override  fun precioPorMB():Double {
            return precioPorMB
        }
    }


class Factura(var tarifa: Tarifas, var numFactura:Int, var IVA:Double, var DNI:String, var minutosConsumidos:Int, var SMSEnviados:Int, var megasConsumidos:Int){

    var total = 0.0
    var totalSinIVA = 0.0

    fun totalBase(){
        totalSinIVA=(minutosConsumidos * tarifa.precioMinuto()) + (SMSEnviados * tarifa.precioSMS())
    }

    fun totalInternet(){
        totalBase()
        totalSinIVA = (totalSinIVA + tarifa.cuotaFija())

        if (megasConsumidos > tarifa.megasMaximos()) {
            totalSinIVA = totalSinIVA + (megasConsumidos - tarifa.megasMaximos()) * tarifa.precioPorMB()
        }
    }

    fun verDatos() {
        println(tarifa.precioMinuto())
        println(tarifa.precioSMS())

        if (megasConsumidos == 0) {
            totalBase()
            println("La factura sin IVA sale en: $totalSinIVA")
            total = totalSinIVA * (1+IVA)
            println("La factura CON IVA sale en: $total")

        } else {
            totalInternet()
            println("La factura de internet sin IVA sale en: $totalSinIVA")
            total = totalSinIVA * (1+IVA)
            println("La factura de internet CON IVA sale en: $total")
        }
    }
}

fun main() {

    var tarif1 = Tarifas(0.08, 0.35)

    var fact1 = Factura(tarif1, 4321,0.21,"15432A", 200, 10, 0)
    fact1.verDatos()

    var tarif2 = TarifaInternet(0.04, 0.25, 20.0, 600, 0.025)

    var fact2 = Factura(tarif2, 43921,0.21,"12345678Y", 180, 2, 700)
    fact2.verDatos()
}

*/

// Versión Alex Abstracta

/*

abstract class Tarifas(private var precioMinuto:Double, private var precioSMS:Double) {

    abstract fun precioMinuto(): Double
    abstract fun precioSMS(): Double

    abstract fun cuotaFija(): Double
    abstract fun megasMaximos(): Int
    abstract fun precioPorMB(): Double
}

class TarifaInternet(private var precioMinuto:Double, private var precioSMS:Double): Tarifas(precioMinuto, precioSMS) {

    private var cuotaFija = 0.0
    private var megasMaximos = 0
    private var precioPorMB = 0.0

    constructor(cuotaFija:Double, precioMinuto: Double, precioSMS: Double, megasMaximos: Int, precioPorMB:Double):this(precioMinuto, precioSMS) {
        this.cuotaFija = cuotaFija
        this.megasMaximos = megasMaximos
        this.precioPorMB = precioPorMB
    }

    override fun precioMinuto(): Double {
        return precioMinuto
    }

    override fun precioSMS(): Double {
        return precioSMS
    }

    override fun cuotaFija(): Double {
        return cuotaFija
    }

    override fun megasMaximos(): Int {
        return megasMaximos
    }

    override fun precioPorMB(): Double {
        return precioPorMB
    }
}


class Factura(var tarifa: Tarifas, var numFactura:Int, var IVA:Double, var DNI:String, var minutosConsumidos:Int, var SMSEnviados:Int, var megasConsumidos:Int){

    var total = 0.0
    var totalSinIVA = 0.0

    fun totalBase(){
        totalSinIVA=(minutosConsumidos * tarifa.precioMinuto()) + (SMSEnviados * tarifa.precioSMS())
    }

    fun totalInternet(){
        totalBase()
        totalSinIVA = (totalSinIVA + tarifa.cuotaFija())

        if (megasConsumidos > tarifa.megasMaximos()) {
            totalSinIVA = totalSinIVA + (megasConsumidos - tarifa.megasMaximos()) * tarifa.precioPorMB()
        }
    }

    fun verDatos() {
        println(tarifa.precioMinuto())
        println(tarifa.precioSMS())

        if (megasConsumidos == 0) {
            totalBase()
            println("La factura sin IVA sale en: $totalSinIVA")
            total = totalSinIVA * (1+IVA)
            println("La factura CON IVA sale en: $total")

        } else {
            totalInternet()
            println("La factura de internet sin IVA sale en: $totalSinIVA")
            total = totalSinIVA * (1+IVA)
            println("La factura de internet CON IVA sale en: $total")
        }
    }
}

fun main() {

    var tarif1 = TarifaInternet(0.08, 0.35)

    var fact1 = Factura(tarif1, 4321,0.21,"15432A", 200, 10, 0)
    fact1.verDatos()

    var tarif2 = TarifaInternet(0.04, 0.25, 20.0, 600, 0.025)

    var fact2 = Factura(tarif2, 43921,0.21,"12345678Y", 180, 2, 700)
    fact2.verDatos()
}

*/

// Versión Tati Abstracta

/*

abstract class TarifaBase(private val precioMinuto:Float, private val precioSMS:Float){

    fun getMinuto():Float{
        return precioMinuto
    }

    fun getSMS():Float{
        return precioSMS
    }

    abstract fun getCuotaPlana():Float

    abstract fun getmbTarifa():Int

    abstract fun getcuotaExtra():Float
}


class TarifaInternet( precioMinuto: Float, precioSMS: Float): TarifaBase(precioMinuto, precioSMS){

    private var cuotaPlana:Float=0f
    private var mbTarifa:Int=0
    private var cuotaExtra:Float=0f
    private var precioMinuto= 0f
    private var precioSMS=0f

    constructor(precioMinuto: Float, precioSMS: Float,cuotaPlana:Float, mbTarifa:Int, cuotaExtra:Float) : this(precioMinuto, precioSMS){
        this.cuotaPlana=cuotaPlana
        this.cuotaExtra=cuotaExtra
        this.mbTarifa=mbTarifa
        this.precioMinuto=precioMinuto
        this.precioSMS=precioSMS
    }

    override fun getCuotaPlana():Float{
        return cuotaPlana
    }

    override fun getmbTarifa():Int{
        return mbTarifa
    }

    override fun getcuotaExtra():Float{
        return cuotaExtra
    }
}

class Factura(var tarifa: TarifaBase, private val nFactura:Int,private val IVA:Float = 0.21f, private val DNI:String, private val min:Int, private val SMS:Int, private val mb:Int){

    fun total() {

        var totalSinIva = (min * tarifa.getMinuto()) + (SMS * tarifa.getSMS())


        if(mb==0){
            totalSinIva= (min * tarifa.getMinuto()) + (SMS * tarifa.getSMS())

        } else {
            if (mb < tarifa.getmbTarifa()){
                totalSinIva += tarifa.getCuotaPlana()
            } else{
                totalSinIva += ((mb - tarifa.getmbTarifa()) * tarifa.getcuotaExtra()) + tarifa.getCuotaPlana()
            }
        }
        var totalConIva = totalSinIva * (1 + IVA)
        println("El precio sin IVA es de $totalSinIva euros y el precio con IVA es de $totalConIva euros.")
    }
}
fun main(){
    val factura1 = Factura(TarifaInternet(0.08f, 0.35f), 1, 0.21f, "12345678Y",200, 10, 0)
    factura1.total()
    val factura2=Factura(TarifaInternet(0.04f, 0.25f, 20f, 600,0.025f), 2, 0.21f, "12345678Y", 180, 2, 700)
    factura2.total()
}

*/


// Crea un programa que en el que puedas introducir números enteros por consola y los guarde en un Arraylist
// hasta que introduzcas un 0. Para finalizar muestra por pantalla los números introducidos, su suma y su media.

/*

fun main() {
    var listaArray= arrayListOf<Double>()

    var algo = 1.0
    var suma = 0.0
    var contador = 0

    while (algo!=0.0){
        println("Introduce algo para añadir al array (Escribe 0 para finalizar el programa)")
        algo = readLine()!!.toDouble()

        if (algo != 0.0) {
        listaArray.add(algo)
        suma = suma + algo
        contador = contador + 1
        println(algo)}
    }

    println("Suma: $suma")
    println("Media " + (suma / contador))
    println(listaArray)

}

*/

// EJERCICIOS Clases Abstractas e Interfaces
//1. Diseña una clase Cuadrado con los siguientes miembros(los atributos serán
//privados):
//• lado
//• área=lado^2
//• perímetro=4*lado
//Diseña una clase Rectángulo con los siguientes miembros(los atributos serán privados):
//• base, altura
//• área=base*altura
//• perímetro=2*base + 2*altura
//Si analizamos detenidamente las clases vemos que las dos tienen en común los
//métodos área y perímetro. Para otras figuras ocurrirá lo mismo, y nos interesa que
//todas tengan el mismo nombre de método para calcular el área y el perímetro pero
//lógicamente siempre distinta implementación, por lo que deducimos que Cuadrado y
//Rectángulo deberían heredar de una clase Padre llamada Figura con los siguientes
//métodos:
//• área y perímetro
//Dado que en la clase Figura no se puede establecer el código de los métodos área y
//perímetro, puesto que no tiene sentido en esta clase, habrá que declararlos como
//abstractos (abstract) y consecuentemente la clase Figura deberá ser abstracta.
//Crea ahora una clase llamada Círculo que herede de Figura. Completa el código de la
//clase Círculo para que sea correcta y poder compilar el proyecto (área=PI*radio*radio
//y perímetro=2*PI*radio).
//• Crea los constructores en las clases para inicializar todos los atributos.
//• En la función main():
//o Crea tres objetos, un cuadrado, un rectángulo y un círculo. ¿Se podría
//crear un objeto de Figura? ¿Por qué?
//o Crea un array de 3 celdas de tipo Figura y guarda en el mismo los tres
//objetos anteriormente creados.
//o Recorre el array con un bucle for y muestra por pantalla las áreas y los
//perímetros de todas las figuras.
//o Sin haber hecho que las clases Cuadrado, Rectángulo y Círculo
//heredasen de Figura, ¿podríamos asegurar que el código del punto
//anterior funcionaría bien para cualquier tipo de figura almacenada en el
//array?. La respuesta a esta pregunta es la ventaja del uso de clases
//abstractas.


//Diseña una clase Cuadrado con los siguientes miembros(los atributos serán
//privados):
//• lado
//• área=lado^2
//• perímetro=4*lado

/*

abstract class Operaciones(){
    abstract fun area():Double
    abstract fun perimetro():Double
}

class Cuadrado (private var lado:Double): Operaciones() {

    override fun area(): Double {
        var area = lado.pow(2)
        return area
    }

    override fun perimetro(): Double {
         var perimetro = 4 * lado
        return perimetro

    }
}
class Rectangulo (private var base:Double, private var altura:Double): Operaciones() {

    override fun area(): Double {
        var area = base * altura
        return area
    }

    override fun perimetro(): Double {
        var perimetro = 2 * base + 2* altura
        return perimetro

    }
}
class Circulo (private var radio:Double): Operaciones() {

    override fun area(): Double {
        var area = PI * radio.pow(2)
        return area
    }

    override fun perimetro(): Double {
        var perimetro = 2 * PI * radio
        return perimetro

    }
}

fun main() {
    var cuadradito = Cuadrado(5.0)
    var rectangulito = Rectangulo(2.0,4.0)
    var circulito = Circulo(8.0)

    var figuritas:Array<Operaciones> = arrayOf(cuadradito, rectangulito, circulito)

    for (i in figuritas.indices) {
        println(figuritas[i].area())
        println(figuritas[i].perimetro())
        println("//////////////")
    }

}
*/
//Parte 2

/*

interface Operaciones{
    abstract fun area():String
    abstract fun perimetro():String
}

class Cuadrado (private var lado:Double): Operaciones {

    override fun area(): String {
        var area = lado.pow(2)
        return "El área del cuadrado es $area"
    }

    override fun perimetro(): String {
        var perimetro = 4 * lado
        return "El perímetro del cuadrado es $perimetro"
    }
}
class Rectangulo (private var base:Double, private var altura:Double): Operaciones {

    override fun area(): String {
        var area = base * altura
        return "El área del rectángulo es $area"
    }

    override fun perimetro(): String {
        var perimetro = 2 * base + 2* altura
        return "El perímetro del rectángulo es $perimetro"
    }
}
class Circulo (private var radio:Double): Operaciones {

    override fun area(): String {
        var area = PI * radio.pow(2)
        return "El área del círculo es $area"
    }

    override fun perimetro(): String {
        var perimetro = 2 * PI * radio
        return "El perímetro del círculo es $perimetro"
    }
}

fun main() {
    var cuadradito = Cuadrado(5.0)
    var rectangulito = Rectangulo(2.0,4.0)
    var circulito = Circulo(8.0)

    var figuritas:Array<Operaciones> = arrayOf(cuadradito, rectangulito, circulito)

    for (i in figuritas.indices) {
        println(figuritas[i].area())
        println(figuritas[i].perimetro())
        println("//////////////")
    }

}

*/

//3. Estamos interesados en guardar información sobre los Animales que emiten
//sonidos característicos. De los Animales, en general me interesa saber la siguiente
//información:
//• Raza, sexo, número de patas
//• Crear un método llamado grito que me devuelva la onomatopeya del grito de
//
//• un animal específico: Ej.: Perro -> ”guau”
//De los Perros a mayores me interesa saber:
//• Si es o no un perro peligroso (boolean)
//• Si está o no adiestrado (boolean)
//Del Pato a mayores me interesa saber:
//• Si tiene o no un plumaje exótico (boolean)
//En el futuro se prevé añadir más clases y todas deberán implementar obligatoriamente
//el método grito debidamente personalizado.
//• Diseña las clases oportunamente. Todos los atributos serán privados. Los
//constructores inicializarán todos los atributos de las clases.
//• En la función main():
//o Crea un array de 3 Animales
//o Inicializa el array con 3 Animales
//o Recorre el array y muestra los gritos de cada animal

/*

abstract class Animales(private val raza:String, private val sexo:String, private val num:Int) {

    abstract fun grito():String
}

class Perro(raza: String, sexo: String, num: Int, private var peligroso:Boolean, private var adiestrado:Boolean):Animales(raza, sexo, num) {
    override fun grito(): String {
        return "El perro hace guau"
    }
}

class Pato(raza: String, sexo: String, num: Int, private var exotico:Boolean):Animales(raza, sexo, num) {
    override fun grito(): String {
        return "El pato hace pato pato pato pato "
    }
}

fun main() {
    var perrito = Perro("labrador", "macho", 4, false, true)
    var patito = Pato("donald", "macho", 2, true)

    var animalitos:Array<Animales> = arrayOf(perrito, patito)

    for (i in animalitos.indices){
        println(animalitos[i].grito())
    }
}

 */

//Parte 2

/*

interface Cosa {
    fun grito():String
}
abstract class Animales(private val raza:String, private val sexo:String, private val num:Int):Cosa {
}

class Perro(raza: String, sexo: String, num: Int, private var peligroso:Boolean, private var adiestrado:Boolean):Animales(raza, sexo, num) {
    override fun grito(): String {
        return "El perro hace guau"
    }
}

class Pato(raza: String, sexo: String, num: Int, private var exotico:Boolean):Animales(raza, sexo, num) {
    override fun grito(): String {
        return "El pato hace pato pato pato pato "
    }
}

class Robot(private var tipo:String):Cosa {
    override fun grito(): String {
        return "El robot hace bip bip"
    }
}

fun main() {
    var perrito = Perro("labrador", "macho", 4, false, true)
    var patito = Pato("donald", "macho", 2, true)
    var r2 = Robot("R2-D2")

    var animalitos:Array<Cosa> = arrayOf(perrito, patito,r2)

    for (i in animalitos.indices){
        println(animalitos[i].grito())
    }
}

*/

// Versión Martín

/*

interface Grito {
    fun grito(): String
}

abstract class Animales(): Grito {
}

class Perros(private val raza: String, private val sexo: String, private val nPatas: Int,
             private val peligroso: Boolean, private val adiestrado: Boolean): Animales(){

    override fun grito(): String {
        return "El perro hace guau"
    }
}

class Patos(private val raza: String, private val sexo: String, private val nPatas: Int,
            private val plumajeExotico: Boolean): Animales(){

    override fun grito(): String {
        return "El pato hace cuac"
    }
}

class Robot(): Grito {
    override fun grito(): String {
        return "El robot hace titititti"
    }
}

fun main() {

    val animales = arrayListOf<Grito>(Perros("Pastor Alemán", "Hembra", 4, false, true),
        Patos("Azulon", "Macho", 2, true))
    animales.add(Robot())

    for (i in animales){
        println(i.grito())
    }
}

*/

// PRÁCTICA 1 CONOCIMIENTOS GENERALES KOTLIN

//En esta relación, implementaremos la “base de datos” de una clínica veterinaria. Se
//compondrá principalmente de una lista de animales. Como los animales tendrán
//diferentes características dependiendo de su especie, crearemos varias clases para las
//diferentes categorías que heredarán de la clase principal Animal.
//Clases y Enum que nos hacen falta:
//• Animal (clase abstracta):
//o Atributos (todos public para poder acceder desde fuera):
//§ nombre, de tipo String
//§ fechaNacimiento, de tipo Date
//Date(year: Int, month: Int, day: Int)
//§ peso, de tipo Double
//§ comentarios, de tipo String
//o Método abstracto:
//§ ToString(), para obligar a que las clases que heredan de Animal
//implementen obligatoriamente el ToString(). La definición es:
//abstract override fun toString(): String
//
//• Perro (hereda de Animal)
//o Atributos adicionales:
//§ raza, clase del tipo enum RazaPerro que podrá tener los valores:
//• PastorAleman, Husky, FoxTerrier, Dalmata, SanBernardo
//§ microchip, de tipo String
//o Constructor con los datos: nombre, raza, fechaNacimiento, peso,
//microchip y comentarios.
//o Método ToString() que sobreescribe al abstracto que servirá para
//mostrar porpantalla una fichita con todos los atributos de perro
//(incluyendo los de animal).
//Ejemplo:
//Ficha de Perro
//Nombre: Luna
//Raza: Pastor alemán
//Fecha de Nacimiento: 12/02/2003
//Peso: 12,4 kg
//Microchip: 38479382749DF39
//Comentarios: Está pachucho.
//
//• Gato (hereda de Animal)
//o Atributos adicionales:
//§ raza, del tipo enum RazaGato que podrá tener los valores:
//• Comun, Siames, Persa, Angora, ScottishFold.
//§ microchip, de tipo String
//o Constructor y método igual que Perro (adaptados a los atributos de
//Gato).
//
//• Pájaro (hereda de Animal)
//o Atributos adicionales:
//§ especie, tipo enum EspeciePajaro que podrá tener los valores:
//• Canario, Periquito, Agapornis.
//§ cantor, de tipo booleano que nos dirá si da mucho la lata por las
//mañanas.
//
//o Constructor y método igual que Perro (adaptados a los atributos de
//Pájaro).
//
//• Reptil (hereda de Animal)
//o Atributos adicionales:
//§ especie, tipo enume EspecieReptil que podrá tener los valores:
//• Tortuga, Iguana, DragonDeComodo.
//§ venenoso, que será de tipo bool y nos dirá lo divertido que es
//que te pique un bicho de éstos.
//
//o Constructor y método igual que Perro (adaptados a los atributos de
//Reptil).
//• ClinicaVeterinaria
//o Atributos:
//§ listaAnimales será una mutableList de Animal en la que
//meteremos todos los animales, independientemente de que
//sean Perros, Gatos, Pájaros o Reptiles.
//
//o Métodos:
//§ InsertaAnimal al que le pasamos un Animal y lo añade a la lista.
//§ BuscaAnimal al que le pasamos el nombre del bicho y nos
//devuelve el Animal en cuestión.
//§ ModificaComentarioAnimal al que le pasamos el nombre del
//animal y el nuevo comentario y nos modifica el comentario en la
//ficha del animal que está en la lista.
//§ ToString() sobrescrito, como siempre, que nos muestra la lista
//de todas las fichas de los animales.
//
//Hacer un programa (main()) que te permita añadir animales de los diferentes tipos y
//nos permita modificar los comentarios y mostrar por pantalla.

// Animal (clase abstracta):
//o Atributos (todos public para poder acceder desde fuera):
//§ nombre, de tipo String
//§ fechaNacimiento, de tipo Date
//Date(year: Int, month: Int, day: Int)
//§ peso, de tipo Double
//§ comentarios, de tipo String
//o Método abstracto:
//§ ToString(), para obligar a que las clases que heredan de Animal
//implementen obligatoriamente el ToString(). La definición es:
//abstract override fun toString(): String

/*

class Date(var año:Int, var mes:Int, var dia:Int) {
    override fun toString(): String {
        return "$dia/$mes/$año"
    }
}


abstract class Animal(var nombre:String, var fechaNacimiento:Date, var peso:Double, var comentarios:String) {

    abstract override fun toString(): String
}


class Perro(nombre:String, var raza:RazaPerro, fechaNacimiento:Date, peso:Double, var microchip:String, comentarios:String):Animal(nombre, fechaNacimiento, peso, comentarios) {

    override fun toString(): String {
        return ("\nFicha de perro." +
                "\nNombre: $nombre." +
                "\nRaza: $raza." +
                "\nFecha nacimiento: $fechaNacimiento." +
                "\nPeso: $peso kg." +
                "\nMicrochip: $microchip." +
                "\nComentarios: $comentarios.")
    }
}
enum class RazaPerro {
    PASTORALEMAN, HUSKY, FOXTERRIER, DALMATA, SANBERNARDO;

    override fun toString(): String {

        return when(this){
            PASTORALEMAN -> "pastor alemán"
            HUSKY -> "husky"
            FOXTERRIER -> "fox terrier"
            DALMATA -> "dálmata"
            SANBERNARDO -> "san bernardo"
        }
    }
}
class Gato(nombre:String, var raza:RazaGato, fechaNacimiento:Date, peso:Double, var microchip:String, comentarios:String):Animal(nombre, fechaNacimiento, peso, comentarios) {

    override fun toString(): String {
        return ("\nFicha de gato." +
                "\nNombre: $nombre." +
                "\nRaza: $raza." +
                "\nFecha nacimiento : $fechaNacimiento." +
                "\nPeso: $peso kg." +
                "\nMicrochip: $microchip." +
                "\nComentarios: $comentarios.")
    }
}
enum class RazaGato {

    COMUN, SIAMES, PERSA, ANGORA, SCOTTISHFOLD;

    override fun toString(): String {

        return when(this){
            COMUN -> "común"
            SIAMES -> "siamés"
            PERSA -> "persa"
            ANGORA -> "angora"
            SCOTTISHFOLD -> "scottish fold"
        }
    }
}
class Pajaro(nombre:String, var especie:EspeciePajaro, fechaNacimiento:Date, peso:Double, var cantor:Boolean, comentarios:String):Animal(nombre, fechaNacimiento, peso, comentarios) {

    fun cantor():String{
        if(cantor==true){
            return "Es cantor"
        } else{
            return "No es cantor"
        }
    }

    override fun toString(): String {
        return ("\nFicha de pájaro." +
                "\nNombre: $nombre." +
                "\nEspecie: $especie." +
                "\nFecha nacimiento : $fechaNacimiento." +
                "\nPeso: $peso kg." +
                "\nCantor: ${cantor()}." +
                "\nComentarios: $comentarios.")
    }
}
enum class EspeciePajaro {

    CANARIO, PERIQUITO, ANAPORNIS;

    override fun toString(): String {

        return when(this){
            CANARIO -> "canario"
            PERIQUITO -> "periquito"
            ANAPORNIS -> "anapornis"
        }
    }
}
class Reptil(nombre:String, var especie:EspecieReptil, fechaNacimiento:Date, peso:Double, var venenoso:Boolean, comentarios:String):Animal(nombre, fechaNacimiento, peso, comentarios){

    fun venenoso():String{
        if(venenoso == true){
            return "Es venenoso"
        } else{
            return "No es venenoso"
        }
    }

    override fun toString(): String {
        return return ("\nFicha de réptil." +
                "\nNombre: $nombre." +
                "\nEspecie: $especie." +
                "\nFecha nacimiento : $fechaNacimiento." +
                "\nPeso: $peso kg." +
                "\nVenenoso: ${venenoso()}." +
                "\nComentarios: $comentarios.")
    }
}
enum class EspecieReptil {

    TORTUGA, IGUANA, DRAGONDECOMODO;

    override fun toString(): String {

        return when(this){
            TORTUGA -> "tortuga"
            IGUANA-> "iguana"
            DRAGONDECOMODO -> "dragón de Comodo"
        }
    }
}
class ClinicaVeterinaria() {

    var listaAnimales = mutableListOf<Animal>(Perro("Laika", RazaPerro.HUSKY, Date(2012, 1, 3), 10.3, "785412P", "skjughfdhw"))

    fun insertarAnimal(animal: Animal){
        listaAnimales.add(animal)

    }

    fun buscarAnimal(nombre:String):List<Animal>{
        return listaAnimales.filter { it.nombre.equals(nombre) }
    }

    fun modificaComentarioAnimal(nombre: String, comentario:String) {

        for (i in listaAnimales.indices) {
            if (listaAnimales[i].nombre == nombre) {
                listaAnimales[i].comentarios = comentario

            }
        }
    }

    override fun toString(): String {
        return listaAnimales.toString()
    }
}
fun main() {
    val veterinario = ClinicaVeterinaria()
    veterinario.insertarAnimal(Pajaro("Pitiño", EspeciePajaro.CANARIO, Date(2022,1, 2), 0.1, true, "Fáltalle un pé"))
    veterinario.insertarAnimal(Perro("Lúa", RazaPerro.PASTORALEMAN, Date(2013, 5, 4), 15.3, "ES78954H258", "Doélle a barriga"))

    println("////////////////////////////////////////////////")
    println("El animal buscado")
    println("${ veterinario.buscarAnimal("Pitiño")}")
    println("////////////////////////////////////////////////")
    println(veterinario.modificaComentarioAnimal("Lúa", "Está curada"))
    println(veterinario.modificaComentarioAnimal("Laika", "Dada de alta"))
    println(veterinario)
}

*/

// PRÁCTICA 2 CONOCIMIENTOS GENERALES KOTLIN
//Crear una aplicación para simular la gestión de una Librería(Clase) llevando el control
//de los libros (hasta un máximo de 50). Para cada libro almacenamos:
//• Titulo
//• Autor
//• Número de Páginas.
//• Tema: (Solo puede ser Aventuras, Biografía, Ciencia, Economía, Historia,
//Informática). (Enum Class)
//• Formato: (Solo puede ser Cartoné, Rustico o Tapa dura). (Enum Class)
//• Estado: (Solo puede ser Novedad o Reedición). (Enum Class)
//En la función main() se debe permitir:
//• Añadir un nuevo libro.
//o Si la lista está completa (50 libros máximo) enviará un mensaje de error.
//• Eliminar un libro.
//o Si la lista está vacía e intentamos borrar enviará un mensaje de error.
//o Debe mostrar un mensaje de advertencia ¿Estás seguro de borrar?, si
//escogemos si, borra el libro, sino no hace nada.
//
//• Mostrar un libro de la lista en base a su título, deben aparecer todos los datos
//• correspondientes a este libro.

/*

class Autor( var titulo: String, var autor: String, var numPaginas: Int, var tema:Tema, var formato:Formato, var estado:Estado) {

    override fun toString(): String {
        return ("\nFicha del libro." +
                "\nTítulo: $titulo." +
                "\nAutor: $autor." +
                "\nNúmero de páginas: $numPaginas." +
                "\nTema: $tema. " +
                "\nFormato: $formato." +
                "\nEstado: $estado.")
    }
}

enum class Tema {
    AVENTURAS, BIOGRAFIA, CIENCIA, ECONOMIA, HISTORIA;

    override fun toString(): String {

        return when(this){
            AVENTURAS -> "Aventuras"
            BIOGRAFIA -> "Biografía"
            CIENCIA -> "Ciencia"
            ECONOMIA -> "Economía"
            HISTORIA -> "Historia"
        }
    }
}

enum class Formato {
    CARTONE, RUSTICO, TAPA_DURA;

    override fun toString(): String {

        return when(this){
            CARTONE -> "Cartoné"
            RUSTICO -> "Rustico"
            TAPA_DURA -> "Tapa dura"
        }
    }
}

enum class Estado {
    NOVEDAD, REEDICION;

    override fun toString(): String {

        return when(this){
            NOVEDAD -> "Novedad"
            REEDICION -> "Reedición"
        }
    }
}

class Libreria() {

    var listaLibreria = mutableListOf<Autor>(Autor("El ladrón del rayo", "Rick Riordan", 300, Tema.AVENTURAS, Formato.TAPA_DURA, Estado.REEDICION))

    var titulo=""
    var autor=""
    var numPaginas=0
    var tema = Tema.AVENTURAS
    var formato = Formato.RUSTICO
    var estado = Estado.NOVEDAD

    fun iniciar(): Autor {
        println("Inserte títalo:")
        titulo = readLine()!!.toString()
        println("Inserte autor:")
        autor = readLine()!!.toString()
        println("Inserte número de páginas:")
        numPaginas = readLine()!!.toInt()
        println("Inserte tema (AVENTURAS, BIOGRAFIA, CIENCIA, ECONOMIA, HISTORIA):")
        tema= Tema.valueOf(readLine()!!.toString())
        println("Inserte formato (CARTONE, RUSTICO, TAPA_DURA):")
        formato= Formato.valueOf(readLine()!!.toString())
        println("Inserte estado (NOVEDAD, REEDICION):")
        estado= Estado.valueOf(readLine()!!.toString())

        return (Autor(titulo,autor,numPaginas, tema, formato, estado))
    }

    fun insertarLibreria(autor: Autor) {
        println(autor)
        if (listaLibreria.size > 50) {
            println("La lista ya está completa")
        } else {
            listaLibreria.add(autor)
        }
        println(listaLibreria)
    }

    fun buscarLibro(titulo: String):List<Autor>{
        return listaLibreria.filter { it.titulo.equals(titulo) }
    }

    fun borrarLibro(titulo: String) {

        var advertencia = ""

        println("Seguro que quieres borrar el libro? (S/N):")
        advertencia = readLine()!!.toString()

        if (advertencia == "S" || advertencia == "s") {
            listaLibreria.removeAll { it.titulo.equals(titulo)}
        }
    }

    override fun toString(): String {
        return listaLibreria.toString()
    }
}

fun main() {
    var libreria = Libreria()
    libreria.insertarLibreria(Autor("El mar de los monstruos","Rick Riordan", 320, Tema.AVENTURAS, Formato.TAPA_DURA, Estado.REEDICION))

    // Comprobar los 50 libros
/*
    for (i in 1..50) {
        libreria.insertarLibreria(Autor("El mar de los monstruos","Rick Riordan", 320, Tema.AVENTURAS, Formato.TAPA_DURA, Estado.REEDICION))
        println("///////////////")
        println(i)
        println("////////////////////////////////////////////////////////////////////////////")
    }
 */

   // println("///////////////////  Borrar libro  /////////////////////")
   // println(libreria)
  //  libreria.borrarLibro("El ladrón del rayo")
   // println("///////////////////  Libro borrado  /////////////////////")
   // println(libreria)


    // Mostrar un libro de la lista en base a su título, deben aparecer todos los datos
// correspondientes a este libro.
    //libreria.insertarLibreria(Autor("La marca de Atenea","Rick Riordan", 350, Tema.AVENTURAS, Formato.TAPA_DURA, Estado.REEDICION))
  //  println("////////////////////  Mostrar libro  ////////////////")
   // println(libreria.buscarLibro("El mar de los monstruos"))
   // println("////////////////////  Mostrar todos los libros  ////////////////")
  //  println(libreria)


    fun menu() {
        var contador = 0
        while (contador != 4 ) {
            println("Gestión de libreria")
            println("1.- Añadir libro")
            println("2.- Eliminar libro")
            println("3.- Mostrar libro")
            println("4.- Fin")
            println("Escoge opción: ")
            var x = readLine()!!.toInt()
            when (x) {
                1 -> libreria.insertarLibreria((Libreria().iniciar()))
                2 -> {
                    println("Que quieres borrar?")
                    var titulo = readLine()!!.toString()
                    libreria.borrarLibro(titulo)
                }
                3 -> {
                    println("Que libro quieres buscar?")
                    var titulo = readLine()!!.toString()
                    println(libreria.buscarLibro(titulo))
                }
                4 -> {
                    contador = 4
                    println("FIN")
                }
            }
        }
    }

    menu()
    println(libreria)
}


*/

// hola
// adios
