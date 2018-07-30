package fr.mxgr.infoot;

import java.util.Date;
import java.util.List;

public class Competition {
    private int id;
    private String name;
    private Season currentSeason;
    private List<Season> seasons;
    private Date lastUpdated;

    //Getter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Season getCurrentSeason() {
        return currentSeason;
    }

    public List<Season> getSeasons() {
        return seasons;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    //Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentSeason(Season currentSeason) {
        this.currentSeason = currentSeason;
    }

    public void setSeasons(List<Season> seasons) {
        this.seasons = seasons;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
