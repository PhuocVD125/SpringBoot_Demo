package phuocvu.org.SPRINGBOOT_DEMO.service;

import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

public interface IStorageService {
    public String storeFile(MultipartFile file);
    public Stream<Path> loadALL(); // load all file in folder
    public byte[] readFileContent(String fileName);
    public void deleteAllFile();
}
