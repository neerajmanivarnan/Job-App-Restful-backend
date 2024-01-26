package com.neeraj.jopApprest.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.neeraj.jopApprest.model.JobPost;

@Repository
public class JobRepo {
    List<JobPost> jobs = new ArrayList<>();
    public JobRepo(){
        //java developer
        jobs.add( new JobPost(1,"Java developer","Experienced java developer required",5));
        jobs.add( new JobPost(2,"React developer","Experienced react developer required",5));
        jobs.add( new JobPost(3,"Angular developer","Experienced java developer required",5));
        jobs.add( new JobPost(4,"Node js developer","Experienced java developer required",5));
        jobs.add( new JobPost(5,"MERN Stack developer","Experienced java developer required",5));
    }

    public List<JobPost> getAllJobs(){
        return jobs;
    }

    public void saveJob(JobPost job){
        jobs.add(job);
    }

    public JobPost getJobById(int postId) {
        for(JobPost job : jobs){
            if(job.getPostId() == postId){
                return job;
            }
        } 
        return null;
    }

    public void updateJobRepo(JobPost job) {
        for(JobPost j:jobs){
            if(j.getPostId() == job.getPostId()){
                
                j.setPostProfile(job.getPostProfile());
                j.setPostDesc(job.getPostDesc());
                j.setReqExperience(j.getReqExperience());
            }
        }
    }

    public void deleteJob(int postId) {
        for(JobPost j:jobs){
            if(j.getPostId() == postId){
                jobs.remove(j);
            }
        }
    }

}
