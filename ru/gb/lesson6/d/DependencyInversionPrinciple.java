package ru.gb.lesson6.d;

import ru.gb.lesson6.i.InterfaceSegregationPrinciple;
import ru.gb.lesson6.s.SingleResponsibilityPrinciple;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DependencyInversionPrinciple {

    public static void main(String[] args) {
        // Принципе инверсии зависимостей

        new NdsCalculator(new ForeignNdsResolver());
        new NdsCalculator(new RussianNdsResolver());

    }

    static class NdsCalculator {

        private final NdsResolver ndsResolver;

        public NdsCalculator(NdsResolver ndsResolver) {
            this.ndsResolver = ndsResolver;
        }

        public double withNds(double price) {
            return ndsResolver.getNds() * price + price;
        }

    }

    // core
    // russian [+core] + RussianNdsResolver
    // foreign [+core] + ForeignNdsResolver

    static interface NdsResolver {
        double getNds();
    }

    static class RussianNdsResolver implements NdsResolver {
        public double getNds() {
            // get http://central-bank/nds/today
            return 0.2; // 20%
        }
    }

    static class ForeignNdsResolver implements NdsResolver{
        public double getNds() {
            if (LocalDate.now().getDayOfWeek() == DayOfWeek.MONDAY) {
                return 0.2;
            }
            return 0.5;
        }
    }

}
