package org.starloco.locos.enums;

public enum Breeds {
    FECA(1),
    OSAMODAS(2),
    ENUTROF(3),
    SRAM(4),
    XELOR(5),
    ECAFLIP(6),
    ENIRIPSA(7),
    IOP(8),
    CRA(9),
    SADIDA(10),
    SACRIEUR(11),
    PANDAWA(12);

    private final int id;

    Breeds(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static Breeds getById(int id) {
        for (Breeds breed : values()) {
            if (breed.getId() == id) {
                return breed;
            }
        }
        throw new IllegalArgumentException("No Breeds found for id: " + id);
    }
}
