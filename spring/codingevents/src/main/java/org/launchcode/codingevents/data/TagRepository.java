package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Tag;
import org.springframework.data.repository.CrudRepository;

public interface TagRepository extends CrudRepository<Tag, Integer> {
}
