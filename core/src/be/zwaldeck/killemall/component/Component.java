package be.zwaldeck.killemall.component;

public interface Component {
    String MESSAGE_TOKEN = ":::::";

    enum MessageType {
        INIT_START_POSITION,
        INIT_STATE,
        INIT_ENTITY,
        INIT_ANGLE,
        INIT_GUN,
        INIT_DIRECTION,

        CURRENT_POSITION,
        CURRENT_MOUSE_POSITION,
        CURRENT_STATE,
        CURRENT_ANGLE,

        IS_FIRING,
        IS_LEFT,
        IS_RIGHT,
        IS_UP,
        IS_DOWN,

        COLLISION_WITH_MAP,
        COLLISION_WITH_ENTITY
    }

    void dispose();
    void receiveMessage(MessageType type, String message);
}
