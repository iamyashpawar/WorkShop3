package bridgelabz;

import java.util.Arrays;

public class Hotel {

    private String hotelName;
    private int rating;
    
    private int[] weekDayRate;
    
    private int [] weekEndRate;
    
    private int[] rewardsWeekRate;
    
    private int[] rewardsWeekendRate;

    public Hotel(String hotelName, int rating, int[] weekDayRate, int[] weekEndRate, int[] rewardsWeekRate, int[] rewardsWeekendRate) {
        this.hotelName = hotelName;
        this.rating = rating;
        this.weekDayRate = weekDayRate;
        this.weekEndRate = weekEndRate;
        this.rewardsWeekRate = rewardsWeekRate;
        this.rewardsWeekendRate = rewardsWeekendRate;
    }

    public Hotel(String lakewood, int rating, int[] weekDayRate, int[] weekEndRate) {
    }

    public String getHotelName() {
        return hotelName;
    }

    public int getRating() {
        return rating;
    }

    public int[] getWeekDayRate() {
        return weekDayRate;
    }

    public int[] getWeekEndRate() {
        return weekEndRate;
    }

    public int[] getRewardsWeekRate() {
        return rewardsWeekRate;
    }

    public int[] getRewardsWeekendRate() {
        return rewardsWeekendRate;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", rating=" + rating +
                ", weekDayRate=" + Arrays.toString(weekDayRate) +
                ", weekEndRate=" + Arrays.toString(weekEndRate) +
                ", rewardsWeekRate=" + Arrays.toString(rewardsWeekRate) +
                ", rewardsWeekendRate=" + Arrays.toString(rewardsWeekendRate) +
                '}';
    }
}
