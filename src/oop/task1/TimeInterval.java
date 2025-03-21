package oop.task1;

public class TimeInterval {

    private int second;
    private int minute;
    private int hour;

    public TimeInterval(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public TimeInterval(int totalSecond){
        this.hour = totalSecond / 3600;
        this.minute = totalSecond % 3600 / 60;
        this.second = totalSecond % 3600 % 60;
    }

    public int totalSeconds(){
        return second + minute * 60 + hour * 3600;
    }

    public TimeInterval sum(TimeInterval second){
        return new TimeInterval(this.totalSeconds() + second.totalSeconds());
    }

    public void print() {
        System.out.println("h" + hour + ", m" + minute + ", s" + second);
    }
}
