package com.github.smallAttr.cloudfollowup;

import java.io.*;

/**
 * @author smallAttr
 * @since 2020-04-29 11:27
 */
public class Visit {

    private Integer id;

    private String name;

    private String description;

    private VisitStatus status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VisitStatus getStatus() {
        return status;
    }

    public void setStatus(VisitStatus status) {
        this.status = status;
    }

    public class VisitStatus implements Serializable {

        private Integer id;

        private String text;


        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }
}

