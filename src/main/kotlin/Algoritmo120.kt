// Código original
// Enunciado:
// Entrar com três números e armazená-los em três variáveis com os seguintes nomes:
// maior, intermediário e menor (suponha números diferentes).
//
// prog se31a / prog se31b
// real a, b, c, aux, maior, intermediario, menor;
// imprima "\ndigite 1 numero: ";
// leia a;
// imprima "\ndigite 2 numero: ";
// leia b;
// imprima "\ndigite 3 numero: ";
// leia c;
// se (a > b) { aux <- a; a <- b; b <- aux; }
// se (a > c) { aux <- a; a <- c; c <- aux; }
// se (b > c) { aux <- b; b <- c; c <- aux; }
// maior <- c;
// intermediario <- b;
// menor <- a;
// imprima "\nmaior: ", maior;
// imprima "\nintermediario: ", intermediario;
// imprima "\nmenor: ", menor;
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    print("Digite 1 número: ")
    var a = readLine()?.toDoubleOrNull() ?: return

    print("Digite 2 número: ")
    var b = readLine()?.toDoubleOrNull() ?: return

    print("Digite 3 número: ")
    var c = readLine()?.toDoubleOrNull() ?: return

    var aux: Double

    // Ordenação lógica para garantir os papéis de menor, intermediário e maior
    if (a > b) {
        aux = a
        a = b
        b = aux
    }
    if (a > c) {
        aux = a
        a = c
        c = aux
    }
    if (b > c) {
        aux = b
        b = c
        c = aux
    }

    val menor = a
    val intermediario = b
    val maior = c

    println("Maior: $maior")
    println("Intermediário: $intermediario")
    println("Menor: $menor")
}