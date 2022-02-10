package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {


    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        System.out.println(job1.getId());
        System.out.println(job2.getId());
        Assert.assertEquals(job1.getId(),1);
        Assert.assertEquals(job2.getId(), 2);
        Assert.assertEquals((job2.getId()-job1.getId()), 1);

    }

    @Test
    public void testJobConstructorSetsAllFields() {

        Employer employer = new Employer("ACME");
        Location location = new Location("Desert");
       PositionType positionType = new PositionType("Quality control");
       CoreCompetency coreCompetency = new CoreCompetency("Persistence");

      Job fieldJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Assert.assertEquals(fieldJob.getName(), "Product tester");
        Assert.assertEquals(fieldJob.getEmployer().toString(), employer.toString());
        Assert.assertEquals(fieldJob.getLocation().toString(), location.toString());
        Assert.assertEquals(fieldJob.getPositionType().toString(), positionType.toString());
        Assert.assertEquals(fieldJob.getCoreCompetency().toString(), coreCompetency.toString());

    }
}


