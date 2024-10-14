package com.JetProject.JobListing.repository;

import com.JetProject.JobListing.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}
