package ru.netology.bonus;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = {"/data.csv"})
    public void findBonus(long amount, boolean registered) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, registered);
    }
}
