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


public class Articles {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private int CODI_ART;
	private String NOM_ART;
	private int PREU;

	
	@ManyToOne
	private Fabricants fabricants;
	
	public Articles(int Codi_ART, String Nom, int Preu) {
		
		super();
		this.CODI_ART= Codi_ART;
		this.NOM_ART = Nom;
		this.PREU = Preu;
		
	}
	

	public Articles() {
		super();
	}


	


	public int getCodi() {
		return CODI_ART;
	}


	public void setCodi(int codi) {
		CODI_ART = codi;
	}


	public String getNom() {
		return NOM_ART;
	}


	public void setNom(String nom) {
		NOM_ART = nom;
	}


	public int getPreu() {
		return PREU;
	}


	public void setPreu(int preu) {
		PREU = preu;
	}


	public Fabricants getFabricants() {
		return fabricants;
	}


	public void setFabricants(Fabricants fabricants) {
		this.fabricants = fabricants;
	}


	public String toString() {
		return "Articles [Codi=" + CODI_ART + ", Nom =" + NOM_ART + ", Preu =" + PREU + "]";
	}
}
