package bridgelabz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.Calendar.PM;

public class HotelMain {

    public static <Mentors> void main(String[] args) throws Exception{

        Hotel hotel1 = new Hotel("Lakewood", 3, new int[]{100,90}, new int[] {80,90});

        Hotel hotel2 = new Hotel("Bridgewood", 4, new int[]{160,60}, new int[] {110,50});

        Hotel hotel3 = new Hotel("Ridgewood", 5, new int[]{220,150}, new int[] {100,40});

        List<Hotel> hotels = new ArrayList<>();

        hotels.add(hotel1);
        hotels.add(hotel2);
        hotels.add(hotel3);


        int[] totalRate = new int[hotels.size()];
             Scanner sc = new Scanner(System.in);

           String date = sc.next();
        String CustomerType = sc.next();



  //hotels.stream()
                private int getWeekendDaysInRange(LocalDate startDate,  LocalDate endDate;
            endDate) {


                return (int) startDate.datesUntil(endDate.plusDays(1)).filter(date->date.getDayOfWeek()
                        .equals(DayOfWeek.SATURDAY) ||date.getDayOfWeek().equals(DayOfWeek.SUNDAY)).count();
            }




    }


}}
