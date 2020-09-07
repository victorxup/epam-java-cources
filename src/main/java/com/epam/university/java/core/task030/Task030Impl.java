package com.epam.university.java.core.task030;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Task030Impl implements Task030 {
    @Override
    public int daysBetweenDates(LocalDate dateStart, LocalDate dateEnd) {
        validate(dateStart, dateEnd);
        int days = dateEnd.getDayOfYear() - dateStart.getDayOfYear();
        return days;
    }

    @Override
    public LocalDate adjustDays(LocalDate dateStart, int daysToAdd) {
        validate(dateStart);
        LocalDate newDate = dateStart.plusDays(daysToAdd);
        return newDate;
    }

    @Override
    public long distanceBetween(Instant instantStart, Instant instantEnd) {
        validate(instantStart, instantEnd);
        Instant i = instantEnd.minusMillis(instantStart.toEpochMilli());
        return i.getEpochSecond();
    }

    @Override
    public DayOfWeek getDayOfWeek(LocalDate localDate) {
        validate(localDate);
        return localDate.getDayOfWeek();
    }

    @Override
    public LocalDate getNextWeekend(LocalDate localDate) {
        validate(localDate);
        LocalDate newDate = localDate.plusDays(1);
        while (true) {
            if (newDate.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
                return newDate;
            }
            newDate = newDate.plusDays(1);
        }
    }

    @Override
    public LocalTime getLocalTime(String timeString) {
        validate(timeString);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mma");
        LocalTime time = LocalTime.parse(timeString, formatter);
        return time;
    }

    private void validate(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException();
        }
    }

    private void validate(Object val1, Object val2) {
        if (val1 == null || val2 == null) {
            throw new IllegalArgumentException();
        }
    }
}
