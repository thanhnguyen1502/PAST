package ss4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }
    public Date start() {
        return this.startTime = new Date();
    }
    public Date stop(){
        return this.endTime = new Date();
    }
    public long getElapsedTime(){
        return this.endTime.getTime()-this.startTime.getTime();
    }

    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        watch.start();

        for (long i = 0; i < 999999999; i++) {
            System.out.println(i+1);

        }
        watch.stop();
        System.out.println(watch.getElapsedTime());
    }
}
