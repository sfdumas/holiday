package com.sfd.holiday

import org.assertj.core.api.Assertions
import spock.lang.Specification
import spock.lang.Unroll

import java.time.LocalDate

class UnitedStatesFederalHolidaysSpec extends Specification {

    @Unroll
    def 'New Years is Jan 1st and Observance is Moved'(LocalDate holiday, LocalDate observed) {
        expect:
        Assertions.assertThat(UnitedStatesFederalHolidays.NEW_YEAR.getHoliday().apply(year))
                .isEqualTo(holiday)

        Assertions.assertThat(UnitedStatesFederalHolidays.NEW_YEAR.getObservance().apply(year))
                .isEqualTo(observed)

        where:
        year || holiday                    | observed
        2022 || LocalDate.of(year, 01, 01) | LocalDate.of(2021, 12, 31)
        2023 || LocalDate.of(year, 01, 01) | LocalDate.of(year, 01, 02)
        2024 || LocalDate.of(year, 01, 01) | LocalDate.of(year, 01, 01)
        2025 || LocalDate.of(year, 01, 01) | LocalDate.of(year, 01, 01)
        2026 || LocalDate.of(year, 01, 01) | LocalDate.of(year, 01, 01)
    }

    def 'New Years was established in 1870'() {
        expect:
        Assertions.assertThat(UnitedStatesFederalHolidays.NEW_YEAR.established()).isEqualTo(1870)
    }

    @Unroll
    def 'MLK JR is always 3rd Monday In January'(LocalDate holiday, LocalDate observed) {
        expect:
        Assertions.assertThat(UnitedStatesFederalHolidays.MLK_JR.getHoliday().apply(year))
                .isEqualTo(holiday)

        Assertions.assertThat(UnitedStatesFederalHolidays.MLK_JR.getObservance().apply(year))
                .isEqualTo(observed)

        where:
        year || holiday                    | observed
        2022 || LocalDate.of(year, 01, 17) | holiday
        2023 || LocalDate.of(year, 01, 16) | holiday
        2024 || LocalDate.of(year, 01, 15) | holiday
        2025 || LocalDate.of(year, 01, 20) | holiday
        2026 || LocalDate.of(year, 01, 19) | holiday
    }

    def 'NMLK JR was established in 1983'() {
        expect:
        Assertions.assertThat(UnitedStatesFederalHolidays.MLK_JR.established()).isEqualTo(1983)
    }

    @Unroll
    def 'Washingtons Birthday is always 3rd Monday In February'(LocalDate holiday, LocalDate observed) {
        expect:
        Assertions.assertThat(UnitedStatesFederalHolidays.WASHINGTONS_BIRTHDAY.getHoliday().apply(year))
                .isEqualTo(holiday)

        Assertions.assertThat(UnitedStatesFederalHolidays.WASHINGTONS_BIRTHDAY.getObservance().apply(year))
                .isEqualTo(observed)

        where:
        year || holiday                    | observed
        2022 || LocalDate.of(year, 02, 21) | holiday
        2023 || LocalDate.of(year, 02, 20) | holiday
        2024 || LocalDate.of(year, 02, 19) | holiday
        2025 || LocalDate.of(year, 02, 17) | holiday
        2026 || LocalDate.of(year, 02, 16) | holiday
    }

    def 'Washingtons Birthday was established in 1879'() {
        expect:
        Assertions.assertThat(UnitedStatesFederalHolidays.WASHINGTONS_BIRTHDAY.established()).isEqualTo(1879)
    }

    @Unroll
    def 'Memorial Day is always the last Monday In May'(LocalDate holiday, LocalDate observed) {
        expect:
        Assertions.assertThat(UnitedStatesFederalHolidays.MEMORIAL_DAY.getHoliday().apply(year))
                .isEqualTo(holiday)

        Assertions.assertThat(UnitedStatesFederalHolidays.MEMORIAL_DAY.getObservance().apply(year))
                .isEqualTo(observed)

        where:
        year || holiday                    | observed
        2022 || LocalDate.of(year, 05, 30) | holiday
        2023 || LocalDate.of(year, 05, 29) | holiday
        2024 || LocalDate.of(year, 05, 27) | holiday
        2025 || LocalDate.of(year, 05, 26) | holiday
        2026 || LocalDate.of(year, 05, 25) | holiday
    }

