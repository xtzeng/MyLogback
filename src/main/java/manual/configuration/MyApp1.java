package manual.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import chapters.configuration.Foo;

public class MyApp1 {
  final static Logger logger = LoggerFactory.getLogger(MyApp1.class);

  public static void main(String[] args) {
    logger.info("Entering application.");

    Foo foo = new Foo();
    foo.doIt();
    logger.info("Exiting application.");
  }
}