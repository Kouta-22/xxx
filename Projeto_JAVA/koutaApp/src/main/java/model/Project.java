package model;


import java.util.Date;

public class Project {
	
	
	private int id;
	private String nome;
	private String descricao;
	private Date createAT;
	private Date updateAT;

	public Project(int id, String nome, String descricao, Date createAT, Date updateAT) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.createAT = createAT;
		this.updateAT = updateAT;
	}
	


	public Project() {
		return;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getCreateAT() {
		createAT = new Date();
		return createAT;
	}


	public void setCreateAT(Date createAT) {
		createAT = new Date();
		this.createAT = createAT;
	}

	public Date getUpdateAT() {
		System.out.println(updateAT);
		updateAT = new Date();
		return updateAT;
	}

	public void setUpdateAT(Date updateAT) {
		updateAT = new Date();
		this.updateAT = updateAT;
	}

}
