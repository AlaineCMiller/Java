
public class Twofer {
    public String twofer(String input) {
        return String.format("One for %s, one for me.", input == null ? "you" : input);
    }
}

