package pl.brunata.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FolderPathRetriver {
    public static Set<File> directoriesFromPath;

    public static Set<File> getAllDirectoriesFromPath(Path path){

        try (Stream<Path> list = Files.list(path)){
            directoriesFromPath = list
                    .filter(Files::isDirectory)
                    .map( Path::toFile)
                        .collect(Collectors.toSet());
        } catch (IOException e){
            e.printStackTrace();
        }
        return directoriesFromPath;
    }
}
