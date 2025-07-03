package org.starloco.locos.enums;

public enum Emotes {
    S_ASSEOIR(1),
    FAIRE_UN_SIGNE_DE_LA_MAIN(2),
    APPLAUDIR(3),
    SE_METTRE_EN_COLERE(4),
    MONTRER_SA_PEUR(5),
    MONTRER_SON_ARME(6),
    JOUER_DE_LA_FLUTE(7),
    LACHER_LES_GAZ(8),
    SALUER(9),
    FAIRE_UN_BISOU(10),
    PIERRE(11),
    FEUILLE(12),
    CISEAUX(13),
    CROISER_LES_BRAS(14),
    MONTRER_DU_DOIGT(15),
    POINTS_DE_SUSPENSION(16),
    S_ALLONGER(19),
    CHAMPION(21),
    AURA_DE_PUISSANCE(22),
    AURA_VAMPYRIQUE(23);

    private final int id;

    Emotes(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static Emotes getById(int id) {
        for (Emotes emote : values()) {
            if (emote.getId() == id) {
                return emote;
            }
        }
        throw new IllegalArgumentException("No Emotes found with id: " + id);
    }
}