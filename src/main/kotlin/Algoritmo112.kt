// Código original
// Enunciado:
// Entrar com dois números e imprimir o menor número (suponha números diferentes).
//
// prog se23
// real a, b;
// imprima "\ndigite 1 numero: ";
// leia a;
// imprima "\ndigite 2 numero: ";
// leia b;
// se (a < b)
// { imprima "\nmenor: ", a; }
// senao
// { imprima "\nmenor: ", b; }
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    print("Digite 1 número: ")
    val a = readLine()?.toDoubleOrNull() ?: return

    print("Digite 2 número: ")
    val b = readLine()?.toDoubleOrNull() ?: return

    if (a < b) {
        println("Menor: $a")
    } else {
        println("Menor: $b")
    }
}