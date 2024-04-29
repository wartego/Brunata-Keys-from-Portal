package pl.brunata.csv.mcids;

import pl.brunata.mapper.MCIDNumberEnum;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DirectoresController {

    private static String path = null;
    private static Set<String> allChildDirectories = null;
    private static final MCIDNumberEnum[] MCIDs = MCIDNumberEnum.values();
    private static List<MCIDNumberEnum> allMCIDS = List.of(MCIDs);
    public static Set<String> listDirectoresUsingJavaIO(String dir) {
        path = dir;
        checkAndCreateIfMainDirectoryExist();

        allChildDirectories =  Stream.of(Objects.requireNonNull(new File(dir).listFiles()))
                .filter(File::isDirectory)
                .map(File::getName)
                .collect(Collectors.toSet());

        createAllNotExistedChildDirectores();
        return allChildDirectories;
    }

    public static void createAllNotExistedChildDirectores(){
        allMCIDS.forEach( mcidNumberEnum -> {
            String currentMCIDNumber = mcidNumberEnum.getMcidNumber();
            if(!allChildDirectories.contains(currentMCIDNumber)){
                try {
                    Files.createDirectories(Path.of(path +"/"+currentMCIDNumber));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
    public static void checkAndCreateIfMainDirectoryExist(){

        boolean exists = new File(path).exists();
        if(!exists){
            try {
                Files.createDirectories(Path.of(path));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }













}
