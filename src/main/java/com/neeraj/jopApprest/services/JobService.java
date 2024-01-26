package com.neeraj.jopApprest.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neeraj.jopApprest.model.JobPost;
import com.neeraj.jopApprest.repo.JobRepo;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addjob(JobPost job){
        repo.saveJob(job); 
    }

    public List<JobPost> getJobs(){
        return repo.getAllJobs();
    }

    public JobPost getJob(int postId) {
        // TODO Auto-generated method stub
        return repo.getJobById(postId);
    }

    public void updateJob(JobPost job) {
        // TODO Auto-generated method stub
        repo.updateJobRepo(job);
    }

    public void deleteJob(int postId) {
        repo.deleteJob(postId);
    }
}
