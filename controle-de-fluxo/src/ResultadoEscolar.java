public class ResultadoEscolar {

    public static void main(String[] args) {
        //Sistema de Fluxo Composto
        int nota = 6;

        if(nota >= 7){
             System.out.println("Aprovado");
        }
       

        else if(nota < 7 && nota >=5) {
            System.out.println("Recuperação");
        }

        else{
            System.out.println("Reprovado");
        }
        //Podemos utilizar operadores ternários.
        // String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota < 7 ? "Recuperação" : "Reprovado";
        // System.out.println("resultado");
        
    }
}
