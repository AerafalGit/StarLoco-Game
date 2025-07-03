package org.starloco.locos.enums;

public enum GuidRanks {
    MENEUR(1),
    BRAS_DROIT(2),
    TRESORIER(3),
    PROTECTEUR(4),
    ARTISAN(5),
    RESERVISTE(6),
    GARDIEN(8),
    ECLAIREUR(9),
    ESPION(10),
    DIPLOMATE(11),
    SECRETAIRE(12),
    TUEUR_DE_FAMILIERS(33),
    BRACONNIER(31),
    CHERCHEUR_DE_TRESORS(30),
    VOLEUR(29),
    INITIE(28),
    ASSASSIN(27),
    GOUVERNEUR(26),
    MUSE(25),
    CONSEILLER(24),
    ELU(23),
    GUIDE(21),
    MENTOR(22),
    RECRUTEUR(20),
    ELEVEUR(19),
    MARCHAND(18),
    APPRENTI(17),
    BOURREAU(16),
    MASCOTTE(34),
    PENITENT(13),
    TUEUR_DE_PERCEPTEUR(35),
    DESERTEUR(15),
    TRAITRE(32),
    BOULET(14),
    LARBIN(7),
    A_L_ESSAI(0);

    private final int id;

    GuidRanks(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static GuidRanks getById(int id) {
        for (GuidRanks rank : values()) {
            if (rank.getId() == id) {
                return rank;
            }
        }
        throw new IllegalArgumentException("No GuidRanks found for id: " + id);
    }
}
