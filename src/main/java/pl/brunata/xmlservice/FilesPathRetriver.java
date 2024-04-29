package pl.brunata.xmlservice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FilesPathRetriver {
    public static final Path PATH = Path.of("src/main/resources/xml");
    public static List<File> allFilesFromDirectorys = new ArrayList<>();
    public static List<File> allDirectoresFromPath;


    public static List<File> getAllFilesFromDirectorys(){
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
