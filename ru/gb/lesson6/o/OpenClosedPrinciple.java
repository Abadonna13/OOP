package ru.gb.lesson6.o;

import java.util.Collection;
import java.util.Collections;

public class OpenClosedPrinciple {

    public static void main(String[] args) {
        // Принцип открытости-закрытость

        // InputStream, OutputStream

    }

//    public class PairSumCalculator extends PairCalculator {
//        @Override
//        public int calculate(int x, int y, String operation) {
//            if ("+".equals(operation)) {
//                return x + y;
//            }
//            throw new UnsupportedOperationException(operation + " не поддерживается");
//        }
//    }

    interface OperationWorker {
        int calculate(int x, int y);
    }

    public class SumOperationWorker implements OperationWorker {
        @Override
        public int calculate(int x, int y) {
            return x + y;
        }
    }

    public class PairCalculator {

        public int calculate(int x, int y, OperationWorker worker) {
            return worker.calculate(x, y);

//            if ("+".equals(operation)) {
//                return x + y;
//            } else if ("*".equals(operation)) {
//                return x * y;
//            }
//             ...
//            throw new UnsupportedOperationException(operation + " не поддерживается");
        }

    }




}
