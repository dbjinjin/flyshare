package com.kakasys.flyshare.system.verify.web;

import com.kakasys.flyshare.base.web.BaseController;
import com.kakasys.rootbase.code.model.ImageSize;
import com.kakasys.rootbase.code.util.CodeUtil;
import com.kakasys.rootbase.data.util.DataUtils;
import com.kakasys.rootbase.string.StrUtils;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2019/1/6 15:38</p>
 * <p>类全名：com.kakasys.flyshare.system.verify.web.VerifyController</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
@Controller
@CrossOrigin
@RequestMapping(value = "/verify")
public class VerifyController extends BaseController
{
    @RequestMapping(value = "/loadCode", method = {RequestMethod.GET, RequestMethod.POST}, produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_GIF_VALUE, MediaType.IMAGE_PNG_VALUE})
    @ResponseBody
    public byte[] loadVerifyCodeImage(HttpServletRequest request) throws IOException
    {
        int width = StrUtils.obj2int(request.getParameter("width"), 150);
        int height = StrUtils.obj2int(request.getParameter("height"), 50);
        ImageSize imageSize = new ImageSize();
        imageSize.setWidth(width);
        imageSize.setHeight(height);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String code = DataUtils.buildRandomCode(4).toUpperCase();
        BufferedImage bufferedImage = CodeUtil.genVerifyCode(imageSize, code);
        ImageIO.write(bufferedImage, "jpg", out);
        return out.toByteArray();
    }

}
