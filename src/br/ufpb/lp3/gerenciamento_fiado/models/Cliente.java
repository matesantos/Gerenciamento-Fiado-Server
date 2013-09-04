package br.ufpb.lp3.gerenciamento_fiado.models;


public class Cliente extends Pessoa {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Cliente(Long id,String nome, String telefone, String rg, String cpf,
			Endereco endereco) {
		super(id, nome, telefone, rg, cpf, endereco);
	}
	
	public Cliente(String nome, String telefone, String rg, String cpf,
			Endereco endereco) {
		super(nome, telefone, rg, cpf, endereco);
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", telefone=" + telefone + ", rg="
				+ rg + ", cpf=" + cpf + ", endereco=" + endereco
				+ ", getNome()=" + getNome() + ", getTelefone()="
				+ getTelefone() + ", getRg()=" + getRg() + ", getCpf()="
				+ getCpf() + ", getEndereco()=" + getEndereco()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	/*
	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readFromParcel(Parcel in) {
		// TODO Auto-generated method stub
		
	}
*/
}
