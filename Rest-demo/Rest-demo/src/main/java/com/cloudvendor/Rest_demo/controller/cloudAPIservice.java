package com.cloudvendor.Rest_demo.controller;

import com.cloudvendor.Rest_demo.model.Cloudvendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")

public class cloudAPIservice
{
    Cloudvendor cloudvendor;
    @GetMapping({"vendorId"})
public Cloudvendor getCloudVendorDetails(String vendorId)
{

    return cloudvendor;
            //new Cloudvendor("c1","shubham","amhera","8439198963");
}

@PostMapping
    public String createCloudVendorDetails(@RequestBody Cloudvendor cloudvendor ){

        this.cloudvendor=cloudvendor;
        return "cloud vendor created successfully";
}

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody Cloudvendor cloudvendor ){

        this.cloudvendor=cloudvendor;
        return "cloud vendor Updated successfully";
    }

    @DeleteMapping
    public String updateCloudVendorDetails(String vendorId ){

        this.cloudvendor=null;
        return "cloud vendor Deleted successfully";
    }


}
