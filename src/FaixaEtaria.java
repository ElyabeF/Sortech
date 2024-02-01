public class FaixaEtaria {
    public static void main(String[] args) {
        String nome1 = "Fulano";
        int datanascimento1 = 1980;
        String nome2 = "Beltrano";
        int datanascimento2 = 2000;
        int anoatual = 2024;
        int idade1 = anoatual - datanascimento1;
        int idade2 = anoatual - datanascimento2;

        String faixaEtaria;
        if (idade1 <= 17) {
            faixaEtaria = "ADOLESCENTE";
        } else if (idade1 >= 18 && idade1 <= 29) {
            faixaEtaria = "JOVEM";
        } else if (idade1 >= 30 && idade1 <= 59){
            faixaEtaria = "ADULTO";
        } else { faixaEtaria = "IDOSO"; }

        String faixaEtaria2;
        if (idade2 <= 17) {
            faixaEtaria2 = "ADOLESCENTE";
        } else if (idade2 >= 18 && idade2 <= 29) {
            faixaEtaria2 = "JOVEM";
        } else if (idade2 >= 30 && idade2 <= 59){
            faixaEtaria2 = "ADULTO";
        } else { faixaEtaria2 = "IDOSO"; }


        System.out.println(">>> Listagem dos Clientes");
        System.out.println(">>> Ano atual: 2024");
        System.out.println("____________________________");
        System.out.println("Nome: " + nome1);
        System.out.println("Data de Nascimento: " + datanascimento1);
        System.out.println("Idade: " + idade1 );
        System.out.println("Caracteristica Etária: " + faixaEtaria);
        System.out.println("____________________________");
        System.out.println("Nome: " + nome2);
        System.out.println("Data de Nascimento: " + datanascimento2);
        System.out.println("Idade: " + idade2 );
        System.out.println("Caracteristica Etária: " + faixaEtaria2);




    }
}


