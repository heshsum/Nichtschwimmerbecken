package mockito;

public class Aktie {
    private String code;
    private String name;
    private int anzahl;

    public Aktie(String code, String name, int anzahl){
        this.code = code;
        this.name = name.toUpperCase();
        this.anzahl = anzahl;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public String getName() {
        return name;
    }
}
