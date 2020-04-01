package com.study.yong.springboot.domain.posts;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass // Entity 클래스들이 이 클래스를 상속받을 경우 필드들오 컬럼으로 인식하도록 하는 어노테이션
@EntityListeners(AuditingEntityListener.class) // BaseTimeEntity 클래스에 Auditing 기능을 포함시킴
public abstract class BaseTImeEntity {

    @CreatedDate // Entity가 생성될 때 자동으로 시간이 저장됨.
    private LocalDateTime createdDate;

    @LastModifiedDate // 조회한 Entity값을 변경할 때 자동으로 시간이 저장됨.
    private LocalDateTime modifiedDate;
}
