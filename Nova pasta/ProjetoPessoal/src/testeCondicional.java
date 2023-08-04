public class testeCondicional {
    public static void main(String[] args) {
        
    int nota = 10;

    if(nota >= 7) {
        System.out.println("Aprovado");
    }
    else if(nota <= 5) {
        System.out.println("Reprovado");
    }
    else if(nota > 5 && nota < 7 ) {
        System.out.println("Prova Minerva");
    }
    else if(nota < 0 ) {
        System.out.println("Prova Minerva");
    }
    else
        System.out.println("Por favor insira a nota novamente");
    
    }
}
