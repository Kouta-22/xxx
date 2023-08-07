package model;

import java.util.Date;

public class Task {
	private int id;
	private int idProject;
	private String nome;
	private String descricao;
	private String notes;
	private boolean completed;
	private Date deadline;
	private Date createAT;
	private Date updateAT;

	public Task(int id, int idProject, String nome, String descricao, String notes, boolean completed, Date deadline,
			Date createAT, Date updateAT) {
		this.id = id;
		this.idProject = idProject;
		this.nome = nome;
		this.descricao = descricao;
		this.notes = notes;
		this.completed = completed;
		this.deadline = deadline;
		this.createAT = createAT;
		this.updateAT = updateAT;
	}

	public Task() {
		this.createAT = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdProject() {
		return idProject;
	}

	public void setIdProject(int idProject) {
		this.idProject = idProject;
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

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public Date getDeadline() {
		deadline = new Date();
		return deadline;
	}

	public void setDeadline(Date deadline) {
		deadline = new Date();
		this.deadline = deadline;
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
		updateAT = new Date();
		return updateAT;
	}

	public void setUpdateAT(Date updateAT) {
		updateAT = new Date();
		this.updateAT = updateAT;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", idProject=" + idProject + ", nome=" + nome + ", descricao=" + descricao
				+ ", notes=" + notes + ", completed=" + completed + ", deadline=" + deadline + ", createAT=" + createAT
				+ ", updateAT=" + updateAT + "]";
	}

}