    def 'Memorial Day was established in 1870'() {
        expect:
        Assertions.assertThat(UnitedStatesFederalHolidays.MEMORIAL_DAY.established()).isEqualTo(1971)
    }

    @Unroll
    def 'Juneteenth is on June 19th and observed otherwise'(LocalDate holiday, LocalDate observed) {
        expect:
        Assertions.assertThat(UnitedStatesFederalHolidays.JUNETEENTH.getHoliday().apply(year))
                .isEqualTo(holiday)

        Assertions.assertThat(UnitedStatesFederalHolidays.JUNETEENTH.getObservance().apply(year))
                .isEqualTo(observed)

        where:
        year || holiday                    | observed
        2022 || LocalDate.of(year, 06, 19) | LocalDate.of(year, 06, 20)
        2023 || LocalDate.of(year, 06, 19) | holiday
        2024 || LocalDate.of(year, 06, 19) | holiday
        2025 || LocalDate.of(year, 06, 19) | holiday
        2026 || LocalDate.of(year, 06, 19) | holiday
    }

    def 'Juneteenth was established in 2021'() {
        expect:
        Assertions.assertThat(UnitedStatesFederalHolidays.JUNETEENTH.established()).isEqualTo(2021)
    }

    @Unroll
    def 'Independence is on July 4th and observed otherwise'(LocalDate holiday, LocalDate observed) {
        expect:
        Assertions.assertThat(UnitedStatesFederalHolidays.INDEPENDENCE.getHoliday().apply(year))
                .isEqualTo(holiday)

        Assertions.assertThat(UnitedStatesFederalHolidays.INDEPENDENCE.getObservance().apply(year))
                .isEqualTo(observed)

        where:
        year || holiday                   | observed
        2022 || LocalDate.of(year, 07, 4) | LocalDate.of(year, 07, 04)
        2023 || LocalDate.of(year, 07, 4) | LocalDate.of(year, 07, 04)
        2024 || LocalDate.of(year, 07, 4) | LocalDate.of(year, 07, 04)
        2025 || LocalDate.of(year, 07, 4) | LocalDate.of(year, 07, 04)
        2026 || LocalDate.of(year, 07, 4) | LocalDate.of(year, 07, 03)
    }

    def 'Independence Day was established in 1938'() {
        expect:
        Assertions.assertThat(UnitedStatesFederalHolidays.INDEPENDENCE.established()).isEqualTo(1938)
    }

    @Unroll
    def 'Labor Day is always the first Monday in September'(LocalDate holiday, LocalDate observed) {
        expect:
        Assertions.assertThat(UnitedStatesFederalHolidays.LABOR.getHoliday().apply(year))
                .isEqualTo(holiday)

        Assertions.assertThat(UnitedStatesFederalHolidays.LABOR.getObservance().apply(year))
                .isEqualTo(observed)

        where:
        year || holiday                  | observed
        2022 || LocalDate.of(year, 9, 5) | holiday
        2023 || LocalDate.of(year, 9, 4) | holiday
        2024 || LocalDate.of(year, 9, 2) | holiday
        2025 || LocalDate.of(year, 9, 1) | holiday
        2026 || LocalDate.of(year, 9, 7) | holiday
    }

    def 'Labor Daywas established in 1894'() {
        expect:
        Assertions.assertThat(UnitedStatesFederalHolidays.LABOR.established()).isEqualTo(1894)
    }

