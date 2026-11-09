// Código original
// Enunciado:
// Criar o algoritmo que deixe entrar com dois números e imprimir
// o quadrado do menor número e a raiz quadrada do maior número, se for possível.
//
// prog se26
// real x, y;
// imprima "\ndigite valor de x: ";
// leia x;
// imprima "\ndigite valor de y: ";
// leia y;
// se(x > y)
// {imprima "\n", raiz(x}, "\n", y **2;}
// senao
// { se(y > x}
// {imprima "\n", raiz(y), "\n", x **2;}
// senao
// { imprima "\nnumeros iguais";}
// }
// imprima "\n";
// flmprog

// Código em Kotlin

import kotlin.math.sqrt

fun main() {
    print("Digite valor de x: ")
    val x = readLine()?.toDoubleOrNull() ?: return

    print("Digite valor de y: ")
    val y = readLine()?.toDoubleOrNull() ?: return

    if (x > y) {
        // x é maior (raiz), y é menor (quadrado)
        println("Raiz do maior ($x): ${sqrt(x)}")
        println("Quadrado do menor ($y): ${y * y}")
    } else if (y > x) {
        // y é maior (raiz), x é menor (quadrado)
        println("Raiz do maior ($y): ${sqrt(y)}")
        println("Quadrado do menor ($x): ${x * x}")
    } else {
        println("Números iguais")
    }
}