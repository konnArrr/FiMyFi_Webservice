package de.kluk.fimyfi_webservice.model;

public enum ColorSystem {
    EMPTY(0),
    CMY(1),
    RGB(2),
    RGBW(3),
    RGBA(4),
    RGBAW(5),
    RGBAWUV(6)
    ;

    private int colSysNumber;

    private ColorSystem(int colSysNumber) {
        this.colSysNumber = colSysNumber;
    }

    public int getColSysNumber() {
        return colSysNumber;
    }

    public static ColorSystem getColorSystemBy(int number) {
        switch (number) {
            case 0: return EMPTY;
            case 1: return CMY;
            case 2: return RGB;
            case 3 : return  RGBW;
            case 4 : return  RGBA;
            case 5 : return  RGBAW;
            case 6 : return  RGBAWUV;
            default : throw new IllegalArgumentException("unexpected value " + number);
        }
    }

}
