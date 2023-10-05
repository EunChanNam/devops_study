package study.devops.post.application;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import study.devops.post.application.dto.PostInfo;
import study.devops.post.domain.Post;
import study.devops.post.domain.PostRepository;

@Service
@RequiredArgsConstructor
public class PostService {

	private final PostRepository postRepository;

	public void registerBook(final String title, final String contents) {
		postRepository.save(new Post(title, contents));
	}

	public PostInfo getPostInfoById(final Long id) {
		Post post = postRepository.findById(id).orElseThrow();
		return new PostInfo(post.getTitle(), post.getContents());
	}
}
