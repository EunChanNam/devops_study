package study.devops.post.domain;

import static jakarta.persistence.GenerationType.*;
import static lombok.AccessLevel.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = PROTECTED)
public class Post {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id;

	private String title;

	private String contents;

	public Post(String title, String contents) {
		this.title = title;
		this.contents = contents;
	}
}
