package org.starloco.locos.enums;

public enum FightStates {
    NEUTRE(0),
    SAOUL(1),
    CHERCHEUR_D_AMES(2),
    PORTEUR(3),
    PEUREUX(4),
    DESORIENTE(5),
    ENRACINE(6),
    PESANTEUR(7),
    PORTE(8),
    MOTIVATION_SYLVESTRE(9),
    APPRIVOISEMENT(10),
    CHEVAUCHANT(11),
    PAS_SAGE(12),
    VRAIMENT_PAS_SAGE(13),
    ENNEIGE(14),
    EVEILLE(15),
    FRAGILISE(16),
    SEPARE(17),
    GELE(18),
    FISSURE(19),
    ENDORMI(26),
    LEOPARDO(27),
    LIBRE(28),
    GLYPHE_IMPAIRE(29),
    GLYPHE_PAIRE(30),
    ENCRE_PRIMAIRE(31),
    ENCRE_SECONDAIRE(32),
    ENCRE_TERTIAIRE(33),
    ENCRE_QUATERNAIRE(34),
    ENVIE_DE_TUER(35),
    ENVIE_DE_PARALYSER(36),
    ENVIE_DE_MAUDIRE(37),
    ENVIE_D_EMPOISONNER(38),
    FLOU(39),
    CORROMPU(40),
    SILENCIEUX(41),
    AFFAIBLI(42),
    WAIT_OVNI(43),
    PAS_CONTENTE(44),
    CONTENTE(46),
    MAUVAISE_HUMEUR(47),
    CONFUS(48),
    GOULIFIE(49),
    ALTRUISTE(50),
    WIP_CHATIMENT_AGILE(51),
    WIP_CHATIMENT_OSE(52),
    WIP_CHATIMENT_SPIRITUEL(53),
    WIP_CHATIMENT_VITALESQUE(54),
    RETRAITE(55),
    INVULNERABLE(56),
    COMPTE_A_REBOURS_2(57),
    COMPTE_A_REBOURS_1(58),
    DEVOUE(60),
    BAGARREUR(61),
    WIP_LOURD(63),
    WIP_GLYPHE_NOM_PROVISOIRE(64),
    WIP_RAYONNEMENT_BLOQUE(65),
    WIP_RAYONNEMENT_1_JOUEUR(66),
    WIP_RAYONNEMENT_2_JOUEUR(67),
    WIP_RAYONNEMENT_3_JOUEUR(68),
    WIP_RAYONNEMENT_4_JOUEUR(69),
    WIP_RAYONNEMENT_1_BOSS(70),
    WIP_RAYONNEMENT_2_BOSS(71),
    WIP_RAYONNEMENT_3_BOSS(72),
    ENTOURBE(73),
    INTACLABLE(75),
    CHASSE(76),
    COEUR_77(77),
    COEUR_78(78),
    COEUR_79(79),
    COEUR_80(80),
    TREFLE_81(81),
    TREFLE_82(82),
    TREFLE_83(83),
    TREFLE_84(84),
    PIQUE_85(85),
    PIQUE_86(86),
    PIQUE_87(87),
    PIQUE_88(88),
    CARREAU_89(89),
    CARREAU_90(90),
    CARREAU_91(91),
    CARREAU_92(92),
    ATARAXIE(93),
    INSOIGNABLE(94),
    SOUFFRANCE_I(95),
    SOUFFRANCE_II(96),
    SOUFFRANCE_III(97),
    PREDATION(98),
    RASSASIE(99),
    MAITRISE(101),
    VIVIFIE(102),
    AVARICE(103),
    CONTAMINE(104),
    SAOUL_105(105),
    TIC(106),
    TAC(107),
    CHASSEUR(108);

    private final int id;

    FightStates(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static FightStates getById(int id) {
        for (FightStates state : FightStates.values()) {
            if (state.getId() == id) {
                return state;
            }
        }
        throw new IllegalArgumentException("No FightStates found for id: " + id);
    }
}
