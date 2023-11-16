package com.gdsc.webboard.answer;

import java.time.LocalDateTime;

import com.gdsc.webboard.question.Question;
import jakarta.persistence.*;
import com.gdsc.webboard.user.SiteUser;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @ManyToOne  // 다대일 관계 지정
    private Question question;

    @ManyToOne
    private SiteUser author;

    private LocalDateTime modifyDate;
}
