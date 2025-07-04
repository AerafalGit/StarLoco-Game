package org.starloco.locos.enums;

public enum Mounts {
    DRAGODINDE_AMANDE_SAUVAGE(1),
    DRAGODINDE_EBENE(3),
    DRAGODINDE_ROUSSE_SAUVAGE(6),
    DRAGODINDE_EBENE_ET_IVOIRE(9),
    DRAGODINDE_ROUSSE(10),
    DRAGODINDE_IVOIRE_ET_ROUSSE(11),
    DRAGODINDE_EBENE_ET_ROUSSE(12),
    DRAGODINDE_TURQUOISE(15),
    DRAGODINDE_IVOIRE(16),
    DRAGODINDE_INDIGO(17),
    DRAGODINDE_DOREE(18),
    DRAGODINDE_POURPRE(19),
    DRAGODINDE_AMANDE(20),
    DRAGODINDE_EMERAUDE(21),
    DRAGODINDE_ORCHIDEE(22),
    DRAGODINDE_PRUNE(23),
    DRAGODINDE_AMANDE_ET_DOREE(33),
    DRAGODINDE_AMANDE_ET_EBENE(34),
    DRAGODINDE_AMANDE_ET_EMERAUDE(35),
    DRAGODINDE_AMANDE_ET_INDIGO(36),
    DRAGODINDE_AMANDE_ET_IVOIRE(37),
    DRAGODINDE_AMANDE_ET_ROUSSE(38),
    DRAGODINDE_AMANDE_ET_TURQUOISE(39),
    DRAGODINDE_AMANDE_ET_ORCHIDEE(40),
    DRAGODINDE_AMANDE_ET_POURPRE(41),
    DRAGODINDE_DOREE_ET_EBENE(42),
    DRAGODINDE_DOREE_ET_EMERAUDE(43),
    DRAGODINDE_DOREE_ET_INDIGO(44),
    DRAGODINDE_DOREE_ET_IVOIRE(45),
    DRAGODINDE_DOREE_ET_ROUSSE(46),
    DRAGODINDE_DOREE_ET_TURQUOISE(47),
    DRAGODINDE_DOREE_ET_ORCHIDEE(48),
    DRAGODINDE_DOREE_ET_POURPRE(49),
    DRAGODINDE_EBENE_ET_EMERAUDE(50),
    DRAGODINDE_EBENE_ET_INDIGO(51),
    DRAGODINDE_EBENE_ET_TURQUOISE(52),
    DRAGODINDE_EBENE_ET_ORCHIDEE(53),
    DRAGODINDE_EBENE_ET_POURPRE(54),
    DRAGODINDE_EMERAUDE_ET_INDIGO(55),
    DRAGODINDE_EMERAUDE_ET_IVOIRE(56),
    DRAGODINDE_EMERAUDE_ET_ROUSSE(57),
    DRAGODINDE_EMERAUDE_ET_TURQUOISE(58),
    DRAGODINDE_EMERAUDE_ET_ORCHIDEE(59),
    DRAGODINDE_EMERAUDE_ET_POURPRE(60),
    DRAGODINDE_INDIGO_ET_IVOIRE(61),
    DRAGODINDE_INDIGO_ET_ROUSSE(62),
    DRAGODINDE_INDIGO_ET_TURQUOISE(63),
    DRAGODINDE_INDIGO_ET_ORCHIDEE(64),
    DRAGODINDE_INDIGO_ET_POURPRE(65),
    DRAGODINDE_IVOIRE_ET_TURQUOISE(66),
    DRAGODINDE_IVOIRE_ET_ORCHIDEE(67),
    DRAGODINDE_IVOIRE_ET_POURPRE(68),
    DRAGODINDE_TURQUOISE_ET_ROUSSE(69),
    DRAGODINDE_ORCHIDEE_ET_ROUSSE(70),
    DRAGODINDE_POURPRE_ET_ROUSSE(71),
    DRAGODINDE_TURQUOISE_ET_ORCHIDEE(72),
    DRAGODINDE_TURQUOISE_ET_POURPRE(73),
    DRAGODINDE_DOREE_SAUVAGE(74),
    DRAGODINDE_SQUELETTE(75),
    DRAGODINDE_ORCHIDEE_ET_POURPRE(76),
    DRAGODINDE_PRUNE_ET_AMANDE(77),
    DRAGODINDE_PRUNE_ET_DOREE(78),
    DRAGODINDE_PRUNE_ET_EBENE(79),
    DRAGODINDE_PRUNE_ET_EMERAUDE(80),
    DRAGODINDE_PRUNE_ET_INDIGO(82),
    DRAGODINDE_PRUNE_ET_IVOIRE(83),
    DRAGODINDE_PRUNE_ET_ROUSSE(84),
    DRAGODINDE_PRUNE_ET_TURQUOISE(85),
    DRAGODINDE_PRUNE_ET_ORCHIDEE(86),
    DRAGODINDE_PRUNE_ET_POURPRE(87),
    DRAGODINDE_EN_ARMURE(88),
    DRAGODINDE_DU_PALADIN(89),
    TABI(90),
    KARNAGE(91),
    BOUFTEA_MAUR(92);

    private final int id;

    Mounts(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static Mounts getById(int id) {
        for (Mounts mount : values()) {
            if (mount.getId() == id) {
                return mount;
            }
        }
        throw new IllegalArgumentException("No Mounts found with id: " + id);
    }
}
