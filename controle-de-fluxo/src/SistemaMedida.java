public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "A";
        //Switch case
        //Se tirar o break, podemos complementar com a ação abaixo.
        switch ( sigla){
            case "P":{
                System.out.println("Pequeno");
                break;
            }
            case "M":{
                System.out.println("Médio");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            }
            default:
            System.out.println("Indefinido");
        
        }

    }
}
