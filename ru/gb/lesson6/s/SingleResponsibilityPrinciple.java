package ru.gb.lesson6.s;

public class SingleResponsibilityPrinciple {

    public static void main(String[] args) {
        // Принцип единой ответственности
        // Единственная причина для изменений


    }

    static class NdsCalculator {

        private final NdsResolver ndsResolver;

        public NdsCalculator(NdsResolver ndsResolver) {
            this.ndsResolver = ndsResolver;
        }

        public double withNds(double price) {
            return ndsResolver.getNds() * price + price;
        }

//        private double nds() {
////             get http://central-bank/nds/today
//            return 0.2; // 20%
//        }

    }

    static class NdsResolver {
        public double getNds() {
            // get http://central-bank/nds/today
            return 0.2; // 20%
        }
    }

//    static class File {
//
//        public File toPdf() {
//            throw new UnsupportedOperationException();
//        }
//
//        public File toDocx() {
//            throw new UnsupportedOperationException();
//        }
//
//    }

}
