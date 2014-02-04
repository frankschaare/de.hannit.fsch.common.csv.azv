/**
 * 
 */
package de.hannit.fsch.common.csv.azv;

import java.sql.Date;

/**
 * @author fsch
 *
 */
public class Arbeitszeitanteil implements IArbeitszeitanteil
{
private	int iTeam = 9;	
private	Date berichtsMonat = null;
private	String kostenStelle = null;
private	String kostenStelleBezeichnung = null;
private	String kostenTraeger = null;
private	String kostenTraegerBezeichnung = null;
private	int prozentAnteil = 0;	
/*
 * Der Anteil des Vollzeitäquivalents je Kostenstelle / Kostenträger
 * Wird festegelegt, wenn in der Klasse Mitarbeiter das Vollzeitäquivalent feststeht.
 */
private double bruttoAufwand = 0;

	/**
	 * 
	 */
	public Arbeitszeitanteil()
	{
	}
	
	public double getBruttoAufwand() {return bruttoAufwand;}
	public void setBruttoAufwand(double bruttoAufwand){this.bruttoAufwand = bruttoAufwand;}

	/* (non-Javadoc)
	 * @see de.hannit.fsch.common.csv.azv.IArbeitszeitanteil#getBerichtsMonat()
	 */
	@Override
	public Date getBerichtsMonat() {return this.berichtsMonat;}

	/* (non-Javadoc)
	 * @see de.hannit.fsch.common.csv.azv.IArbeitszeitanteil#setBerichtsMonat(java.sql.Date)
	 */
	@Override
	public void setBerichtsMonat(Date berichtsMonat){this.berichtsMonat = berichtsMonat;}

	/* (non-Javadoc)
	 * @see de.hannit.fsch.common.csv.azv.IArbeitszeitanteil#getKostenstelle()
	 */
	@Override
	public String getKostenstelle(){return this.kostenStelle;}

	/* (non-Javadoc)
	 * @see de.hannit.fsch.common.csv.azv.IArbeitszeitanteil#setKostenstelle(java.lang.String)
	 */
	@Override
	public void setKostenstelle(String kostenStelle){this.kostenStelle = kostenStelle;}

	/* (non-Javadoc)
	 * @see de.hannit.fsch.common.csv.azv.IArbeitszeitanteil#getKostentraeger()
	 */
	@Override
	public String getKostentraeger(){return this.kostenTraeger;}

	/* (non-Javadoc)
	 * @see de.hannit.fsch.common.csv.azv.IArbeitszeitanteil#setKostentraeger(java.lang.String)
	 */
	@Override
	public void setKostentraeger(String kostenTraeger){this.kostenTraeger = kostenTraeger;}

	/* (non-Javadoc)
	 * @see de.hannit.fsch.common.csv.azv.IArbeitszeitanteil#getProzentanteil()
	 */
	@Override
	public int getProzentanteil(){return this.prozentAnteil;}

	/* (non-Javadoc)
	 * @see de.hannit.fsch.common.csv.azv.IArbeitszeitanteil#setProzentanteil(int)
	 */
	@Override
	public void setProzentanteil(int prozentAnteil){this.prozentAnteil = prozentAnteil;}

	@Override
	public int getITeam(){return this.iTeam;}

	@Override
	public void setITeam(int teamNR){this.iTeam = teamNR;}

	@Override
	public String getKostenstelleOderKostentraegerLang()
	{
	return this.kostenStelle != null ? this.kostenStelle : this.kostenTraeger;
	}

	@Override
	public String getKostenStelleBezeichnung() {return this.kostenStelleBezeichnung;}

	@Override
	public void setKostenStelleBezeichnung(String kostenStelleBezeichnung) {this.kostenStelleBezeichnung = kostenStelleBezeichnung;	
	}

	@Override
	public String getKostenTraegerBezeichnung() {return this.kostenTraegerBezeichnung;}

	@Override
	public void setKostenTraegerBezeichnung(String kostenTraegerBezeichnung) {this.kostenTraegerBezeichnung = kostenTraegerBezeichnung;}

}
