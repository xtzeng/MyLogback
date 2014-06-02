
   /**
2    * Logback: the reliable, generic, fast and flexible logging framework.
3    * Copyright (C) 1999-2013, QOS.ch. All rights reserved.
4    *
5    * This program and the accompanying materials are dual-licensed under
6    * either the terms of the Eclipse Public License v1.0 as published by
7    * the Eclipse Foundation
8    *
9    *   or (per the licensee's choosing)
10   *
11   * under the terms of the GNU Lesser General Public License version 2.1
12   * as published by the Free Software Foundation.
13   */
  package manual.configuration;
  
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  
  import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import chapters.configuration.Foo;
  
  public class MyApp2 {
    final static Logger logger = LoggerFactory.getLogger(MyApp2.class);
  
    public static void main(String[] args) {
      // assume SLF4J is bound to logback in the current environment
      LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
      // print logback's internal status
      StatusPrinter.print(lc);
      
      logger.info("Entering application.");
      Foo foo = new Foo();
      foo.doIt();
      logger.info("Exiting application.");
    }
  }