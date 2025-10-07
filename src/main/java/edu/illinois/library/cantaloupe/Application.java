package edu.illinois.library.cantaloupe;

import java.io.FileReader;
import java.io.IOException;
import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;

/**
 * Class representing the application. This is not the main application class,
 * which is actually {@link StandaloneEntry}.
 */
public final class Application {
    private static final String DEFAULT_VERSION = "Unknown";

    /**
     * @return The application version from {@literal MANIFEST.MF}, or some
     *         other string if not running from a JAR.
     */
    public static String getVersion() {
      try {
          MavenXpp3Reader reader = new MavenXpp3Reader();
          Model model = reader.read(new FileReader("pom.xml"));
          return model.getVersion();
      } catch (IOException | XmlPullParserException e) {
          return DEFAULT_VERSION;
      }
    }
}
