public class Main {
      private static String nome;
      private static String cpf;
      private static int idade;

public static void main (String [] args){
    Pessoa p1 = new Pessoa(nome, cpf, idade);
    GerenciadorPessoas gerenciamento = new GerenciadorPessoas();

    p1.setNome ("vitória");
    p1.setCpf ("021.916.641-21");
    p1.setIdade (18);
     System.out.println(" Nome:" + p1.getNome()  + " Cpf:" + p1.getCpf() + " Idade:" + p1.getIdade() );

     gerenciamento.cadastrarPessoa1(new Pessoa(" maria ", "273.183.158-38", 37 ));
     gerenciamento.cadastrarPessoa2(new Pessoa("josé ", "055,653,822-62", 38));

     System.out.println("Informações da pessoa1");
     gerenciamento.exibirPessoa1();
     System.out.println("Informações da pessoa2");
     gerenciamento.exibirPessoa2();

     gerenciamento.atualizarPessoa1(new Pessoa(" pedro ", "125.348.365-54", 35));
     System.out.println("\nInformações da Pessoa1 (atualizadas):");
     gerenciamento.exibirPessoa1();
     gerenciamento.atualizarPessoa2(new Pessoa(" lucas ", "346.165.324-36", 40));
     System.out.println("\nInformações da Pessoa2 (atualizadas):");
     gerenciamento.exibirPessoa2();



}
}
