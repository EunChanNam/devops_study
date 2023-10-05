package study.devops.post.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;

import study.devops.post.domain.Post;
import study.devops.post.domain.PostRepository;

public interface PostJpaRepository extends JpaRepository<Post, Long>, PostRepository {
}
