package utils;

public class Object {
    private static String NAZWA_ODBIORCY;
    private static String NUMER_RACHUNKU;
    private static String KWOTA;
    private static String TYTUŁ_PRZELEWU;

    public static String getNazwaOdbiorcy() {
        return NAZWA_ODBIORCY;
    }

    public static void setNazwaOdbiorcy(String nazwaOdbiorcy) {
        NAZWA_ODBIORCY = nazwaOdbiorcy;
    }

    public static String getNumerRachunku() {
        return NUMER_RACHUNKU;
    }

    public static void setNumerRachunku(String numerRachunku) {
        NUMER_RACHUNKU = numerRachunku;
    }

    public static String getKWOTA() {
        return KWOTA;
    }

    public static void setKWOTA(String KWOTA) {
        Object.KWOTA = KWOTA;
    }

    public static String getTytułPrzelewu() {
        return TYTUŁ_PRZELEWU;
    }

    public static void setTytułPrzelewu(String tytulPrzelewu) {
        TYTUŁ_PRZELEWU = tytulPrzelewu;
    }
}


