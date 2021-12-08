package application;

public class Client {
	

	private String Adresse ;
	private String CNIPassport ;
	private String DateDebut ;
	private String Email ;
	private String Nbadge ;
	private String NomPrenom ;
	private String Phone ;
	private String NomEntreprise ;
	private String Nom ;
	
	public Client(String adresse, String cNIPassport, String dateDebut, String email, String nbadge, String nomPrenom,
			String phone, String nomEntreprise, String nom) {
		super();
		Adresse = adresse;
		CNIPassport = cNIPassport;
		DateDebut = dateDebut;
		Email = email;
		Nbadge = nbadge;
		NomPrenom = nomPrenom;
		Phone = phone;
		NomEntreprise = nomEntreprise;
		Nom = nom;
	}

	public String getAdresse() {
		return Adresse;
	}

	public String getCNIPassport() {
		return CNIPassport;
	}

	public String getDateDebut() {
		return DateDebut;
	}

	public String getEmail() {
		return Email;
	}

	public String getNbadge() {
		return Nbadge;
	}

	public String getNomPrenom() {
		return NomPrenom;
	}

	public String getPhone() {
		return Phone;
	}

	public String getNomEntreprise() {
		return NomEntreprise;
	}

	public String getNom() {
		return Nom;
	}
	
	

}
