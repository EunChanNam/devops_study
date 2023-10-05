package study.devops.post.domain;

import java.util.Optional;

public interface PostRepository {

	void save(final Post book);

	Optional<Post> findById(final Long id);
}
