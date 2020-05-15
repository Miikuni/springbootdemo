package com.Miikuni.springbootdemo.fileupload;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * 文件上传
 */
@RestController
public class FileUploadController {

    /**
     * 文件上传
     */
    @PostMapping("/fileUploadController")
    //参数中的参数名file 是必须与html中input的name相同
    public String fileUpload(MultipartFile file) throws IOException {
        System.out.println(file.getOriginalFilename());
        //文件上传后存放的位置
        file.transferTo(new File("/user/" + file.getOriginalFilename()));
        return "OK";
    }
}
