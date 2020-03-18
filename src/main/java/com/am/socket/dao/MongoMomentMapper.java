package com.am.socket.dao;

import com.am.socket.model.Moment;
import com.am.socket.model.MongoTest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoMomentMapper extends MongoRepository<Moment, String> {}
