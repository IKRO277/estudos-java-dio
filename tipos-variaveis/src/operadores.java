public class operadores {
    
    public static void main(String[] args){

        String nomeCompleto = "Linguagem" + "Java";
            System.out.println(nomeCompleto);

        int a, b;
        a = 6;
        b = 6;

        String resultado = "";
            if (a==b)
                resultado = "Verdadeiro";
            else
                resultado = "Falso";
        System.out.println(resultado);
        // ou posso usar(String resultado = a==b ? "Verdadeiro" : "Falso";)
        int numero1, numero2;
        numero1 = 4;
        numero2 = 6;

        boolean simNao = numero1 == numero2; 

            System.out.println("numero1 é igual numero2 ? " + simNao);

        simNao = numero1 != numero2;

            System.out.println("numero1 é diferente de numero2 ? " + simNao);

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas são verdadeiras");
        }
        if(condicao1 || condicao2){
            System.out.println("Pelo menos uma é verdadeira");
        }
        System.out.println("fim");

        int number1 = (5+4);
        int number5 = (5+9);

        if(number1 == number5){
        System.out.println("é igualzin");
        }
        else
        System.out.println("não é igualzin");
    }
}
