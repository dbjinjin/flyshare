package com.kakasys.flyshare.page;

import com.kakasys.flyshare.base.web.BaseController;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/14 14:15</p>
 * <p>类全名：com.kakasys.flyshare.page.PageController</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
@Controller
@RequestMapping("/page")
public class PageController extends BaseController
{
    private Configuration templateConfig;

    private String DEFAULT_STATIC_PATH = "G:\\github\\flyshare\\src\\main\\resources\\templates\\html";

    @Autowired
    public PageController(Configuration templateConfig)
    {
        this.templateConfig = templateConfig;
    }

    @RequestMapping("/static")
    public void freemarkerStatic(@RequestParam String name)
    {
        Writer out = null;
        try
        {
            long start = System.currentTimeMillis();
            Template template = templateConfig.getTemplate(name);
            String htmlName = name.replace(".ftl", ".html");
            logger.info("Freemarker文件 {} 准备静态化...", name);
            logger.info("静态化路径 {} 文件名: {}...", DEFAULT_STATIC_PATH, htmlName);
            out = new FileWriter(new File(DEFAULT_STATIC_PATH, htmlName));
            Map<String, Object> dataModel = new HashMap<>();
            dataModel.put("name", "wuxiaohai");
            template.process(dataModel, out);
            long end = System.currentTimeMillis();
            logger.info("静态化完成,耗时 {}(ms)...", end - start);
        } catch (Exception e)
        {
            logger.error("Freemarker静态化异常", e);
        } finally
        {
            try
            {
                if (out != null)
                {
                    out.close();
                }
            } catch (IOException e)
            {
                logger.error(e);
            }
        }
    }

    @RequestMapping("/show")
    public ModelAndView showPage(@RequestParam String name)
    {
        ModelAndView view = new ModelAndView();
        view.setViewName(name);
        return view;
    }
}
