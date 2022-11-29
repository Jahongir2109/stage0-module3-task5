package lang.print.gaps.task5;

import java.sql.Time;

public class TimeConvertor {
    public static void main(String[] args) {
        new TimeConvertor().convert(15);
    }
    public void convert(float minutes) {
        System.out.println(minutes*60);
    }
}
