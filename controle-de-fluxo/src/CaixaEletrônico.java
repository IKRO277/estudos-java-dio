public class CaixaEletrônico {
    public static void main(String[] args) {
        //Fluxo simples.
        double saldo = 25.0;
        double valorSolicitado = 16.0;

        if(valorSolicitado < saldo){
        saldo = saldo - valorSolicitado;
        System.out.println("novo saldo: " + saldo);
        }
        else{
        System.out.println("saldo insuficiente");
        }
    }
}
