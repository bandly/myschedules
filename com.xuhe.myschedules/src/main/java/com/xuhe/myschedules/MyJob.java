package com.xuhe.myschedules;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

public class MyJob implements org.quartz.Job {
    public MyJob() {
    }

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.err.println("Hello World!  MyJob is executing.");
    }

    public static void main(String[] args) throws SchedulerException {
        // Grab the Scheduler instance from the Factory
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

        // and start it off
        scheduler.start();

        // define the job and tie it to our MyJob class
        JobDetail job = newJob(MyJob.class).withIdentity("job1", "group1").build();

        // Trigger the job to run now, and then repeat every 40 seconds
        Trigger trigger = newTrigger().withIdentity("trigger1", "group1").startNow()
            .withSchedule(simpleSchedule().withIntervalInSeconds(40).repeatForever()).build();

        // Tell quartz to schedule the job using our trigger
        scheduler.scheduleJob(job, trigger);

    }
}
