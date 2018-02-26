
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table

public class Fabricants {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CODI_FAB;
	private String NOM_FAB;
	
	@ManyToOne
	private Direccio direccio;
	
	public Fabricants(int Codi, String nom){
		super();
		this.CODI_FAB = Codi;
		this.NOM_FAB= nom;
		
	}
	
	public Fabricants(){	
		super();
}

	

	public int getCodi() {
		return CODI_FAB;
	}



	public void setCodi(int codi) {
		CODI_FAB = codi;
	}



	public String getNom() {
		return NOM_FAB;
	}



	public void setNom(String nom) {
		NOM_FAB = nom;
	}



	public Direccio getDireccio() {
		return direccio;
	}



	public void setDireccio(Direccio direccio) {
		this.direccio = direccio;
	}



	@Override
	public String toString() {
		return "Fabricants [Codi=" + CODI_FAB + ", nom=" + NOM_FAB + "]";
	}
}
