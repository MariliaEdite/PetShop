package CadastroAnimal;
import java.time.LocalDate;
public class Servico extends Cadastro {
    private String tipoServico;
    private LocalDate dataServico;
    private String descricao;

    // GETTERS E SETTERS 

	public String getTipoServico() {
		return this.tipoServico;
	}

	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}

	public LocalDate getDataServico() {
		return this.dataServico;
	}

	public void setDataServico(LocalDate dataServico) {
		this.dataServico = dataServico;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

    @Override
    public void imprimirCadastro(){
        System.out.println("Cadastro do Serviço: ");
        System.out.println("Tipo de Serviço: " + getTipoServico());
        System.out.println("Data do Serviço: " + getDataServico());
        System.out.println("Descrição: " + getDescricao());  

    }
    public void realizarServico(){
        System.out.println("Serviço de " + getTipoServico() + "realizado com sucesso!");
    }
}
