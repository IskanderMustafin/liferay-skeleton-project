package com.entech.miniprojectdb;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

@Controller
@RequestMapping("VIEW")
public class BaseController {

	private static final Log log = LogFactoryUtil.getLog(BaseController.class);

    @RenderMapping
	public String showBaseView(RenderRequest request, RenderResponse response, Model model) {
        log.info("Inside showBaseView method.");
        model.addAttribute("welcomeMsg", "Some welcome msg");
		return "view";
	}
}
