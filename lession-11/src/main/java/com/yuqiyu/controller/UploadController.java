package com.yuqiyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by Administrator on 2018/4/15/015.
 */
@Controller
public class UploadController {

    @GetMapping(value = "/index")
    public String index(){
        return "index";
    }

    @PostMapping(value = "/upload")
    @ResponseBody
    public String upload(HttpServletRequest request, MultipartFile file){
        try {
            String uploadDir=request.getSession().getServletContext().getRealPath("/")+"upload/";
            File dir=new File(uploadDir);
            if (!dir.exists()){
                dir.mkdirs();
            }
            executeUpload(file, uploadDir);
        } catch (IOException e) {
            e.printStackTrace();
            return "上传失败";
        }
        return "上传成功";
    }

    private void executeUpload(MultipartFile file, String uploadDir) throws IOException {
        String filename= UUID.randomUUID()+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        File serverFile= new File(uploadDir+filename);
        file.transferTo(serverFile);
    }
    @PostMapping(value = "/uploads")
    @ResponseBody
    public String uploads(HttpServletRequest request, MultipartFile[] file){
        try {
            String uploadDir=request.getSession().getServletContext().getRealPath("/")+"upload/";
            File dir=new File(uploadDir);
            if (!dir.exists()){
                dir.mkdirs();
            }
            for (MultipartFile f:file){
                executeUpload(f, uploadDir);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return "上传失败";
        }
        return "上传成功";
    }

}
