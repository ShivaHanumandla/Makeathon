package org.hackarthon.controller;

import org.hackarthon.bean.Resources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class directoryController {

    @GetMapping("/employee/{id}")
    public Resources getResourcesDirectory(@PathVariable String id){

        Long idLong = Long.parseLong(id);
        if(idLong==648879) {
            Resources resources = new Resources();
            resources.setAddress("KOLKATA");
            resources.setResourceId(new Long(648879));
            resources.setId(new Long(1234));
            resources.setContactNo("4561237890");
            return resources;
        }else{
            return  null;
        }

    }

}
