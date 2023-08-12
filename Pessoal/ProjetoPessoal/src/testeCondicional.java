public class testeCondicional {
    public static void main(String[] args) {
        
    String sigla = "M";

    switch (sigla) {
        case "P":{
              System.out.println("PEQUENO");
            break;
        }
        case "M":{
             System.out.println("MÉDIO");
            break;
        }
        case "G":{
             System.out.println("GRANDE");
            break;
        }
        default:
            System.out.println("INDEFINIDO");
            break;
    }
    

    /* 
    <<Mais performática em questão de sintaxe>>
     * int nota = 10;
        //
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
    */
    }
}
