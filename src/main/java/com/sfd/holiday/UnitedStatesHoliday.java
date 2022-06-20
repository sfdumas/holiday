package com.sfd.holiday;

import java.time.LocalDate;
import java.util.function.Function;

public interface UnitedStatesHoliday extends Holiday {

    boolean isFederalHoliday();

    default Function<Integer, LocalDate> getObservance() {
        return year -> shiftObservance(getHoliday().apply(year));
    }

    default LocalDate shiftObservance(LocalDate holiday) {
        return switch (holiday.getDayOfWeek()) {
            case SUNDAY -> holiday.plusDays(1);
            case SATURDAY -> holiday.minusDays(1);
            default -> holiday;
        };
    }
}
