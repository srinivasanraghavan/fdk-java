package com.fnproject.fn.runtime.cloudthreads;


/**
 * Created on 26/08/2017.
 * <p>
 * (c) 2017 Oracle Corporation
 */
public class TestSupport {
    public static CompletionId completionId(String id) {
        return new CompletionId(id);
    }

    public static String completionIdString(CompletionId id) {
        return id.getId();
    }

    public static ThreadId threadId(String id) {
        return new ThreadId(id);
    }
}