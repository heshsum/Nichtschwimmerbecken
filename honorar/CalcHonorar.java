package honorar;

/**
 * Klasse für die Berechnung eines Autorenhonorars
 */
public class CalcHonorar {
    /**
     * Methode um das Honorar für einen Autor zu berechnen.
     * @param s der Text für den das Honorar berechnet werden soll.
     *          Mindestlänge für den Text: 1000 Zeichen
     * @return das Honorar des Autors
     * @throws IllegalArgumentException
     */
    public int getHonorar(String s) throws IllegalArgumentException {
        if (s == null || s.length() < 1000) {
            throw new IllegalArgumentException();
        }
        return s.replaceAll("\\s+", "").length() / 100;
    }

    public int countPictures(String s) {
        return s.split("Bild").length;
    }
}
