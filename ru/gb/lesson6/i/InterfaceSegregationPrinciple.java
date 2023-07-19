package ru.gb.lesson6.i;

import java.util.List;

public class InterfaceSegregationPrinciple {

    public static void main(String[] args) {


        // Принцип разделения интерфейсов

        // List -> Collection -> Iterable
        // Set  -> Collection -> Iterable


        // Keyboard       -> Computer
        // keyboard.key() -> Computer
        // Bluetooth, USB, USB-C, PS/2

    }

    class WebHtmlCreator {

        private NdsResolver ndsResolver;

        public WebHtmlCreator(NdsCalculator ndsResolver) {
            this.ndsResolver = ndsResolver;
        }

        public String createHtmlPage() {
            return "какой-то текст..." + "НДС на сегодня: " + ndsResolver.nds();
        }

    }

    interface NdsResolver {
        double nds();
    }

    interface INdsСalculator {
        double withNds(double price);
    }

    class NdsCalculator implements NdsResolver, INdsСalculator {

        @Override
        public double withNds(double price) {
            return nds() * price + price;
        }

        @Override
        public double nds() {
            return 0.2;
        }

    }

}
