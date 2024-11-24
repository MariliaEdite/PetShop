package CadastroAnimal;

public class Animal extends Cadastro{
    private String tipo;
    private String raca;
    private double altura;
    private double peso;
    private int idade;

    //GETTERS E SETTERS

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRaca() {
		return this.raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public double getAltura() {
		return this.altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

    @Override
    public void imprimirCadastro(){
        System.out.println("Cadastro do Animal: ");
        System.out.println("Nome: " + getNome());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Raça: " + getRaca());
        System.out.println("Idade: " + getIdade() + " anos");
        

    }

}
