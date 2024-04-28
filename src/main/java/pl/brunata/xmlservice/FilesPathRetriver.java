package pl.brunata.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

public class FilesPathRetriver {
    public static final Path PATH = Path.of("src/main/resources/xml");
    public static Set<File> allFilesFromDirectorys = new HashSet<>();
    public static Set<File> allDirectoresFromPath;


    public static Set<File> getAllFilesFromDirectorys(){
        allDirectoresFromPath = FolderPathRetriver.getAllDirectoriesFromPath(PATH);

        for (File file : allDirectoresFromPath) {
            try{
               Files.list(file.toPath())
                        .filter(Files::isRegularFile)
                        .map(Path::toFile)
                       .forEach(allFilesFromDirectorys::add);
            } catch (IOException e){
                e.printStackTrace();
            }
        }

        long count = allFilesFromDirectorys.stream().map(File::toPath).distinct().count();
        System.out.println("In all directorys there is in total files: " + count);
        return allFilesFromDirectorys;

    }
}
