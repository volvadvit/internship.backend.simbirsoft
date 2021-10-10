package com.volvadvit.internshipparsing.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

/**
 * @author Vadim Volkov volvadvit@gmail.com
 * @since 10.10.2021
 */

@Entity
@Data
@NoArgsConstructor
@Table(name = "words_count")
public class WordToCount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String word;
    private Integer count;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "url_id")
    private SourceURL sourceUrl;

    public WordToCount(String word, Integer count) {
        this.word = word;
        this.count = count;
    }

    public WordToCount(String word, Integer count, SourceURL sourceUrl) {
        this.word = word;
        this.count = count;
        this.sourceUrl = sourceUrl;
    }
}
