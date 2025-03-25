package Day4;
public class Task {
  public void talk() {
        System.out.println("Hello!");
    }
    public void talk(String name) {
        System.out.println("Hello, " + name + "!");
    }
    public static void main(String[] args) {
        Task person = new Task();
        person.talk();
        person.talk("Keerthana");
    }
}

