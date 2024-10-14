package com.JetProject.JobListing.repository;

import com.JetProject.JobListing.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String>
{

}
