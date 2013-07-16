/**
 * 
 */
package de.hannit.fsch.common.csv.azv;

import java.util.Date;

/**
 * @author fsch
 *
 */
public class AZVDatensatz implements IAZVDatensatz
{
private	int personalNummer = 0;
private Date berichtsMonat;
private java.sql.Date berichtsMonatSQL;
private String kostenStelle = null;
private String kostenTraeger = null;
private	int prozentAnteil = 0;
private String source = null;
private boolean exists = false;
private boolean mitarbeiterChecked = false;	

	/**
	 * 
	 */
	public AZVDatensatz()
	{

	}
	
	public int getPersonalNummer(){return this.personalNummer;}
	public void setPersonalNummer(int personalNummer){this.personalNummer = personalNummer;}

	public Date getBerichtsMonat(){return this.berichtsMonat;}
	public void setBerichtsMonat(Date berichtsMonat){this.berichtsMonat = berichtsMonat;}

	public String getKostenstelle(){return this.kostenStelle;}
	public void setKostenstelle(String kostenStelle){this.kostenStelle = kostenStelle;}

	public String getKostentraeger(){return this.kostenTraeger;}
	public void setKostentraeger(String kostenTraeger){this.kostenTraeger = kostenTraeger;}

	public int getProzentanteil(){return this.prozentAnteil;}
	public void setProzentanteil(int prozentAnteil){this.prozentAnteil = prozentAnteil;}

	public String getSource(){return this.source;}
	public void setSource(String source){this.source = source;}
}
