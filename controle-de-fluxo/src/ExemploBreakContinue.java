public class ExemploBreakContinue{
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero++){
            if(numero == 3)
            break;
            //poderia ser continue por exemplo, ele apenas continuaria.
             System.out.println(numero);
        }
    }
}