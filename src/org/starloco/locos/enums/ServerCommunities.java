package org.starloco.locos.enums;

public enum ServerCommunities {
    FRANCOPHONE(0),
    ROYAUME_UNI_IRLANDE(1),
    INTERNATIONALE(2),
    ALLEMANDE(3),
    HISPANOPHONE(4),
    RUSSE(5),
    BRESILIENNE(6),
    NEERLANDAISE(7),
    ITALIENNE(9),
    JAPONAISE(10),
    DEBUG(99);

    private final int id;

    ServerCommunities(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static ServerCommunities getById(int id) {
        for (ServerCommunities community : values()) {
            if (community.getId() == id) {
                return community;
            }
        }
        throw new IllegalArgumentException("No ServerCommunities found with id: " + id);
    }
}
