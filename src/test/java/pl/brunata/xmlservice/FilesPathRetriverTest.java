package pl.brunata.service;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Set;

class FilesPathRetriverTest {

    @Test
    void getAllFilesFromDirectorys() {
        Set<File> filesFromDirectorys = FilesPathRetriver.getAllFilesFromDirectorys();
        filesFromDirectorys.forEach(System.out::println);
    }
}