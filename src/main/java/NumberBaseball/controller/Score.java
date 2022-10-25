package NumberBaseball.controller;

public enum Score {
    BALL(0),
    STRIKE(0);

    private int count;

    Score(int count) {
        this.count = count;
    }

    public void initCount() {
        setCount(0);
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void addCount() {
        count += 1;
    }

    public int getCount() {
        return count;
    }
}
