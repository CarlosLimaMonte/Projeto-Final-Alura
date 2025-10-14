import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BuscaCep buscaCep = new BuscaCep();
        GuardaCep guardaCep = new GuardaCep();
        List<Cep> listaCep = new ArrayList<>();

        System.out.print("Digite o cep que gostaria de pesquisar: ");
        String cep = input.nextLine();

        Cep c1 = buscaCep.buscaCep(cep);
        listaCep.add(c1);

        System.out.print("Deseja busca mais um Cep? Sim / Não");
        String opcao = input.nextLine();

        while(opcao.equalsIgnoreCase("sim")){
            System.out.print("Digite o cep que gostaria de pesquisar: ");
            cep = input.nextLine();
            c1 = buscaCep.buscaCep(cep);
            listaCep.add(c1);
            System.out.print("Deseja busca mais um Cep? Sim / Não: ");
            opcao = input.nextLine();
        }

        guardaCep.guardaMaisdeUmCep(listaCep);
        System.out.println(listaCep);

    }
}