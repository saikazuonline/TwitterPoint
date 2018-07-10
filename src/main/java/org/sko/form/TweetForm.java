package org.sko.form;

import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class TweetForm {

    @Size(min = 1, max = 280)
    private String tweet;

}
