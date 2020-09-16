package com.gdut.Controller;

import java.io.File;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping(value = "/fileupload.do", method = RequestMethod.POST)
	public String doFileUpload(MultipartFile photo, HttpSession session) throws Exception {

		 /*String path = "C:/Users/zy/Desktop/图片";*/
		String path = session.getServletContext().getRealPath("/images");
		if (photo.getSize() > 0) {
			// 获取到上传文件的原始名称
			String fileName = photo.getOriginalFilename();
			String ext = fileName.substring(fileName.lastIndexOf("."),fileName.length());
			session.setAttribute("ext", ext);
			if (fileName.endsWith("jpg") || fileName.endsWith("png")) {
				File file = new File(path, session.getAttribute("accound")+ext);
				photo.transferTo(file);
			}
		}
		return "/editMessage.jsp";
	}

}
