// Código original
// Enunciado:
// Entrar com dois números e imprimi-los em ordem decrescente (suponha números diferentes).
//
// prog se25
// real a, b;
// imprima "\ndigite 1 numero: ";
// leia a;
// imprima " \ndigite 2 numero: ";
// leia b;
// se (a > b)
// { imprima "\n",a , " " ,b; }
// senao
// { imprima "\n",b " ",a; }
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    print("Digite 1 número: ")
    val a = readLine()?.toDoubleOrNull() ?: return

    print("Digite 2 número: ")
    val b = readLine()?.toDoubleOrNull() ?: return

    if (a > b) {
        println("$a $b")
    } else {
        println("$b $a")
    }
}