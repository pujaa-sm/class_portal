
package day4cw2.day4cw2.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import day4cw2.day4cw2.model.Job;
import day4cw2.day4cw2.service.JobService;;
@RestController
public class JobController {
    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }
    @PostMapping("/api/job")
    public ResponseEntity<Job>createJob(@RequestBody Job job){
        Job createdJob=jobService.createJob(job);
        return new ResponseEntity<>(createdJob,HttpStatus.CREATED);
    }
    @GetMapping("/api/job")
    public ResponseEntity<List<Job>>getAllJob(){
        List<Job>job=jobService.getAllJobs();
        return new ResponseEntity<>(job,HttpStatus.OK);
    } 
    @GetMapping("/api/job/{jobId}")
    public ResponseEntity<Job>getById(@PathVariable int jobId){
        Job job=jobService.getJobId(jobId);
        if(job!=null){
            return new ResponseEntity<>(job,HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    } 
}