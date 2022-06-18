package honorar;

/**
 * Klasse für die Berechnung eines Autorenhonorars
 */
public class CalcHonorar {

    /**
     * Methode um das Honorar für einen Autor zu berechnen.
     * @param s der Text für den das Honorar berechnet werden soll.
     *          Mindestlänge für den Text: 100 Zeichen
     * @return das Honorar des Autors
     * @throws IllegalArgumentException
     */
    public static int getHonorar(String s) throws IllegalArgumentException {
        if (s == null || s.length() < 10000) {
            throw new IllegalArgumentException();
        }
        return s.length() / 100;
    }
}
