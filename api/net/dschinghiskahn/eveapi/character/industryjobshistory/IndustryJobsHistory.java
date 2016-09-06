package net.dschinghiskahn.eveapi.character.industryjobshistory;

import java.util.ArrayList;
import java.util.List;

import net.dschinghiskahn.eveapi.util.ApiResponse;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

@Root(name = "eveapi")
public class IndustryJobsHistory extends ApiResponse {

    @Path("result/rowset[1]")
    @Attribute(name="name", required = false)
    private String rowsetName1;

    @Path("result/rowset[1]")
    @Attribute(name="key", required = false)
    private String rowsetKey1;

    @Path("result/rowset[1]")
    @Attribute(name="columns", required = false)
    private String rowsetColumns1;

    @Path("result/rowset[1]")
    @ElementList(type = Job.class, required = false, inline = true)
    private List<Job> jobs = new ArrayList<Job>();

    public List<Job> getJobs(){
        return jobs;
    }

    @Override
    public String toString(){
        return "IndustryJobsHistory [" +
            "jobs = " + jobs + ", " +
            "]";
    }

}
