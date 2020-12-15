package com.kgc.edocconsumers.controller;

import com.kgc.edocwork.pojo.Entry;
import com.kgc.edocwork.service.WorkService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class WorkController {

    @Reference
    WorkService workService;

    @RequestMapping("/")
    public String index(Integer type, Model model){
        List<Entry> entrylist = workService.entrylist(type);
        model.addAttribute("entrylist",entrylist);
        return "index";
    }


    @RequestMapping("/toadd")
    public String toadd(){
        return "add";
    }

    @RequestMapping("/doadd")
    public String doadd(Entry entry, HttpSession session){
        int i=workService.addentry(entry);
        if(i>0){
            session.setAttribute("msg", "添加成功");
            return "redirect:/";
        }
        session.setAttribute("msg","添加失败");
        return "add";
    }

    @RequestMapping("/toupd")
    public String toupd(Integer id,Model model){
        Entry entry = workService.entryById(id);
        model.addAttribute("entry",entry);
        return "upd";
    }


    @RequestMapping("/doupd")
    public String doupd(Entry entry,Model model,HttpSession session){
        int upd = workService.upd(entry);
        if(upd>0){
            session.setAttribute("msg","修改成功");
            return "redirect:/";
        }
        session.setAttribute("msg","失败");
        return "redirect:/";
    }

    @RequestMapping("/date")
    public String date(Integer id,HttpSession session){
        int delete = workService.delete(id);
        if(delete>0){
            session.setAttribute("msg","删除成功");
            return "redirect:/";
        }
        session.setAttribute("msg","失败");
        return "redirect:/";
    }
}
