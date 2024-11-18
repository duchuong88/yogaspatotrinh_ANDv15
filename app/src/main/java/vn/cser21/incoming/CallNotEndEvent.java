package yogaspatotrinh.ezs.incoming;

public class CallNotEndEvent {
    public int id;
    public int duration;

    public CallNotEndEvent(int id, int duration) {
        this.id = id;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}