package de.hannit.fsch.common.csv.azv;

import java.sql.Date;

public interface IArbeitszeitanteil
{
public int getITeam();
public void setITeam(int teamNR);

public Date getBerichtsMonat();
public void setBerichtsMonat(Date berichtsMonat);

public String getKostenstelleOderKostentraegerLang();

public String getKostenstelle();
public void setKostenstelle(String kostenStelle);
public String getKostenStelleBezeichnung();
public void setKostenStelleBezeichnung(String kostenStelleBezeichnung);

public String getKostenTraegerBezeichnung();
public void setKostenTraegerBezeichnung(String kostenTraegerBezeichnung);
public String getKostentraeger();
public void setKostentraeger(String kostenTraeger);

public int getProzentanteil();
public void setProzentanteil(int prozentAnteil);
}
