package com.joker.controller;

import org.springframework.boot.system.ApplicationHome;
import org.springframework.http.HttpRequest;
import org.springframework.util.ClassUtils;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UploadController {



    @RequestMapping("fileupload")
    public Map<String,Object> upload(MultipartFile filename, HttpServletRequest request) throws Exception{
        String originalFilename = filename.getOriginalFilename();
        String prefix = originalFilename.substring(originalFilename.indexOf("."));

    /*ApplicationHome home = new ApplicationHome(getClass());
    File sysfile = home.getSource();
    String jarPath = sysfile.getParentFile().getParentFile().toString();

    File file = new File(jarPath, "/static/upload/"+originalFilename);

    if(!file.exists()){
        file.mkdirs();
    }
    System.out.println(file.getAbsolutePath());*/

        DateFormat format = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
        String format1 = format.format(new Date());
        filename.transferTo(new File("D:/图片/",format1+prefix));
        Map<String,Object> map=new HashMap();
        map.put("msg","ojbk");
        return map;

    }
}


