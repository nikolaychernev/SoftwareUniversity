package bg.softuni.utils;

public class RegistrationTime {

    private Integer hour;
    private Integer minutes;
    private Integer day;
    private Integer month;
    private Integer year;

    public RegistrationTime(String registrationTime) {
        this.initializeData(this.parseData(registrationTime));
    }

    public Integer getHour() {
        return this.hour;
    }

    private void setHour(Integer hour) {
        this.hour = hour;
    }

    public Integer getMinutes() {
        return this.minutes;
    }

    private void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Integer getDay() {
        return this.day;
    }

    private void setDay(Integer day) {
        this.day = day;
    }

    public Integer getMonth() {
        return this.month;
    }

    private void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return this.year;
    }

    private void setYear(Integer year) {
        this.year = year;
    }

    private Integer[] parseData(String registrationTime) {
        String[] splitRegistrationTime = registrationTime.split("\\s");

        String hourAndMinutes = splitRegistrationTime[0];
        String date = splitRegistrationTime[1];

        String[] splitHoursAndMinutes = hourAndMinutes.split(":");
        String[] splitDate = date.split("/");

        Integer hour = Integer.parseInt(splitHoursAndMinutes[0]);
        Integer minutes = Integer.parseInt(splitHoursAndMinutes[1]);

        Integer day = Integer.parseInt(splitDate[0]);
        Integer month = Integer.parseInt(splitDate[1]);
        Integer year = Integer.parseInt(splitDate[2]);

        Integer[] parsedData = new Integer[5];

        parsedData[0] = hour;
        parsedData[1] = minutes;
        parsedData[2] = day;
        parsedData[3] = month;
        parsedData[4] = year;

        return parsedData;
    }

    private void initializeData(Integer[] data) {
        Integer hour = data[0];
        Integer minutes = data[1];
        Integer day = data[2];
        Integer month = data[3];
        Integer year = data[4];

        this.setHour(hour);
        this.setMinutes(minutes);
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }

    @Override
    public String toString() {
        String hour = this.hour < 10 ? "0" + this.hour : this.hour + "";
        String minutes = this.minutes < 10 ? "0" + this.minutes : this.minutes + "";
        String day = this.day < 10 ? "0" + this.day : this.day + "";
        String month = this.month < 10 ? "0" + this.month : this.month + "";

        return hour + ":" + minutes + " " + day + "/" + month + "/" + this.year;
    }
}