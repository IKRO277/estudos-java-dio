public class ExemploForArray {
    public static void main(String[] args) {
        //trabalhando for com arrays
        String alunos [] = { "Vitor", "Julia", "Vitor", "Marcos"};
        for(int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no índice x= " + x + " é " + alunos[ x ]);
        }
    }
}
//poderia ser:
//for(String aluno : alunos){
// System.out.println("O aluno é: " + aluno);