package Medication;

public class Tableau {

    private int nb;
    private boolean done;
    private boolean nouveau;
    private String name;
    private String size;
    private Object type;
    private String use;
    private String daybreak;
    private String morning;
    private String noon;
    private String evening;
    private String night;
    private String sleep;
    private String storage;
    private String diff;
    private String infos;

    public Tableau(){
        this.nb = nb;this.done = false;this.nouveau = false;this.name = "";this.size = "";this.type = "";this.use = "";this.daybreak = "";
        this.morning = "";this.noon = "";this.evening = "";this.night = "";this.sleep = "";this.storage = "";this.diff = "";this.infos = "";
    }

    public Tableau(int nb, boolean done, boolean nouveau, String name, String size, Object type,
                   String use, String daybreak, String morning, String noon, String evening, String night, String sleep,
                   String storage, String diff, String infos){
        this.nb = nb;
        this.done = done;
        this.nouveau = nouveau;
        this.name = name;
        this.size = size;
        this.type = type;
        this.use = use;
        this.daybreak = daybreak;
        this.morning = morning;
        this.noon = noon;
        this.evening = evening;
        this.night = night;
        this.sleep = sleep;
        this.storage = storage;
        this.diff = diff;
        this.infos = infos;
    }

    public int getNb() {
        return nb;
    }

    public void setNb(int nb) {
        this.nb = nb;
    }

    public Boolean getDone() {
        return done;
    }
    public void setDone(boolean done) {
        this.done = done;
    }

    public Boolean getNouveau() {
        return nouveau;
    }

    public void setNouveau(boolean nouveau) {
        this.nouveau = nouveau;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getDaybreak() {
        return daybreak;
    }

    public void setDaybreak(String daybreak) {
        this.daybreak = daybreak;
    }

    public String getMorning() {
        return morning;
    }

    public void setMorning(String morning) {
        this.morning = morning;
    }

    public String getNoon() {
        return noon;
    }

    public void setNoon(String noon) {
        this.noon = noon;
    }

    public String getEvening() {
        return evening;
    }

    public void setEvening(String evening) {
        this.evening = evening;
    }

    public String getNight() {
        return night;
    }

    public void setNight(String night) {
        this.night = night;
    }

    public String getSleep() {
        return sleep;
    }

    public void setSleep(String sleep) {
        this.sleep = sleep;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getDiff() {
        return diff;
    }

    public void setDiff(String diff) {
        this.diff = diff;
    }

    public String getInfos() {
        return infos;
    }

    public void setInfos(String infos) {
        this.infos = infos;
    }
}
