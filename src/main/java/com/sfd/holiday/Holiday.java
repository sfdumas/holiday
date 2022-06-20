package com.sfd.holiday;

import java.time.LocalDate;
import java.util.function.Function;

public interface Holiday {

    /**
     * Is the day of the holiday.
     *
     * @return the date the holiday is on.
     */
    Function<Integer, LocalDate> getHoliday();

    /**
     * The year the holiday was established
     *
     * @return The year the holiday was established
     */
    Integer established();

}
