// Código original
// Enunciado:
// Entrar com três números e imprimi-los em ordem crescente (suponha números diferentes).
// Várias são as soluções para colocar três números em ordem crescente, decrescente, maior e menor ou intermediário.
// Acreditamos que esta solução seja bem simples e tem como objetivo armazenar na variável a o menor valor;
// na variável b, o segundo valor; e na variável c, o maior valor.
//
// prog se29
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
// imprima "\nOrdem Crescente: ", a, " " ,b, " ",c ;
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

    println("Ordem Crescente: $a $b $c")
}