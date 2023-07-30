public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String meuCepFormatado = formatarCep("23765064");
            System.out.println(meuCepFormatado);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            System.out.println("O sistema só aceita no 8 dígitos.");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
