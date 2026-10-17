class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(toDays(date1) - toDays(date2));
    }

    private int toDays(String date) {
        return (int) java.time.LocalDate.parse(date).toEpochDay();
    }
}