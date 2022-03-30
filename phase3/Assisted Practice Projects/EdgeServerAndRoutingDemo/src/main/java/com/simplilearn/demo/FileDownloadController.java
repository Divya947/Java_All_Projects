package com.simplilearn.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileDownloadController {

	@GetMapping("/download")
	public ResponseEntity<Object> downloadFile() throws FileNotFoundException{

		String filename="src\\main\\resources\\static\\test.txt";

		File file =new File(filename);
		InputStreamResource resource= new InputStreamResource(new FileInputStream(file));

		 HttpHeaders headers=new HttpHeaders();
		 headers.add("Content-Disposition", 
				 String.format("attachment; filename=\"%s\"", file.getName()));
		 headers.add("Cache-Control", "no-cache,no-store,must-revalidate");
		 headers.add("pragma", "no-cache");
		 headers.add("Expires", "0");

		 ResponseEntity<Object> responseentity=ResponseEntity.ok().headers(headers).contentLength(file.length())
				 .contentType(MediaType.parseMediaType("application/txt")).body(resource);

		return responseentity;

	}


	@PostMapping("/upload")
	public String fileUpload(@RequestParam("file") MultipartFile file) {

		String Message="";


		try {
			byte[] bytes;
			bytes = file.getBytes();
			Path path=Paths.get("src\\main\\resources\\file\\"+file.getOriginalFilename());
			Files.write(path,bytes);
			Message="File Uploaded Successfully";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			 Message="error : "+e.getMessage(); 
		}



		return Message;
	}

}