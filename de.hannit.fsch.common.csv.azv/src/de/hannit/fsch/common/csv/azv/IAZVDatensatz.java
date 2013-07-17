/**
 * 
 */
package de.hannit.fsch.common.csv.azv;

import java.util.Date;

/**
 * @author fsch
 *
 */
public interface IAZVDatensatz
{
public int getPersonalNummer();
public void setPersonalNummer(int personalNummer);

public String getTeam();
public void setTeam(String team);

public Date getBerichtsMonat();
public void setBerichtsMonat(Date berichtsMonat);

public String getKostenstelle();
public void setKostenstelle(String kostenStelle);

public String getKostentraeger();
public void setKostentraeger(String kostenTraeger);

public int getProzentanteil();
public void setProzentanteil(int prozentAnteil);

public String getSource();
public void setSource(String source);
}
