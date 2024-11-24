import java.time.LocalDate;
import java.util.Scanner;

import CadastroAnimal.*;

public class PetShopCadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Instancia animal
        Animal animal1 = new Animal();

        System.out.print("Digite o nome do animal: ");
        animal1.setNome(scanner.nextLine());
        System.out.print("Digite o Telefone do responsável: ");
        animal1.setTelefone(scanner.nextLine());
        System.out.print("Digite o Endereço do responsável: ");
        animal1.setEndereco(scanner.nextLine());
        System.out.print("Digite o Tipo do Animal: ");
        animal1.setTipo(scanner.nextLine());
        System.out.print("Digite a Raça do Animal: ");
        animal1.setRaca(scanner.nextLine());
        System.out.print("Digite a Idade do Animal: ");
        animal1.setIdade(scanner.nextInt());
        animal1.setDataCadastro(LocalDate.now());

        //Instancia servico
        Servico servico1 = new Servico();
        scanner.nextLine();
        System.out.print("Digite o Tipo do Servico: ");
        servico1.setTipoServico(scanner.nextLine());
        System.out.print("Digite a Descrição do Servico: ");
        servico1.setDescricao(scanner.nextLine());
        servico1.setDataServico(LocalDate.now());
        servico1.setNome("Serviço para " + animal1.getNome());
        servico1.setTelefone(animal1.getTelefone());

        System.out.println("\nCadastro do Animal:");
        animal1.imprimirCadastro();
        System.out.println("\nCadastro do Serviço:");
        servico1.imprimirCadastro();
        scanner.close();
    }
}
