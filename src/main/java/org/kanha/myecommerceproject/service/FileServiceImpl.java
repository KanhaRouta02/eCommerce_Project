package org.kanha.myecommerceproject.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;
@Service
public class FileServiceImpl implements FileService {

    @Override
    public String uploadImage(String path, MultipartFile file) throws IOException {
        // File names of current or original file
        String originalFilename = file.getOriginalFilename();

        // Generate a unique file name
        String randomId = UUID.randomUUID().toString();
        String fileName = randomId.concat(originalFilename.substring(originalFilename.lastIndexOf("."))); // mat.jpg -> 123 -> 123.jpg
        String filePath = path + File.separator + fileName;

        // Check path exist and create
        File folder = new File(path);
        if (!folder.exists()) folder.mkdirs();

        // Upload to server
        Files.copy(file.getInputStream(), Paths.get(filePath));

        // Return file name
        return fileName;
    }
}
