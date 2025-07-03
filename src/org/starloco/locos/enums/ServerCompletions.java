package org.starloco.locos.enums;

public enum ServerCompletions {
    RECOMMANDE(0),
    MOYENNE(1),
    ELEVEE(2),
    COMING_SOON(3),
    COMPLET(4),
    NEW(5);

    private final int id;

    ServerCompletions(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static ServerCompletions fromId(int id) {
        for (ServerCompletions completion : values()) {
            if (completion.getId() == id) {
                return completion;
            }
        }
        throw new IllegalArgumentException("No ServerCompletions with id: " + id);
    }
}
