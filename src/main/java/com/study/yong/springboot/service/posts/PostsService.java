package com.study.yong.springboot.service.posts;

import com.study.yong.springboot.domain.posts.Posts;
import com.study.yong.springboot.domain.posts.PostsRepository;
import com.study.yong.springboot.web.dto.PostsResponseDto;
import com.study.yong.springboot.web.dto.PostsSaveRequestDto;
import com.study.yong.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requetDto) {
        Posts posts = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));
        posts.update(requetDto.getTitle(), requetDto.getContent());
        return id;
    }
    public PostsResponseDto findById(Long id) {
        Posts entity = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당사용자가 없습니다. id=" + id));
        return new PostsResponseDto(entity);
    }
}
