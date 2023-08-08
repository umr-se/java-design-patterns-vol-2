public class MainClass {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name");
        System.out.println("Your OS Name is : "+osName);
        if (osName.contains("linux")) {
            factory = new MacOSFactory();
        }
        else if (osName.contains("windows 11")) {
            factory = new AndroidFactory();
        }

        else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
