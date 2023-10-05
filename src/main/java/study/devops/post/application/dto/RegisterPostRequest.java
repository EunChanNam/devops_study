package study.devops.post.application.dto;

public record RegisterPostRequest(
	String title,
	String contents
) {
}
