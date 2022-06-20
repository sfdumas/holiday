package com.sfd.holiday;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.function.Function;

public enum UnitedStatesFederalHolidays implements UnitedStatesHoliday {
    NEW_YEAR {
        @Override
        public Function<Integer, LocalDate> getHoliday() {
            return year -> LocalDate.of(year, 1, 1);
        }

        @Override
        public Integer established() {
            return 1870;
        }
    },

    MLK_JR {
        @Override
        public Function<Integer, LocalDate> getHoliday() {
            return year -> LocalDate.of(year, 1, 1)
                    .with(TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.MONDAY));
        }

        @Override
        public Integer established() {
            return 1983;
        }
    },

    WASHINGTONS_BIRTHDAY {
        @Override
        public Function<Integer, LocalDate> getHoliday() {
            return year -> LocalDate.of(year, 2, 1)
                    .with(TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.MONDAY));
        }

        @Override
        public Integer established() {
            return 1879;
        }
    },

    MEMORIAL_DAY {
        @Override
        public Function<Integer, LocalDate> getHoliday() {
            return year -> LocalDate.of(year, 5, 1)
                    .with(TemporalAdjusters.lastInMonth(DayOfWeek.MONDAY));
        }

        @Override
        public Integer established() {
            return 1971;
        }
    },
    JUNETEENTH {
        @Override
        public Function<Integer, LocalDate> getHoliday() {
            return year -> LocalDate.of(year, 6, 19);
        }

        @Override
        public Integer established() {
            return 2021;
        }
    },

    INDEPENDENCE {
        @Override
        public Function<Integer, LocalDate> getHoliday() {
            return year -> LocalDate.of(year, 7, 4);
        }

        @Override
        public Integer established() {
            return 1938;
        }
    },

    LABOR {
        @Override
        public Function<Integer, LocalDate> getHoliday() {
            return year -> LocalDate.of(year, 9, 1)
                    .with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        }

        @Override
        public Integer established() {
            return 1894;
        }
    },

    COLUMBUS {
        @Override
        public Function<Integer, LocalDate> getHoliday() {
            return year -> LocalDate.of(year, 10, 1)
                    .with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.MONDAY));
        }

        @Override
        public Integer established() {
            return 1937;
        }
    },

    VETERANS {
        @Override
        public Function<Integer, LocalDate> getHoliday() {
            return year -> LocalDate.of(year, 11, 11);
        }

        @Override
        public Integer established() {
            return 1938;
        }
    },

    THANKSGIVING {
        @Override
        public Function<Integer, LocalDate> getHoliday() {
            return year -> LocalDate.of(year, 11, 1)
                    .with(TemporalAdjusters.dayOfWeekInMonth(4, DayOfWeek.THURSDAY));
        }

        @Override
        public Integer established() {
            return 1941;
        }
    },

    CHRISTMAS {
        @Override
        public Function<Integer, LocalDate> getHoliday() {
            return year -> LocalDate.of(year, 12, 25);
        }

        @Override
        public Integer established() {
            return 1870;
        }
    };

    public boolean isFederalHoliday() {
        return true;
    }

}
