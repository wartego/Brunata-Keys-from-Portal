package pl.brunata.xmlservice;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;
import java.util.Set;

class FilesPathRetriverTest {

    @Test
    void getAllFilesFromDirectorys() {
        List<File> filesFromDirectorys = FilesPathRetriver.getAllFilesFromDirectorys();
        filesFromDirectorys.forEach(System.out::println);
    }
}