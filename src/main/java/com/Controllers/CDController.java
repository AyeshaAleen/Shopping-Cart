package com.Controllers;

import com.Domain.CDs;
import com.Services.CDServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CDController {
    @Autowired
    private CDServices CDServices;

    @RequestMapping("/CD")
    @ResponseBody
    public List<CDs> getAllCD()
    {
        return CDServices.getAllCD();
    }

    @RequestMapping("/CD/{id}")
    public CDs getCD( @PathVariable long id)
    {
        return CDServices.getCD(1);
    }

    @RequestMapping(method = RequestMethod.POST, value= "/CD")
    public void addCD(@RequestBody CDs cd)
    {
        CDServices.addCD(cd);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/CD/{id}")
    public void updateCD(@RequestBody CDs cd, @PathVariable long id)
    {
        CDServices.updateCD(id, cd);
    }

    @RequestMapping(method = RequestMethod.DELETE, value= "/CD")
    public void deleteCD(@RequestBody long id)
    {
        CDServices.deleteCD(id);
    }
}
