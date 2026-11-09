// Código original
// Enunciado:
// Entrar com três números e imprimir o maior número (suponha números diferentes).
//
// prog se27solucao1
// real a, b, c;
// imprima "\ndigite 1 numero: ";
// leia a;
// imprima "\ndigite 2 numero: ";
// leia b;
// imprima "\ndigite 3 numero: ";
// leia c;
// se (a > b)
// {
// se (a > c)
// { imprima "\nmaior: " a }
// senao
// { imprima "\nmaior: " c; }
// }
// senão
// {
// se ( b > c)
// { imprima "\nmaior: " b; }
// sena o
// { imprima "\nmaior: " c ; }
// }
// imprima "\n"
// fimprog
//
// (Alternativa prog se27solucao2 utiliza se ( a > b && a > c ))

// Código em Kotlin

fun main() {
    print("Digite 1 número: ")
    val a = readLine()?.toDoubleOrNull() ?: return

    print("Digite 2 número: ")
    val b = readLine()?.toDoubleOrNull() ?: return

    print("Digite 3 número: ")
    val c = readLine()?.toDoubleOrNull() ?: return

    // Solução idiomática usando maxOf do Kotlin
    val maior = maxOf(a, b, c)
    println("maior: $maior")
}