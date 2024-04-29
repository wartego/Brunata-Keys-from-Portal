package pl.brunata.xmlservice;


import org.junit.Test;

import java.io.File;
import java.nio.file.*;
import java.util.List;
import java.util.Set;


public class FolderPathRetriverTest {

    @Test
    public void getAllDirectoriesFromPath() {
        Path path = Path.of("src/main/resources/xml");
        List<File> allDirectoriesFromPath = FolderPathRetriver.getAllDirectoriesFromPath(path);

        allDirectoriesFromPath.forEach(System.out::println);

    }
}