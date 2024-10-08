package com.isslem.livres.entities;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Livre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLivre;
	
	private String nomLivre;
	
	private String nomAuteur;
	
	private Double prixLivre;
	
	private Date datePublication;
	
	@ManyToOne
	private Genre genre;

	
	
	public Livre() {
		super();
	}
	public Livre(String nomLivre, String nomAuteur , Double prixLivre, Date datePublication) {
		super();
		this.nomLivre = nomLivre;
		this.nomAuteur= nomAuteur;
		this.prixLivre = prixLivre;
		this.datePublication = datePublication;
		
	}
		
	public Long getIdLivre() {
		return idLivre;
	}
	public void setIdLivre(Long idLivre) {
		this.idLivre = idLivre;
	}
	public String getNomLivre() {
		return nomLivre;
	}
	
	public String getNomAuteur() {
		return nomAuteur;
	}
	public void setNomAuteur(String nomAuteur) {
		this.nomAuteur = nomAuteur;
	}
	public void setNomLivre(String nomLivre) {
		this.nomLivre = nomLivre;
	}
	public Double getPrixLivre() {
		return prixLivre;
	}
	public void setPrixLivre(Double prixLivre) {
		this.prixLivre = prixLivre;
	}
	public Date getDatePublication() {
		return datePublication;
	}
	public void setDatePublication(Date datePublication) {
		this.datePublication = datePublication;
	}
	
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	@Override
	public String toString() {
		return "Livre [idLivre=" + idLivre + ", nomLivre=" + nomLivre +" , nomAuteur= "+ nomAuteur + ", prixLivre=" + prixLivre
		        + ", datePublication=" + datePublication + "]";
	}

}
