package study.devops.post.presentation;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import study.devops.post.application.PostService;
import study.devops.post.application.dto.PostInfo;
import study.devops.post.application.dto.RegisterPostRequest;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class PostController {

	private final PostService postService;

	@PostMapping
	public ResponseEntity<Void> register(
		@RequestBody final RegisterPostRequest request
	) {
		postService.registerBook(request.title(), request.contents());
		return ResponseEntity.noContent().build();
	}

	@GetMapping("/{id}")
	public ResponseEntity<PostInfo> queryById(
		@PathVariable final Long id
	) {
		PostInfo result = postService.getPostInfoById(id);
		return ResponseEntity.ok(result);
	}
}
