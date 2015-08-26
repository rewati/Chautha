package com.chautha.webside.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Rewati Raman
 */

@Controller
@RequestMapping("admin")
public interface AdminControler {

    @RequestMapping("")
    public String getDashBoard();

    @RequestMapping("/{adminUrl}")
    public String pageLayoutList(String adminUrl);
}
