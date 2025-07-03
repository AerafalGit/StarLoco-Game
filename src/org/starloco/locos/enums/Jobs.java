package org.starloco.locos.enums;

public enum Jobs {
    BASE(1),
    BUCHERON(2),
    FORGEUR_EPEES(11),
    SCULPTEUR_ARCS(13),
    FORGEUR_MARTEAUX(14),
    CORDONNIER(15),
    BIJOUTIER(16),
    FORGEUR_DAGUES(17),
    SCULPTEUR_BATONS(18),
    SCULPTEUR_BAGUETTES(19),
    FORGEUR_PELLES(20),
    MINEUR(24),
    BOULANGER(25),
    ALCHIMISTE(26),
    TAILLEUR(27),
    PAYSAN(28),
    FORGEUR_HACHES(31),
    PECHEUR(36),
    CHASSEUR(41),
    FORGEMAGE_DAGUES(43),
    FORGEMAGE_EPEES(44),
    FORGEMAGE_MARTEAUX(45),
    FORGEMAGE_PELLES(46),
    FORGEMAGE_HACHES(47),
    SCULPTEMAGE_ARCS(48),
    SCULPTEMAGE_BAGUETTES(49),
    SCULPTEMAGE_BATONS(50),
    BOUCHER(56),
    POISSONNIER(58),
    FORGEUR_BOUCLIERS(60),
    CORDOMAGE(62),
    JOAILLOMAGE(63),
    COSTUMAGE(64),
    BRICOLEUR(65),
    JOAILLIER_66(66),
    BIJOUTIER_67(67),
    PAYSAN_70(70),
    PAYSAN_71(71),
    COUPE(72);

    private final int id;

    Jobs(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static Jobs getById(int id) {
        for (Jobs job : values()) {
            if (job.getId() == id) {
                return job;
            }
        }
        throw new IllegalArgumentException("No Jobs found with id: " + id);
    }
}
