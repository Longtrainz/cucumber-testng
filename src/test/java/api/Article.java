package api;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Article {
	private String date;
	private String layout;
	private List<String> categories;
	private String title;
	private String lang;
	private String url;
	private String content;
	private List<String> tags;
}