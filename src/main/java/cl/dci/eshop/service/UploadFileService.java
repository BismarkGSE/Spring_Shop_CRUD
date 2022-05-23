package cl.dci.eshop.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UploadFileService {
	
	private String upload_folder = ".//src//main//resources//static//img";
	
	public void saveFile(MultipartFile file) throws IOException {
		if ( !file.isEmpty() ) {
			byte[] bytes = file.getBytes();
			Path path = Paths.get(upload_folder +file.getOriginalFilename());
			Files.write(path,bytes);
		}
	}

}
