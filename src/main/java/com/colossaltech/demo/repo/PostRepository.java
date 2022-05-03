package com.colossaltech.demo.repo;

import com.colossaltech.demo.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
