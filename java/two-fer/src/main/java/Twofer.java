import java.util.Optional;

class Twofer {
    String twofer(String name) {
        Optional<String> optName = Optional.ofNullable(name);
        return String.format("One for %s, one for me.", optName.orElse("you"));
    }
}
