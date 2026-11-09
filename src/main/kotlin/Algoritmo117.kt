// Código original
// Enunciado:
// Entrar com três números e armazenar o maior número na variável de nome maior (suponha números diferentes).
// Esta é uma solução alternativa e melhor para o algoritmo anterior.
//
// prog se28solucao1 / prog se28solucao2
// real a, b, c, maior;
// imprima "\ndigite 1 numero: " ;
// leia a;
// imprima "\ndigite 2 numero: " ;
// leia b;
// imprima "\ndigite 3 numero: " ;
// leia c;
// maior <- a;
// se (b > maior) { maior <- b; }
// se (c > maior) { maior <- c; }
// imprima "\nmaior: ", maior;
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    print("Digite 1 número: ")
    val a = readLine()?.toDoubleOrNull() ?: return

    print("Digite 2 número: ")
    val b = readLine()?.toDoubleOrNull() ?: return

    print("Digite 3 número: ")
    val c = readLine()?.toDoubleOrNull() ?: return

    var maior = a
    if (b > maior) {
        maior = b
    }
    if (c > maior) {
        maior = c
    }

    println("Maior: $maior")
}