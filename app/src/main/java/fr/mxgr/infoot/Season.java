package fr.mxgr.infoot;

import java.util.Date;

public class Season {
    private int id;
    private Date startDate;
    private Date endDate;
    private int currentMatchDay;

    //Getter
    public int getId() {
        return id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getCurrentMatchDay() {
        return currentMatchDay;
    }

    //Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setCurrentMatchDay(int currentMatchDay) {
        this.currentMatchDay = currentMatchDay;
    }
}
