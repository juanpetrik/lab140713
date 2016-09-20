package br.petrik.persistencia;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "Log")
public class Log implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	@Version
	@Column(name = "version")
	private int version;

	@Column(name = "mdb")
	private String mdb;

	@Column(name = "data")
	private String data;

	@Column(name = "hora")
	private String hora;

	@Column(name = "informacao")
	private String informacao;

	public Long getId() {
		return this.id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(final int version) {
		this.version = version;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Log)) {
			return false;
		}
		Log other = (Log) obj;
		if (id != null) {
			if (!id.equals(other.id)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	public String getMdb() {
		return mdb;
	}

	public void setMdb(String mdb) {
		this.mdb = mdb;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getInformacao() {
		return informacao;
	}

	public void setInformacao(String informacao) {
		this.informacao = informacao;
	}

	@Override
	public String toString() {
		String result = getClass().getSimpleName() + " ";
		if (mdb != null && !mdb.trim().isEmpty())
			result += "mdb: " + mdb;
		if (data != null && !data.trim().isEmpty())
			result += ", data: " + data;
		if (hora != null && !hora.trim().isEmpty())
			result += ", hora: " + hora;
		if (informacao != null && !informacao.trim().isEmpty())
			result += ", informacao: " + informacao;
		return result;
	}
}