/**
 * 
 */
package de.hannit.fsch.common.csv.azv;

import java.util.Calendar;
import java.util.Date;

/**
 * @author fsch
 *
 */
public class AZVDatensatz implements IAZVDatensatz
{
public static final int PERSONALNUMMER_VORSTAND = 120026;

private	int rowCount = 0;
private	int personalNummer = 0;
private boolean pnrNachgetragen = false;
private String strTeam = null;
private String strNachname = null;
private String userName = null;
private	int iTeam = 9;
private Date berichtsMonat;
private String berichtsMonatAsString = null;
private String berichtsJahrAsString = null;
private java.sql.Date berichtsMonatSQL;
private String kostenStelle = null;
private String kostenstellenBeschreibung = null;
private String kostenTraeger = null;
private String kostenTraegerBeschreibung = null;
private	int prozentAnteil = 0;
private String source = null;
private boolean existsMitarbeiter = false;
private boolean mitarbeiterChecked = false;	

private Calendar cal = Calendar.getInstance();

	/**
	 * 
	 */
	public AZVDatensatz()
	{

	}
	
	public String getUserName(){return userName;}
	public void setUserName(String userName){this.userName = userName;}

	public void setBerichtsMonatAsString(String berichtsMonatAsString){this.berichtsMonatAsString = berichtsMonatAsString;}
	public String getBerichtsMonatAsString(){return this.berichtsMonatAsString;}
	public void setBerichtsJahrAsString(String berichtsJahrAsString) 
	{
	this.berichtsJahrAsString = berichtsJahrAsString;
	}
	public String getBerichtsJahrAsString(){return this.berichtsJahrAsString;}
	
	public int getPersonalNummer(){return (this.personalNummer != 0) ? this.personalNummer : 0;}
	public void setPersonalNummer(int personalNummer){this.personalNummer = personalNummer;}

	public Date getBerichtsMonat(){return this.berichtsMonat;}
	public void setBerichtsMonat(Date berichtsMonat)
	{
	this.berichtsMonat = berichtsMonat;
	cal.setTime(berichtsMonat);
	this.berichtsMonatSQL = new java.sql.Date(cal.getTimeInMillis());
	}

	public String getKostenstelle(){return this.kostenStelle;}
	public String getKostenstellenBeschreibung(){return kostenstellenBeschreibung;}

	public void setKostenstelle(String kostenStelle)
	{
		if (kostenStelle.length() > 0)
		{
			if (kostenStelle.contains(";"))
			{
			String[] parts = kostenStelle.split(";");
			this.kostenStelle = parts[0];
			this.kostenstellenBeschreibung = parts[1]; 
			}
			else
			{
			this.kostenStelle = kostenStelle;
			}
		}
	}

	public String getKostentraeger(){return this.kostenTraeger;}
	public String getKostenTraegerBeschreibung(){return kostenTraegerBeschreibung;}

	public void setKostentraeger(String kostenTraeger)
	{
		if (kostenTraeger.length() > 0)
		{
			if (kostenTraeger.contains(";"))
			{
				String[] parts = kostenTraeger.split(";");
				this.kostenTraeger = parts[0];
				this.kostenTraegerBeschreibung = parts[1]; 
			}
			else
			{
				this.kostenTraeger = kostenTraeger;
			}
		}
	}

	public int getProzentanteil(){return this.prozentAnteil;}
	public void setProzentanteil(int prozentAnteil){this.prozentAnteil = prozentAnteil;}

	public String getSource(){return this.source;}
	public void setSource(String source){this.source = source;}

	@Override
	public String getTeam(){return (this.strTeam != null) ? this.strTeam : "";}

	@Override
	public void setTeam(String team)
	{
	this.strTeam = this.strTeam != null ? this.strTeam : team;
	setiTeam(team);
	}

	public int getiTeam(){return iTeam;}

	public void setiTeam(String team)
	{
		if (team.length() > 0)
		{
		String[] parts = team.split(" ");	
			try
			{
			this.iTeam = Integer.parseInt(parts[1]);
			}
			catch (NumberFormatException e)
			{
			e.printStackTrace();
			this.iTeam = 9;
			}
		}
		else 
		{
			if (personalNummer == PERSONALNUMMER_VORSTAND)
			{
			this.strTeam = "Vorstand";
			this.iTeam = 0;
			}	
		}
	}
	public boolean personalNummerNachgetragen(){return pnrNachgetragen;}
	public void setpersonalNummerNachgetragen(boolean incoming){this.pnrNachgetragen = incoming;}
	
	public boolean existsMitarbeiter(){return existsMitarbeiter;}
	public void setExistsMitarbeiter(boolean exists){this.existsMitarbeiter = exists;}

	public boolean isMitarbeiterChecked(){return mitarbeiterChecked;}
	public void setMitarbeiterChecked(boolean mitarbeiterChecked){this.mitarbeiterChecked = mitarbeiterChecked;}

	public java.sql.Date getBerichtsMonatSQL()
	{
	return berichtsMonatSQL;
	}

	@Override
	public String getNachname() {return strNachname;}

	@Override
	public void setNachname(String nachname) {this.strNachname = nachname;}

	@Override
	public void setKostenArt(String incoming)
	{
	String kostenArt = incoming;	
	String beschreibung = "";
	
		if (kostenArt.length() > 0)
		{
			if (kostenArt.contains(";"))
			{
			String[] parts = kostenArt.split(";");
			kostenArt = parts[0];
			beschreibung = parts[1];
			}
			
			switch (kostenArt.length())
			{
			case 4:
			setKostenstelle(kostenArt);
			this.kostenstellenBeschreibung = beschreibung;
			break;

			default:
			setKostentraeger(kostenArt);	
			this.kostenTraegerBeschreibung = beschreibung;
			break;
			}

		}
		
	}

	@Override
	public int getRowCount()
	{
	return this.rowCount;
	}

	@Override
	public void setRowCount(int incoming)
	{
	this.rowCount = incoming;	
	}
	
	
}
