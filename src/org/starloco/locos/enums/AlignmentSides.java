package org.starloco.locos.enums;

public enum AlignmentSides {
    NEUTRE(0),
    BONTARIEN(1),
    BRAKMARIEN(2),
    MERCENAIRE(3);

    private final int id;

    AlignmentSides(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static AlignmentSides getById(int id) {
        for (AlignmentSides side : values()) {
            if (side.getId() == id) {
                return side;
            }
        }
        throw new IllegalArgumentException("No AlignmentSides found for id: " + id);
    }
}
