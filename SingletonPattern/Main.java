class AppSettings { private static AppSettings instance;
private AppSettings() {
    System.out.println("Settings object created");
}

public static AppSettings getInstance() {
    if (instance == null) {
        instance = new AppSettings();
    }

    return instance;
}

public void showSettings() {
    System.out.println("Application settings are loaded");
}
}
public class Main {
     public static void main(String[] args) {
         AppSettings settings1 = AppSettings.getInstance(); 
         AppSettings settings2 = AppSettings.getInstance();
    settings1.showSettings();

    System.out.println(settings1 == settings2);
}
}