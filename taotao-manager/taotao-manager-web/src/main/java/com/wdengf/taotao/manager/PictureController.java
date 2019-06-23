package com.wdengf.taotao.manager;

import com.wdengf.taotao.common.util.IDUtils;
import com.wdengf.taotao.common.util.JsonUtils;
import com.wdengf.taotao.manager.common.utils.QiniuCloudUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;


@Controller
public class PictureController {

	
	
	@RequestMapping(value="/pic/upload", method=RequestMethod.POST)
	@ResponseBody
    public String picUpload(MultipartFile uploadFile)  {
		try {
	        byte[] bytes = uploadFile.getBytes();
	        String imageName = IDUtils.genImageName();
	
	        QiniuCloudUtil qiniuUtil = new QiniuCloudUtil();
	       
            //使用base64方式上传到七牛云
        	String url = qiniuUtil.put64image(bytes, imageName);
        	//响应上传图片的url
			Map<String,Object> result = new HashMap<>();
			result.put("error", 0);
			result.put("url", "http://"+url);
			return JsonUtils.objectToJson(result);
		    
		} catch (Exception e) {
			e.printStackTrace();
			Map<String,Object> result = new HashMap<>();
			result.put("error", 1);
			result.put("message", "图片上传失败");
			return JsonUtils.objectToJson(result);
		}
	}
}
