import java.util.Locale;
import java.util.ResourceBundle;

public class Greeter {

  private Locale locale;
  private String name;

  public Greeter(String language, String country, String name) {
    locale = new Locale(language, country);
    this.name = name;
  }

  public String sayHello() {
    ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);
    return messages.getString("greeting") + ", " + name;
  }

  public static void main(String[] args) {
    String language = "Unknown";
    String country = "Unknown";
    String name = "Unknown";
    for(int i = 0; i < args.length; i++) {
      if(i==0) {
        language = args[i];
      } else if(i==1) {
        country = args[i];
      } else if(i==2) {
        name = args[i];
      }
    }
    Greeter greeter = new Greeter(language, country, name);
    System.out.println(greeter.sayHello());
  }
}
