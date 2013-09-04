package br.ufpb.lp3.gerenciamento_fiado.models;

public class Vendedor extends Pessoa {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private String login;
	private String senha;

	public Vendedor(Long id,String nome, String telefone, String rg, String cpf,
			Endereco endereco,String login, String senha) {
		super(id,nome, telefone, rg, cpf, endereco);
		this.login = login;
		this.senha = senha;
	}
	
	public Vendedor(String nome, String telefone, String rg, String cpf,
			Endereco endereco,String login, String senha) {
		super(nome, telefone, rg, cpf, endereco);
		this.login = login;
		this.senha = senha;
	}

	public Vendedor(){}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
/*
	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel out, int flags) {
		out.writeLong(id);  
	    out.writeString(nome);
	    out.writeString(telefone);
	    out.writeString(rg);
	    out.writeString(cpf);
	    out.writeString(endereco.getRua());
	    out.writeString(endereco.getNumero());
	    out.writeString(endereco.getCep());
	    out.writeString(endereco.getEstado());
	    out.writeString(endereco.getCidade());
	    out.writeString(endereco.getBairro());
	    out.writeString(login);
	    out.writeString(senha);
	    
	}
	
	 public void readFromParcel(Parcel in) {  
	        this.id = in.readLong();  
	        this.nome = in.readString();
	        this.telefone = in.readString();
	        this.rg = in.readString();
	        this.cpf = in.readString();
	        this.endereco.setRua(in.readString());
	        this.endereco.setNumero(in.readString());
	        this.endereco.setCep(in.readString());
	        this.endereco.setEstado(in.readString());
	        this.endereco.setCidade(in.readString());
	        this.endereco.setBairro(in.readString());
	        this.login = in.readString();
	        this.senha = in.readString();
	    }  
	  
	    public static final Parcelable.Creator<Vendedor> CREATOR = new Parcelable.Creator<Vendedor>() {  
	        public Vendedor createFromParcel(Parcel in) {  
	            return new Vendedor(in);  
	        }  
	  
	        public Vendedor[] newArray(int size) {  
	            return new Vendedor[size];  
	        }  
	    };  
*/
}
