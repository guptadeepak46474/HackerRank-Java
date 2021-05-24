class Singleton {
    private static Singleton instance;
    public static String str;
    private Singleton(){}

    static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class){
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}