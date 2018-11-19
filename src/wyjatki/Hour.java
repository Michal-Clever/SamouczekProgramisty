package wyjatki;

public class Hour {
    int hour = 0;

    public Hour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }
    
    public int getNumberOfSeconds(int hour) {
        if (hour < 0) {
            throw new IllegalArgumentException("Hour must be >= 0: " + hour);
        }
        return hour * 60 * 60;
    }

    @Override
    public String toString() {
        return "Hour{" +
                "hour=" + hour +
                '}';
    }
}
