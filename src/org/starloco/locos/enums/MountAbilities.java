package org.starloco.locos.enums;

public enum MountAbilities {
    INFATIGABLE(1),
    PORTEUSE(2),
    REPRODUCTRICE(3),
    SAGE(4),
    ENDURANTE(5),
    AMOUREUSE(6),
    PRECOCE(7),
    PREDISPOSEE_GENETIQUE(8),
    CAMELEONE(9);

    private final int id;

    MountAbilities(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static MountAbilities getById(int id) {
        for (MountAbilities ability : values()) {
            if (ability.getId() == id) {
                return ability;
            }
        }
        throw new IllegalArgumentException("No MountAbilities found with id: " + id);
    }
}
