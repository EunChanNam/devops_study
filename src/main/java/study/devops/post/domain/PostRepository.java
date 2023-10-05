package study.devops.post.domain;

import java.util.Optional;

public interface PostRepository {

	Post save(final Post post);

	Optional<Post> findById(final Long id);
}
