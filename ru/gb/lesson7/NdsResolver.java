package ru.gb.lesson7;

//@Component
public class NdsResolver {

    private static NdsResolver instance = new NdsResolver();

    private NdsResolver() {

        // spring
        // IoCContainer

    }

    // a -> NdsResolver.getInstance() -> a(monitor)
    // b -> NdsResolver.getInstance()

    public static NdsResolver getInstance() {
//        if (instance == null) {
//            synchronized (NdsResolver.class) {
//                if (instance == null) {
//                    instance = new NdsResolver();
//                }
//            }
//        }
        return instance;
    }

    public double getNds() {
        return 0.5;
    }

}
