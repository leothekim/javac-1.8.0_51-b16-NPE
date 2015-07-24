import java.util.function.Function;

public class Testing {
  public Testing() {
    this(Strings::new);
  }

  public Testing(final Function<String, String> func) {
    func.apply("foo");
  }

}