    @Unroll
    def 'Columbus Day is always the second Monday in September'(LocalDate holiday, LocalDate observed) {
        expect:
        Assertions.assertThat(UnitedStatesFederalHolidays.COLUMBUS.getHoliday().apply(year))
                .isEqualTo(holiday)

        Assertions.assertThat(UnitedStatesFederalHolidays.COLUMBUS.getObservance().apply(year))
                .isEqualTo(observed)

        where:
        year || holiday                    | observed
        2022 || LocalDate.of(year, 10, 10) | holiday
        2023 || LocalDate.of(year, 10, 9)  | holiday
        2024 || LocalDate.of(year, 10, 14) | holiday
        2025 || LocalDate.of(year, 10, 13) | holiday
        2026 || LocalDate.of(year, 10, 12) | holiday
    }

    def 'Columbus Day was established in 1937'() {
        expect:
        Assertions.assertThat(UnitedStatesFederalHolidays.COLUMBUS.established()).isEqualTo(1937)
    }

    @Unroll
    def 'Veterans Day is always November 11th and observed otherwise'(LocalDate holiday, LocalDate observed) {
        expect:
        Assertions.assertThat(UnitedStatesFederalHolidays.VETERANS.getHoliday().apply(year))
                .isEqualTo(holiday)

        Assertions.assertThat(UnitedStatesFederalHolidays.VETERANS.getObservance().apply(year))
                .isEqualTo(observed)

        where:
        year || holiday                    | observed
        2022 || LocalDate.of(year, 11, 11) | holiday
        2023 || LocalDate.of(year, 11, 11) | LocalDate.of(year, 11, 10)
        2024 || LocalDate.of(year, 11, 11) | holiday
        2025 || LocalDate.of(year, 11, 11) | holiday
        2026 || LocalDate.of(year, 11, 11) | holiday
    }

    def 'Veterans Day was established in 1938'() {
        expect:
        Assertions.assertThat(UnitedStatesFederalHolidays.VETERANS.established()).isEqualTo(1938)
    }

    @Unroll
    def 'Thanksgiving Day is always the 4th Thursday in November'(LocalDate holiday, LocalDate observed) {
        expect:
        Assertions.assertThat(UnitedStatesFederalHolidays.THANKSGIVING.getHoliday().apply(year))
                .isEqualTo(holiday)

        Assertions.assertThat(UnitedStatesFederalHolidays.THANKSGIVING.getObservance().apply(year))
                .isEqualTo(observed)

        where:
        year || holiday                    | observed
        2022 || LocalDate.of(year, 11, 24) | holiday
        2023 || LocalDate.of(year, 11, 23) | holiday
        2024 || LocalDate.of(year, 11, 28) | holiday
        2025 || LocalDate.of(year, 11, 27) | holiday
        2026 || LocalDate.of(year, 11, 26) | holiday
    }

    def 'Thanksgiving was established in 1941'() {
        expect:
        Assertions.assertThat(UnitedStatesFederalHolidays.THANKSGIVING.established()).isEqualTo(1941)
    }

    @Unroll
    def 'Christamas Day is always on December 25th and observed otherwise'(LocalDate holiday, LocalDate observed) {
        expect:
        Assertions.assertThat(UnitedStatesFederalHolidays.CHRISTMAS.getHoliday().apply(year))
                .isEqualTo(holiday)

        Assertions.assertThat(UnitedStatesFederalHolidays.CHRISTMAS.getObservance().apply(year))
                .isEqualTo(observed)

        where:
        year || holiday                    | observed
        2022 || LocalDate.of(year, 12, 25) | LocalDate.of(year, 12, 26)
        2023 || LocalDate.of(year, 12, 25) | holiday
        2024 || LocalDate.of(year, 12, 25) | holiday
        2025 || LocalDate.of(year, 12, 25) | holiday
        2026 || LocalDate.of(year, 12, 25) | holiday
    }

    def 'Christmas was established in 1870'() {
        expect:
        Assertions.assertThat(UnitedStatesFederalHolidays.CHRISTMAS.established()).isEqualTo(1870)
    }

}
