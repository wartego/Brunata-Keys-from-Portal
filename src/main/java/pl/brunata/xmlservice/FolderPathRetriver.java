package pl.brunata.xmlservice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FolderPathRetriver {
    public static List<File> directoriesFromPath;

    public static List<File> getAllDirectoriesFromPath(Path path){

        try (Stream<Path> list = Files.list(path)){
            directoriesFromPath = list
                    .filter(Files::isDirectory)
                    .map( Path::toFile)
                        .collect(Collectors.toList());
        } catch (IOException e){
            e.printStackTrace();
        }
        return directoriesFromPath;
    }
}
