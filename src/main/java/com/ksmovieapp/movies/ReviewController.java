package com.ksmovieapp.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ReviewController extends MongoRepository<Review, ObjectId> {


}
