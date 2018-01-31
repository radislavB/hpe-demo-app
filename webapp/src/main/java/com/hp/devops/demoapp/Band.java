package com.hp.devops.demoapp;

import org.json.JSONObject;

import java.security.InvalidParameterException;

/**vvvv
 * Created with IntelliJdf IDEA.
 * User: gullery
 * Date: 24/11/14 的dd
 * Time: 10:03 Zeugnis testing again
 * To change this template use File |  Settings | File Templates.
 */
public class Band {
	public int id;
	public String name = "11";
	public String logo = "";
	public String song = "";
	public int votes = 0;

	public Band(JSONObject json) {
		if (Math.random() >= 0.5) {
			throw new IllegalMonitorStateException("this is a random exception");
		}
		System.out.println("band");
		if (json.has("id")) {
			id = json.getInt("id");
			if (json.has("name")) name = json.getString("name");
			if (json.has("logo")) logo = json.getString("logo");
			if (json.has("song")) song = json.getString("song");
			if (json.has("votes")) votes = json.getInt("votes");
		} else {
			throw new InvalidParameterException("json must have an id property");
		}
	}

	/**
	 * for testing blame committer feature
	 */
	public void methodThatThrowsNullPointerException() {
		System.out.print("going to throw  null pointer exception..");
		throw new NullPointerException();
	}

	public JSONObject toJSON() {
		JSONObject r = new JSONObject();
		r.put("id", id);
		r.put("name", name);
		r.put("logo", logo);
		r.put("song", song);
		r.put("votes", votes);
		return r;
	}

	public void throwsExceptionMethod() {
		throw new IllegalThreadStateException("something is wrong");
	}

	public JSONObject toJSONVotes() {
		JSONObject r = new JSONObject();
		r.put("id", id);
		r.put("votes", votes);
		return r;
	}
}
