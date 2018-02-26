import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table


public class Direccio {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private int CODI_DIR;
	private String DIRECCIO;
	private String LOCALITAT;
	private String CODI_POSTAL;

	public Direccio(int Codi, String Direccio, String Localitat, String Codi_postal) {
		
		super();
		this.CODI_DIR= Codi;
		this.DIRECCIO = Direccio;
		this.LOCALITAT = Localitat;
		this.CODI_POSTAL = Codi_postal;
		
	}
	

	public Direccio() {
		super();
	}


	
	
	public int getCodi() {
		return CODI_DIR;
	}


	public void setCodi(int codi) {
		CODI_DIR = codi;
	}


	public String getDireccio() {
		return DIRECCIO;
	}


	public void setDireccio(String direccio) {
		DIRECCIO = direccio;
	}


	public String getLocalitat() {
		return LOCALITAT;
	}


	public void setLocalitat(String localitat) {
		LOCALITAT = localitat;
	}


	public String getCodi_postal() {
		return CODI_POSTAL;
	}


	public void setCodi_postal(String codi_postal) {
		CODI_POSTAL = codi_postal;
	}


	public String toString() {
		return "Direccio [Codi=" + CODI_DIR + ", Direccio =" + DIRECCIO + ", Localitat =" + LOCALITAT + ", Codi_postal=" + CODI_POSTAL + "]";
	}
}
