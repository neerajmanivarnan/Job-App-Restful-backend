package com.neeraj.jopApprest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neeraj.jopApprest.model.JobPost;
import com.neeraj.jopApprest.services.JobService;



@RestController
public class jobController {

    @Autowired
    JobService service;

    @GetMapping("jobs")
    public List<JobPost> viewalljobs(){
        return service.getJobs();
    }

    @GetMapping("jobs/{postId}")
    public JobPost viewjob(@PathVariable int postId){
        return service.getJob(postId);
    }

    @PostMapping(path="jobs",consumes="application/json")
    public JobPost postJob(@RequestBody JobPost job) {
        service.addjob(job);
        
        return job;
    }

    @PutMapping("jobs")
    public JobPost updateJob(@RequestBody JobPost job) {
        //TODO: process PUT request
        service.updateJob(job);
        
        return service.getJob(job.getPostId());
    }

    @DeleteMapping("jobs/{postId}")
    public void deleteJob(@PathVariable("postId") int postId){
        service.deleteJob(postId);
        
    }
  
    
    

}
