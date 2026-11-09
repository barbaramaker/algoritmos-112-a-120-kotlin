// Código original
// Enunciado:
// Entrar com três números e imprimi-los em ordem decrescente (suponha números diferentes).
//
// prog se30
// real a, b, c, aux;
// imprima "\ndigite 1 numero: " ;
// leia a;
// imprima "\ndigite 2 numero: " ;
// leia b;
// imprima "\ndigite 3 numero: " ;
// leia c;
// se ( a > b )
// { aux <- a; a <- b; b <- aux; }
// se ( a > c )
// { aux <- a; a <- c; c <- aux; }
// se ( b > c )
// { aux <- b; b <- c; c <- aux; }
// imprima "\nOrdem Decrescente: " c, " ",b, " " ,a ;
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

    // Após ordenar de forma crescente nas variáveis (a <= b <= c),
    // imprimimos de trás para frente para obter a ordem decrescente.
    println("Ordem Decrescente: $c $b $a")
}